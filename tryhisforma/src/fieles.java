import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Logger;
import java.util.logging.Level;
public class fieles {
    static Connection conn = null;
    static ResultSet rs = null;
    static Statement s = null;
    static String url = "jdbc:mysql://localhost:3306/ojito";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String username = "root";
    static String password = "";

    public static void conectar() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("CONEXIÓN ESTABLECIDA CON ÉXITO :)");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(fieles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void leerRegistro() {
        try {
            String sql = "select * from personas";
            s = conn.createStatement();
            rs = s.executeQuery(sql);
            System.out.println("ID\t\tNombre\tApellido\tEdad\tDistrito");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                String distrito = rs.getString("distrito");
                System.out.println(id+"\t\t"+nombre + "\t" + apellido + "\t" + edad + "\t" + distrito);
            }

        } catch (SQLException ex) {
            Logger.getLogger(fieles.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        public static void main(String[] args){
        conectar();leerRegistro();
    }
}
