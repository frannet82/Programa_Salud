//Esta clase permite ingresar todos los datos respectivos de una clinica al sistema. 
//Se le crea un perfil al clinica.
//Los pacientes puedan acceder a él por medio del buscador.
package healthAbility;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import java.awt.Color;

public class RegistrarClinicas{

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarClinicas window = new RegistrarClinicas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Clinica.registrarClinica("Hospital Max Peralta","200 mts sur de la esquina suroeste del Parque Central","Regional Central","Cartago","Cartago","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Max Peralta.jpg");
		Clinica.registrarClinica("Hospital William Allen, Turrialba","250 mts este de la Iglesia","Turrialba","Turrialba","Cartago","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\William Allen.jpg");
		Clinica.registrarClinica("Hospital San Juan de Dios", "100 mts del supermercado", "chepe", "chepe", "San Jose","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Juan de Dios.jpg" );
		Clinica.registrarClinica("Hospital Calderon Guardia", "Del parque nacional 100 mts Norte, San Jose", "Distrito", "Canton", "San Jose", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Calderon Guardia.jpg");
		Clinica.registrarClinica("Hospital Mexico", "La Uruca, de la Pozuelo 200 mts. Sur , despues de la rotonda 200 mts. Oeste", "San jose", "San jose", "San Jose", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Mexico.jpg");
		Clinica.registrarClinica("Hospital de la Mujer","De la Escuela Ricardo Jimenez 100 mts. Oeste calle central San Jos�","San Jose","San Jose","San Jose","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Hospital de la mujer.jpg");
		Clinica.registrarClinica("Hospital Blanco Cervantes", "De las oficinas centrales de la Cruz Roja 150 mts. Oeste, detr疽 del Ministerio de Salud", "San Jose", "San Jose", "San Jose", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Blanco Cervantes.jpg");
		Clinica.registrarClinica("Hospital Tony Facio, Limon","","","Guapiles","Limon","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Tony Facio.jpg");
		Clinica.registrarClinica("Hospital de San Carlos", "2 kilometros al norte de la catedral de Ciudad Quesada", "", "San Carlos", "Alajuela", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Carlos.jpg");
		Clinica.registrarClinica("Hospital Enrique Baltodano Brice", "Barrio Moracia,contiguo a la Cruz Roja", "", "Liberia", "Guanacaste", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Enrique Baltodano Brice.jpg");
		Clinica.registrarClinica("Hospital de la Anexion", "Avenida principal frente al supermercado PALI", "", "Nicoya", "Guanacaste", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\La Anexion.jpg");
		Clinica.registrarClinica("Hospital de Ciudad Neilly", "De la entrada principal de Ciudad Neily 2 kim carretera hacia Paso Canoas, contiguo a la gasolinera", "", "Ciudad Neily", "Puntarenas", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Ciudad Neily.jpg");
		Clinica.registrarClinica("Hospital de Osa Tom疽 Casas Casaj俍", "500 metros norte de la escuela de Ojo de Agua", "Ciudad Cortes", "Osa", "Puntarenas", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Tomas Casas.jpg");
		Clinica.registrarClinica("Hospital San Francisco de As﨎", "400 metros oeste de la terminal de buses", "", "Grecia", "Alajuela", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Francisco de As﨎.jpg");
		Clinica.registrarClinica("Hospital San Vicente de Paul", "Avenida 16" , "", "", "Heredia", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Vicente de Paul.jpg");
		Clinica.registrarClinica("Hospital Psiqui疸rico Roberto Chac Paut", "4 km al norte de la municipalidad de la Union", "Tres Rios", "", "Cartago","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Roberto Chacon Paut.jpg" );
	}

	/**
	 * Create the application.
	 */
	//Aquí se abre la ventana para el registro de clinicas
	public RegistrarClinicas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Nombre de la clinica u hospital(obligatorio)");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Direcci\u00F3n(obligatorio)");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Distrito");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cant\u00F3n");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Provincia(obligatorio)");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Foto(ingrese el nombre de la foto)");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if((textField.getText()).equals("")||(textField_1.getText()).equals("")||(textField_4.getText()).equals("")){
					JOptionPane.showMessageDialog(frame, "No se puede registrar la clinica debido a que no lleno espacios obligatorios ", "Error!", JOptionPane.WARNING_MESSAGE);
				}
				else if(Clinica.validarRegistro(textField.getText())!=1)
				{
					JOptionPane.showMessageDialog(frame, "No se puede registrar la clinica debido a que ya existe una con ese nombre","Error",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					Clinica.registrarClinica(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), "/Imagenes/"+textField_5.getText());
					JOptionPane.showMessageDialog(frame, "La clinica fue registrada con exito","Exito",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EventQueue.invokeLater(new Runnable() 
				{
					public void run() 
					{
						try {
							VentanaAdministrador window = new VentanaAdministrador();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(476)
					.addComponent(btnNewButton_1)
					.addContainerGap(45, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(131))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(btnNewButton_1)
					.addGap(30))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
