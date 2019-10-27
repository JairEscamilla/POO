package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;

public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "#Allan14";
    private static final String url = "jdbc:mysql://localhost/clinica";

    public Conectar() {
        conn = null;
        try {
            // Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos", "Conexión",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error con la conexion");
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void DesConnection() {
        conn = null;
        if (conn == null) {
            System.out.println("Termino la conexion");
        }
    }

    public void LeerRegistros() throws SQLException {
        Statement s = (Statement) conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM Medicos");
        while (rs.next()) {
            System.out.println(rs.getInt("id_medico") + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
}
