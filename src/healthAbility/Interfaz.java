
package healthAbility;
import java.io.*;

import healthAbility.*;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

import javax.swing.JOptionPane; 
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.ScrollPane;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Panel;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Canvas;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.text.BadLocationException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz
{
	JFrame frmHealthability;
	private JTextField textField;
	private JPasswordField passwordField;
	private static String pNombre;
	private static String pApellido1;
	private static String pApellido2;
	private static String pCédula;
	private static String pCorreoElectrónico;
	private static String pFotodelpaciente;
	private static String pCita;
	private static String pcontraseña;
	JOptionPane VentanaEmergente = new JOptionPane(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws BadLocationException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frmHealthability.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		ArrayList<String> e = new ArrayList<>();
		e.add("Cardiología");
		e.add("Neurología");
		ArrayList<String>  a = new ArrayList<>();
		a.add("Pediatría");
		ArrayList<String> t=new ArrayList<>();
		t.add("Gediatría");
		ArrayList<String> s=new ArrayList<>();
		s.add("Odontología");
		ArrayList<String>  b=new ArrayList<>();
		b.add("Oftalmología");
		
		ArrayList<String>  i = new ArrayList<>();
		i.add("Consulta: $50\n");
		i.add("Operacion: $1000");
		ArrayList<String>  o = new ArrayList<>();
		o.add("Consulta 90$\n");
		o.add("Operacion $200\n");
		
		String[] a1 = {"Hospital Calderon Guardia"};
		String[] b1 = {"Hospital de Ciudad Neilly"};
		String[] c1 = {"Hospital San Juan de Dios"};
		String[] d1 = {"Hospital de la Mujer"};
		String[] e1 = {"Hospital de la Anexion","Hospital Tony Facio"};
		
		Medico.IngresarMedico("Fabian", "Arce", "Molina","/Imagenes/H1.jpg", "115890113", "sarcem1111@gmail.com",e, "La buena medicina es aquella que mejora el cuerpo y no asalta el bolsillo.", a1, i, "Español\nIngles", "UCIMED","Colegio de medicos y cirujanos","heredia");
		Medico.IngresarMedico("Francisco", "Murillo", "Fallas","/Imagenes/H2.jpg","287654321", "franMu@gmail.com", a, "El arte del médico es el mantener animado al paciente mientras la naturaleza lo va curando.",b1,o ,"Español\nIngles\nFrances", "Universidad de Costa Rica","Colegio de medicos y cirujanos","san josé");
		Medico.IngresarMedico("Myron", "Camacho", "Brenes","/Imagenes/H3.jpg", "123456789", "myroncama8985@gmail.com", t, "Médico es aquel que te acompaña a la tumba con palabras griegas.",c1,o, "Español\nIngles\nFrances", "Hispanoamericana","Colegio de medicos y cirujanos","limón");
		Medico.IngresarMedico("Natalia", "Villalobos", "Blanco","/Imagenes/M1.jpg", "7564857463", "NataVi@gmail.com",s, "Médico: profesional de la salud que tapa sus errores con tierra.",d1,o,"","Universidad de Costa Rica","Colegio de medicos y cirujanos","puntarenas");
		Medico.IngresarMedico("Gabriel", "Mora", "Padilla","/Imagenes/H4.jpg", "484736253", "GaMo@gmail.com", b, "Hay que tener cuidado con los libros de salud, podemos morir por culpa de una errata.", e1, i, "UCIMED", "Español\nIngles\nPortugues","Colegio de medicos y cirujanos","heredia");
		Medico.IngresarMedico("William", "Espinoza", "Vega","/Imagenes/H5.jpg", "745325342", "WiEsp@gmail.com", a, "A los médicos son a los que mejor les va, sus éxitos andan por ahí y a sus fracasos los entierran.",a1, i,"Español\nIngles\nItaliano", "Universidad de Costa Rica","Colegio de medicos y cirujanos","guanacaste");
		Medico.IngresarMedico("Alejandra", "Acosta", "Sanchez","/Imagenes/M2.jpg", "24351675", "AleAco@gmail.com", e, "El médico es simplemente una persona que recibe una nueva vida que Dios manda.", c1,i, "Español\nIngles", "Universidad de Costa Rica","Colegio de medicos y cirujanos","cartago");
		Medico.IngresarMedico("Paula", "Romero", "Vargas","/Imagenes/M3.jpg", "756453423", "PauRom@gmail.com", t, "¿La enfermedad? La vida. ¿La cura? La muerte. Yo sólo estoy para retrasar la cura a esa enfermedad que es la vida.", d1,o, "Español\nIngles\nAleman", "Universidad de Costa Rica","Colegio de medicos y cirujanos","san josé");
		Medico.IngresarMedico("Mariana", "Cortes", "Soto","/Imagenes/M4.jpg", "656453645", "MariCor@gmail.com", s, "La buena medicina es aquella que mejora el cuerpo y no asalta el bolsillo.", e1, o,"Español\nIngles\nHolandes", "Universidad de Costa Rica","Colegio de medicos y cirujanos","cartago");
		Medico.IngresarMedico("Sofia", "Palma", "Guitierrez","/Imagenes/M5.jpg", "231425364", "SofPal@gmail.com",b, "Yo que deseo ser médico preferiría antes amputar el odio, porque... ¿de qué sirve que la gente esté sana si se odia?", a1,i, "Ingles", "Universidad de Costa Rica","Colegio de medicos y cirujanos","heredia");
		Medico.IngresarMedico("Lizeth", "Rodriguez", "Rojas","/Imagenes/M6.jpg", "354634343", "LizethRod@gmail.com", a, "La gente quiere a los médicos que quieren a la gente; antes de ser un buen médico, se una buena persona.", e1,i, "Español", "Universidad de Costa Rica","Colegio de medicos y cirujanos","san josé");
		Medico.IngresarMedico("Yuliana", "Marin", "Solis","/Imagenes/M7.jpg", "756453624", "YuliMari@gmail.com", t, "Dios regala la vida, los médicos están para salvarla y protegerla.", c1, o,"Español\nIngles", "Universidad de Costa Rica","Colegio de medicos y cirujanos","alajuela");
		
		Padecimiento.ingresarPadecimiento("","Cardiologia","Daño al miocardio");
		Padecimiento.ingresarPadecimiento("","Neurologia","Aneurisma");
		Padecimiento.ingresarPadecimiento("Deficit atencional", "Pediatria","");
		Padecimiento.ingresarPadecimiento("Infarto","Cardiologia","");
		Padecimiento.ingresarPadecimiento("Dolor de huesos","Oseo","Artritis");
		Padecimiento.ingresarPadecimiento("","Pulmonar", "Daño en los pulmonos");
		Padecimiento.ingresarPadecimiento("Fractura en la pierna","Oseo","Fractura de tibia y peroné");
		
		Clinica.registrarClinica("Hospital Max Peralta","200 mts sur de la esquina suroeste del Parque Central","Regional Central","Cartago","Cartago","/Imagenes/Max Peralta.jpg");
		Clinica.registrarClinica("Hospital William Allen, Turrialba","250 mts este de la Iglesia","Turrialba","Turrialba","Cartago","/Imagenes/William Allen.jpg");
		Clinica.registrarClinica("Hospital San Juan de Dios", "100 mts del supermercado, contiguo al Hospital de Niños", "", "", "San José","/Imagenes/San Juan de Dios.jpg" );
		Clinica.registrarClinica("Hospital Calderon Guardia", "Del parque nacional 100 mts Norte, San José", "Distrito", "Canton", "San José", "/Imagenes/Calderon Guardia.jpg");
		Clinica.registrarClinica("Hospital Mexico", "La Uruca, de la Pozuelo 200 mts. Sur , despues de la rotonda 200 mts. Oeste", "San José", "San José", "San José", "/Imagenes/Mexico.jpg");
		Clinica.registrarClinica("Hospital de la Mujer","De la Escuela Ricardo Jimenez 100 mts. Oeste calle central San José","San José","San José","San José","/Imagenes/Hospital de la mujer.jpg");
		Clinica.registrarClinica("Hospital Blanco Cervantes", "De las oficinas centrales de la Cruz Roja 150 mts. Oeste, detrás del Ministerio de Salud", "San José", "San José", "San José", "/Imagenes/Blanco Cervantes.jpg");
		Clinica.registrarClinica("Hospital Tony Facio, Limón","","","Guapiles","Limón","/Imagenes/Tony Facio.jpg");
		Clinica.registrarClinica("Hospital de San Carlos", "2 kilometros al norte de la catedral de Ciudad Quesada", "", "San Carlos", "Alajuela", "/Imagenes/San Carlos.jpg");
		Clinica.registrarClinica("Hospital Enrique Baltodano Briceño", "Barrio Moracia,contiguo a la Cruz Roja", "", "Liberia", "Guanacaste", "/Imagenes/Enrique Baltodano Brice?.jpg");
		Clinica.registrarClinica("Hospital de la Anexion", "Avenida principal frente al supermercado PALI", "", "Nicoya", "Guanacaste", "/Imagenes/La Anexion.jpg");
		Clinica.registrarClinica("Hospital de Ciudad Neilly", "De la entrada principal de Ciudad Neily 2 kim carretera hacia Paso Canoas, contiguo a la gasolinera", "", "Ciudad Neily", "Puntarenas", "/Imagenes/Ciudad Neily.jpg");
		Clinica.registrarClinica("Hospital de Osa Tomás Casas Casajú", "500 metros norte de la escuela de Ojo de Agua", "Ciudad Cortes", "Osa", "Puntarenas", "/Imagenes/Tomas Casas.jpg");
		Clinica.registrarClinica("Hospital San Francisco de Asís", "400 metros oeste de la terminal de buses", "", "Grecia", "Alajuela", "/Imagenes/San Francisco de As?.jpg");
		Clinica.registrarClinica("Hospital San Vicente de Paúl", "Avenida 16" , "", "", "Heredia", "/Imagenes/San Vicente de Paul.jpg");
		Clinica.registrarClinica("Hospital Psiquiátrico Roberto Chacón Paut", "4 km al norte de la municipalidad de la Union", "Tres Rios", "", "Cartago","/Imagenes/Roberto Chacon Paut.jpg" );
	}
	
	/**
	 * Create the application.
	 */
	
	public Interfaz() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHealthability = new JFrame();
		frmHealthability.setTitle("HealthABILITY");
		frmHealthability.getContentPane().setBackground(Color.WHITE);
		frmHealthability.setResizable(false);
		frmHealthability.setBackground(SystemColor.menuText);
		frmHealthability.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\TITAN\\Desktop\\Iconos\\smbolo-mdico-del-caduceo-fondo-azul-9299141.jpg"));
		frmHealthability.setForeground(Color.WHITE);
		frmHealthability.setBounds(100, 100, 638, 473);
		frmHealthability.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_3 = new JLabel("___________________________________________________________________________________________________________________________________________________________________________________________");
		lblNewLabel_3.setForeground(new Color(169, 169, 169));
		
		JTextPane textPane = new JTextPane();
		textPane.setText("HealthABILITY");
		textPane.setForeground(new Color(51, 153, 102));
		textPane.setFont(new Font("Sylfaen", Font.PLAIN, 29));
		textPane.setEditable(false);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Interfaz.class.getResource("/Imagenes/Doctores.png")));
		
		JLabel lblNewLabel = new JLabel("Crear/Entrar a tu cuenta");
		lblNewLabel.setBackground(new Color(220, 220, 220));
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnNewButton = new JButton("Crea tu cuenta ");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() 
					{
						try 
						{
							Perfil window2 = new Perfil();
							window2.frmHealthability2.setVisible(true);
							frmHealthability.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnNewButton.setForeground(new Color(255, 153, 51));
		
		JLabel lblCreUnaCuenta = new JLabel("Crea una cuenta nueva");
		lblCreUnaCuenta.setForeground(new Color(0, 0, 255));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Interfaz.class.getResource("/Imagenes/doctora(4A).jpg")));
		
		JLabel lblEntrATu = new JLabel("Entra a tu cuenta");
		lblEntrATu.setForeground(new Color(0, 102, 255));
		
		textField = new JTextField();
		
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JButton btnIngresar = new JButton("Ingresa");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String pCorreoElectrónico = textField.getText();
				String pcontraseña = new String(passwordField.getPassword());
				RegistrodePaciente.ValorCambiodeperfil=RegistrodePaciente.IngresarPaciente(pCorreoElectrónico,pcontraseña);
				
				if (pCorreoElectrónico.equals("administrador")&& pcontraseña.equals("admin") )
				{
					EventQueue.invokeLater(new Runnable() 
					{
						public void run() 
						{
							try 
							{
								VentanaAdministrador window = new VentanaAdministrador();
								window.frame.setVisible(true);
								frmHealthability.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				
				
				else if (RegistrodePaciente.ValorCambiodeperfil!=-1){
					
					// Registro del usuario
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								PerfilDusuario window = new PerfilDusuario();
								window.frame.setVisible(true);
								frmHealthability.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});			
				}
							
				else{
					JOptionPane.showMessageDialog(frmHealthability,"Información incorrecta","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					frmHealthability.repaint();//refresca la pantalla
				}
			}
		});

		btnIngresar.setForeground(Color.BLUE);
		GroupLayout groupLayout = new GroupLayout(frmHealthability.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
							.addGap(157)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCreUnaCuenta)
										.addComponent(btnNewButton))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(106)
											.addComponent(lblEntrATu))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(86)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(passwordField)
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(248)
									.addComponent(btnIngresar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(69)
							.addComponent(lblNewLabel)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addGap(29)
					.addComponent(lblNewLabel)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCreUnaCuenta)
								.addComponent(lblEntrATu))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnIngresar))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		frmHealthability.getContentPane().setLayout(groupLayout);
	}
}
