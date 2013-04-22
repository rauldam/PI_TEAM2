

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class acercaDe extends JFrame {

	private JPanel acerca;
	private static acercaDe frame;
	private ImageIcon logoAccegal = new ImageIcon("..\\pictodac\\images\\logoaccegal.jpg");
	private ImageIcon logoPictoDroid = new ImageIcon("..\\pictodac\\images\\pictodroidlite.png");


	/**
	 * Launch the application.
	 * @wbp.parser.constructor
	 */
/*
public static void main(String[] args) {
/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new acercaDe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}/*

	/**
	 * Crea un acercaDe desde el Frame anterior.
	 * @param p
	 */
	public acercaDe(final JFrame anterior) {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("K:\\Programaci\u00F3n\\Pictodroid Escritorio\\pictodac\\images\\pictodroidlite.png"));
		setTitle("Acerca de PictoDroid Escritorio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 10, 700, 1000);
		
		JMenuBar menu = new JMenuBar();
		setJMenuBar(menu);
		
		JMenu listConf = new JMenu("Configuraci\u00F3n");
		menu.add(listConf);
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				anterior.dispose(); // Cerramos el metodo anterior para asegurarnos que podemos liberar memoria.
				frame.dispose();
			}
		});
		listConf.add(salir);
		
		JMenu listAtras = new JMenu("Atras");
		menu.add(listAtras);
		
		JMenuItem volverAnt = new JMenuItem("Volver a la pantalla anterior");
		volverAnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				anterior.setVisible(true); //Volvemos a la pantalla anterior de la que hemos venido.
				frame.dispose();
			}
		});
		listAtras.add(volverAnt);

		
		acerca = new JPanel();
		acerca.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(acerca);
		GridBagLayout gbl_acerca = new GridBagLayout();
		gbl_acerca.columnWidths = new int[] {650};
		gbl_acerca.columnWeights = new double[]{0.0};
		gbl_acerca.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		acerca.setLayout(gbl_acerca);
		
		JLabel logoAccegalLabel = new JLabel("");
		logoAccegalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoAccegalLabel.setIcon(logoAccegal);
		GridBagConstraints gbc_logoAccegalLabel = new GridBagConstraints();
		gbc_logoAccegalLabel.fill = GridBagConstraints.BOTH;
		gbc_logoAccegalLabel.insets = new Insets(0, 0, 5, 0);
		gbc_logoAccegalLabel.gridx = 0;
		gbc_logoAccegalLabel.gridy = 0;
		acerca.add(logoAccegalLabel, gbc_logoAccegalLabel);
		
		JLabel DescripcionLabel = new JLabel("DESCRIPCI\u00D3N");
		DescripcionLabel.setFont(new Font("Arial", Font.BOLD, 13));
		DescripcionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_DescripcionLabel = new GridBagConstraints();
		gbc_DescripcionLabel.fill = GridBagConstraints.BOTH;
		gbc_DescripcionLabel.insets = new Insets(0, 0, 5, 0);
		gbc_DescripcionLabel.gridx = 0;
		gbc_DescripcionLabel.gridy = 1;
		acerca.add(DescripcionLabel, gbc_DescripcionLabel);
		
		JLabel logoPictoEscritorioLabel = new JLabel("");
		logoPictoEscritorioLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoPictoEscritorioLabel.setIcon(logoPictoDroid);
		GridBagConstraints gbc_logoPictoEscritorioLabel = new GridBagConstraints();
		gbc_logoPictoEscritorioLabel.fill = GridBagConstraints.BOTH;
		gbc_logoPictoEscritorioLabel.insets = new Insets(0, 0, 5, 0);
		gbc_logoPictoEscritorioLabel.gridx = 0;
		gbc_logoPictoEscritorioLabel.gridy = 2;
		acerca.add(logoPictoEscritorioLabel, gbc_logoPictoEscritorioLabel);
		
		JLabel textoLabel = new JLabel("PictoDroid Escritorio");
		textoLabel.setFont(new Font("Arial", Font.BOLD, 13));
		textoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		textoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		textoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textoLabel = new GridBagConstraints();
		gbc_textoLabel.fill = GridBagConstraints.BOTH;
		gbc_textoLabel.insets = new Insets(0, 0, 5, 0);
		gbc_textoLabel.gridx = 0;
		gbc_textoLabel.gridy = 3;
		acerca.add(textoLabel, gbc_textoLabel);
		
		JTextPane textoParrafo1 = new JTextPane();
		textoParrafo1.setFont(new Font("Arial", Font.PLAIN, 13));
		textoParrafo1.setBackground(UIManager.getColor("Panel.background"));
		textoParrafo1.setEditable(false);
		textoParrafo1.setText("PictoDroid Escritorio es una aplicaci\u00F3n para sistemas de escritorio, similar al Pictodroid de Android, que permite a los usuarios comunicarse a trav\u00E9s del uso de pictogramas o pictos(signos que representan esquem\u00E1ticamente un s\u00EDmbolo, objeto real o figura).\r\nEsta version nos permite poder guarada la configuraci\u00F3n seg\u00FAn el perfil de usuario que conecte al iniciar la aplicaci\u00F3n. Adem\u00E1s de las anteriores opciones de PictoDroid Lite.\r\nEn la actualidad se pueden realizar oraciones iniciadas por:\r\n- vamos a...\r\n- quiero jugar...\r\n- quiero ir al ba\u00F1o...\r\n- quiero beber...\r\n- quiero comer...\r\n- estoy...\r\n\r\nAl completar la selecci\u00F3n de pictos el sistema proceder\u00E1 a la lectura de la frase formada.\r\n\r\nTodos los pictos pueden ser modificados o eliminados y es posible a\u00F1adir tantos como sea necesario. El proceso se encuentra explicado en el manual de la aplicaci\u00F3n disponible en htt://www.accegal.org. Si tiene alguna duda o dificultad en la configuraci\u00F3n de PictoDroid Escritorio puede ponerse en contacto con nosotros en el email: cotacto@accegal.org y trataremos de ayudarle.\r\n\r\nLa alicaci\u00F3n utiliza los pictos de ARASAAC (http://arasaac.org), creados poe Sergio Palao y distribuidos con licencia Creative Commons (BY-NC-SA), aunque es posible configurarla para utilizar otros pictos e incluso im\u00E1genes reales.");
		GridBagConstraints gbc_textoParrafo1 = new GridBagConstraints();
		gbc_textoParrafo1.fill = GridBagConstraints.BOTH;
		gbc_textoParrafo1.insets = new Insets(0, 0, 5, 0);
		gbc_textoParrafo1.gridx = 0;
		gbc_textoParrafo1.gridy = 4;
		acerca.add(textoParrafo1, gbc_textoParrafo1);
		
		JLabel infoLabel = new JLabel("M\u00C1S INFORMACI\u00D3N");
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		infoLabel.setFont(new Font("Arial", Font.BOLD, 13));
		GridBagConstraints gbc_infoLabel = new GridBagConstraints();
		gbc_infoLabel.fill = GridBagConstraints.BOTH;
		gbc_infoLabel.insets = new Insets(0, 0, 5, 0);
		gbc_infoLabel.gridx = 0;
		gbc_infoLabel.gridy = 5;
		acerca.add(infoLabel, gbc_infoLabel);
		
		JTextPane textParrafo2 = new JTextPane();
		textParrafo2.setText("Contacto:\r\n\r\ncontacto@accegal.org\r\n\r\nManual:\r\n\r\nhtt://www.accegal.org/pictodroid-lite/\r\n\r\nAgradecimientos:\r\n\r\nJoaqu\u00EDn Ignacion Pelaez Santana,\r\ndise\u00F1adore gr\u00E1fico de la ciudad de Talca - Chile (\"joaquinpelaezs@gmail.com\" - http://www.wix.com/joaquinpelaezs/dgsrpelaez) que ha realizado la imagen corporativa tanto de PictoDroid como de PictoDroid Lite.\r\n\r\nFeliciano Couto, cuyo tablero de comunicaci\u00F3n(http://chiscos.net/f1/comunicador/comunicador.html) sirve de base para la elaboraci\u00F3n de este proyecto.\r\n\r\nARASAAC(http://arasaac.org) por el uso de sus pictos y a Jos\u00E9 Manuel Marcos y David romero, del eqipo de ARASAAC, por sus sugerencias en el desarrollo de la aplicaci\u00F3n.");
		textParrafo2.setFont(new Font("Arial", Font.PLAIN, 13));
		textParrafo2.setEditable(false);
		textParrafo2.setBackground(UIManager.getColor("MenuItem.background"));
		GridBagConstraints gbc_textParrafo2 = new GridBagConstraints();
		gbc_textParrafo2.fill = GridBagConstraints.BOTH;
		gbc_textParrafo2.gridx = 0;
		gbc_textParrafo2.gridy = 6;
		acerca.add(textParrafo2, gbc_textParrafo2);
		
	}
}
