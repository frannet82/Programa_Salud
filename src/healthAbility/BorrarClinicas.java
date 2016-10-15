//Esta clase permite borrar clínicas del sistema seleccionando de una lista que muestra el nombre de las clínicas ya ingresadas
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

public class BorrarClinicas {

	JFrame frame;

	/**
	 * Create the application.
	 */
	
	public BorrarClinicas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Vector comboBoxItems=new Vector();
	    final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
	    model.addElement(" ");
	    
	    for (int i = 0; i < Clinica.cantClinicas; i++)
	    {
	    	model.addElement(Clinica.nombre.get(i));
	    }
	    final JComboBox comboBox = new JComboBox(model);
	    
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de Clinicas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JButton btnBorrarClinica = new JButton("Borrar clinica");
		btnBorrarClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto=(String) comboBox.getSelectedItem();
				int encontrar=Clinica.borrarClinica(texto);
				if(encontrar!=-1){
					JOptionPane.showMessageDialog(frame, "La clinica fue eliminada con exito","Exito",JOptionPane.INFORMATION_MESSAGE);
					System.out.println(Clinica.nombre);
					model.removeAllElements();
					for (int i = 0; i <= Clinica.cantClinicas; i++)
				    {
				    	model.addElement(Clinica.nombre.get(i));
				    }
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Por favor seleccione una clínica","Error",JOptionPane.WARNING_MESSAGE);
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
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(94, Short.MAX_VALUE)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
					.addGap(65))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(195)
					.addComponent(btnBorrarClinica)
					.addContainerGap(200, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(215, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addGap(210))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
					.addComponent(btnBorrarClinica)
					.addGap(30)
					.addComponent(btnVolver)
					.addGap(27))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
