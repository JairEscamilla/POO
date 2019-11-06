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
       java.sql.Statement s2 = (Statement) conn.createStatement();
       java.sql.Statement s3 = (Statement) conn.createStatement();
       s3.executeUpdate("INSERT INTO Direcciones(Id_direccion, Calle, NumExt, NumInt, CP, Zona, Delegacion, Id_paciente) VALUES (null, '" + pac.calle +  "', '" + pac.numEx + "', '"+ pac.numInt +"', '"+ pac.cp +"', '"+ pac.zona + "', '"+ pac.delegacion + "', 1)");
       s2.executeUpdate("INSERT INTO Medicos(Id_medico, Nombre, Apaterno, Amaterno, id_paciente) VALUES (null, '"+ pac.nom + "', '"+ pac.apPat + "', '" + pac.apMat +"', 1)");
        s.executeUpdate("INSERT INTO Pacientes(Id_Paciente, APaterno, AMaterno, Nombre, sexo, Fecnac, Tiempo, EstadoFederativo, EstadoCivil, Estudios, Leer, Escribir, ocupacion, religion, age, cp) VALUES(null, '"
                + pac.apPatPac + "', '" + pac.apMatPac + "', '" + pac.nomPac + "', '" + pac.sexo + "', '" + pac.aaP + "-" + pac.mmP + "-" + pac.ddP + "', '" + pac.tiempo + "', '" + pac.estadoPac + "', '" + pac.estadoCivil + "', '"+ pac.estudios + "', '" + pac.leer + "', '" + pac.escribir + "', '" + pac.ocupacion + "', '" + pac.religion + "', '" + pac.edad + "', '" + pac.cp + "')");
        
    }


    public void DesConnection(){
        conn = null;
        if(conn == null){
            System.out.println("Termino la conexion");
        }
    }

    
}