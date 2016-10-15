//Funcion que abre la ventana que permite calificar al medico
package healthAbility;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class VentanaDeCalificacion {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDeCalificacion window = new VentanaDeCalificacion(0);
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
	public VentanaDeCalificacion(int Pos) {
		initialize(Pos);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int Pos) 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(450, 250, 470, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JEditorPane dtrpnComment = new JEditorPane();
		dtrpnComment.setBackground(Color.WHITE);
		
		JLabel lblPuntuacin = new JLabel(" Puntuaci\u00F3n:");
		lblPuntuacin.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		lblPuntuacin.setFont(new Font("Verdana", Font.BOLD, 11));
		lblPuntuacin.setBackground(Color.WHITE);
		
		final JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Verdana", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"5","4","3","2","1"}));;
		
		JScrollPane scrollPane = new JScrollPane();
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Medico.CalificarMedico(Pos,Integer.parseInt(comboBox.getSelectedItem().toString()));
				
				try 
				{
					Medico.reviews.get(Pos).ingresarComentario("Fabian Arce Molina",dtrpnComment.getText(),comboBox.getSelectedItem().toString());
					PerfilMedico window = new PerfilMedico(Pos);
					window.frame.setVisible(true);
					frame.dispose();
				} 
				
				catch (BadLocationException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		});
		btnEnviar.setFont(new Font("Verdana", Font.BOLD, 11));
		btnEnviar.setBackground(Color.WHITE);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblPuntuacin, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(btnEnviar, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addGap(642))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPuntuacin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
							.addComponent(btnEnviar)
							.addGap(32))))
		);
		scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Comente su opinion sobre este m\u00E9dico", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(dtrpnComment);
		frame.getContentPane().setLayout(groupLayout);
	}
}
