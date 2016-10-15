//Esta clase permite al administrador indicarle al sistema si va a ingresar un nuevo tipo de padecimiento o un nuevo padecimiento en un tipo ya ingresado
package healthAbility;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPadecimiento 
{
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPadecimiento window = new VentanaPadecimiento();
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
	public VentanaPadecimiento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//Este metodo inicializa la ventana
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JLabel lblPregunta = new JLabel("\u00BFDesea registrar un nuevo tipo de padecimiento?");
		lblPregunta.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				RegistrarPadecimientoNuevo window = new RegistrarPadecimientoNuevo();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnSi.setBackground(Color.WHITE);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try 
						{
							RegistrarPadecimiento window = new RegistrarPadecimiento();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNo.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(60, Short.MAX_VALUE)
					.addComponent(lblPregunta, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(139)
					.addComponent(btnSi)
					.addGap(62)
					.addComponent(btnNo)
					.addContainerGap(147, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPregunta, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNo)
						.addComponent(btnSi))
					.addContainerGap(190, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(520, 250, 450, 121);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
