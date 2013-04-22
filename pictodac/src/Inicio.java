
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Inicio extends JFrame {
	
	private pictoDAC picto;
	private configuracion config;
	private acercaDe acerca;
	private static Inicio frame;
	private ImageIcon logoPictoDroid = new ImageIcon("..\\pictodac\\images\\pictodroidlite.png");
	private ImageIcon logoAccegal = new ImageIcon("..\\pictodac\\images\\logoaccegal.jpg");
	private ImageIcon logoDAC = new ImageIcon("..\\pictodac\\images\\Logodac.png");
	private JPanel inicio;
	private JTextField textUsuario;
	private JPasswordField passwordUsuario;
	private JButton accederBoton;
	private JLabel usuarioLabel;
	private JLabel passwordLabel;
	private JButton nuevoUsuarioBoton;
	private JLabel logoLabel;
	private JLabel logoLabel2;
	private JLabel logoLabel3;
	private String usuario;
	private String password;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Inicio();
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
	public Inicio() {

		setFont(new Font("Arial", Font.PLAIN, 13));
		setIconImage(Toolkit.getDefaultToolkit().getImage("K:\\Programaci\u00F3n\\Pictodroid Escritorio\\pictodac\\images\\pictodroidlite.png"));
		setTitle("Inicio PictoDroid Escritorio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 450, 300);
		
		JMenuBar menu = new JMenuBar();
		menu.setFont(new Font("Arial", Font.PLAIN, 13));
		setJMenuBar(menu);
		
		JMenu listConf = new JMenu("Configuraci\u00F3n");
		listConf.setFont(new Font("Arial", Font.PLAIN, 13));
		menu.add(listConf);
		
		JMenuItem conf = new JMenuItem("Configuraci\u00F3n");
		conf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
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
			public void mousePressed(MouseEvent arg0) {
				frame.dispose();
			}
		});
		salir.setFont(new Font("Arial", Font.PLAIN, 13));
		listConf.add(salir);
		
		inicio = new JPanel();
		inicio.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(inicio);
		inicio.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("140px"),
				ColumnSpec.decode("140px:grow"),
				ColumnSpec.decode("140px"),},
			new RowSpec[] {
				RowSpec.decode("35px"),
				RowSpec.decode("35px"),
				RowSpec.decode("25px"),
				RowSpec.decode("20px"),
				RowSpec.decode("25px"),
				FormFactory.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				RowSpec.decode("35px"),
				RowSpec.decode("25px"),}));
		
		logoLabel = new JLabel("");
		logoLabel.setIcon(logoPictoDroid);
		logoLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		inicio.add(logoLabel, "1, 1, 1, 2, center, center");
		
		logoLabel2 = new JLabel("");
		logoLabel2.setIcon(logoAccegal);
		logoLabel2.setFont(new Font("Arial", Font.PLAIN, 13));
		inicio.add(logoLabel2, "2, 1, 1, 2, center, center");
		
		logoLabel3 = new JLabel("");
		logoLabel3.setIcon(logoDAC);
		logoLabel3.setFont(new Font("Arial", Font.PLAIN, 13));
		inicio.add(logoLabel3, "3, 1, 1, 2, center, center");
		
		usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		usuarioLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inicio.add(usuarioLabel, "1, 3, right, center");
		
		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				//para comprobar que funciona
				usuario = textUsuario.getText();
				if(usuario.length()>=10)
				{
					textUsuario.setEditable(false);
					
				}
				System.out.println(""+usuario);
			}
		});
		textUsuario.setToolTipText("El usuario debe tener como m\u00E1ximo 10 caracteres.");
		textUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		textUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		inicio.add(textUsuario, "2, 3, fill, fill");
		textUsuario.setColumns(10);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		inicio.add(passwordLabel, "1, 5, right, center");
		
		passwordUsuario = new JPasswordField(10);
		passwordUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				//para comprobar que funciona
				char[] passwords = passwordUsuario.getPassword();
				
				System.out.println(""+passwords);
			}
		});
		passwordUsuario.setToolTipText("La contrase\u00F1a debe tener 10 caracteres como m\u00E1ximo");
		passwordUsuario.setFont(new Font("Arial", Font.PLAIN, 13));
		passwordUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		inicio.add(passwordUsuario, "2, 5, fill, fill");
		
		accederBoton = new JButton("Acceder");
		accederBoton.setFont(new Font("Arial", Font.PLAIN, 13));
		accederBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char[] passwords = passwordUsuario.getPassword();
				password = new String(passwords);
				
				if(usuario.isEmpty() && password.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Se deben introducir un usuario y una contraseña");
				}
				/*if(usuario.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Debe introducirse un usuario");
				}
				if(password.isEmpty());
				{
					JOptionPane.showMessageDialog(null, "Debe introducirse un password");
				}*/
				if((!usuario.isEmpty())&&(!password.isEmpty()))
				{
					interfaz inter = new interfaz();
					if(inter.validarUsuario(usuario, password))
					{
						System.out.println("va hasta el dispose");
						//Cerramos la pantalla de inicio definitivamente.
						frame.dispose();// da un fallo
					}
					else
					{
						JOptionPane.showConfirmDialog(null, "El usuario o la contraseña no estan en la BB.DD");
					}
				}
			}
		});
		
		nuevoUsuarioBoton = new JButton("Nuevo Usuario");
		nuevoUsuarioBoton.setFont(new Font("Arial", Font.PLAIN, 13));
		inicio.add(nuevoUsuarioBoton, "1, 8");
		inicio.add(accederBoton, "3, 8");
	}
}
