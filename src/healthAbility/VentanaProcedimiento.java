//Esta clase permite ingresar un procedimiento en un area de especilidad de un medico, con su nombre y costo
package healthAbility;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaProcedimiento {

	JFrame frame;
	static String Procedimiento;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProcedimiento window = new VentanaProcedimiento(0);
					window.frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	
	public VentanaProcedimiento(int Pos) {
		initialize(Pos);
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(final int Pos) 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);

		JLabel lblNombreDel = new JLabel("Nombre del procedimiento:");
		lblNombreDel.setForeground(new Color(0, 0, 0));
		lblNombreDel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNombreDel.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNombreDel.setHorizontalAlignment(SwingConstants.CENTER);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblCosto = new JLabel("Costo: $");
		lblCosto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCosto.setForeground(Color.BLACK);
		lblCosto.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCosto.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("");
		textPane_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				boolean find = false;
				for (int i = 0; i < textPane_1.getText().length(); i++)
				{
					if(textPane_1.getText().charAt(i) != '0' && textPane_1.getText().charAt(i) != '1' && textPane_1.getText().charAt(i) != '2' && textPane_1.getText().charAt(i) != '3' && textPane_1.getText().charAt(i) != '4' && textPane_1.getText().charAt(i) != '5' && textPane_1.getText().charAt(i) != '6' && textPane_1.getText().charAt(i) != '7' && textPane_1.getText().charAt(i) != '8' && textPane_1.getText().charAt(i) != '9')
					{
						find = true;
					}
				}
				if (textPane.getText().equals("") || textPane_1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Llene los campos solicitados","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else if(find)
				{
					JOptionPane.showMessageDialog(frame, "El costo solo puede tener numeros","Error",JOptionPane.INFORMATION_MESSAGE);
				}
				
				else
				{
					Procedimiento = "";
					Procedimiento = IngresarMedico.listaProcedimientos.get(Pos);
					IngresarMedico.listaProcedimientos.set(Pos, Procedimiento + textPane.getText() + " " +"$"+ textPane_1.getText() +"\n");
					frame.dispose();
				}
			}
		});
		
		btnGuardar.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(119)
							.addComponent(lblCosto, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNombreDel)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGuardar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNombreDel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCosto, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addComponent(btnGuardar)
					.addGap(31))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(380, 260, 550, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}