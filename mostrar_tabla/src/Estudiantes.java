
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Estudiantes {
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
            conn=DriverManager.getConnection(url,username,password);
            System.out.println("---------SE ESTABLECIÓ LA CONEXIÓOOOON--------");

        }catch(ClassNotFoundException|SQLException ex){
        Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE,null,ex);
        }}
        public static void mostrar_tabla(){
            try{
            String sql="select * from estudiantes";
                    s=conn.createStatement();
            rs=s.executeQuery(sql);
                    System.out.println("ID"+"\t"+"NOMBRE"+"\t"+"APELLIDO"+"\t\t"+"NOTA"+"\t"+"FECHA DE NACIMIENTO");
            while(rs.next()){
                int id=rs.getInt("id");
                String nombre=rs.getString("nombre");
                String lastname= rs.getString("apellido");
                int nota=rs.getInt("nota_examen");
                String naci=rs.getString("fecha_nacimiento");
                        System.out.println(id+"\t"+nombre+"\t"+lastname+"\t\t"+nota+"\t"+naci);
            }
        }catch (SQLException e){
                Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE,null,e);
            }
    }

    public static void main(String[] args){
        conectar();mostrar_tabla();
    }



}
