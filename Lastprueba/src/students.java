import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class students {
    static Connection conn=null;
    static ResultSet rs=null;
    static Statement s=null;
    static String driver="com.mysql.cj.jdbc.Driver";
    static String username="root";
    static String password="";
    static String url="jdbc:mysql://localhost:3306/ojito";
    public static void conectar(){
        try{ Class.forName(driver);
            conn=DriverManager.getConnection(url,username,password);

        }catch (ClassNotFoundException|SQLException e){
            Logger.getLogger(students.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public static void Mostrar_la_tabla() {
        try {
            String sql = "SELECT * FROM mascotasatendidas";
            s = conn.createStatement();
            rs = s.executeQuery(sql);
            System.out.println("ID" + "\t" + "NOMBRE" + "\t" + "ESPECIE" + "\t" + "FECHA DE INGRESO" + " " + "EDAD");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String fe = rs.getString("fecha_ingreso");
                int edad = rs.getInt("edad");
                System.out.println(id + "\t" + nombre + "\t" + especie + "\t" + fe + "\t" + edad);
            }
        } catch (SQLException e) {
            Logger.getLogger(students.class.getName()).log(Level.SEVERE, null, e);
        }
    }
        public static void main(String[] args){conectar();Mostrar_la_tabla();
        }


    }


