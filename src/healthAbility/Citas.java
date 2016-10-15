package healthAbility;
import java.awt.EventQueue;

import javax.swing.JOptionPane; 
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import healthAbility.RegistrodeCita;
import healthAbility.RegistrodePaciente;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import healthAbility.RegistrodePaciente;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JDesktopPane;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.JTabbedPane;

import java.awt.TextArea;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import java.awt.Panel;

import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

import java.awt.Scrollbar;

import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.util.ArrayList;

public class Citas {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					Citas window = new Citas("123456789");
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
	
	public Citas(String cedula) {
		initialize(cedula);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final String cedula) 
	{
		RegistrodeCita.Fechaguardadas(30);
		
		RegistrodeCita.CitasGuardadas2("Lunes ",RegistrodeCita.FechasDcalendario.get(0),"10:00 am ", "1:00 pm ", "5:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Martes ",RegistrodeCita.FechasDcalendario.get(1),"8:00 am ", "1:00 pm ", "6:00 pm","115890113");	
		RegistrodeCita.CitasGuardadas2("Miercoles ",RegistrodeCita.FechasDcalendario.get(2),"11:00 am ", "2:00 pm ", "5:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Jueves ",RegistrodeCita.FechasDcalendario.get(3),"12:00 am ", "3:00 pm ", "6:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Viernes ",RegistrodeCita.FechasDcalendario.get(4),"9:00 am ", "4:00 pm ", "6:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Sabado ",RegistrodeCita.FechasDcalendario.get(5),"Ocupado","Ocupado", "Ocupado","115890113");
		RegistrodeCita.CitasGuardadas2("Domingo ",RegistrodeCita.FechasDcalendario.get(6),"Ocupado","Ocupado", "Ocupado","115890113");
		
		RegistrodeCita.CitasGuardadas2("Lunes ",RegistrodeCita.FechasDcalendario.get(7),"9:00 am ", "2:00 pm ", "8:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Martes ",RegistrodeCita.FechasDcalendario.get(8),"8:00 am ", "4:00 pm ", "5:00 pm","115890113");	
		RegistrodeCita.CitasGuardadas2("Miercoles ",RegistrodeCita.FechasDcalendario.get(9),"11:00 am ", "2:00 pm ", "9:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Jueves ",RegistrodeCita.FechasDcalendario.get(10),"12:00 am ", "3:00 pm ", "9:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Viernes ",RegistrodeCita.FechasDcalendario.get(11),"9:00 am ", "1:00 pm ", "7:30 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Sabado ",RegistrodeCita.FechasDcalendario.get(12),"9:00 am ","Ocupado", "Ocupado","115890113");
		RegistrodeCita.CitasGuardadas2("Domingo ",RegistrodeCita.FechasDcalendario.get(13),"Ocupado","1:00 pm ", "Ocupado","115890113");
		
		RegistrodeCita.CitasGuardadas2("Lunes ",RegistrodeCita.FechasDcalendario.get(14),"9:35 am ", "2:45 pm ", "6:00 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Martes ",RegistrodeCita.FechasDcalendario.get(15),"8:30 am ", "5:30 pm ", "6:00 pm","115890113");	
		RegistrodeCita.CitasGuardadas2("Miercoles ",RegistrodeCita.FechasDcalendario.get(16),"10:00 am ", "2:05 pm ", "9:10 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Jueves ",RegistrodeCita.FechasDcalendario.get(17),"8:00 am ", "3:20 pm ", "9:10 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Viernes ",RegistrodeCita.FechasDcalendario.get(18),"9:10 am ", "1:20 pm ", "Ocupado","115890113");
		RegistrodeCita.CitasGuardadas2("Sabado ",RegistrodeCita.FechasDcalendario.get(19),"11:11 am ","Ocupado", "7:30 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Domingo ",RegistrodeCita.FechasDcalendario.get(20),"Ocupado","1:00 pm ", "Ocupado","115890113");
		
		RegistrodeCita.CitasGuardadas2("Lunes ",RegistrodeCita.FechasDcalendario.get(21),"9:30 am ", "1:45 pm ", "Ocupado","115890113");
		RegistrodeCita.CitasGuardadas2("Martes ",RegistrodeCita.FechasDcalendario.get(22),"8:00 am ", "4:10 pm ", "6:00 pm","115890113");	
		RegistrodeCita.CitasGuardadas2("Miercoles ",RegistrodeCita.FechasDcalendario.get(23),"12:30 am ", "2:35 pm ", "9:30 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Jueves ",RegistrodeCita.FechasDcalendario.get(24),"12:00 am ", "4:00 pm ", "9:45 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Viernes ",RegistrodeCita.FechasDcalendario.get(25),"9:00 am ", "2:00 pm ", "7:30 pm","115890113");
		RegistrodeCita.CitasGuardadas2("Sabado ",RegistrodeCita.FechasDcalendario.get(26),"9:00 am ","1:20 pm ", "Ocupado","115890113");
		RegistrodeCita.CitasGuardadas2("Domingo ",RegistrodeCita.FechasDcalendario.get(27),"Ocupado","1:20 pm ", "Ocupado","115890113");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 700, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		JButton btnaml = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+4));
		btnaml.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+4).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+2));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+1));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+4));
							
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+4,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_2.add(btnaml);
	
		
		JButton btnamm = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+10));
		btnamm.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+10).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+8));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+7));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+10));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+10,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_2.add(btnamm);
		
		JButton button_2 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+16));
		button_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+16).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+14));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+13));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+16));
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+16,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			
			}
		});
		panel_2.add(button_2);
		
		JButton button_3 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+22));
		button_3.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+22).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+20));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+19));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+22));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+22,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
			
		});
		panel_2.add(button_3);
		
		JButton button_4 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+28));
		button_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+28).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+26));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+25));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+28));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+28,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
		
			}
		});
		panel_2.add(button_4);
		
		JButton button_5 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+34));
		button_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+34).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+32));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+31));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+34));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+34,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			
			}
		});
		panel_2.add(button_5);
		
		JButton button_6 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+40));
		button_6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+40).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+38));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+37));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+40));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+40,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			
			}
		});
		panel_2.add(button_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		
		JButton btnaml_1 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+5));
		btnaml_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+5).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+2));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+1));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+5));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+5,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");	
						}
					}
				}
			}
		});
		
		panel_3.add(btnaml_1);
				
		JButton btnamm_1 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+11));
		btnamm_1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+11).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+8));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+7));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+11));
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+11,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_3.add(btnamm_1);		
		JButton button_9 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+17));
		button_9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+17).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+14));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+13));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+17));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+17,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
						}
					}
				}
			}
		});
		panel_3.add(button_9);
		
		JButton button_10 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+23));
		button_10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+23).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+20));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+19));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+23));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+23,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_3.add(button_10);
		
		JButton button_11 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+29));
		button_11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+29).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+26));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+25));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+29));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+29,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_3.add(button_11);
		
		JButton button_12 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+35));
		button_12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+35).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+32));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+31));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+35));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+35,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_3.add(button_12);
		
		JButton button_13 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+41));
		button_13.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+41).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+38));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+37));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+41));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+41,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
				
			}
		});
		panel_3.add(button_13);
		
		JButton button_14 = new JButton("<----");
		button_14.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent arg0) {
				if (RegistrodeCita.valorDpaso>0){
				RegistrodeCita.valorDpaso-=1;
				RegistrodeCita.Contador=RegistrodeCita.Contador-42;
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Citas window = new Citas(cedula);
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
				else{
					JOptionPane.showMessageDialog(frame,"Ya no hay citas anteriores disponibles","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					
				}
				
			}
		});
		
		JButton button_15 = new JButton("---->");
		button_15.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if (RegistrodeCita.valorDpaso<3){
				RegistrodeCita.valorDpaso+=1;
				RegistrodeCita.Contador=RegistrodeCita.Contador+42;
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Citas window = new Citas(cedula);
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				}
				else{
					JOptionPane.showMessageDialog(frame,"Aun no estan las citas despues de esta fecha disponibles","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
				}	
			}
		});
		
		JButton button_16 = new JButton("Volver");
		button_16.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try 
						{
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
			
			
		});
				
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					
					.addComponent(button_14)
					.addPreferredGap(ComponentPlacement.RELATED, 1005, Short.MAX_VALUE)
					.addComponent(button_16)
					.addPreferredGap(ComponentPlacement.RELATED, 1005, Short.MAX_VALUE)
					.addComponent(button_15)
					.addPreferredGap(ComponentPlacement.UNRELATED,500, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
						
					.addContainerGap(56, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_14)
						.addComponent(button_15))
						.addComponent(button_16)
					.addContainerGap(55, Short.MAX_VALUE))
		);
		panel_4.setLayout(new GridLayout(0, 7, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+2));
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+8));
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+14));
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+20));
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+26));
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+32));
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+38));
		panel_4.add(lblNewLabel);
		
		JButton btnNewButton = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+3));
		btnNewButton.addMouseListener(new MouseAdapter() {
			//Efecto al tocar el mouse cambia el estado del boton y de la variable
			public void mouseClicked(MouseEvent e) {
				if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+3).equals("Ocupado"))
				JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
				else{
					int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
					
					if(eleccion==JOptionPane.YES_OPTION){
						JOptionPane.showMessageDialog(null, "Cita Confirmada");
						RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+2));
						RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+1));
						RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+3));
						RegistrodeCita.Paquete.set(RegistrodeCita.Contador+3,"Ocupado");
					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Citas window = new Citas(cedula);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});}
					else if (eleccion==JOptionPane.NO_OPTION){
						JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
						
					}
					
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+9));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+9).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+8));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+7));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+9));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+9,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+15));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+15).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+14));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+13));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+15));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+15,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
				
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+21));
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.valor+21).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+20));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+19));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+21));
							RegistrodeCita.Paquete.set(RegistrodeCita.valor+21,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
				
				
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+27));
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {{
				if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+27).equals("Ocupado"))
				JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
				else{
					int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
					
					if(eleccion==JOptionPane.YES_OPTION){
						JOptionPane.showMessageDialog(null, "Cita Confirmada");
						RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+26));
						RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+25));
						RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+27));
						RegistrodeCita.Paquete.set(RegistrodeCita.Contador+27,"Ocupado");
					
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Citas window = new Citas(cedula);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});}
					else if (eleccion==JOptionPane.NO_OPTION){
						JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
						
					}
					
				}
			}
				
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+33));
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+33).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+32));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+31));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+33));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+33,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
				
			}
		});
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton(RegistrodeCita.Paquete.get(RegistrodeCita.Contador+39));
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				{
					if (RegistrodeCita.Paquete.get(RegistrodeCita.Contador+39).equals("Ocupado"))
					JOptionPane.showMessageDialog(frame,"Ya esta ocupado","Error",JOptionPane.INFORMATION_MESSAGE);//Mensaje emergente
					else{
						int eleccion=JOptionPane.showConfirmDialog(null,"Desea sacar la cita");
						
						if(eleccion==JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Cita Confirmada");
							RegistrodePaciente.DatosfechaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+38));
							RegistrodePaciente.DatosdiaCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+37));
							RegistrodePaciente.DatosCita.set(RegistrodePaciente.ValorCambiodeperfil,RegistrodeCita.Paquete.get(RegistrodeCita.Contador+39));
							RegistrodeCita.Paquete.set(RegistrodeCita.Contador+39,"Ocupado");
						
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Citas window = new Citas(cedula);
									window.frame.setVisible(true);
									frame.dispose();
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});}
						else if (eleccion==JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, "La cita no a sido selecciona");
							
						}
						
					}
				}
			}
		});
		panel_1.add(btnNewButton_6);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblLunes = new JLabel(RegistrodeCita.Paquete.get(1));
		panel.add(lblLunes);
		
		JLabel lblMartes = new JLabel(RegistrodeCita.Paquete.get(7));
		panel.add(lblMartes);
		
		JLabel lblMiercoles = new JLabel(RegistrodeCita.Paquete.get(13));
		panel.add(lblMiercoles);
		
		JLabel lblJueves = new JLabel(RegistrodeCita.Paquete.get(19));
		panel.add(lblJueves);
		
		JLabel lblViernes = new JLabel(RegistrodeCita.Paquete.get(25));
		panel.add(lblViernes);
		
		JLabel lblSabado = new JLabel(RegistrodeCita.Paquete.get(31));
		panel.add(lblSabado);
		
		JLabel lblDomingo = new JLabel(RegistrodeCita.Paquete.get(37));
		panel.add(lblDomingo);
		frame.getContentPane().setLayout(groupLayout);
	}


	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public JScrollPane getScrollPane() {
		return getScrollPane();
	}
}