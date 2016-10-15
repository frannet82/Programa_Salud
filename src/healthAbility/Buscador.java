//Esta clase permite al paciente buscar medicos, clinicas y padecimientos por medio de un filtro con sus respectivos nombres.
//Permite acceder a los perfiles de medicos, clinicas y padecimientos para ver informacion detallada.
//Hay un buscador extra que permite busquedas con filtros por procedimientos, provincias y especialidades.
package healthAbility;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.ScrollPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Buscador 
{
	JFrame frame;
	private JTextField textField;
	ArrayList<String> Top10 = new ArrayList<>();
	static ArrayList<Integer> PosMedico = new ArrayList<>();
	
	public static BufferedImage resize(BufferedImage image, int width, int height) {
	    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bi;
	}
	
	public Buscador() throws BadLocationException, IOException {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @throws BadLocationException 
	 * @throws IOException 
	 */
	
	private void initialize() throws BadLocationException, IOException {
		RegistrodeCita.Fechaguardadas(30);
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(15, 15, 1340, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.BOLD, 10));
		textField.setColumns(10);
		textField.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nombre del m\u00E9dico, cl\u00EDnica o padecimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Filtro del buscador", TitledBorder.LEADING, TitledBorder.TOP, null, null));;
		comboBox_1.setFont(new Font("Verdana", Font.BOLD, 11));		
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Médicos","Clínicas","Padecimientos"}));

		
		final JLabel label0 = new JLabel("");
		label0.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label0.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label0.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label0.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label0.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
		final JLabel label1 = new JLabel("");
		label1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label1.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label1.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label1.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label1.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label2 = new JLabel("");
		label2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label2.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label2.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label2.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label2.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label3 = new JLabel("");
		label3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label3.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label3.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label3.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label3.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label4 = new JLabel("");
		label4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label4.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label4.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label4.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label4.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label5 = new JLabel("");
		label5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label5.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label5.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label5.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label5.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label6 = new JLabel("");
		label6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label6.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label6.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label6.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label6.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label7 = new JLabel("");
		label7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label7.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label7.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label7.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label7.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label8 = new JLabel("");
		label8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(label8.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label8.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label8.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label8.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		final JLabel label9 = new JLabel("");
		label9.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				textField.setText(label9.getText());
				if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
				{
					final int Pos = Clinica.BuscarClinica(label9.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try 
							{
								InterfazClinica window = new InterfazClinica(Pos);
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
				else if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
				{
					final int Pos = Medico.BuscarMedico(label9.getText());
					EventQueue.invokeLater(new Runnable() {
						public void run() 
						{
							try {
								PerfilMedico window = new PerfilMedico(Pos);
								window.frame.setVisible(true);
								frame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else
				{
					final ArrayList<Integer> Pos = Padecimiento.BuscarPadecimiento(label9.getText());
					JOptionPane.showMessageDialog(frame, "Nombre: "+Padecimiento.nombrePadecimiento.get(Pos.get(0)).get(Pos.get(1))+"\n\n"+"Descripcion: "+Padecimiento.descripcion.get(Pos.get(0)), "Area médica: "+Padecimiento.tipos.get(Pos.get(0)),JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		final ArrayList<JLabel> Labels = new ArrayList<>();
		Labels.add(label0);
		Labels.add(label1);
		Labels.add(label2);
		Labels.add(label3);
		Labels.add(label4);
		Labels.add(label5);
		Labels.add(label6);
		Labels.add(label7);
		Labels.add(label8);
		Labels.add(label9);
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				{
					label0.setText("");
					label1.setText("");
					label2.setText("");
					label3.setText("");
					label4.setText("");
					label5.setText("");
					label6.setText("");
					label7.setText("");
					label8.setText("");
					label9.setText("");
					
					if (comboBox_1.getSelectedItem().toString().equals("Médicos"))
						if(Medico.BuscadorMedico(textField.getText()) != null)
						{
							Top10 = Medico.BuscadorMedico(textField.getText());
							for (int x = 0; x<Top10.size() && x < 10; x++)
							{
								Labels.get(x).setText(Top10.get(x));
							}
						}
						else
						{
							textField.setText("No hay médicos registrados");
						}
					else if (comboBox_1.getSelectedItem().toString().equals("Clínicas"))
						if(Medico.BuscadorMedico(textField.getText()) != null)
						{
							Top10.clear();
							Top10 = Clinica.buscadorClinica(textField.getText());
							for (int x = 0; x < Top10.size() && x < 10; x++)
							{
								Labels.get(x).setText(Top10.get(x));
							}
						}
						else
						{
							textField.setText("No hay clínicas registradas");
						}
					else
						if(Medico.BuscadorMedico(textField.getText()) != null)
						{
							Top10 = Padecimiento.BuscadorPadecimiento(textField.getText());
							for (int x = 0; x<Top10.size() && x < 10; x++)
							{
								Labels.get(x).setText(Top10.get(x));
							}
						}
						else
						{
							textField.setText("No hay clínicas registradas");
						}
				}
			}
		});

		textField.setColumns(10);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Provincia donde habitas", TitledBorder.LEADING, TitledBorder.TOP, null, null));;
		comboBox.setFont(new Font("Verdana", Font.BOLD, 11));		
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {" ","San José","Heredia","Alajuela","Cartago","Limón","Puntarenas","Guanacaste"}));	
		
	    Vector comboBoxItems1=new Vector();
	    final DefaultComboBoxModel model1 = new DefaultComboBoxModel(comboBoxItems1);
	    model1.addElement(" ");
	    
	    for (int i = 0; i < Medico.especialidad.size(); i++)
	    {
	    	model1.addElement(Medico.procedimiento.get(i));
	    }
		
	    Vector comboBoxItems=new Vector();
	    final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
	    model.addElement(" ");
	    
	    for (int i = 0; i < Padecimiento.cantPadecimientos; i++)
	    {
	    	model.addElement(Padecimiento.tipos.get(i));
	    }
	    
		final JComboBox comboBox1 = new JComboBox(model);
		comboBox1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				
			}
		});
		comboBox1.setBackground(Color.WHITE);
		comboBox1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u00C1rea de su padecimiento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox1.setFont(new Font("Verdana", Font.BOLD, 11));
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		final JPanel panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		
		JScrollPane scrollPane_1 = new JScrollPane();
	    Vector comboBoxItems2=new Vector();
	    final DefaultComboBoxModel model2 = new DefaultComboBoxModel(comboBoxItems2);
	    model2.addElement(" ");
	    
	    for (int i = 0; i < Medico.especialidad.size(); i++)
	    {
	    	for (int x = 0; x < Medico.especialidad.get(i).size(); x++)
	    	{
	    		String[] treat = Medico.procedimiento.get(i).get(x).split("\n");
	    		for (String y : treat)
	    		{
	    			model2.addElement(y + ", " + Medico.especialidad.get(i).get(x) +", "+ Medico.nombre.get(i) + " " +Medico.apellido1.get(i) + " "+ Medico.apellido2.get(i));
	    		}
	    	}
	    }
	    Collections.sort(comboBoxItems2);
		final JComboBox comboBox_2 = new JComboBox(model2);
		comboBox_2.setBorder(new TitledBorder(null, "Procedimientos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		comboBox_2.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(comboBox_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener()
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0)
			{
				if (!comboBox_2.getSelectedItem().toString().equals(" "))
				{
					String[] nombre = comboBox_2.getSelectedItem().toString().split(", ");
					int Pos = Medico.BuscarMedico(nombre[2]);
					String Calificacion = "";
					String Especia = "";
					String CM = "";
						for (int x = 0; x < Medico.especialidad.get(Pos).size(); x++)
						{
							Especia += Medico.especialidad.get(Pos).get(x) +", ";
						}
						if(Medico.CalificacionMedico.get(Pos) == 0.0)
						{
							Calificacion = "Este medico no ha sido calificado";
						}
						else
						{
							Calificacion += Medico.CalificacionMedico.get(Pos);
						}
						for (String x : Medico.centroMedico.get(Pos))
						{
							CM += x + ", ";
						}
			    		final JTextPane textPane = new JTextPane();
			    		textPane.setText("NOMBRE DEL MEDICO:\n"+Medico.nombre.get(Pos) +" "+Medico.apellido1.get(Pos)+" "+Medico.apellido2.get(Pos)+ "\n\n" + "CALIFICACION DEL MEDICO (DE 1 AL 5):\n"+Calificacion+"\n\n"+"ESPECIALIDAD(ES) DEL MEDICO:\n"+Especia + "\n\n" + "CENTRO(S) MEDICO(S) DONDE LABORA:\n" + CM + "\n");
			    		textPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			    		textPane.setForeground(SystemColor.BLACK);
			    		textPane.setBackground(Color.WHITE);
			    		textPane.setFont(new Font("Verdana", Font.BOLD, 11));
			    		textPane.setEditable(false);
			    		Especia = "";
			    		CM = "";
			    		panel1.add(textPane);  
			  	    
			    	scrollPane.setViewportView(panel1);
				}
				else if (comboBox.getSelectedItem().toString().equals(" ") && !comboBox1.getSelectedItem().toString().equals(" "))
				{
					PosMedico.clear();
					PosMedico = Medico.BuscadorEspecialidad(comboBox1.getSelectedItem().toString());
					String Calificacion = "";
					String Especia = "";
					String CM = "";
					for(int i = 0; i < PosMedico.size(); i++)
			  	    {
						for (int x = 0; x<=Medico.especialidad.get(PosMedico.get(i)).size()-1;x++)
						{
							Especia += Medico.especialidad.get(PosMedico.get(i)).get(x) +"-";
						}
						if(Medico.CalificacionMedico.get(PosMedico.get(i)) == 0.0)
						{
							Calificacion = "Este medico no ha sido calificado";
						}
						else
						{
							Calificacion += Medico.CalificacionMedico.get(PosMedico.get(i));
						}
						for (String x : Medico.centroMedico.get(i))
						{
							CM += x + ", ";
						}
			    		final JTextPane textPane = new JTextPane();
			    		textPane.setText("NOMBRE DEL MEDICO:\n"+Medico.nombre.get(PosMedico.get(i)) +" "+Medico.apellido1.get(PosMedico.get(i))+" "+Medico.apellido2.get(PosMedico.get(i))+ "\n\n" + "CALIFICACION DEL MEDICO (DE 1 AL 5):\n"+Calificacion+"\n\n"+"ESPECIALIDAD(ES) DEL MEDICO:\n"+Especia + "\n\n" + "CENTRO(S) MEDICO(S) DONDE LABORA:\n" + CM + "\n");
			    		textPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			    		textPane.setForeground(SystemColor.BLACK);
			    		textPane.setBackground(Color.WHITE);
			    		textPane.setFont(new Font("Verdana", Font.BOLD, 11));
			    		textPane.setEditable(false);
			    		Especia = "";
			    		CM = "";
			    		panel1.add(textPane);  
			  	    } 
			    	scrollPane.setViewportView(panel1);
				}
				else if (!comboBox.getSelectedItem().toString().equals(" ") && !comboBox1.getSelectedItem().toString().equals(" "))
				{
					PosMedico.clear();
					PosMedico = Medico.BuscadorMedicoFiltroEP(comboBox.getSelectedItem().toString(), comboBox1.getSelectedItem().toString());
					String Calificacion = "";
					String Especia = "";
					String CM = "";
					for(int i = 0; i<PosMedico.size(); i++)
			  	    {
						for (int x = 0; x<=Medico.especialidad.get(PosMedico.get(i)).size()-1;x++)
						{
							Especia += Medico.especialidad.get(PosMedico.get(i)).get(x) +"-";
						}
						if(Medico.CalificacionMedico.get(PosMedico.get(i)) == 0.0)
						{
							Calificacion = "Este medico no ha sido calificado";
						}
						else
						{
							Calificacion += Medico.CalificacionMedico.get(PosMedico.get(i));
						}
						for (String x : Medico.centroMedico.get(i))
						{
							CM += x + ", ";
						}
			    		final JTextPane textPane = new JTextPane();
			    		textPane.setText("NOMBRE DEL MEDICO:\n"+Medico.nombre.get(PosMedico.get(i)) +" "+Medico.apellido1.get(PosMedico.get(i))+" "+Medico.apellido2.get(PosMedico.get(i))+ "\n\n" + "CALIFICACION DEL MEDICO (DE 1 AL 5):\n"+Calificacion+"\n\n"+"ESPECIALIDAD(ES) DEL MEDICO:\n"+Especia + "\n\n" + "CENTRO MEDICO DONDE LABORA:\n" + CM +"\n");
			    		textPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			    		textPane.setForeground(SystemColor.BLACK);
			    		textPane.setBackground(Color.WHITE);
			    		textPane.setFont(new Font("Verdana", Font.BOLD, 11));
			    		textPane.setEditable(false);
			    		Especia = "";
			    		CM= "";
			    		panel1.add(textPane);  
			  	    } 
			    	scrollPane.setViewportView(panel1);
				}
				else if (!comboBox.getSelectedItem().toString().equals(" ") && comboBox1.getSelectedItem().toString().equals(" "))
				{
					PosMedico.clear();
					PosMedico = Clinica.BuscadorProvincia(comboBox.getSelectedItem().toString());
					for(int i = 0; i<=PosMedico.size()-1; i++)
			  	    {
			    		final JTextPane textPane = new JTextPane();
			    		textPane.setText("NOMBRE DEL CENTRO MEDICO:\n"+Clinica.nombre.get(PosMedico.get(i)) + "\n\n" + "PROVINCIA:\n"+Clinica.provincia.get(PosMedico.get(i))+"\n\n"+"CANTON:\n"+ Clinica.canton.get(PosMedico.get(i)) + "\n\n" + "DIRECCION:\n" + Clinica.direccion.get(PosMedico.get(i))+"\n");
			    		textPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			    		textPane.setForeground(SystemColor.BLACK);
			    		textPane.setBackground(Color.WHITE);
			    		textPane.setFont(new Font("Verdana", Font.BOLD, 11));
			    		textPane.setEditable(false);
			    		panel1.add(textPane);  
			  	    } 
			    	scrollPane.setViewportView(panel1);
				}
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBackground(Color.WHITE);
		btnVolver.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent arg0) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PerfilDusuario window = new PerfilDusuario();
						window.frame.setVisible(true);
						frame.dispose();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
				
			}
		});
		JLabel lblProvincia = new JLabel("");
		lblProvincia.setHorizontalAlignment(SwingConstants.CENTER);
		
		BufferedImage image = ImageIO.read(Buscador.class.getResource("/Imagenes/Casa.png"));
		BufferedImage resizedImage = resize(image,50,50);
		
		lblProvincia.setIcon(new ImageIcon(resizedImage));
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);

		BufferedImage image1 = ImageIO.read(Buscador.class.getResource("/Imagenes/salud.png"));
		BufferedImage resizedImage1 = resize(image1,50,50);
		
		label.setIcon(new ImageIcon(resizedImage1));
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		BufferedImage image2 = ImageIO.read(Buscador.class.getResource("/Imagenes/filtro.png"));
		BufferedImage resizedImage2 = resize(image2,50,50);
		
		label_1.setIcon(new ImageIcon(resizedImage2));
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		BufferedImage image3 = ImageIO.read(Buscador.class.getResource("/Imagenes/search.png"));
		BufferedImage resizedImage3 = resize(image3,50,50);
		
		label_2.setIcon(new ImageIcon(resizedImage3));
		
		JLabel label_3 = new JLabel("");
		
		BufferedImage image4 = ImageIO.read(Buscador.class.getResource("/Imagenes/doctor.png"));
		BufferedImage resizedImage4 = resize(image4,50,50);
		
		label_3.setIcon(new ImageIcon(resizedImage4));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(1)
										.addComponent(label0, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label5, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(label4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
										.addComponent(label3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
								.addComponent(label7, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
								.addComponent(label8, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
								.addComponent(label6, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
								.addComponent(label9, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
							.addGap(73)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(272)
									.addComponent(btnVolver))
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(633, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
					.addGap(156))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label0)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label6)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label9)
							.addContainerGap(428, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(btnVolver)
							.addContainerGap())))
		);
		
		JButton btnRefrescar = new JButton("Refrescar");
		btnRefrescar.setBackground(Color.WHITE);
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
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
		scrollPane.setColumnHeaderView(btnRefrescar);
		
		frame.getContentPane().setLayout(groupLayout);  
        }   
	}