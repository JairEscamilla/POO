package bd;
import java.sql.SQLException;
public class PruebaCon {
    public static void main(String[] args) throws SQLException{
        Conectar con = new Conectar();
        con.getConnection();
        con.LeerRegistros();
        
    }
}