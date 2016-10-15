package healthAbility;

import healthAbility.Interfaz;
import healthAbility.RegistrodePaciente;
import healthAbility.Buscador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerfilDusuario {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilDusuario window = new PerfilDusuario();
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
	public PerfilDusuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 737, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("___________________________________________________________________________________________________________________________________________________________________________________________");
		label.setForeground(new Color(169, 169, 169));
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\TITAN\\Desktop\\Iconos\\Doctores.png"));
		
		JTextPane textPane = new JTextPane();
		textPane.setText("HealthABILITY");
		textPane.setForeground(new Color(51, 153, 102));
		textPane.setFont(new Font("Sylfaen", Font.PLAIN, 29));
		textPane.setEditable(false);
		
		JLabel lblNewLabel = new JLabel("Nombre: "+RegistrodePaciente.DatosDePacientes.get(RegistrodePaciente.ValorCambiodeperfil) +" Apellidos: "+ RegistrodePaciente.DatosApellido1.get(RegistrodePaciente.ValorCambiodeperfil)+"  "+RegistrodePaciente.DatosApellido2.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JLabel lblNewLabel_1 = new JLabel("Informacion Personal");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBackground(Color.GREEN);
		
		JLabel lblNewLabel_2 = new JLabel("Cédula: "+RegistrodePaciente.DatosDeCédula.get(RegistrodePaciente.ValorCambiodeperfil) );
		
		JLabel lblNewLabel_3 = new JLabel("Correo Electrónico: "+RegistrodePaciente.DatosDeCorreoElectrónico.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JLabel lblNewLabel_4 = new JLabel("Área de padecimiento: "+RegistrodePaciente.DatosPadecimientoP.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
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
		btnSalir.setForeground(Color.BLUE);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalir.setBackground(Color.LIGHT_GRAY);
		
		JButton btnBuscador = new JButton("Buscador");
		btnBuscador.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
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
		});
		btnBuscador.setForeground(Color.BLUE);
		btnBuscador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscador.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblCitas = new JLabel("Cita");
		lblCitas.setForeground(Color.BLUE);
		lblCitas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCitas.setBackground(Color.BLUE);
		
		JLabel lblNewLabel_5 = new JLabel(RegistrodePaciente.DatosfechaCita.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JLabel lblNewLabel_6 = new JLabel(RegistrodePaciente.DatosdiaCita.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JLabel lblNewLabel_7 = new JLabel(RegistrodePaciente.DatosCita.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JLabel lblNewLabel_8 = new JLabel("Provincia/Estado: "+RegistrodePaciente.DatosProvincia.get(RegistrodePaciente.ValorCambiodeperfil));
		
		JLabel lblNewLabel_9 = new JLabel("Descripción padecimiento: "+RegistrodePaciente.DatosDescripPadecimiento.get(RegistrodePaciente.ValorCambiodeperfil));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 1122, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(267)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_9)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel_8)
								.addContainerGap())
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnBuscador, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
									.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(457))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblNewLabel_2)
													.addGap(257)
													.addComponent(lblNewLabel_5))
												.addComponent(lblNewLabel_1))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCitas, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblNewLabel_6)
													.addGap(18)
													.addComponent(lblNewLabel_7)))))
									.addContainerGap(114, Short.MAX_VALUE))))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label)
					.addGap(80)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblCitas, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblNewLabel_3)
							.addGap(18)
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_8)
							.addGap(18)
							.addComponent(lblNewLabel_9)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscador, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(63))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_7))
							.addGap(267))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
