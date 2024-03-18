import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Libros {
    static Connection conn = null;
    static Statement s = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;

    static Scanner sc = new Scanner(System.in);

    static String db = "fa_uni_poo";
    static String url = "jdbc:mysql://n1nlmysql19plsk.secureserver.net:3306/";
    static String user = "fa_uni_poo_user";
    static String password = "f5t5r34lb4";
    static String driver = "com.mysql.cj.jdbc.Driver";

    public static void conectar_db() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + db, user, password);
            System.out.println("CONECTADO");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void buscar_Autor(String autor) {
        String tx_titulo;
        int nu_precio;

        try {
            String sql = "SELECT T_LIBRO.tx_titulo, T_LIBRO.nu_precio "
                    + "FROM T_LIBRO "
                    + "INNER JOIN T_AUTOR ON T_LIBRO.id_autor = T_AUTOR.id_autor "
                    + "WHERE UPPER(T_AUTOR.tx_nombre) LIKE UPPER('%" + autor + "%')";

            s = conn.createStatement();
            rs = s.executeQuery(sql);
            System.out.println("-------RESULTADOS-----");
            System.out.println("TITULO\t\tPRECIO");
            while (rs.next()) {
                tx_titulo = rs.getString("tx_titulo");
                nu_precio = rs.getInt("nu_precio");
                System.out.println(tx_titulo + "\t\t" + nu_precio);
            }

            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        String autor;
        conectar_db();
        System.out.print("---->INGRESE EL AUTOR: ");
        autor = sc.nextLine();
        buscar_Autor(autor);
    }
}
