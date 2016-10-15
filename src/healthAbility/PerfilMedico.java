//Esta clase permite a los pacientes ver los datos de las medicos.
//Los datos se muestran en un perfil de forma grafica.
package healthAbility;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import healthAbility.Citas;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class PerfilMedico 
{
	JFrame frame;
	/**
	 * @wbp.nonvisual location=278,339
	 */
	/**
	 * Launch the application.
	 * @throws BadLocationException 
	 */
	public static void main(String[] args) throws BadLocationException {
		ArrayList<String> e = new ArrayList<>();
		e.add("Cardiologia");
		e.add("Neurologia");
		ArrayList<String>  a = new ArrayList<>();
		a.add("Pediatria");
		ArrayList<String>  i = new ArrayList<>();
		i.add("Consulta: $50\n");
		i.add("Operacion: $1000");
		ArrayList<String>  o = new ArrayList<>();
		o.add("90$ Consulta dermatológo\n390$ Botox\n90$Examen de cabello\n$90Examen de uñas");
		o.add("");
		String[] q = {"Hospital Calderon Guardia","Hospital de la Mujer"};
		String[] w = {"Hospital de Ciudad Neilly","Hospital de la Anexion"};
		
		Medico.IngresarMedico("Fabian", "Arce", "Molina","/Imagenes/medico.jpg", "115890113", "sarcem1111@gmail.com",e, "La buena medicina es aquella que mejora el cuerpo y no asalta el bolsillo.", q, i, "Español\nIngles", "UCIMED","Colegio de medicos y cirujanos","heredia");
		Medico.IngresarMedico("Francisco", "Murillo", "Fallas","","987654321", "franMu@gmail.com", a, "El arte del médico es el mantener animado al paciente mientras la naturaleza lo va curando.",w,o ,"Español\nIngles\nFrances", "Universidad de Costa Rica","Colegio de medicos y cirujanos","san josé");
		Medico.IngresarMedico("Myron", "Camacho", "Brenes","", "123456789", "MyCam@gmail.com", e, "Médico es aquel que te acompaña a la tumba con palabras griegas.",w,o, "Español\nIngles\nFrances", "Hispanoamericana","Colegio de medicos y cirujanos","limón");
		Medico.IngresarMedico("Natalia", "Villalobos", "Blanco","", "7564857463", "NataVi@gmail.com",e, "Médico: profesional de la salud que tapa sus errores con tierra.",q,o,"","Universidad de Costa Rica","Colegio de medicos y cirujanos","puntarenas");
		Medico.IngresarMedico("Gabriel", "Mora", "Padilla","", "984736253", "GaMo@gmail.com", a, "Hay que tener cuidado con los libros de salud, podemos morir por culpa de una errata.", w, i, "UCIMED", "Español\nIngles\nPortugues","Colegio de medicos y cirujanos","heredia");
		Medico.IngresarMedico("William", "Espinoza", "Vega","", "745325342", "WiEsp@gmail.com", a, "A los médicos son a los que mejor les va, sus éxitos andan por ahí y a sus fracasos los entierran.",q, i,"Español\nIngles\nItaliano", "Universidad de Costa Rica","Colegio de medicos y cirujanos","guanacaste");
		Medico.IngresarMedico("Alejandra", "Acosta", "Sanchez","", "24351675", "AleAco@gmail.com", a, "El médico es simplemente una persona que recibe una nueva vida que Dios manda.", w,i, "Español\nIngles", "Universidad de Costa Rica","Colegio de medicos y cirujanos","cartago");
		Medico.IngresarMedico("Paula", "Romero", "Vargas","", "756453423", "PauRom@gmail.com", e, "¿La enfermedad? La vida. ¿La cura? La muerte. Yo sólo estoy para retrasar la cura a esa enfermedad que es la vida.", w,o, "Español\nIngles\nAleman", "Universidad de Costa Rica","Colegio de medicos y cirujanos","san josé");
		Medico.IngresarMedico("Mariana", "Cortes", "Soto","", "856453645", "MariCor@gmail.com", e, "La buena medicina es aquella que mejora el cuerpo y no asalta el bolsillo.", q, o,"Español\nIngles\nHolandes", "Universidad de Costa Rica","Colegio de medicos y cirujanos","cartago");
		Medico.IngresarMedico("Sofia", "Palma", "Guitierrez","", "231425364", "SofPal@gmail.com",a, "Yo que deseo ser médico preferiría antes amputar el odio, porque... ¿de qué sirve que la gente esté sana si se odia?", w,i, "Ingles", "Universidad de Costa Rica","Colegio de medicos y cirujanos","heredia");
		Medico.IngresarMedico("Lizeth", "Rodriguez", "Rojas","", "354634343", "LizethRod@gmail.com", a, "La gente quiere a los médicos que quieren a la gente; antes de ser un buen médico, se una buena persona.", w,i, "Español", "Universidad de Costa Rica","Colegio de medicos y cirujanos","san josé");
		Medico.IngresarMedico("Yuliana", "Marin", "Solis","", "756453624", "YuliMari@gmail.com", a, "Dios regala la vida, los médicos están para salvarla y protegerla.", q, o,"Español\nIngles", "Universidad de Costa Rica","Colegio de medicos y cirujanos","alajuela");

		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					PerfilMedico window = new PerfilMedico(0);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static BufferedImage resize(BufferedImage image, int width, int height) {
	    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bi;
	}
	
	/**
	 * Create the application.
	 * @throws BadLocationException 
	 * @throws IOException 
	 */
	
	public PerfilMedico(int pos) throws BadLocationException, IOException 
	{
		initialize(pos);
	}

	private void initialize(final int Pos) throws BadLocationException, IOException {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(200, 0, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		BufferedImage image = ImageIO.read(PerfilMedico.class.getResource(Medico.foto.get(Pos)));
		BufferedImage resizedImage = resize(image,200,200);
		lblNewLabel.setIcon(new ImageIcon(resizedImage));
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNombre = new JLabel(Medico.nombre.get(Pos) + " " + Medico.apellido1.get(Pos) + " " + Medico.apellido2.get(Pos));
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNombre.setForeground(Color.BLUE);
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNombre.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		String especialidad = "";
		for(int i = 0; i < Medico.especialidad.get(Pos).size(); i++)
		{
			especialidad += Medico.especialidad.get(Pos).get(i) + ", ";
		}
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JTextArea txtrEspecialidad = new JTextArea();
		txtrEspecialidad.setForeground(Color.BLUE);
		txtrEspecialidad.setEditable(false);
		txtrEspecialidad.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtrEspecialidad.setText(especialidad);
		scrollPane_1.setViewportView(txtrEspecialidad);
		
		JLabel lblPuntuacion = new JLabel( String.valueOf(Medico.actualCalificacionMedico.get(Pos)).substring(0, 3) );
		lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntuacion.setForeground(Color.BLUE);
		lblPuntuacion.setFont(new Font("Verdana", Font.BOLD, 22));
		lblPuntuacion.setBorder(null);
		
		final JLabel lblCalificar = new JLabel("Calificar");
		lblCalificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try 
						{
							VentanaDeCalificacion window = new VentanaDeCalificacion(Pos);
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
		
		JLabel lblNumeroDeCalificaciones = new JLabel(Medico.CantidadDeCalificaciones.get(Pos).size() + " calificaciones");
		lblNumeroDeCalificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDeCalificaciones.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				if (Medico.CantidadDeCalificaciones.get(Pos).size() == 0)
				{
					lblCalificar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				}
				else
				{
					EventQueue.invokeLater(new Runnable() 
					{
						public void run() 
						{
							try 
							{			
								Medico.reviews.get(Pos).frame.setVisible(true);
							} 
							catch (Exception e) 
							{
								e.printStackTrace();
							}
						}
					});
				}

			}
		});
		lblNumeroDeCalificaciones.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblProcedimiento = new JLabel("Procedimiento");
		lblProcedimiento.setForeground(Color.GRAY);
		lblProcedimiento.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblIdiomas = new JLabel("Idiomas");
		lblIdiomas.setFont(new Font("Verdana", Font.BOLD, 13));
		lblIdiomas.setForeground(Color.GRAY);
		
		JLabel lblAfiliaciones = new JLabel("Afiliaciones:");
		lblAfiliaciones.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAfiliaciones.setForeground(Color.GRAY);
		
		JLabel lblPuntuacion_1 = new JLabel("Puntuacion");
		lblPuntuacion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntuacion_1.setForeground(Color.GRAY);
		lblPuntuacion_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblPuntuacion_1.setBorder(null);
		
		final JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("null")
			@Override
			public void mouseClicked(MouseEvent e) {
				JTextComponent txtAh = null;
				txtAh.setText(lblNewLabel_1.getText());
			}
		});
		
		JEditorPane txtpnText = new JEditorPane();
		txtpnText.setEditable(false);
		txtpnText.setText(Medico.slogan.get(Pos));
		txtpnText.setForeground(Color.BLUE);
		txtpnText.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtpnText.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblEducacion_1 = new JLabel("Educacion:");
		lblEducacion_1.setForeground(Color.GRAY);
		lblEducacion_1.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblSlogan = new JLabel("Slogan:");
		lblSlogan.setForeground(Color.GRAY);
		lblSlogan.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblCentroMedico = new JLabel("Centro Medico");
		lblCentroMedico.setForeground(Color.GRAY);
		lblCentroMedico.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JEditorPane dtrpnF= new JEditorPane();
		dtrpnF.setEditable(false);
		dtrpnF.setText(Medico.educacion.get(Pos));
		dtrpnF.setForeground(Color.BLUE);
		dtrpnF.setFont(new Font("Verdana", Font.PLAIN, 13));
		dtrpnF.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JEditorPane dtrpnColegioDeMedicos = new JEditorPane();
		dtrpnColegioDeMedicos.setEditable(false);
		dtrpnColegioDeMedicos.setText(Medico.afiliacion.get(Pos));
		dtrpnColegioDeMedicos.setForeground(Color.BLUE);
		dtrpnColegioDeMedicos.setFont(new Font("Verdana", Font.PLAIN, 13));
		dtrpnColegioDeMedicos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JEditorPane dtrpnHospitaCalderonGuardia = new JEditorPane();
		String CM = "";
		for (int i = 0; i < Medico.centroMedico.get(Pos).length; i++)
		{
			CM += Medico.centroMedico.get(Pos)[i] +"\n";
		}
		dtrpnHospitaCalderonGuardia.setText(CM);
		dtrpnHospitaCalderonGuardia.setForeground(Color.BLUE);
		dtrpnHospitaCalderonGuardia.setFont(new Font("Verdana", Font.PLAIN, 13));
		dtrpnHospitaCalderonGuardia.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JEditorPane dtrpnEspaolnnica = new JEditorPane();
		dtrpnEspaolnnica.setText(Medico.idioma.get(Pos));
		dtrpnEspaolnnica.setForeground(Color.BLUE);
		dtrpnEspaolnnica.setFont(new Font("Verdana", Font.PLAIN, 13));
		dtrpnEspaolnnica.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblCedula = new JLabel("Correo:");
		lblCedula.setForeground(Color.GRAY);
		lblCedula.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblSlogan_1 = new JLabel("Cedula:");
		lblSlogan_1.setForeground(Color.GRAY);
		lblSlogan_1.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblFarcemhotmailcom = new JLabel(Medico.correo.get(Pos));
		lblFarcemhotmailcom.setForeground(Color.BLUE);
		lblFarcemhotmailcom.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblFarcemhotmailcom.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label_3 = new JLabel(Medico.cedula.get(Pos));
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblRegresar = new JLabel("Volver");
		lblRegresar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Buscador window = new Buscador();
							window.frame.setVisible(true);
							frame.dispose();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		lblRegresar.setForeground(Color.GRAY);
		lblRegresar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblRegresar.setFont(new Font("Verdana", Font.BOLD, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		JTextPane txtpnTextpane = new JTextPane();
	    MutableAttributeSet attrs = txtpnTextpane.getInputAttributes();  
	    StyledDocument doc = txtpnTextpane.getStyledDocument();
	    scrollPane.setViewportView(txtpnTextpane);
		for(int i = 0; i <= Medico.especialidad.get(Pos).size()-1; i++)
		{
	    	StyleConstants.setFontFamily(attrs, "Arial");
	    	StyleConstants.setFontSize(attrs, 15);
	        StyleConstants.setForeground(attrs, Color.BLACK);
			doc.insertString(doc.getLength(),Medico.especialidad.get(Pos).get(i) + ":\n", attrs);
			
	    	StyleConstants.setFontFamily(attrs, "Arial");
	    	StyleConstants.setFontSize(attrs, 13);
	        StyleConstants.setForeground(attrs, Color.GRAY);       
	        doc.insertString(doc.getLength(), Medico.procedimiento.get(Pos).get(i), attrs);
		}
		
		JLabel lblCita = new JLabel("Sacar cita");
		lblCita.setHorizontalAlignment(SwingConstants.CENTER);
		lblCita.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				EventQueue.invokeLater(new Runnable() {
					public void run() 
					{
						try 
						{
							Medico.citas.get(Pos).frame.setVisible(true);
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		lblCita.setFont(new Font("Verdana", Font.BOLD, 11));
		
		lblCalificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificar.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblAreas = new JLabel("Areas:");
		lblAreas.setForeground(Color.GRAY);
		lblAreas.setFont(new Font("Verdana", Font.BOLD, 13));
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setForeground(Color.GRAY);
		lblNombre_1.setFont(new Font("Verdana", Font.BOLD, 13));
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(txtpnText, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblAfiliaciones)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(dtrpnColegioDeMedicos, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblSlogan_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblCedula)
												.addComponent(lblNombre_1))
											.addGap(4)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblNombre)
													.addPreferredGap(ComponentPlacement.RELATED))
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblFarcemhotmailcom, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.RELATED))
													.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)))
											.addGap(47))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblAreas, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCalificar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
												.addComponent(lblPuntuacion, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
												.addComponent(lblPuntuacion_1, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
												.addComponent(lblNumeroDeCalificaciones, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
											.addGap(63))
										.addComponent(lblCita, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(48)
											.addComponent(lblProcedimiento))
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(27)
											.addComponent(dtrpnHospitaCalderonGuardia, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(108)
											.addComponent(lblCentroMedico, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(388)
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(90)
											.addComponent(lblIdiomas))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
											.addGap(31)
											.addComponent(dtrpnEspaolnnica)
											.addGap(80)
											.addComponent(lblRegresar, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addGap(83)))))
							.addGap(845))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblSlogan)
								.addComponent(lblEducacion_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(dtrpnF, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPuntuacion_1)
									.addComponent(lblNombre))
								.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAreas, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(5)
									.addComponent(lblPuntuacion)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNumeroDeCalificaciones)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCalificar, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addGap(10)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblFarcemhotmailcom, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCedula, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSlogan_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblCita))
							.addGap(24))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtpnText, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblSlogan, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addGap(28)))
							.addComponent(lblEducacion_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(dtrpnF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAfiliaciones)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(22)
											.addComponent(lblIdiomas, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(17)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblProcedimiento)
												.addComponent(lblCentroMedico, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))))
								.addComponent(dtrpnColegioDeMedicos, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(dtrpnEspaolnnica)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
									.addComponent(dtrpnHospitaCalderonGuardia)))
							.addGap(58))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblRegresar, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(55)))
					.addGap(406)
					.addComponent(lblNewLabel_1)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
	}
}
