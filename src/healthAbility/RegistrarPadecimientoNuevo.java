//Esta clase permite ingresar el nombre de un nuevo tipo de padecimiento al sistema. 
package healthAbility;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarPadecimientoNuevo {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		Padecimiento.ingresarPadecimiento("Corazon acelerado","Cardiologia","Daño al miocardio");
		Padecimiento.ingresarPadecimiento("Dolor de cabeza","Neurologia","Aneurisma");
		Padecimiento.ingresarPadecimiento("Alergia","Dermatologia","Artritis");
		Padecimiento.ingresarPadecimiento("Gripe", "Pediatria", "Agua en los pulmones");
		Padecimiento.ingresarPadecimiento("Infarto","Coronaria","Da al miocardio");
		Padecimiento.ingresarPadecimiento("Dolor de huesos","Oseo","Artritis");
		Padecimiento.ingresarPadecimiento("Bronquitis","Pulmonar", "Agua en los pulmones");
		Padecimiento.ingresarPadecimiento("Infarto2","Coronaria", "Obstrucci de arteria");
		Padecimiento.ingresarPadecimiento("Fractura en la pierna","Oseo","Fractura de tibia y peron�");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarPadecimientoNuevo window = new RegistrarPadecimientoNuevo();
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
	//Aquí se abre la ventana para registrar nuevos tipos de padecimientos
	public RegistrarPadecimientoNuevo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JLabel lblNombreDelPadecimiento = new JLabel("\u00C1rea medica del nuevo tipo de padecimiento");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNuevoPadecimiento = new JLabel("Descripcion del nuevo tipo de padecimiento");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(Color.WHITE);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				boolean find = false;
				for(String i : Padecimiento.tipos)
				{
					if(i.toLowerCase().equals(textField.getText().replace(" ", "").toLowerCase()))
					{
						find = true;
						break;
					}
				}
				if(textField.getText().replace(" ", "").equals("") || textField_1.getText().replace(" ", "").equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Llene todos los campos","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else if (find)
				{
					JOptionPane.showMessageDialog(frame, "Esa especialidad ya esta registrada","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					Padecimiento.ingresarPadecimiento("", textField.getText(), textField_1.getText());
					JOptionPane.showMessageDialog(frame, "El padecimiento fue registrado con exito","Exito",JOptionPane.INFORMATION_MESSAGE);
					VentanaAdministrador window = new VentanaAdministrador();
					window.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegistrar)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNombreDelPadecimiento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNuevoPadecimiento, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombreDelPadecimiento)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNuevoPadecimiento)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(btnRegistrar)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(480, 220, 450, 212);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
