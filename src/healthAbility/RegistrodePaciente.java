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
	private String C�dula=null;
	private String CorreoElectr�nico=null;
	private String FotodelPaciente=null;
	private String PadecimientosP=null;
	private String DescripPadecimiento=null;
	private String Cita=null;
	private String Contrase�a=null;
	static ArrayList<String> DatosDePacientes = new ArrayList<>();
	static ArrayList<String> DatosApellido1 = new ArrayList<>();
	static ArrayList<String> DatosApellido2 = new ArrayList<>();
	static ArrayList<String> DatosDeC�dula = new ArrayList<>();
	static ArrayList<String> DatosDeCorreoElectr�nico = new ArrayList<>();
	static ArrayList<String> DatosDeFotosdelPaciente = new ArrayList<>();
	static ArrayList<String> DatosDeCita = new ArrayList<>();
	static ArrayList<String> DatosDecontrase�a = new ArrayList<>();
	static ArrayList<String> DatosPadecimientoP = new ArrayList<>();
	static ArrayList<String> DatosDescripPadecimiento = new ArrayList<>();
	static ArrayList<String> DatosfechaCita = new ArrayList<>();
	static ArrayList<String> DatosdiaCita = new ArrayList<>();
	static ArrayList<String> DatosCita = new ArrayList<>();
	static ArrayList<String> DatosProvincia = new ArrayList<>();

	public RegistrodePaciente (String nombre,String Apellido1,String Apellido2, String c�dula,String correoElectr�nico,String contrase�a){
		setNombre(nombre);
		setC�dula(c�dula);
		setCorreoElectr�nico(correoElectr�nico);
		setContrase�a(contrase�a);
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

	
	public String getContrase�a() {
		return Contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}

	public void GuardarDatos(String nombre, String Apellido1,String Apellido2, String c�dula,String correoElectr�nico,String Contrase�a,String Padecimiento, String DescripPadecimiento,String fechaCita, String diaCita, String Cita,String Provincia){
		DatosDePacientes.add(nombre);
		DatosApellido1.add(Apellido1);
		DatosApellido2.add(Apellido2);
		DatosDeC�dula.add(c�dula);
		DatosDeCorreoElectr�nico.add(correoElectr�nico);
		DatosDecontrase�a.add(Contrase�a);
		DatosPadecimientoP.add(Padecimiento);
		DatosDescripPadecimiento.add(DescripPadecimiento);
		DatosfechaCita.add(fechaCita);
		DatosdiaCita.add(diaCita);
		DatosCita.add(Cita);
		DatosProvincia.add(Provincia);
	}
	
	public static int IngresarPaciente(String PCorreoElect�nico,String Pcontrase�a)  {//Busca que el usuario este registrado
		int Tama�oDeLista=0;
		int contador=0;
		
		Tama�oDeLista=DatosDeCorreoElectr�nico.size();
	
		while (Tama�oDeLista!=contador){
			if (DatosDecontrase�a.get(contador).equals(Pcontrase�a) & DatosDeCorreoElectr�nico.get(contador).equals(PCorreoElect�nico)){
				
				return contador;
				
			}
			else{
				contador++;
			}
				
			}
		return -1;
		}
	
	static boolean BuscarPaciente(String pC�dula)  {//Busca que el usuario este registrado
		int Tama�oDeLista=0;
		int contador=0;
		
		Tama�oDeLista=DatosDecontrase�a.size();
	
		while (Tama�oDeLista!=contador){
			if (DatosDeC�dula.get(contador).equals(pC�dula) ){
				
				return true;
				
			}
			else{
				contador++;
			}
				
			}
		
		return false;
		}
	
	
	static boolean BuscarPacienteporCorreo(String Correo)  {//Busca que el usuario este registrado
		int Tama�oDeLista=0;
		int contador=0;
		
		Tama�oDeLista=DatosDeCorreoElectr�nico.size();
	
		while (Tama�oDeLista!=contador){
			if (DatosDeCorreoElectr�nico.get(contador).equals(Correo) ){
				
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
    		// Propiedades de la conexi�n
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
 
    		Address [] receptores = new Address [] { //Reciben el correo electr�nico
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
	public String getC�dula() {
		return C�dula;
	}
	public void setC�dula(String c�dula) {
		C�dula = c�dula;
	}
	public String getCorreoElectr�nico() {
		return CorreoElectr�nico;
	}
	public void setCorreoElectr�nico(String correoElectr�nico) {
		CorreoElectr�nico = correoElectr�nico;
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
		System.out.println( "RegistrodePaciente [Nombre=" + Nombre + ", C�dula=" + C�dula
				+ ", CorreoElectr�nico=" + CorreoElectr�nico
				+ ", FotodelPaciente=" + FotodelPaciente + ", Padecimientos="
				+ PadecimientosP + "]");
		return "";
	}

}

