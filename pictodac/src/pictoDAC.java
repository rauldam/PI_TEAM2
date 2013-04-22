import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


public class pictoDAC extends JFrame {

	private JPanel escritorio;
	private static pictoDAC frame;
	private acercaDe acerca;
	private configuracion config;
	private Inicio ini;
	/*private ImageIcon pictoA1 = new ImageIcon("..\\pictodac\\images\\01sujetos.png");
	private ImageIcon pictoA2 = new ImageIcon("..\\pictodac\\images\\02verbos.png");
	private ImageIcon pictoA3 = new ImageIcon("..\\pictodac\\images\\03alimentacion.png");
	private ImageIcon pictoA4 = new ImageIcon("..\\pictodac\\images\\04objetos.png");
	private ImageIcon pictoB1 = new ImageIcon("..\\pictodac\\images\\05lugares.png");
	private ImageIcon pictoB2 = new ImageIcon("..\\pictodac\\images\\06otros.png");*/

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new pictoDAC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public pictoDAC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("K:\\Programaci\u00F3n\\Pictodroid Escritorio\\pictodac\\images\\pictodroidlite.png"));
		setTitle("PictoDroid Escritorio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 800, 500);
		
		JMenuBar menu = new JMenuBar();
		menu.setFont(new Font("Arial", Font.PLAIN, 13));
		setJMenuBar(menu);
		
		JMenu listConf = new JMenu("Configuraci\u00F3n");
		listConf.setFont(new Font("Arial", Font.PLAIN, 13));
		menu.add(listConf);
		
		JMenuItem usuario = new JMenuItem("Cambiar de Usuario");
		usuario.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				ini = new Inicio();
				ini.setVisible(true);
				frame.dispose();
			}
		});
		usuario.setFont(new Font("Arial", Font.PLAIN, 13));
		listConf.add(usuario);
		
		JMenuItem conf = new JMenuItem("Configuraci\u00F3n");
		conf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				config = new configuracion(frame);
				config.setVisible(true);
				frame.setVisible(false);
			}
		});
		conf.setFont(new Font("Arial", Font.PLAIN, 13));
		listConf.add(conf);
		
		JMenuItem acercaDe = new JMenuItem("Acerca de...");
		acercaDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				acerca=new acercaDe(frame);
				acerca.setVisible(true);
				frame.setVisible(false);
			}
		});
		acercaDe.setFont(new Font("Arial", Font.PLAIN, 13));
		listConf.add(acercaDe);
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		salir.setFont(new Font("Arial", Font.PLAIN, 13));
		listConf.add(salir);
		escritorio = new JPanel();
		escritorio.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(escritorio);
		GridBagLayout gbl_escritorio = new GridBagLayout();
		gbl_escritorio.columnWidths = new int[]{387, 0};
		gbl_escritorio.rowHeights = new int[]{0, 182, 28, 0};
		gbl_escritorio.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_escritorio.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		escritorio.setLayout(gbl_escritorio);
		
		JLabel fraseLabel = new JLabel("Frase echa con los pictogramas");
		GridBagConstraints gbc_fraseLabel = new GridBagConstraints();
		gbc_fraseLabel.insets = new Insets(0, 0, 5, 0);
		gbc_fraseLabel.gridx = 0;
		gbc_fraseLabel.gridy = 0;
		escritorio.add(fraseLabel, gbc_fraseLabel);
		fraseLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		fraseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel principal = new JPanel();
		principal.setBackground(UIManager.getColor("Button.background"));
		GridBagConstraints gbc_principal = new GridBagConstraints();
		gbc_principal.fill = GridBagConstraints.BOTH;
		gbc_principal.insets = new Insets(0, 0, 5, 0);
		gbc_principal.gridx = 0;
		gbc_principal.gridy = 1;
		escritorio.add(principal, gbc_principal);
		principal.setLayout(new GridLayout(4, 4, 4, 4));
		
		JButton pictA1 = new JButton("pictA1");
	//	pictA1.setText("SUJETOS");
	//	pictA1.setIcon(pictoA1);
		pictA1.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictA1);
		
		JButton pictA2 = new JButton("pictA2");
	//	pictA2.setText("VERBOS");
	//	pictA2.setIcon(pictoA2);
		pictA2.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictA2);
		
		JButton pictA3 = new JButton("pictA3");
//		pictA3.setText("ALIMENTACIÓN");
//		pictA3.setIcon(pictoA3);
		pictA3.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictA3);
		
		JButton pictA4 = new JButton("pictA4");
	//	pictA4.setText("OBJETOS");
	//	pictA4.setIcon(pictoA4);
		pictA4.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictA4);
		
		JButton pictB1 = new JButton("pictB1");
	//	pictB1.setText("LUGARES");
	//	pictB1.setIcon(pictoB1);
		pictB1.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictB1);
		
		JButton pictB2 = new JButton("pictB2");
//		pictB2.setText("OTROS");
//		pictB2.setIcon(pictoB2);
		pictB2.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictB2);
		
		JButton pictB3 = new JButton("pictB3");
		pictB3.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictB3);
		
		JButton pictB4 = new JButton("pictB4");
		pictB4.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictB4);
		
		JButton pictC1 = new JButton("pictC1");
		pictC1.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictC1);
		
		JButton pictC2 = new JButton("pictC2");
		pictC2.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictC2);
		
		JButton pictC3 = new JButton("pictC3");
		pictC3.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictC3);
		
		JButton pictC4 = new JButton("pictC4");
		pictC4.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictC4);
		
		JButton pictD1 = new JButton("pictD1");
		pictD1.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictD1);
		
		JButton pictD2 = new JButton("pictD2");
		pictD2.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictD2);
		
		JButton pictD3 = new JButton("pictD3");
		pictD3.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictD3);
		
		JButton pictD4 = new JButton("pictD4");
		pictD4.setFont(new Font("Arial", Font.PLAIN, 13));
		principal.add(pictD4);
		
		JPanel bajo = new JPanel();
		GridBagConstraints gbc_bajo = new GridBagConstraints();
		gbc_bajo.fill = GridBagConstraints.BOTH;
		gbc_bajo.gridx = 0;
		gbc_bajo.gridy = 2;
		escritorio.add(bajo, gbc_bajo);
		bajo.setLayout(new BorderLayout(0, 0));
		
		JButton reproducir = new JButton("Reproducir");
		reproducir.setFont(new Font("Arial", Font.PLAIN, 13));
		bajo.add(reproducir, BorderLayout.WEST);
		
		JButton atras = new JButton("Atras");
		atras.setFont(new Font("Arial", Font.PLAIN, 13));
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ini = new Inicio();
				ini.setVisible(true);
				frame.setVisible(false);
			}
		});
		bajo.add(atras, BorderLayout.EAST);
	}
}
