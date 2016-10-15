//Esta clase permite ingresar el nombre de un padecimiento en un tipo de padecimiento ya ingresado al sistema. 
//Los pacientes puedan acceder a él por medio del buscador.
package healthAbility;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarPadecimiento {

	JFrame frame;
	private JTextField textField;

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
					RegistrarPadecimiento window = new RegistrarPadecimiento();
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
	//Aquí se abre la ventana para el registro de padecimientos por el nombre y clasificandolo en la lista de tipos de padecimientos
	public RegistrarPadecimiento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 150, 326, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Nombre del padecimiento");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo del padecimiento");
		
	    Vector comboBoxItems=new Vector();
	    final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
	    model.addElement("");
	    
	    for (int i = 0; i < Padecimiento.cantPadecimientos; i++)
	    {
	    	model.addElement(Padecimiento.tipos.get(i));
	    }
	    
		final JComboBox comboBox1 = new JComboBox(model);
		comboBox1.setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(textField.getText().equals(""))
				{
					JOptionPane.showMessageDialog(frame, "No se puede registrar el padecimiento debido a que no lleno espacios obligatorios ", "Error!", JOptionPane.WARNING_MESSAGE);
				}
				else if(Padecimiento.validarRegistro(textField.getText())!=1)
				{
					JOptionPane.showMessageDialog(frame, "No se puede registrar el padecimiento debido a que ya existe uno con ese nombre","Error",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					Padecimiento.ingresarPadecimiento(textField.getText(),comboBox1.getSelectedItem().toString(),"");
					JOptionPane.showMessageDialog(frame, "El padecimiento fue registrado con exito","Exito",JOptionPane.INFORMATION_MESSAGE);
					VentanaAdministrador window = new VentanaAdministrador();
					window.frame.setVisible(true);
					frame.dispose();
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
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
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)
								.addComponent(comboBox1, 0, 260, Short.MAX_VALUE))
							.addGap(28))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
									.addComponent(btnNewButton_1)))
							.addGap(28))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(41))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
