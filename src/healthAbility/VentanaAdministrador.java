//Esta clase permite administrar lo que es el ingreso y borrado de los medicos, clinicas y padecimientos del sistema.
//Se controla por medio de una interfaz grafica.
package healthAbility;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class VentanaAdministrador 
{
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdministrador window = new VentanaAdministrador();
					window.frame.setVisible(true);
					//frame.hide();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Clinica.registrarClinica("Hospital Max Peralta","200 mts sur de la esquina suroeste del Parque Central","Regional Central","Cartago","Cartago","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Max Peralta.jpg");
		Clinica.registrarClinica("Hospital William Allen, Turrialba","250 mts este de la Iglesia","Turrialba","Turrialba","Cartago","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\William Allen.jpg");
		Clinica.registrarClinica("Hospital San Juan de Dios", "100 mts del supermercado", "chepe", "chepe", "San José","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Juan de Dios.jpg" );
		Clinica.registrarClinica("Hospital Calderon Guardia", "Del parque nacional 100 mts Norte, San José", "Distrito", "Canton", "San José", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Calderon Guardia.jpg");
		Clinica.registrarClinica("Hospital Mexico", "La Uruca, de la Pozuelo 200 mts. Sur , despues de la rotonda 200 mts. Oeste", "San José", "San José", "San José", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Mexico.jpg");
		Clinica.registrarClinica("Hospital de la Mujer","De la Escuela Ricardo Jimenez 100 mts. Oeste calle central San Jos�","San José","San José","San José","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Hospital de la mujer.jpg");
		Clinica.registrarClinica("Hospital Blanco Cervantes", "De las oficinas centrales de la Cruz Roja 150 mts. Oeste, detr疽 del Ministerio de Salud", "San José", "San José", "San José", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Blanco Cervantes.jpg");
		Clinica.registrarClinica("Hospital Tony Facio, Limon","","","Guapiles","Limón","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Tony Facio.jpg");
		Clinica.registrarClinica("Hospital de San Carlos", "2 kilometros al norte de la catedral de Ciudad Quesada", "", "San Carlos", "Alajuela", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Carlos.jpg");
		Clinica.registrarClinica("Hospital Enrique Baltodano Brice", "Barrio Moracia,contiguo a la Cruz Roja", "", "Liberia", "Guanacaste", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Enrique Baltodano Brice.jpg");
		Clinica.registrarClinica("Hospital de la Anexion", "Avenida principal frente al supermercado PALI", "", "Nicoya", "Guanacaste", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\La Anexion.jpg");
		Clinica.registrarClinica("Hospital de Ciudad Neilly", "De la entrada principal de Ciudad Neily 2 kim carretera hacia Paso Canoas, contiguo a la gasolinera", "", "Ciudad Neily", "Puntarenas", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Ciudad Neily.jpg");
		Clinica.registrarClinica("Hospital de Osa Tom疽 Casas Casaj俍", "500 metros norte de la escuela de Ojo de Agua", "Ciudad Cortes", "Osa", "Puntarenas", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Tomas Casas.jpg");
		Clinica.registrarClinica("Hospital San Francisco de As﨎", "400 metros oeste de la terminal de buses", "", "Grecia", "Alajuela", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Francisco de As﨎.jpg");
		Clinica.registrarClinica("Hospital San Vicente de Paul", "Avenida 16" , "", "", "Heredia", "C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\San Vicente de Paul.jpg");
		Clinica.registrarClinica("Hospital Psiqui疸rico Roberto Chac Paut", "4 km al norte de la municipalidad de la Union", "Tres Rios", "", "Cartago","C:\\Users\\Sandra\\workspace\\Healthabilitty\\src\\ImagenesClinicas\\Roberto Chacon Paut.jpg" );
		
		Padecimiento.ingresarPadecimiento("Infarto ","Coronaria","Da al miocardio");
		Padecimiento.ingresarPadecimiento("Fuertes dolores de cabeza","Neurologico","Aneurisma");
		Padecimiento.ingresarPadecimiento("Dolor de huesos","Oseo","Artritis");
		Padecimiento.ingresarPadecimiento("Dificultad respiratoria","Pulmonar", "Asma");
		Padecimiento.ingresarPadecimiento("Presion alta","Coronaria", "Obstrucci de arteria");
		Padecimiento.ingresarPadecimiento("Fractura en la pierna","Oseo","Fractura de tibia y peron�");	
	}

	/**
	 * Create the application.
	 */
	//Funcion que abre la ventana del administrador
	public VentanaAdministrador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(470, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Ventana de administraci\u00F3n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Administrar m\u00E9dicos");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblAdministrarClinicas = new JLabel("Administrar clinicas");
		lblAdministrarClinicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministrarClinicas.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblAdministrarPadecimientos = new JLabel("Administrar padecimientos");
		lblAdministrarPadecimientos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministrarPadecimientos.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Registrar médico");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				EventQueue.invokeLater(new Runnable() 
				{
					public void run() 
					{
						try {
							IngresarMedico window = new IngresarMedico();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setForeground(Color.BLUE);
		
		JLabel lblBorrarMdico = new JLabel("Borrar m\u00E9dico");
		lblBorrarMdico.setFont(new Font("Verdana", Font.BOLD, 11));
		lblBorrarMdico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				EventQueue.invokeLater(new Runnable() 
				{
					public void run() 
					{
						try 
						{
							BorrarMedico window = new BorrarMedico();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		lblBorrarMdico.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarMdico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBorrarMdico.setForeground(Color.BLUE);
		
		JLabel lblRegistrarClinica = new JLabel("Registrar clinica");
		lblRegistrarClinica.setFont(new Font("Verdana", Font.BOLD, 11));
		lblRegistrarClinica.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RegistrarClinicas window = new RegistrarClinicas();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			
			}
		});
		lblRegistrarClinica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistrarClinica.setForeground(Color.BLUE);
		
		JLabel lblBorrarClinica = new JLabel("Borrar clinica");
		lblBorrarClinica.setFont(new Font("Verdana", Font.BOLD, 11));
		lblBorrarClinica.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							BorrarClinicas window = new BorrarClinicas();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}});
		lblBorrarClinica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBorrarClinica.setForeground(Color.BLUE);
		
		JLabel lblRegistrarPadecimiento = new JLabel("Registrar padecimiento");
		lblRegistrarPadecimiento.setFont(new Font("Verdana", Font.BOLD, 11));
		lblRegistrarPadecimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarPadecimiento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaPadecimiento window = new VentanaPadecimiento();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		lblRegistrarPadecimiento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistrarPadecimiento.setForeground(Color.BLUE);
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblBorrarPadecimiento = new JLabel("Borrar padecimiento");
		lblBorrarPadecimiento.setFont(new Font("Verdana", Font.BOLD, 11));
		lblBorrarPadecimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrarPadecimiento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							BorrarPadecimiento window = new BorrarPadecimiento();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		lblBorrarPadecimiento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBorrarPadecimiento.setForeground(Color.BLUE);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Interfaz window = new Interfaz();
							window.frmHealthability.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(254)
					.addComponent(btnNewButton)
					.addContainerGap(277, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(125)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblBorrarPadecimiento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblRegistrarPadecimiento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblAdministrarPadecimientos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblBorrarClinica, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblRegistrarClinica, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblAdministrarClinicas, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblBorrarMdico, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(separator_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
						.addComponent(separator_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
						.addComponent(separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(144, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblBorrarMdico, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAdministrarClinicas, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblRegistrarClinica)
					.addGap(18)
					.addComponent(lblBorrarClinica, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAdministrarPadecimientos)
					.addGap(18)
					.addComponent(lblRegistrarPadecimiento)
					.addGap(18)
					.addComponent(lblBorrarPadecimiento)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
