import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.logging.Logger;
import java.util.logging.Level;
public class vet {
    static Connection conn=null;
    static ResultSet rs=null;
    static Statement s=null;
    static String driver="com.mysql.cj.jdbc.Driver";
    static String username="root";
    static String url="jdbc:mysql://localhost:3306/ojito";
    static String password="";
    public static void conectar(){
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, username,password);
        }catch(ClassNotFoundException|SQLException e){
            Logger.getLogger(vet.class.getName()).log(Level.SEVERE,null,e);

        }

    }
    public static void Leer_perritos(){
        try{
        String sql="select * from mascotasatendidas";
        s= conn.createStatement();
        rs=s.executeQuery(sql);
        System.out.println("ID"+"\t"+"NOMBRE"+"\t"+"ESPECIE"+"\t"+"FECHA DE INGRESO"+" "+"EDAD");
        while(rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String especie = rs.getString("especie");
            String fe = rs.getString("fecha_ingreso");
            int edad = rs.getInt("edad");
            System.out.println(id+"\t"+nombre+"\t"+especie+"\t"+fe+"\t"+edad);
        }
    }catch (SQLException e){
            Logger.getLogger(vet.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public static void mostrar_gatos(){
        try{
            String sql="SELECT * FROM mascotasatendidas WHERE especie= 'Gato'";
            s= conn.createStatement();
            rs=s.executeQuery(sql);
            System.out.println("ID"+"\t"+"NOMBRE"+"\t"+"ESPECIE"+"\t"+"FECHA DE INGRESO"+" "+"EDAD");
            while(rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String fe = rs.getString("fecha_ingreso");
                int edad = rs.getInt("edad");
                System.out.println(id+"\t"+nombre+"\t"+especie+"\t"+fe+"\t"+edad);
            }
        }catch (SQLException e){
            Logger.getLogger(vet.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public static void mostrar_perros(){
        try{
            String sql="SELECT * FROM mascotasatendidas WHERE especie= 'Perro'";
            s= conn.createStatement();
            rs=s.executeQuery(sql);
            System.out.println("ID"+"\t"+"NOMBRE"+"\t"+"ESPECIE"+"\t"+"FECHA DE INGRESO"+" "+"EDAD");
            while(rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String fe = rs.getString("fecha_ingreso");
                int edad = rs.getInt("edad");
                System.out.println(id+"\t"+nombre+"\t"+especie+"\t"+fe+"\t"+edad);
            }
        }catch (SQLException e){
            Logger.getLogger(vet.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public static void ord_edad_des(){
        try{
            String sql="SELECT * FROM mascotasatendidas WHERE especie='Gato' ORDER BY edad DESC ";
            s= conn.createStatement();
            rs=s.executeQuery(sql);
            System.out.println("ID"+"\t"+"NOMBRE"+"\t"+"ESPECIE"+"\t"+"FECHA DE INGRESO"+" "+"EDAD");
            while(rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                String fe = rs.getString("fecha_ingreso");
                int edad = rs.getInt("edad");
                System.out.println(id+"\t"+nombre+"\t"+especie+"\t"+fe+"\t"+edad);
            }
        }catch (SQLException e){
            Logger.getLogger(vet.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public static void main(String[] args){
        conectar();System.out.println("------MOSTRAR LA TABLA COMPLETA----------\n");
        Leer_perritos();System.out.println("------MOSTRAR A LOS GATOS----------\n"); mostrar_gatos();
        System.out.println("------MOSTRAR A LOS PERROS----------\n");mostrar_perros();
        System.out.println("------TABLA ORDENADA DESCENTEMENTE ----------\n"); ord_edad_des();
    }



}
