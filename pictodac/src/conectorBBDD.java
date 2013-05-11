import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conector {
	private Connection conexion;
	static String bd="sql27540";
	static String user="sql27540";
	static String password="jN5*jD6*";
	static String server="jdbc:mysql://sql2.freemysqlhosting.net/"+bd;
	static Statement st;
	static ResultSet rdo;
	/** Creates a new instance of BasedeDatos */
	public conectorBaseDatos() {
	}

	public void establecerConexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(server,user,password);
		}
		catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
		}
	}

	public Connection getConexion(){
		return conexion;
	}

	public void cerrar(ResultSet rs){
		if(rs !=null){
			try{
				rs.close();
			}
			catch(Exception e){
				System.out.print("No es posible cerrar la Conexion");
			}
		}
	}

	public void cerrar(java.sql.Statement stmt){
		if(stmt !=null){
			try{
				stmt.close();
			}
			catch(Exception e){}
		}
	}

	public void destruir(){

		if(conexion !=null){

			try{
				conexion.close();
			}
			catch(Exception e){}
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prova p=new prova();
		p.establecerConexion();
		String consulta = new String("select NombreUsuario,password from Configuracion");
		
		try{

            st = p.getConexion().createStatement();
            rdo = st.executeQuery(consulta);
            while(rdo.next()){
                System.out.print(rdo.getString("NombreUsuario")+"\t");
                System.out.println(rdo.getString("password"));
                System.out.println("----------------------------");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
		finally{
			p.cerrar(rdo);
			p.cerrar(st);
			p.destruir();		
		}
		
	}

	
}



