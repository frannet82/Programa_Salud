package healthAbility;
import healthAbility.Padecimiento;

import javax.swing.JOptionPane; 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ListCellRenderer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.ComponentOrientation;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.SystemColor;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Perfil {

	JFrame frmHealthability2;
	private JTextField txtNombre;
	private JComboBox textField_1;
	private JTextField textField_2;
	private JPasswordField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox<String> textField_6;
	private static String pNombre;
	private static String pApellido1;
	private static String pApellido2;
	private static String pCédula;
	private static String pCorreoElectrónico;
	private static String pFotodelpaciente;
	private static String pCita;
	private static String pcontraseña;
	private static String ProvinciaEstado;
	JOptionPane VentanaEmergente = new JOptionPane(); 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil window = new Perfil();
					window.frmHealthability2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Perfil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmHealthability2 = new JFrame();
		frmHealthability2.setTitle("HealthABILITY");
		frmHealthability2.getContentPane().setName("");
		frmHealthability2.setIgnoreRepaint(true);
		frmHealthability2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\TITAN\\Desktop\\Iconos\\smbolo-mdico-del-caduceo-fondo-azul-9299141.jpg"));
		frmHealthability2.setVisible(true);
		frmHealthability2.setPreferredSize(new Dimension(645, 476));
		frmHealthability2.setResizable(false);
		frmHealthability2.setSize(new Dimension(675, 476));
		frmHealthability2.getContentPane().setBackground(Color.WHITE);
		frmHealthability2.setBackground(Color.WHITE);
		frmHealthability2.setBounds(100, 100, 708, 476);
		frmHealthability2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnPerfil = new JTextPane();
		txtpnPerfil.setEditable(false);
		txtpnPerfil.setFont(new Font("Tahoma", Font.PLAIN, 27));
		txtpnPerfil.setBackground(Color.WHITE);
		txtpnPerfil.setForeground(new Color(46, 139, 87));
		txtpnPerfil.setText("Create una cuenta");
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setEnabled(false);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPane.setForeground(Color.LIGHT_GRAY);
		textPane.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		// Entradas de los textos en blanco
		txtNombre = new JTextField();
		txtNombre.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtNombre.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtNombre.setSelectedTextColor(new Color(180, 180, 180));
		txtNombre.setName("Nombre");
		txtNombre.setToolTipText("");
		txtNombre.setColumns(10);
		
		textField_1 = new JComboBox();
		textField_1.setName("Provincia/Estado");
		
		textField_2 = new JTextField();
		textField_2.setName("Correo Electr\u00F3nico");
		textField_2.setColumns(10);
		
		textField_3 = new JPasswordField();
		textField_3.setToolTipText("La contrase\u00F1a debe tener m\u00EDnimo 8 caracteres.");
		textField_3.setName("Contrase\u00F1a");
		textField_3.setColumns(10);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setSelectedTextColor(SystemColor.activeCaptionBorder);
		textField.setName("Apellido");
		textField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setSelectedTextColor(SystemColor.activeCaptionBorder);
		textField_4.setName("Apellido2");
		textField_4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("La c\u00E9dula debe tener una cantidad de 9 d\u00EDgitos, no puede contener letras. ");
		textField_5.setSelectedTextColor(SystemColor.activeCaptionBorder);
		textField_5.setName("C\u00E9dula");
		textField_5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textField_5.setColumns(10);

		textField_6 = new JComboBox();
		textField_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				RegistrodePaciente.ValorDseleccion=(String)(textField_6.getSelectedItem());
				frmHealthability2.repaint();
			}
		});

		textField_1.insertItemAt("Heredia/Costa Rica", 0);
		textField_1.insertItemAt("San Jose/Costa Rica", 1);
		textField_1.insertItemAt("Alajuela/Costa Rica", 2);
		textField_1.insertItemAt("Cartago/Costa Rica", 3);
		textField_1.insertItemAt("Limón/Costa Rica", 4);
		textField_1.insertItemAt("Guanacaste/Costa Rica", 5);
		
		textField_6.insertItemAt(" ",0);
		int conteo;
		
		for (conteo=0; conteo < Padecimiento.tipos.size();conteo++){
			
			textField_6.insertItemAt(Padecimiento.tipos.get(conteo),conteo+1);
			}
		
		textField_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				RegistrodePaciente.ValorDseleccion2=(String)(textField_1.getSelectedItem());
				frmHealthability2.repaint();
			}
		});
				
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Acepto los T\u00E9rminos y Condiciones",true);
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setToolTipText("\r\n");
		rdbtnNewRadioButton.setSelected(false);
		
		//Toma los datos de los cuadros en blanco

		JButton btnRegistrarse = new JButton("Registrarse");//Boton, Es el boton que se muestra en pantalla como registrar
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //método para indicar lo que va a realizar el boton después de darle click
				
				String pNombre = txtNombre.getText();
				String pApellido1 = textField.getText();
				String pApellido2 = textField_4.getText();
				String pCédula = textField_5.getText();
			
				String pCorreoElectrónico =textField_2.getText();
				String pcontraseña = new String(textField_3.getPassword());
				//Todas las validaciones
				if (pNombre.equals("") || pApellido1.equals("") || pApellido2.equals("") || pCédula.equals("") || pCorreoElectrónico.equals("") || pcontraseña.equals("") ){
					JOptionPane.showMessageDialog(frmHealthability2,"Faltan Campos por rellenar","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que faltan campos
					frmHealthability2.repaint();// refresca la pantalla
				}
				else
				{
					int tamañoContraseña=pcontraseña.length();// tamaño de la contraseña para verificar si es minimo de 8 digitos
					int tamañopNombre=pNombre.length();
					int tamañopApellido1=pApellido1.length();
					int tamañopApellido2=pApellido2.length();
					int tamañoCédula=pCédula.length();
					int conta=1;
					int conta2=1;
					int conta3=1;
					int conta4=1;
					String spidcedula[]=pCédula.split("");
					String spidNombre[]=pNombre.split("");
					String spidpApellido1[]=pApellido1.split("");
					String spidpApellido2[]=pApellido2.split("");
					while (conta2!=tamañopNombre+1){
						try{
						
						if (spidNombre[conta2].equals(" ")){
							conta2=100;
							break;
							
						}
						else if ( spidNombre[conta2].equals("0") || spidNombre[conta2].equals("1") || spidNombre[conta2].equals("2") || spidNombre[conta2].equals("3") || spidNombre[conta2].equals("4") || spidNombre[conta2].equals("5") || spidNombre[conta2].equals("6") || spidNombre[conta2].equals("7") || spidNombre[conta2].equals("8") || spidNombre[conta2].equals("9")){
							conta2=200;
							break;
						}
						
						else{
							conta2++;
						}
						}
						finally{
							frmHealthability2.repaint();
							
							}
						}

					while (conta3!=tamañopApellido1+1){
						try{
						
						if (spidNombre[conta3].equals(" ")){
							conta3=100;
							break;
							
						}
						else if (spidpApellido1[conta3].equals("0") || spidpApellido1[conta3].equals("1") || spidpApellido1[conta3].equals("2") || spidpApellido1[conta3].equals("3") || spidpApellido1[conta3].equals("4") || spidpApellido1[conta3].equals("5") || spidpApellido1[conta3].equals("6") || spidpApellido1[conta3].equals("7") || spidpApellido1[conta3].equals("8") || spidpApellido1[conta3].equals("9")){
							conta3=200;
							break;
						}
						
						else{
							conta3++;
						}
						}
						finally{
							frmHealthability2.repaint();
							
							}
						}

					while (conta4!=tamañopApellido2+1){
						try{
						
						if (spidNombre[conta4].equals(" ")){
							conta4=100;
							break;
							
						}
						else if (spidpApellido2[conta4].equals("0") || spidpApellido2[conta4].equals("1") || spidpApellido2[conta4].equals("2") || spidpApellido2[conta4].equals("3") || spidpApellido2[conta4].equals("4") || spidpApellido2[conta4].equals("5") || spidpApellido2[conta4].equals("6") || spidpApellido2[conta4].equals("7") || spidpApellido2[conta4].equals("8") || spidpApellido2[conta4].equals("9")){
							conta4=200;
							break;
						}
						
						else{
							conta4++;
						}
						}
						finally{
							frmHealthability2.repaint();
							
							}
						}
					
					while (conta!=9){
						try{
							
						if (spidcedula[conta].equals(" ")){
							conta=100;
							break;
							
						}
						else if (!spidcedula[conta].equals("0") && !spidcedula[conta].equals("1") && !spidcedula[conta].equals("2") && !spidcedula[conta].equals("3") && !spidcedula[conta].equals("4") && !spidcedula[conta].equals("5") && !spidcedula[conta].equals("6") && !spidcedula[conta].equals("7") && !spidcedula[conta].equals("8") && !spidcedula[conta].equals("9")){
							conta=200;
							break;
						}
						
						else{
							conta++;
						}
						}
						finally{
							frmHealthability2.repaint();
							
							}
						}
					
					if(tamañoContraseña<8){
						JOptionPane.showMessageDialog(frmHealthability2,"La contraseña debe tener minimo 8 caracteres","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
					}
					else if(tamañoCédula!=9){
					JOptionPane.showMessageDialog(frmHealthability2,"La cédula debe tener 9 caracteres","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
					frmHealthability2.repaint();// refresca la pantalla
					
					}
						
					else if(spidcedula[1].equals("0")){
						JOptionPane.showMessageDialog(frmHealthability2,"La cédula no puede tener un cero al inicio","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
					}
					
					
					else if (conta==100){
						JOptionPane.showMessageDialog(frmHealthability2,"La cédula no puede tener espacios en blanco","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
					}
					else if(conta2==100 || conta3==100 || conta4==100){
						JOptionPane.showMessageDialog(frmHealthability2,"El nombre no puede tener espacios en blanco","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
					}
					else if(conta2==200 || conta3==200 || conta4==200){
						JOptionPane.showMessageDialog(frmHealthability2,"El nombre solo puede tener letras","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
					}
					else if (conta==200){
						JOptionPane.showMessageDialog(frmHealthability2,"La cédula no puede tener letras","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
					}
					else if (RegistrodePaciente.BuscarPaciente(pCédula)==true){
						JOptionPane.showMessageDialog(frmHealthability2,"Ya existe un paciente con esa cédula","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
						
					}
					
					else if(RegistrodePaciente.BuscarPacienteporCorreo(pCorreoElectrónico)==true){
						JOptionPane.showMessageDialog(frmHealthability2,"Ya existe un paciente con ese correo electrónico","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantalla
						
					}
					else if(RegistrodePaciente.ValidarEmail(pCorreoElectrónico)==false){
						JOptionPane.showMessageDialog(frmHealthability2,"El correo digitado no es válido","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantall
					
						
					}
					else if(rdbtnNewRadioButton.isSelected()==false){
						JOptionPane.showMessageDialog(frmHealthability2,"No ha aceptado los términos y condiciones","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						frmHealthability2.repaint();// refresca la pantall
						
					}
					
					else
					{
						boolean enviar = RegistrodePaciente.enviarEmail(pCorreoElectrónico);
						if (enviar)
						{
							RegistrodePaciente paciente1= new RegistrodePaciente(pNombre,pApellido1,pApellido2, pCédula, pCorreoElectrónico,pcontraseña);
							paciente1.GuardarDatos(pNombre,pApellido1,pApellido2, pCédula, pCorreoElectrónico,pcontraseña,RegistrodePaciente.ValorDseleccion,null,null,null,null,RegistrodePaciente.ValorDseleccion2);
							Interfaz window2 = new Interfaz();
							window2.frmHealthability.setVisible(true);
							frmHealthability2.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(frmHealthability2,"Se necesita conexion a internet","Error",JOptionPane.WARNING_MESSAGE);// mensaje emergente para indicar que la contraseña no es valida
						}
					}
				}
			}
		});

		JLabel lblNombre = new JLabel("Nombre/Apellido/Apellido");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setEnabled(false);
		
		JLabel lblCorreoElectronico = new JLabel("Provincia/Estado");
		lblCorreoElectronico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoElectronico.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("Correo Electr\u00F3nico");
		lblNewLabel.setEnabled(false);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setEnabled(false);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/doctora(4A) (2).jpg")));
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("HealthABILITY");
		textPane_1.setForeground(new Color(51, 153, 102));
		textPane_1.setFont(new Font("Sylfaen", Font.PLAIN, 29));
		textPane_1.setEditable(false);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Perfil.class.getResource("/Imagenes/Doctores.png")));
		
		JLabel lblCdula = new JLabel("C\u00E9dula");
		lblCdula.setEnabled(false);
		
		JLabel lblPadecimientos = new JLabel("Padecimientos");
		lblPadecimientos.setEnabled(false);
		
	
		textField_6.setToolTipText("Elija un Padecimiento");
		textField_6.setName("Nombre");
		textField_6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GroupLayout groupLayout = new GroupLayout(frmHealthability2.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(226)
					.addComponent(lblNewLabel_3))
				.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addGroup(groupLayout.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblCorreoElectronico, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(10)
												.addComponent(lblNewLabel_1)))
										.addComponent(lblNewLabel))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(rdbtnNewRadioButton))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField_3, Alignment.LEADING)
										.addComponent(txtNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
										.addComponent(textField_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addComponent(textField_1, Alignment.LEADING, 0, 99, Short.MAX_VALUE))
									.addGap(36)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblPadecimientos)
										.addComponent(lblCdula)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_6, 0, 67, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
										.addComponent(textField_5, 0, 0, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(67)
							.addComponent(txtpnPerfil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(203)
					.addComponent(btnRegistrarse))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(62)
							.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(txtpnPerfil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCdula))
								.addComponent(lblCorreoElectronico, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPadecimientos)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnNewRadioButton))
						.addComponent(lblNewLabel_2))
					.addGap(20)
					.addComponent(btnRegistrarse)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		frmHealthability2.getContentPane().setLayout(groupLayout);
	}
}

