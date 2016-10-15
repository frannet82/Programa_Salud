//Esta clase permite borrar tipos de padecimientos del sistema seleccionando de una lista que muestra el nombre de los tipos ya ingresadas
//Si se borra un tipo padecimiento se borran todos los padecimientos asociados a ese tipo
package healthAbility;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class BorrarPadecimiento{

	JFrame frame;

	/**
	 * Create the application.
	 */

	public BorrarPadecimiento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Vector comboBoxItems=new Vector();
	    final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
	    model.addElement(" ");
	    
	    for (int i = 0; i < Padecimiento.tipos.size(); i++)
	    {
	    	for(String x : Padecimiento.nombrePadecimiento.get(i))
	    	{
	    		model.addElement(x);
	    	}	
	    }
	    
	    final JComboBox comboBox1 = new JComboBox(model);
		comboBox1.setBackground(Color.WHITE);
		comboBox1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de padecimientos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox1.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JButton btnBorrarPadecimiento = new JButton("Borrar Padecimiento");
		btnBorrarPadecimiento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				String texto=comboBox1.getSelectedItem().toString();
				int encontrar=Padecimiento.borrarNombre(texto);
				if(encontrar!=-1)
				{
					JOptionPane.showMessageDialog(frame, "El padecimiento fue eliminado con éxito","Exito",JOptionPane.INFORMATION_MESSAGE);
					model.removeAllElements();
				    for (int i = 0; i < Padecimiento.tipos.size(); i++)
				    {
				    	for(String x : Padecimiento.nombrePadecimiento.get(i))
				    	{
				    		model.addElement(x);
				    	}
				    }
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Por favor seleccione un padecimiento","Error",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
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
					.addGap(142)
					.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(116, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(192, Short.MAX_VALUE)
					.addComponent(btnBorrarPadecimiento)
					.addGap(163))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(210)
					.addComponent(btnVolver)
					.addContainerGap(211, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
					.addComponent(btnBorrarPadecimiento)
					.addGap(18)
					.addComponent(btnVolver)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
