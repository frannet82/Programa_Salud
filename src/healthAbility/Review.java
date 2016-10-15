//Este función muestra todos los comentarios de los médicos así como sus calificaciones.
//Permite ingresar comentarios.
//Calcula la puntuación promedio del médico.
//Guarda la fecha en la que el comentario fue creado.
package healthAbility;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLayeredPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.UIManager;

import java.awt.Scrollbar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Review
{
	JFrame frame;
	private JTextPane txtpnTextpane = new JTextPane();
    private MutableAttributeSet attrs = txtpnTextpane.getInputAttributes();  
    private StyledDocument doc = txtpnTextpane.getStyledDocument();
    private Date fechaCreación;

	/**
	 * Launch the application.
	 * @throws BadLocationException 
	 */
	public static void main(String[] args) throws BadLocationException 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Review window = new Review();
					window.ingresarComentario("Fabian Arce Molina", "XD", "4.5");
					window.frame.setVisible(true);
					
					Review review = new Review();
					review.ingresarComentario("Fabian Arce Molina", "XD", "4.5");
					review.frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 * @throws BadLocationException 
	 */
	
	public Review() throws BadLocationException 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() throws BadLocationException {
		this.frame = new JFrame();
		this.frame.getContentPane().setBackground(Color.WHITE);
		this.frame.setBounds(400, 100, 525, 530);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.dispose();
			}
		});
		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Verdana", Font.BOLD, 13));
        
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
					.addGap(1))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(379, Short.MAX_VALUE)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExit)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		scrollPane_1.setViewportView(txtpnTextpane);
		frame.getContentPane().setLayout(groupLayout);
		
		txtpnTextpane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Calificaciones del m\u00E9dico", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		scrollPane_1.setViewportView(txtpnTextpane);
        
        txtpnTextpane.setEditable(false);
		}
		
		//Metodo que recibe el nombre del medico, un comentario y una puntuacion del 1 al 5.
		//Almacena los 3 parametros en una interfaz propia de cada medico.
		void ingresarComentario(String nombre, String comentario, String puntuacion) throws BadLocationException
	    {
	    	if (comentario.length() > 40)
	    	{
	    		int cLargo = comentario.length();
	    		int i=40;
	    		while(i < cLargo)
	    		{
	    			comentario = comentario.substring(0, i) + "\n" + comentario.substring(i,cLargo);
	    			i += 40;
	    		}
	    	}
	    	this.setFechaCreacion();
	    	
	    	StyleConstants.setFontFamily(attrs, "Arial");
	    	StyleConstants.setFontSize(attrs, 15);
	        StyleConstants.setForeground(attrs, Color.BLACK);
	        doc.insertString(doc.getLength()," Nombre: " + nombre + "\n", attrs);
	        
	    	StyleConstants.setFontFamily(attrs, "Arial");
	    	StyleConstants.setFontSize(attrs, 14);
	        StyleConstants.setForeground(attrs, Color.BLACK);               
	        doc.insertString(doc.getLength()," Fecha: " + this.getFechaCreacion() + "\n", attrs);
	         
	    	StyleConstants.setFontFamily(attrs, "Arial Bold");
	    	StyleConstants.setFontSize(attrs, 15);
	        StyleConstants.setForeground(attrs, Color.BLUE);       
	        doc.insertString(doc.getLength()," Puntuación: " + puntuacion, attrs);
	        
	    	StyleConstants.setFontFamily(attrs, "Arial");
	    	StyleConstants.setFontSize(attrs, 13);
	        StyleConstants.setForeground(attrs, Color.GRAY);       
	        doc.insertString(doc.getLength(), "\n\n" + "\"" + comentario + "\"" + "\n", attrs);
	        
	    	StyleConstants.setFontFamily(attrs, "Arial");
	    	StyleConstants.setFontSize(attrs, 12);
	        StyleConstants.setForeground(attrs, Color.BLACK);
	        doc.insertString(doc.getLength(),"___________________________________________________________________\n\n", attrs);
	    }
	    
		//Se accede a la fecha actual y la guarda en una variable.
		public void setFechaCreacion()
		{
			Calendar calendario;
			calendario = Calendar.getInstance();
			fechaCreación = calendario.getTime();
		}
		
		//Define el formato en el cual se va a guardar la fecha actual.
		public String getFechaCreacion()
		{
			SimpleDateFormat mascara = new SimpleDateFormat("dd / MM / yy");
			return mascara.format(this.fechaCreación);
		}
}
