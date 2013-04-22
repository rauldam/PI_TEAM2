import java.util.ArrayList;


public class interfaz {

	private ArrayList configura = new ArrayList();
	private static Inicio ini;
	//private static pictoDAC picto;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ini = new Inicio();
		ini.setVisible(true);
	}
	
	/**
	 * 
	 * @param usuario
	 * @param password
	 * @return boolean True = Usuario correcto.
	 */
	public boolean validarUsuario(String usuario, String password)
	{
		String[] usu = {usuario,password};
		if(true)
		{
		cargaConfiguracion(usuario);
		System.out.println("valida el usuario"+usuario+password);
		ini.setVisible(false);
		//picto.setVisible(true);
		/* compara con la BB.DD.
		 * para saber si es verdadero o no.
		 */
				return true;
		}
		else
		{
			return false;
		}
	}
	
	public void cargaConfiguracion(String usuario)
	{
		//iremnos a la BB.DD. y cargaremos la configuración en un ArrayList
		System.out.println("carga la configuracion");
	}

}
