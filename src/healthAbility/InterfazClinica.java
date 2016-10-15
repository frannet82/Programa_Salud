//Esta clase permite a los pacientes ver los datos de las clinicas.
//Los datos se muestran en un perfil de forma grafica.
package healthAbility;
import java.util.*;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Cursor;

import javax.swing.border.BevelBorder;

import java.awt.Button;

import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JSeparator;
import javax.swing.JProgressBar;

import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

public class InterfazClinica{

	JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazClinica window = new InterfazClinica(3);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Clinica.registrarClinica("Hospital Max Peralta","200 mts sur de la esquina suroeste del Parque Central","Regional Central","Cartago","Cartago","/Imagenes/Max Peralta.jpg");
		Clinica.registrarClinica("Hospital William Allen, Turrialba","250 mts este de la Iglesia","Turrialba","Turrialba","Cartago","/Imagenes/William Allen.jpg");
		Clinica.registrarClinica("Hospital San Juan de Dios", "100 mts del supermercado", "chepe", "chepe", "San José","/Imagenes/San Juan de Dios.jpg" );
		Clinica.registrarClinica("Hospital Calderon Guardia", "Del parque nacional 100 mts Norte, San José", "Distrito", "Canton", "San José", "/Imagenes/Calderon Guardia.jpg");
		Clinica.registrarClinica("Hospital Mexico", "La Uruca, de la Pozuelo 200 mts. Sur , despues de la rotonda 200 mts. Oeste", "San José", "San José", "San José", "/Imagenes/Mexico.jpg");
		Clinica.registrarClinica("Hospital de la Mujer","De la Escuela Ricardo Jimenez 100 mts. Oeste calle central San Jos�","San José","San José","San José","/Imagenes/Hospital de la mujer.jpg");
		Clinica.registrarClinica("Hospital Blanco Cervantes", "De las oficinas centrales de la Cruz Roja 150 mts. Oeste, detr疽 del Ministerio de Salud", "San José", "San José", "San José", "/Imagenes/Blanco Cervantes.jpg");
		Clinica.registrarClinica("Hospital Tony Facio, Limón","","","Guapiles","Limón","/Imagenes/Tony Facio.jpg");
		Clinica.registrarClinica("Hospital de San Carlos", "2 kilometros al norte de la catedral de Ciudad Quesada", "", "San Carlos", "Alajuela", "/Imagenes/San Carlos.jpg");
		Clinica.registrarClinica("Hospital Enrique Baltodano Brice", "Barrio Moracia,contiguo a la Cruz Roja", "", "Liberia", "Guanacaste", "/Imagenes/Enrique Baltodano Brice.jpg");
		Clinica.registrarClinica("Hospital de la Anexion", "Avenida principal frente al supermercado PALI", "", "Nicoya", "Guanacaste", "/Imagenes/La Anexion.jpg");
		Clinica.registrarClinica("Hospital de Ciudad Neilly", "De la entrada principal de Ciudad Neily 2 kim carretera hacia Paso Canoas, contiguo a la gasolinera", "", "Ciudad Neily", "Puntarenas", "/Imagenes/Ciudad Neily.jpg");
		Clinica.registrarClinica("Hospital de Osa Tom疽 Casas Casaj俍", "500 metros norte de la escuela de Ojo de Agua", "Ciudad Cortes", "Osa", "Puntarenas", "/Imagenes/Tomas Casas.jpg");
		Clinica.registrarClinica("Hospital San Francisco de As﨎", "400 metros oeste de la terminal de buses", "", "Grecia", "Alajuela", "/Imagenes/San Francisco de As﨎.jpg");
		Clinica.registrarClinica("Hospital San Vicente de Paul", "Avenida 16" , "", "", "Heredia", "/Imagenes/San Vicente de Paul.jpg");
		Clinica.registrarClinica("Hospital Psiqui疸rico Roberto Chac Paut", "4 km al norte de la municipalidad de la Union", "Tres Rios", "", "Cartago","/Imagenes/Roberto Chacon Paut.jpg" );
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public InterfazClinica(int pos) throws IOException 
	{
		initialize(pos);
	}
	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize(int pos) throws IOException {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/Imagenes/Simbolomedicina.jpg"));
		frame.setBackground(Color.BLUE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(250, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JLabel lblNewLabel = new JLabel();
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		BufferedImage image1 = ImageIO.read(InterfazClinica.class.getResource(Clinica.foto.get(pos)));
		BufferedImage resizedImage1 = resize(image1,200,200);
		lblNewLabel.setIcon(new ImageIcon((resizedImage1)));
		
		final JLabel lblNewLabel_2 = new JLabel(Clinica.provincia.get(pos)+ ", Costa Rica");
		lblNewLabel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(Color.BLUE);
		
		final JLabel lblNewLabel_3 = new JLabel(Clinica.nombre.get(pos));
		lblNewLabel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_3.setForeground(Color.BLUE);
		
		final JLabel lblCanton = new JLabel(Clinica.canton.get(pos));
		lblCanton.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblCanton.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCanton.setForeground(Color.BLUE);
		
		final JLabel lblDistrito = new JLabel(Clinica.distrito.get(pos));
		lblDistrito.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblDistrito.setForeground(Color.BLUE);
		lblDistrito.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		final ArrayList<JLabel> etiquetas=new ArrayList<>();
		etiquetas.add(lblNewLabel);
		etiquetas.add(lblNewLabel_2);
		etiquetas.add(lblNewLabel_3);
		etiquetas.add(lblCanton);
		etiquetas.add(lblDistrito);
		
		JLabel lblVolver = new JLabel("Volver");
		lblVolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolver.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		lblVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVolver.setFont(new Font("Verdana", Font.BOLD, 14));
		lblVolver.setForeground(Color.GRAY);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		BufferedImage image = ImageIO.read(InterfazClinica.class.getResource("/Imagenes/PTR.png"));
		BufferedImage resizedImage = resize(image,100,100);
		lblNewLabel_5.setIcon(new ImageIcon(resizedImage));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.GRAY);
		lblNombre.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setHorizontalAlignment(SwingConstants.LEFT);
		lblProvincia.setForeground(Color.GRAY);
		lblProvincia.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccion.setForeground(Color.GRAY);
		lblDireccion.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblCantn = new JLabel("Cantón:");
		lblCantn.setHorizontalAlignment(SwingConstants.LEFT);
		lblCantn.setForeground(Color.GRAY);
		lblCantn.setFont(new Font("Verdana", Font.BOLD, 14));
		
		JLabel lblDistrito_1 = new JLabel("Distrito:");
		lblDistrito_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDistrito_1.setForeground(Color.GRAY);
		lblDistrito_1.setFont(new Font("Verdana", Font.BOLD, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addGap(1)
									.addComponent(lblNewLabel_2))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCantn, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDistrito_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
									.addGap(1)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDistrito)
										.addComponent(lblCanton)))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(392)
							.addComponent(lblVolver, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
					.addGap(184))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addContainerGap(761, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblProvincia, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2))
									.addGap(20)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCanton)
										.addComponent(lblCantn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDistrito)
										.addComponent(lblDistrito_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(65))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(lblVolver)
					.addGap(53))
		);
	
		JEditorPane dtrpnDireccion = new JEditorPane();
		dtrpnDireccion.setEditable(false);
		dtrpnDireccion.setForeground(Color.BLUE);
		dtrpnDireccion.setFont(new Font("Verdana", Font.PLAIN, 11));
		dtrpnDireccion.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		dtrpnDireccion.setText(Clinica.direccion.get(pos));
		scrollPane.setViewportView(dtrpnDireccion);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	//Funcion que ajusta el tamaño de una imagen
	public static BufferedImage resize(BufferedImage image, int width, int height) {
	    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
	    Graphics2D g2d = (Graphics2D) bi.createGraphics();
	    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
	    g2d.drawImage(image, 0, 0, width, height, null);
	    g2d.dispose();
	    return bi;
	}
}
