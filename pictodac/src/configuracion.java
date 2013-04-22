

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Component;
import java.awt.Rectangle;

public class configuracion extends JFrame {

	private static configuracion frame;
	private JPanel inicio;
	private JMenuBar menuBar;
	private JLabel audioTituloLabel;
	private JLabel lblColumnasYFilas;
	private JLabel lblPersonalizacin;
	private JLabel lblColoresYTamaos;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JTextPane txtpnSeleccioneSiDesea;
	private JTextPane txtpnSeleccioneElIdioma;
	private JTextPane txtpnSeleccioneElModo;
	private JTextPane txtpnTipoDeEntrada;
	private JTextPane txtpnNmeroDeColumnas;
	private JComboBox comboBox_4;
	private JTextPane txtpnNumeroDeFilas;
	private JComboBox comboBox_5;
	private JTextPane txtpnMaysculasOMinsculas;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JTextPane txtpnDeseaQueEl;
	private JTextPane txtpnTipoDePulsacin;
	private JComboBox comboBox_8;
	private JTextPane txtpnColores;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JTextPane txtpnColoresDeTexto;
	private JTextPane txtpnTamaoDeTexto;
	private JSpinner spinner;
	private JTextPane txtpnTamaoDeTexto_1;
	private JSpinner spinner_1;
	private JMenu mnVolver;
	private JMenuItem mntmGuardandoConfiguracin;
	private JMenuItem mntmSinGuardarLa;
	private ImageIcon logoIdioma = new ImageIcon("..\\pictodac\\images\\audioidioma.png");
	private ImageIcon logoColumnas = new ImageIcon("..\\pictodac\\images\\columnasfilas.png");
	private ImageIcon logoPersonalizacion = new ImageIcon("..\\pictodac\\images\\mayminmarco.png");
	private ImageIcon logoColores = new ImageIcon("..\\pictodac\\images\\colorestamanhos.png");

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new configuracion();
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
	public configuracion(final JFrame anterior) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("K:\\Programaci\u00F3n\\Pictodroid Escritorio\\pictodac\\images\\pictodroidlite.png"));
		setTitle("Configuraci\u00F3n PictoDroid Escritorio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 800, 400);
		
		JMenuBar menu = new JMenuBar();
		menu.setAlignmentY(Component.CENTER_ALIGNMENT);
		menu.setFont(new Font("Arial", Font.PLAIN, 13));
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		setJMenuBar(menu);
		
		JMenu listConf = new JMenu("Configuraci\u00F3n");
		menu.add(listConf);
		
		JMenuItem acercaDe = new JMenuItem("Acerca de...");
		listConf.add(acercaDe);
		
		JMenuItem salir = new JMenuItem("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				frame.dispose();
			}
		});
		listConf.add(salir);
		
		mnVolver = new JMenu("Volver");
		menu.add(mnVolver);
		
		mntmGuardandoConfiguracin = new JMenuItem("Guardando configuraci\u00F3n");
		mnVolver.add(mntmGuardandoConfiguracin);
		
		mntmSinGuardarLa = new JMenuItem("Sin guardar la configuraci\u00F3n");
		mnVolver.add(mntmSinGuardarLa);
		
		inicio = new JPanel();
		inicio.setBounds(new Rectangle(1, 1, 1, 1));
		inicio.setFont(new Font("Arial", Font.PLAIN, 13));
		inicio.setBorder(UIManager.getBorder("DesktopIcon.border"));
		setContentPane(inicio);
		GridBagLayout gbl_inicio = new GridBagLayout();
		gbl_inicio.columnWidths = new int[] {200, 200, 200, 200};
		gbl_inicio.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0};
		gbl_inicio.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0};
		inicio.setLayout(gbl_inicio);
		
		audioTituloLabel = new JLabel("Audio e Idioma:");
		audioTituloLabel.setIcon(logoIdioma);
		GridBagConstraints gbc_audioTituloLabel = new GridBagConstraints();
		gbc_audioTituloLabel.insets = new Insets(0, 0, 5, 5);
		gbc_audioTituloLabel.gridx = 0;
		gbc_audioTituloLabel.gridy = 0;
		inicio.add(audioTituloLabel, gbc_audioTituloLabel);
		
		lblColumnasYFilas = new JLabel("Columnas y Filas:");
		lblColumnasYFilas.setIcon(logoColumnas);
		GridBagConstraints gbc_lblColumnasYFilas = new GridBagConstraints();
		gbc_lblColumnasYFilas.insets = new Insets(0, 0, 5, 5);
		gbc_lblColumnasYFilas.gridx = 1;
		gbc_lblColumnasYFilas.gridy = 0;
		inicio.add(lblColumnasYFilas, gbc_lblColumnasYFilas);
		
		lblPersonalizacin = new JLabel("Personalizaci\u00F3n:");
		lblPersonalizacin.setIcon(logoPersonalizacion);
		GridBagConstraints gbc_lblPersonalizacin = new GridBagConstraints();
		gbc_lblPersonalizacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalizacin.gridx = 2;
		gbc_lblPersonalizacin.gridy = 0;
		inicio.add(lblPersonalizacin, gbc_lblPersonalizacin);
		
		lblColoresYTamaos = new JLabel("Colores y Tama\u00F1os");
		lblColoresYTamaos.setIcon(logoColores);
		GridBagConstraints gbc_lblColoresYTamaos = new GridBagConstraints();
		gbc_lblColoresYTamaos.insets = new Insets(0, 0, 5, 0);
		gbc_lblColoresYTamaos.gridx = 3;
		gbc_lblColoresYTamaos.gridy = 0;
		inicio.add(lblColoresYTamaos, gbc_lblColoresYTamaos);
		
		txtpnSeleccioneSiDesea = new JTextPane();
		txtpnSeleccioneSiDesea.setBackground(UIManager.getColor("Button.background"));
		txtpnSeleccioneSiDesea.setEditable(false);
		txtpnSeleccioneSiDesea.setText("Activar o desactivar el sintetizador de voz");
		GridBagConstraints gbc_txtpnSeleccioneSiDesea = new GridBagConstraints();
		gbc_txtpnSeleccioneSiDesea.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnSeleccioneSiDesea.fill = GridBagConstraints.BOTH;
		gbc_txtpnSeleccioneSiDesea.gridx = 0;
		gbc_txtpnSeleccioneSiDesea.gridy = 1;
		inicio.add(txtpnSeleccioneSiDesea, gbc_txtpnSeleccioneSiDesea);
		
		txtpnNmeroDeColumnas = new JTextPane();
		txtpnNmeroDeColumnas.setBackground(UIManager.getColor("Button.background"));
		txtpnNmeroDeColumnas.setText("N\u00FAmero de columnas de pictos");
		GridBagConstraints gbc_txtpnNmeroDeColumnas = new GridBagConstraints();
		gbc_txtpnNmeroDeColumnas.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnNmeroDeColumnas.fill = GridBagConstraints.BOTH;
		gbc_txtpnNmeroDeColumnas.gridx = 1;
		gbc_txtpnNmeroDeColumnas.gridy = 1;
		inicio.add(txtpnNmeroDeColumnas, gbc_txtpnNmeroDeColumnas);
		
		txtpnMaysculasOMinsculas = new JTextPane();
		txtpnMaysculasOMinsculas.setBackground(UIManager.getColor("Button.background"));
		txtpnMaysculasOMinsculas.setText("May\u00FAsculas o Min\u00FAsculas");
		GridBagConstraints gbc_txtpnMaysculasOMinsculas = new GridBagConstraints();
		gbc_txtpnMaysculasOMinsculas.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnMaysculasOMinsculas.fill = GridBagConstraints.BOTH;
		gbc_txtpnMaysculasOMinsculas.gridx = 2;
		gbc_txtpnMaysculasOMinsculas.gridy = 1;
		inicio.add(txtpnMaysculasOMinsculas, gbc_txtpnMaysculasOMinsculas);
		
		txtpnColores = new JTextPane();
		txtpnColores.setBackground(UIManager.getColor("Button.background"));
		txtpnColores.setText("Colores de Fondo");
		GridBagConstraints gbc_txtpnColores = new GridBagConstraints();
		gbc_txtpnColores.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnColores.fill = GridBagConstraints.BOTH;
		gbc_txtpnColores.gridx = 3;
		gbc_txtpnColores.gridy = 1;
		inicio.add(txtpnColores, gbc_txtpnColores);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sin Sintentizador de voz", "Con Sintentizador de voz"}));
		comboBox.setEditable(true);
		comboBox.setToolTipText("Juaj\r\nhhjgsd\r\nashd");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 2;
		inicio.add(comboBox, gbc_comboBox);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4"}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 2;
		inicio.add(comboBox_4, gbc_comboBox_4);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"May\u00FAsculas", "Min\u00FAsculas"}));
		GridBagConstraints gbc_comboBox_6 = new GridBagConstraints();
		gbc_comboBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_6.gridx = 2;
		gbc_comboBox_6.gridy = 2;
		inicio.add(comboBox_6, gbc_comboBox_6);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Amarillo", "Azul", "Blanco", "Naranja", "Negro", "Rojo", "Rosa", "Verde"}));
		GridBagConstraints gbc_comboBox_9 = new GridBagConstraints();
		gbc_comboBox_9.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_9.gridx = 3;
		gbc_comboBox_9.gridy = 2;
		inicio.add(comboBox_9, gbc_comboBox_9);
		
		txtpnSeleccioneElIdioma = new JTextPane();
		txtpnSeleccioneElIdioma.setEditable(false);
		txtpnSeleccioneElIdioma.setText("Idioma deseado");
		txtpnSeleccioneElIdioma.setBackground(UIManager.getColor("Button.background"));
		GridBagConstraints gbc_txtpnSeleccioneElIdioma = new GridBagConstraints();
		gbc_txtpnSeleccioneElIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnSeleccioneElIdioma.fill = GridBagConstraints.BOTH;
		gbc_txtpnSeleccioneElIdioma.gridx = 0;
		gbc_txtpnSeleccioneElIdioma.gridy = 3;
		inicio.add(txtpnSeleccioneElIdioma, gbc_txtpnSeleccioneElIdioma);
		
		txtpnNumeroDeFilas = new JTextPane();
		txtpnNumeroDeFilas.setBackground(UIManager.getColor("Button.background"));
		txtpnNumeroDeFilas.setText("Numero de Filas de pictos");
		GridBagConstraints gbc_txtpnNumeroDeFilas = new GridBagConstraints();
		gbc_txtpnNumeroDeFilas.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnNumeroDeFilas.fill = GridBagConstraints.BOTH;
		gbc_txtpnNumeroDeFilas.gridx = 1;
		gbc_txtpnNumeroDeFilas.gridy = 3;
		inicio.add(txtpnNumeroDeFilas, gbc_txtpnNumeroDeFilas);
		
		txtpnDeseaQueEl = new JTextPane();
		txtpnDeseaQueEl.setBackground(UIManager.getColor("Button.background"));
		txtpnDeseaQueEl.setText("Desea que el picto tenga o no marco");
		GridBagConstraints gbc_txtpnDeseaQueEl = new GridBagConstraints();
		gbc_txtpnDeseaQueEl.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnDeseaQueEl.fill = GridBagConstraints.BOTH;
		gbc_txtpnDeseaQueEl.gridx = 2;
		gbc_txtpnDeseaQueEl.gridy = 3;
		inicio.add(txtpnDeseaQueEl, gbc_txtpnDeseaQueEl);
		
		txtpnColoresDeTexto = new JTextPane();
		txtpnColoresDeTexto.setBackground(UIManager.getColor("Button.background"));
		txtpnColoresDeTexto.setText("Colores de Texto");
		GridBagConstraints gbc_txtpnColoresDeTexto = new GridBagConstraints();
		gbc_txtpnColoresDeTexto.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnColoresDeTexto.fill = GridBagConstraints.BOTH;
		gbc_txtpnColoresDeTexto.gridx = 3;
		gbc_txtpnColoresDeTexto.gridy = 3;
		inicio.add(txtpnColoresDeTexto, gbc_txtpnColoresDeTexto);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Espa\u00F1ol", "English", "Fran\u00E7ais"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 0;
		gbc_comboBox_1.gridy = 4;
		inicio.add(comboBox_1, gbc_comboBox_1);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4"}));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 1;
		gbc_comboBox_5.gridy = 4;
		inicio.add(comboBox_5, gbc_comboBox_5);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Con Marco", "Sin Marco"}));
		GridBagConstraints gbc_comboBox_7 = new GridBagConstraints();
		gbc_comboBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_7.gridx = 2;
		gbc_comboBox_7.gridy = 4;
		inicio.add(comboBox_7, gbc_comboBox_7);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Amarillo", "Azul", "Blanco", "Naranja", "Negro", "Rojo", "Rosa", "Verde"}));
		GridBagConstraints gbc_comboBox_10 = new GridBagConstraints();
		gbc_comboBox_10.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_10.gridx = 3;
		gbc_comboBox_10.gridy = 4;
		inicio.add(comboBox_10, gbc_comboBox_10);
		
		txtpnSeleccioneElModo = new JTextPane();
		txtpnSeleccioneElModo.setText("Modo de reproducci\u00F3n");
		txtpnSeleccioneElModo.setEditable(false);
		txtpnSeleccioneElModo.setBackground(UIManager.getColor("Button.background"));
		GridBagConstraints gbc_txtpnSeleccioneElModo = new GridBagConstraints();
		gbc_txtpnSeleccioneElModo.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnSeleccioneElModo.fill = GridBagConstraints.BOTH;
		gbc_txtpnSeleccioneElModo.gridx = 0;
		gbc_txtpnSeleccioneElModo.gridy = 5;
		inicio.add(txtpnSeleccioneElModo, gbc_txtpnSeleccioneElModo);
		
		txtpnTipoDePulsacin = new JTextPane();
		txtpnTipoDePulsacin.setText("Tipo de pulsaci\u00F3n");
		txtpnTipoDePulsacin.setBackground(UIManager.getColor("Button.background"));
		GridBagConstraints gbc_txtpnTipoDePulsacin = new GridBagConstraints();
		gbc_txtpnTipoDePulsacin.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnTipoDePulsacin.fill = GridBagConstraints.BOTH;
		gbc_txtpnTipoDePulsacin.gridx = 2;
		gbc_txtpnTipoDePulsacin.gridy = 5;
		inicio.add(txtpnTipoDePulsacin, gbc_txtpnTipoDePulsacin);
		
		txtpnTamaoDeTexto = new JTextPane();
		txtpnTamaoDeTexto.setBackground(UIManager.getColor("Button.background"));
		txtpnTamaoDeTexto.setText("Tama\u00F1o de Texto de Picto");
		GridBagConstraints gbc_txtpnTamaoDeTexto = new GridBagConstraints();
		gbc_txtpnTamaoDeTexto.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnTamaoDeTexto.fill = GridBagConstraints.BOTH;
		gbc_txtpnTamaoDeTexto.gridx = 3;
		gbc_txtpnTamaoDeTexto.gridy = 5;
		inicio.add(txtpnTamaoDeTexto, gbc_txtpnTamaoDeTexto);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Acumulativo", "Puntual"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 0;
		gbc_comboBox_2.gridy = 6;
		inicio.add(comboBox_2, gbc_comboBox_2);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Pulsar", "Pulsar y soltar"}));
		GridBagConstraints gbc_comboBox_8 = new GridBagConstraints();
		gbc_comboBox_8.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_8.gridx = 2;
		gbc_comboBox_8.gridy = 6;
		inicio.add(comboBox_8, gbc_comboBox_8);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(20), null, null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.gridx = 3;
		gbc_spinner.gridy = 6;
		inicio.add(spinner, gbc_spinner);
		
		txtpnTipoDeEntrada = new JTextPane();
		txtpnTipoDeEntrada.setEditable(false);
		txtpnTipoDeEntrada.setBackground(UIManager.getColor("Button.background"));
		txtpnTipoDeEntrada.setText("Tipo de entrada para reproducir en modo acumulativo");
		GridBagConstraints gbc_txtpnTipoDeEntrada = new GridBagConstraints();
		gbc_txtpnTipoDeEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnTipoDeEntrada.fill = GridBagConstraints.BOTH;
		gbc_txtpnTipoDeEntrada.gridx = 0;
		gbc_txtpnTipoDeEntrada.gridy = 7;
		inicio.add(txtpnTipoDeEntrada, gbc_txtpnTipoDeEntrada);
		
		txtpnTamaoDeTexto_1 = new JTextPane();
		txtpnTamaoDeTexto_1.setText("Tama\u00F1o de texto de T\u00EDtulo");
		txtpnTamaoDeTexto_1.setBackground(UIManager.getColor("Button.background"));
		GridBagConstraints gbc_txtpnTamaoDeTexto_1 = new GridBagConstraints();
		gbc_txtpnTamaoDeTexto_1.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnTamaoDeTexto_1.fill = GridBagConstraints.BOTH;
		gbc_txtpnTamaoDeTexto_1.gridx = 3;
		gbc_txtpnTamaoDeTexto_1.gridy = 7;
		inicio.add(txtpnTamaoDeTexto_1, gbc_txtpnTamaoDeTexto_1);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Mediante Picto", "Mediante pulsaci\u00F3n larga"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 0;
		gbc_comboBox_3.gridy = 8;
		inicio.add(comboBox_3, gbc_comboBox_3);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(30), null, null, new Integer(1)));
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.gridx = 3;
		gbc_spinner_1.gridy = 8;
		inicio.add(spinner_1, gbc_spinner_1);
	}
}
