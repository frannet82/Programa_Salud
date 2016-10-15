//Esta clase permite a un paciente hacerse una cuenta en el sistema.
//Se ingresan los datos en un interfaz grafica.
package healthAbility;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class RegistrodePaciente 
{
	static int ValorCambiodeperfil=0;
	static String ValorDseleccion;
	static String ValorDseleccion2;
	private String Nombre=null;
	private String Apellido1=null;
	private String Apellido2=null;
	private String Cédula=null;
	private String CorreoElectrónico=null;
	private String FotodelPaciente=null;
	private String PadecimientosP=null;
	private String DescripPadecimiento=null;
	private String Cita=null;
	private String Contraseña=null;
	static ArrayList<String> DatosDePacientes = new ArrayList<>();
	static ArrayList<String> DatosApellido1 = new ArrayList<>();
	static ArrayList<String> DatosApellido2 = new ArrayList<>();
	static ArrayList<String> DatosDeCédula = new ArrayList<>();
	static ArrayList<String> DatosDeCorreoElectrónico = new ArrayList<>();
	static ArrayList<String> DatosDeFotosdelPaciente = new ArrayList<>();
	static ArrayList<String> DatosDeCita = new ArrayList<>();
	static ArrayList<String> DatosDecontraseña = new ArrayList<>();
	static ArrayList<String> DatosPadecimientoP = new ArrayList<>();
	static ArrayList<String> DatosDescripPadecimiento = new ArrayList<>();
	static ArrayList<String> DatosfechaCita = new ArrayList<>();
	static ArrayList<String> DatosdiaCita = new ArrayList<>();
	static ArrayList<String> DatosCita = new ArrayList<>();
	static ArrayList<String> DatosProvincia = new ArrayList<>();

	public RegistrodePaciente (String nombre,String Apellido1,String Apellido2, String cédula,String correoElectrónico,String contraseña){
		setNombre(nombre);
		setCédula(cédula);
		setCorreoElectrónico(correoElectrónico);
		setContraseña(contraseña);
		setApellido1(Apellido1);
		setApellido2(Apellido2);
	}
	
	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	
	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public void GuardarDatos(String nombre, String Apellido1,String Apellido2, String cédula,String correoElectrónico,String Contraseña,String Padecimiento, String DescripPadecimiento,String fechaCita, String diaCita, String Cita,String Provincia){
		DatosDePacientes.add(nombre);
		DatosApellido1.add(Apellido1);
		DatosApellido2.add(Apellido2);
		DatosDeCédula.add(cédula);
		DatosDeCorreoElectrónico.add(correoElectrónico);
		DatosDecontraseña.add(Contraseña);
		DatosPadecimientoP.add(Padecimiento);
		DatosDescripPadecimiento.add(DescripPadecimiento);
		DatosfechaCita.add(fechaCita);
		DatosdiaCita.add(diaCita);
		DatosCita.add(Cita);
		DatosProvincia.add(Provincia);
	}
	
	public static int IngresarPaciente(String PCorreoElectónico,String Pcontraseña)  {//Busca que el usuario este registrado
		int TamañoDeLista=0;
		int contador=0;
		
		TamañoDeLista=DatosDeCorreoElectrónico.size();
	
		while (TamañoDeLista!=contador){
			if (DatosDecontraseña.get(contador).equals(Pcontraseña) & DatosDeCorreoElectrónico.get(contador).equals(PCorreoElectónico)){
				
				return contador;
				
			}
			else{
				contador++;
			}
				
			}
		return -1;
		}
	
	static boolean BuscarPaciente(String pCédula)  {//Busca que el usuario este registrado
		int TamañoDeLista=0;
		int contador=0;
		
		TamañoDeLista=DatosDecontraseña.size();
	
		while (TamañoDeLista!=contador){
			if (DatosDeCédula.get(contador).equals(pCédula) ){
				
				return true;
				
			}
			else{
				contador++;
			}
				
			}
		
		return false;
		}
	
	
	static boolean BuscarPacienteporCorreo(String Correo)  {//Busca que el usuario este registrado
		int TamañoDeLista=0;
		int contador=0;
		
		TamañoDeLista=DatosDeCorreoElectrónico.size();
	
		while (TamañoDeLista!=contador){
			if (DatosDeCorreoElectrónico.get(contador).equals(Correo) ){
				
				return true;
				
			}
			else{
				contador++;
			}
				
			}
		
		return false;
		}
	
	
	//  Valida si una direccion email es correcta */
	public static boolean ValidarEmail (String Correo) {
		try
		{
	    // Establece un  patron que debe tener el correo para ser valido
	    Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	    // Asociar el string al patron
	    Matcher Emparejar = patron.matcher(Correo);

	   // Comprobar si encaja
	   return Emparejar.matches();
	   }
		catch(Exception e){
			
			e.printStackTrace();
		}
		return false;}
	////////////////////////////////////////////////////////////
	
	//Devuelve true en caso de que se envie el email de manera correcta, o
    //devuelve false si no se pudo enviar el email
    public static boolean enviarEmail (String correo) 
    {
    	try
    	{
    		// Propiedades de la conexión
    		Properties props = new Properties();
    		props.setProperty("mail.smtp.host",  "smtp.gmail.com");
    		props.setProperty("mail.smtp.starttls.enable", "true");
    		props.setProperty("mail.smtp.port", "587");
    		props.setProperty("mail.smtp.auth", "true");
 
    		// Preparamos la sesion
    		Session session = Session.getDefaultInstance(props);
                 
    		//Recoger los datos
    		String CorreoDehealthability= "healthability.salud.bienestar@gmail.com";
    		String password= "HealthABILITY124589";            
    		String Destinatario= correo;
    		String Asunto = "Bienvenido a Healthability";
    		String Mensaje = "Gracias por unirte te esperamos con nuevas citas cada semana";
 
                 
    		// Construimos el mensaje
    		MimeMessage message = new MimeMessage(session);
         
    		message.setFrom(new InternetAddress( CorreoDehealthability ));
 
    		Address [] receptores = new Address [] { //Reciben el correo electrónico
    				new InternetAddress ( Destinatario )
    		};
         
    		//receptores.
    		message.addRecipients(Message.RecipientType.TO, receptores);        
    		message.setSubject( Asunto );        
    		message.setText( Mensaje );
             
    		// Lo enviamos.
    		Transport Conexion = session.getTransport("smtp");
    		Conexion.connect(CorreoDehealthability, password);
    		Conexion.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
                 
    		// Cierre de la conexion.
    		Conexion.close();
    		return true;
    	}
    	catch (Exception e)
    	{
    		return false;
    	}       
    }
	
	///////////////////////////////////////////////////////////
	public String getCita() {
		return Cita;
	}

	public void setCita(String cita) {
		Cita = cita;
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCédula() {
		return Cédula;
	}
	public void setCédula(String cédula) {
		Cédula = cédula;
	}
	public String getCorreoElectrónico() {
		return CorreoElectrónico;
	}
	public void setCorreoElectrónico(String correoElectrónico) {
		CorreoElectrónico = correoElectrónico;
	}
	public String getFotodelPaciente() {
		return FotodelPaciente;
	}
	public void setFotodelPaciente(String fotodelPaciente) {
		FotodelPaciente = fotodelPaciente;
	}
	public String getPadecimientos() {
		return PadecimientosP;
	}
	public void setPadecimientos(String padecimientos) {
		PadecimientosP = padecimientos;
	}

	@Override
	public String toString() {
		System.out.println( "RegistrodePaciente [Nombre=" + Nombre + ", Cédula=" + Cédula
				+ ", CorreoElectrónico=" + CorreoElectrónico
				+ ", FotodelPaciente=" + FotodelPaciente + ", Padecimientos="
				+ PadecimientosP + "]");
		return "";
	}

}

