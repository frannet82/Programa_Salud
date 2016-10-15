//Esta clase permite borrar médicos del sistema seleccionando de una lista que muestra el nombre de los médicos ya ingresados
package healthAbility;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorrarMedico {
	JFrame frame;

	/**
	 * Create the application.
	 */
	/*
	Esta es la interfaz que permite por medio de una lista seleccionar y eliminar a un médico ya registrado
	*/
	public BorrarMedico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Vector comboBoxItems=new Vector();
	    final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
	    model.addElement(" ");
	    
	    for (int i = 0; i < Medico.cantidadDeMedicos; i++)
	    {
	    	model.addElement(Medico.cedula.get(i) + "-" + "Nombre: "+Medico.nombre.get(i) +" "+ Medico.apellido1.get(i)+" "+Medico.apellido2.get(i));
	    }
	    
	    //Esta es la lista que permite mostrar el nombre de todos los médicos registrados 
	    Collections.sort(comboBoxItems);
	    final JComboBox comboBox = new JComboBox(model);
	    
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Lista de m\u00E9dicos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox.setFont(new Font("Verdana", Font.BOLD, 11));
		
		//Botón que permite borrar al médico seleccionado
		JButton btnBorrarClinica = new JButton("Borrar medico");
		btnBorrarClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String texto=comboBox.getSelectedItem().toString().split("-")[0];
				System.out.println(texto);
				int encontrar=Medico.borrarMedico(texto);
				if(encontrar!=-1)
				{
					JOptionPane.showMessageDialog(frame, "El medico fue eliminada con exito","Exito",JOptionPane.INFORMATION_MESSAGE);
					System.out.println(Clinica.nombre);
					model.removeAllElements();
					for (int i = 0; i < Medico.cantidadDeMedicos; i++)
				    {
				    	model.addElement(Medico.nombre.get(i));
				    }
					EventQueue.invokeLater(new Runnable()
					{
						public void run() 
						{
							try 
							{
								Buscador window = new Buscador();
								window.frame.setVisible(true);
							} 
							catch (Exception e) 
							{
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Por favor seleccione un médico","Error",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		//Regresa a la ventana del administrador
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
					.addContainerGap(75, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
							.addGap(64))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnBorrarClinica)
							.addGap(92)
							.addComponent(btnVolver)
							.addGap(22))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(168)
							.addComponent(btnVolver)
							.addGap(20, 20, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBorrarClinica)
							.addGap(39))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}

