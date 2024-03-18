import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class Buscarlasfacturas {
        static Connection conn = null;
        static Statement s = null;
        static ResultSet rs = null;
        static Scanner sc = new Scanner(System.in);

        static String driver = "com.mysql.cj.jdbc.Driver";
        static String db = "fa_uni_poo";
        static String url = "jdbc:mysql://n1nlmysql19plsk.secureserver.net:3306/";
        static String user = "fa_uni_poo_user";
        static String password = "f5t5r34lb4";

        public static void conectarse() {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url + db, user, password);
                System.out.println("---CONECTADO---");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Buscarlasfacturas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public static void buscarpordistrito(String distrito) {
            try {
                String sql = "SELECT T_FACTURA.ID_FACTURA, T_FACTURA.NU_TOTAL_FAC "
                        + "FROM T_FACTURA "
                        + "INNER JOIN T_CLIENTE ON T_FACTURA.ID_CLIENTE = T_CLIENTE.ID_CLIENTE "
                        + "INNER JOIN T_DISTRITO ON T_CLIENTE.ID_DISTRITO = T_DISTRITO.ID_DISTRITO "
                        + "WHERE UPPER(T_DISTRITO.TX_DISTRITO) LIKE UPPER('%" + distrito + "%')";

                s = conn.createStatement();
                rs = s.executeQuery(sql);
                System.out.println("-------RESULTADOS-----");
                System.out.println("NUMERO_FACTURA\t MONTO TOTAL FACTURADO");
                while (rs.next()) {
                    int id_factura = rs.getInt("ID_FACTURA");
                    int total_facturado = rs.getInt("NU_TOTAL_FAC");
                    System.out.println("*"+id_factura + "\t\t\t\t" +"S/."+ total_facturado);
                }

                rs.close();

            } catch (SQLException ex) {
                Logger.getLogger(Buscarlasfacturas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public static void main(String[] args) {
            String distrito;
            conectarse();
            System.out.print("---->INGRESE EL DISTRITO : ");
            distrito = sc.nextLine();
            buscarpordistrito(distrito);
        }
    }


