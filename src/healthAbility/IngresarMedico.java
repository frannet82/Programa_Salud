//Esta clase permite ingresar todos los datos respectivos a un médico al sistema. 
//Se le crea un perfil al médico.
//Los pacientes puedan acceder a él por medio del buscador.
package healthAbility;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import javax.swing.ComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IngresarMedico
{
	JFrame frame;
	private JPasswordField passwordField;
	static ArrayList<String> listaEspecialidades = new ArrayList<>();
	static ArrayList<String> listaProcedimientos = new ArrayList<>();
	static String CentroMedico = "";
	static String Idioma = "";
	static String CE = "";
	static String Afiliacion = "";
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args)
	{
		Clinica.registrarClinica("Clinica del dolor","300 mts de supermercado","Cartago","Cartago","Cartago","image");
		Clinica.registrarClinica("Clinica de la Soledad","250 mts este de la Iglesia","Pacayas","Alvarado","Cartago","image");
		Clinica.registrarClinica("San juan de Dios", "100 mts del supermercado", "chepe", "chepe", "San José","/ImagenesClinicas/San Juan de Dios.jpg" );
		Clinica.registrarClinica("Hospital Calderón Guardia", "Del parque nacional 100 mts Norte, San José", "Distrito", "Cantón", "San José", "Nueva carpeta\\Calderon Guardia.jpg");
		
		Padecimiento.ingresarPadecimiento("Infarto","Coronaria","Da al miocardio");
		Padecimiento.ingresarPadecimiento("Dolor de huesos","Oseo","Artritis");
		Padecimiento.ingresarPadecimiento(" ","Pulmonar", "Agua en los pulmones");
		Padecimiento.ingresarPadecimiento("","Coronaria", "Obstrucci de arteria");

		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					IngresarMedico window = new IngresarMedico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public static int BuscarEspe(String pnombre)
	{
		boolean encontrado = false;
		int i=0;
		int indice=-1;
		while (!encontrado && i < listaEspecialidades.size() && listaEspecialidades.get(i) != null)
		{
			if ((listaEspecialidades.get(i)).equals(pnombre))
			{
				indice=i;
				encontrado=true;
			}
			i++;
		}
		return indice;
	}
	public IngresarMedico() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	//Esta es la ventana que abre la ventana para ingresar un medico
	private void initialize() throws IOException 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(300, 0, 850, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Nombre - 1er Apellido - 2do Apellido:");
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBorder(null);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Verdana", Font.BOLD, 11));
		
		final JTextPane textPane = new JTextPane();//Nombre
		textPane.setBackground(Color.WHITE);
		textPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		final JTextPane textPane_1 = new JTextPane();//Apellido 1
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		final JTextPane textPane_2 = new JTextPane();//Apellido 2
		textPane_2.setBackground(Color.WHITE);
		textPane_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	    
	    Vector comboBoxItems=new Vector();
	    final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
	    model.addElement("");
	    
	    for (int i = 0; i <= Padecimiento.cantPadecimientos-1; i++)
	    {
	    	model.addElement(Padecimiento.tipos.get(i));
	    }
	    
	    Collections.sort(comboBoxItems);
		final JComboBox comboBox = new JComboBox(model);//Especialidades
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione su area de especialidad(es)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox.setFont(new Font("Verdana", Font.BOLD, 11));

	    Vector comboBoxItems1=new Vector();
	    final DefaultComboBoxModel model1 = new DefaultComboBoxModel(comboBoxItems1);
	    model1.addElement("");
	    
	    for (int i = 0; i <= Clinica.cantClinicas-1; i++)
	    {
	    	model1.addElement(Clinica.nombre.get(i));
	    }
	    
	    Collections.sort(comboBoxItems1);
		final JComboBox comboBox_1 = new JComboBox(model1);//Centro medico
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione el(los) centro(s) medico(s) donde labora", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox_1.setFont(new Font("Verdana", Font.BOLD, 11));
		
		final JTextPane textPane_3 = new JTextPane();//Correo
		textPane_3.setBackground(Color.WHITE);
		textPane_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		final JPasswordField passwordField = new JPasswordField();//Password
		passwordField.setToolTipText("Contrase\u00F1a de minimo 8 caracteres");
		passwordField.setBackground(Color.WHITE);
		passwordField.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		Vector comboBoxItems2=new Vector();
		final DefaultComboBoxModel model2 = new DefaultComboBoxModel(comboBoxItems2);
	    model2.addElement("");
	    
		final JComboBox comboBox_2 = new JComboBox(model2);//Procedimiento
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Especialidad del procedimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JButton btnIngresar = new JButton("Agregar");//Boton especialidad
		btnIngresar.setBackground(Color.WHITE);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblSlogan = new JLabel("Slogan:");
		lblSlogan.setFont(new Font("Verdana", Font.BOLD, 11));
		
		final JTextPane textPane_4 = new JTextPane();//Cedula
		textPane_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_4.setBackground(Color.WHITE);
		
		final JTextPane textPane_5 = new JTextPane();//Slogan
		textPane_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_5.setBackground(Color.WHITE);
		
		final JTextPane textPane_6 = new JTextPane();//Idioma
		textPane_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_6.setBackground(Color.WHITE);
		
		final JTextPane textPane_7 = new JTextPane();//Afiliacion
		textPane_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_7.setBackground(Color.WHITE);
		
		final JTextPane textPane_8 = new JTextPane();//Centro de estudios
		textPane_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_8.setBackground(Color.WHITE);
		btnIngresar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				boolean encontrado = false;
				if (!comboBox.getSelectedItem().toString().equals(""))
				{
					for(int i = 0; i < listaEspecialidades.size() && !encontrado; i++)
					{
						if (listaEspecialidades.get(i).equals(comboBox.getSelectedItem().toString()))
						{
							encontrado = true;
							break;
						}
					}
					if (encontrado)
					{
						JOptionPane.showMessageDialog(frame, "Especialidad ya ingresada","Error",JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						listaEspecialidades.add(comboBox.getSelectedItem().toString());
						listaProcedimientos.add("");
						model2.addElement(comboBox.getSelectedItem().toString());
						comboBox_2.setModel(model2);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Seleccione una opción","Error",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		JButton button = new JButton("Agregar");//Centro medico
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (comboBox_1.getSelectedItem().toString().equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Seleccione una opción", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (CentroMedico.contains(comboBox_1.getSelectedItem().toString()))
				{
					JOptionPane.showMessageDialog(frame, "Ese centro médico ya está ingresado","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{	
					CentroMedico += comboBox_1.getSelectedItem().toString() + "-";
				}	
			}			
		});
		
		JButton button_1 = new JButton("Agregar");//Boton procedimiento
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!comboBox_2.getSelectedItem().toString().equals(""))
				{
					final int Pos = BuscarEspe(comboBox_2.getSelectedItem().toString());
					EventQueue.invokeLater(new Runnable() 
					{
						public void run() 
						{
							try
							{
								VentanaProcedimiento window = new VentanaProcedimiento(Pos);
								window.frame.setVisible(true);
							} 
							catch (Exception e) 
							{
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Seleccione una opción","Error",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaAdministrador window = new VentanaAdministrador();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnVolver.setBackground(Color.WHITE);
		
		JLabel lblFoto = new JLabel("Nombre foto:");
		lblFoto.setFont(new Font("Verdana", Font.BOLD, 11));
		
		final JTextPane textPane_9 = new JTextPane();//foto
		textPane_9.setToolTipText("Por ejemplo: foto.png \r\n(la foto debe de estar en la carpeta Imagenes en el ruta de este proyecto.)");
		textPane_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textPane_9.setBackground(Color.WHITE);
		
		JLabel lblIngreseUnIdioma = new JLabel("Ingrese un idioma");
		
		BufferedImage image1 = ImageIO.read(IngresarMedico.class.getResource("/Imagenes/log.png"));
		BufferedImage resizedImage1 = resize(image1,24,21);
		
		lblIngreseUnIdioma.setIcon(new ImageIcon(resizedImage1));
		lblIngreseUnIdioma.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				textPane_6.setText(textPane_6.getText().replace(" ",""));
				String[] idiomaA = Idioma.split("\n");
				boolean find = false;
				boolean find2 = false;
				for (String i : idiomaA)
				{
					if (textPane_6.getText().toLowerCase().equals(i.toLowerCase()))
					{
						find = true;
					}
				}
				
				for (int i = 0; i < textPane_6.getText().length(); i++)
				{
					if(textPane_6.getText().charAt(i) == '0' || textPane_6.getText().charAt(i) == '1' || textPane_6.getText().charAt(i) == '2' || textPane_6.getText().charAt(i) == '3' || textPane_6.getText().charAt(i) == '4' || textPane_6.getText().charAt(i) == '5' || textPane_6.getText().charAt(i) == '6' || textPane_6.getText().charAt(i) == '7' || textPane_6.getText().charAt(i) == '8' || textPane_6.getText().charAt(i) == '9')
					{
						find2 = true;
					}
				}
				
				if (textPane_6.getText().equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Ingrese un idioma","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					if (find)
					{
						JOptionPane.showMessageDialog(frame, "Ese idioma ya esta ingresado", "Error",JOptionPane.INFORMATION_MESSAGE);
					}
					else if (find2)
					{
						JOptionPane.showMessageDialog(frame, "Solo letras", "Error",JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						Idioma += textPane_6.getText() + "\n";
					}	
				}
			}
		});
			
		lblIngreseUnIdioma.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblIngreseUnaAfiliacion = new JLabel("Ingrese una afiliacion");
		lblIngreseUnaAfiliacion.setIcon(new ImageIcon(resizedImage1));
		lblIngreseUnaAfiliacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				textPane_7.setText(textPane_7.getText().replace(" ",""));
				String[] idiomaA = Afiliacion.split(", ");
				boolean find = false;
				boolean find2 = false;
				
				for (String i : idiomaA)
				{
					if (textPane_7.getText().toLowerCase().equals(i.toLowerCase()))
					{
						find = true;
					}
				}
				
				for (int i = 0; i < textPane_7.getText().length(); i++)
				{
					if(textPane_7.getText().charAt(i) == '0' || textPane_7.getText().charAt(i) == '1' || textPane_7.getText().charAt(i) == '2' || textPane_7.getText().charAt(i) == '3' || textPane_7.getText().charAt(i) == '4' || textPane_7.getText().charAt(i) == '5' || textPane_7.getText().charAt(i) == '6' || textPane_7.getText().charAt(i) == '7' || textPane_7.getText().charAt(i) == '8' || textPane_7.getText().charAt(i) == '9')
					{
						find2 = true;
					}
				}
				
				if (textPane_7.getText().equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Ingrese una afiliación","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (find2)
				{
					JOptionPane.showMessageDialog(frame, "Solo letras", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					if (find)
					{
						JOptionPane.showMessageDialog(frame, "Esa afiliación ya está ingresada", "Error",JOptionPane.INFORMATION_MESSAGE);
					}
					
					else
					{
						Afiliacion += textPane_7.getText() + ", ";
					}	
				}
			}
		});
		lblIngreseUnaAfiliacion.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblIngreseUnCentro = new JLabel("Ingrese un centro de estudios");
		lblIngreseUnCentro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				String[] idiomaA = CE.split(", ");
				boolean find = false;
				boolean find2 = false;
				for (String i : idiomaA)
				{
					if (textPane_8.getText().toLowerCase().equals(i.toLowerCase()))
					{
						find = true;
					}
				}
				
				for (int i = 0; i < textPane_8.getText().length(); i++)
				{
					if(textPane_8.getText().charAt(i) == '0' || textPane_8.getText().charAt(i) == '1' || textPane_8.getText().charAt(i) == '2' || textPane_8.getText().charAt(i) == '3' || textPane_8.getText().charAt(i) == '4' || textPane_8.getText().charAt(i) == '5' || textPane_8.getText().charAt(i) == '6' || textPane_8.getText().charAt(i) == '7' || textPane_8.getText().charAt(i) == '8' || textPane_8.getText().charAt(i) == '9')
					{
						find2 = true;
					}
				}
				
				if (textPane_8.getText().equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Ingrese un centro de estudios","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (find2)
				{
					JOptionPane.showMessageDialog(frame, "Solo letras", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else
				{
					if (find)
					{
						JOptionPane.showMessageDialog(frame, "Ese centro de estudios ya está ingresado", "Error",JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						CE += textPane_8.getText() + ", ";
					}	
				}
			}
		});
		lblIngreseUnCentro.setIcon(new ImageIcon(resizedImage1));
		lblIngreseUnCentro.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblGuardarDatos = new JLabel("Guardar datos");
		lblGuardarDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				boolean find = false;
				String password = "";
				char[] x = passwordField.getPassword();
				StringBuilder SB = new StringBuilder();
				for (char i : x)
				{
					SB.append(i);
				}
				password = SB.toString();
				
				for (String i : listaProcedimientos)
				{
					if (i.equals(""))
					{
						find = true;
					}
				}
				String[] Centros = CentroMedico.split("-");
				
				String nombre = textPane.getText();
				String apellido1 = textPane_1.getText();
				String apellido2 = textPane_2.getText();
				String correo = textPane_3.getText();
				String cedula = textPane_4.getText();
				String slogan = textPane_5.getText();
				
				boolean findNombre = false;
				boolean findA1 = false;
				boolean findA2 = false;
				boolean findCorreo = RegistrodePaciente.ValidarEmail(correo);
				boolean findCorreo1 = RegistrodePaciente.BuscarPacienteporCorreo(correo);
				boolean findCedula = false;
				
				
				for (int i = 0; i < nombre.length(); i++)
				{
					if(nombre.charAt(i) == '0' || nombre.charAt(i) == '1' || nombre.charAt(i) == '2' || nombre.charAt(i) == '3' || nombre.charAt(i) == '4' || nombre.charAt(i) == '5' || nombre.charAt(i) == '6' || nombre.charAt(i) == '7' || nombre.charAt(i) == '8' || nombre.charAt(i) == '9')
					{
						findNombre = true;
					}
				}
				
				for (int i = 0; i < apellido1.length(); i++)
				{
					if(apellido1.charAt(i) == '0' || apellido1.charAt(i) == '1' || apellido1.charAt(i) == '2' || apellido1.charAt(i) == '3' || apellido1.charAt(i) == '4' || apellido1.charAt(i) == '5' || apellido1.charAt(i) == '6' || apellido1.charAt(i) == '7' || apellido1.charAt(i) == '8' || apellido1.charAt(i) == '9')
					{
						findA1 = true;
					}
				}
				
				for (int i = 0; i < apellido2.length(); i++)
				{
					if(apellido2.charAt(i) == '0' || apellido2.charAt(i) == '1' || apellido2.charAt(i) == '2' || apellido2.charAt(i) == '3' || apellido2.charAt(i) == '4' || apellido2.charAt(i) == '5' || apellido2.charAt(i) == '6' || apellido2.charAt(i) == '7' || apellido2.charAt(i) == '8' || apellido2.charAt(i) == '9')
					{
						findA2 = true;
					}
				}
				
				for (int i = 0; i < cedula.length(); i++)
				{
					if(cedula.charAt(i) != '0' && cedula.charAt(i) != '1' && cedula.charAt(i) != '2' && cedula.charAt(i) != '3' && cedula.charAt(i) != '4' && cedula.charAt(i) != '5' && cedula.charAt(i) != '6' && cedula.charAt(i) != '7' && cedula.charAt(i) != '8' && cedula.charAt(i) != '9')
					{
						findCedula = true;
					}
				}
				
				for (int i = 0; i < slogan.length(); i++)
				{
					if(slogan.charAt(i) == '0' || slogan.charAt(i) == '1' || slogan.charAt(i) == '2' || slogan.charAt(i) == '3' || slogan.charAt(i) == '4' || slogan.charAt(i) == '5' || slogan.charAt(i) == '6' || slogan.charAt(i) == '7' || slogan.charAt(i) == '8' || slogan.charAt(i) == '9')
					{
						findA1 = true;
					}
				}
				
				if(textPane.getText().replace(" ", "").equals("") || textPane_1.getText().replace(" ", "").equals("") || textPane_2.getText().replace(" ", "").equals("") || textPane_3.getText().replace(" ", "").equals("") || textPane_4.getText().replace(" ", "").equals("") || textPane_5.getText().replace(" ", "").equals("") || textPane_6.getText().replace(" ", "").equals("") || textPane_7.getText().replace(" ", "").equals("") || textPane_8.getText().replace(" ", "").equals("") || password.replace("", " ").equals("") || listaEspecialidades.size() == 0 || find || CentroMedico.replace(" ", "").equals("") || Idioma.replace(" ", "").equals("") || CE.replace(" ", "").equals("") || Afiliacion.replace(" ", "").equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Llene todos los espacios e ingrese todas las opciones indicadas","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (findNombre)
				{
					JOptionPane.showMessageDialog(frame, "Solo usar letras en el nombre", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (findA1)
				{
					JOptionPane.showMessageDialog(frame, "Solo letras en el primer apellido", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (password.length()<8)
				{
					JOptionPane.showMessageDialog(frame, "La contraseña debe ser mayor a 8 caracteres", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (findA2)
				{
					JOptionPane.showMessageDialog(frame, "Solo letras en el segundo apellido", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (findCorreo)
				{
					JOptionPane.showMessageDialog(frame, "Correo no valido", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if(cedula.length()!=9)
				{
					JOptionPane.showMessageDialog(frame, "La cedula debe de ser de 9 dígitos", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if(cedula.charAt(0) == '0')
				{
					JOptionPane.showMessageDialog(frame, "La cedula no puede empezar con un 0", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (findCedula)
				{
					JOptionPane.showMessageDialog(frame, "Solo números en la cedula", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if (findCorreo1)
				{
					JOptionPane.showMessageDialog(frame, "Correo ya utilizado por otro usuario", "Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else
				{
					String foto = "/Imagenes/"+textPane_9.getText();
					try 
					{
						new ImageIcon(IngresarMedico.class.getResource(foto));
						Medico.IngresarMedico(textPane.getText(), textPane_1.getText(), textPane_2.getText(), "/Imagenes/"+textPane_9.getText(), textPane_4.getText(), textPane_3.getText(), listaEspecialidades, "\"" + textPane_5.getText() + "\"", Centros, listaProcedimientos, Idioma, CE, Afiliacion, password);
						EventQueue.invokeLater(new Runnable()
						{
							public void run() 
							{
								try 
								{
									Buscador window = new Buscador();
									window.frame.setVisible(true);
									frame.dispose();
								} 
								catch (Exception e) 
								{
									e.printStackTrace();
								}
							}
						});
					} 
					catch (Exception e1) 
					{
						JOptionPane.showMessageDialog(frame, "La imagen no fue encontrada, verifique que su nombre este correcto y que se encuentre en la ruta: /Imagenes/ de este proyecto","Error",JOptionPane.INFORMATION_MESSAGE);
					}
				}

			}
		});
		lblGuardarDatos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		BufferedImage image2 = ImageIO.read(IngresarMedico.class.getResource("/Imagenes/sign1.jpg"));
		BufferedImage resizedImage2 = resize(image2,83,83);
		
		lblGuardarDatos.setIcon(new ImageIcon(resizedImage2));
		lblGuardarDatos.setBackground(Color.WHITE);
		lblGuardarDatos.setFont(new Font("Verdana", Font.BOLD, 11));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textPane_8, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPane_7, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPane_6, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIngreseUnCentro, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIngreseUnaAfiliacion)
								.addComponent(lblIngreseUnIdioma, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(button_1))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnIngresar)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblGuardarDatos, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
									.addGap(229)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnVolver)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSlogan, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textPane_5, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblFoto))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCedula, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
									.addComponent(lblContrasea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPane_4, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPane_9, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))))
					.addGap(26))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCedula, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textPane_9, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textPane_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textPane_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textPane_7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblIngreseUnIdioma, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblIngreseUnaAfiliacion, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIngreseUnCentro, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(textPane_8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblSlogan, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIngresar)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(125)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1))
							.addGap(18)
							.addComponent(lblGuardarDatos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(19))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnVolver)
							.addGap(35))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	//Funcion que ajusta el tamaño de una imagen
	public static BufferedImage resize(BufferedImage image, int width, int height) {
	    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bi;
	}
}

