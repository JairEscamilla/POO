package p15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

public class Conexion{
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "#Allan14";
    private static final String url = "jdbc:mysql://localhost/clinica";

    public Conexion(){
        conn = null;
        try {
            //Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos", "Conexión", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error con la conexion");
        }
    }

    public Connection getConnection(){
        return conn;
    }
    
    public void InsertarRegistros(Paciente pac) throws SQLException {
       java.sql.Statement s = (Statement) conn.createStatement();
        s.executeUpdate("INSERT INTO registros(nombre, apellidoP, apellidoM, edad, dia, mes, anio, sexo) VALUES('"
                + pac.nomPac + "', '" + pac.apPatPac + "', '" + pac.apMatPac + "', '" + pac.edad + "', '" + pac.dd + "', '" + pac.mm + "', '" + pac.aa + "', '" + pac.sexo + "')");
    }


    public void DesConnection(){
        conn = null;
        if(conn == null){
            System.out.println("Termino la conexion");
        }
    }

    
}