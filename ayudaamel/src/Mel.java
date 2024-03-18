import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Mel {
   static Connection conn=null;
   static ResultSet rs=null;
   static Statement s=null;
   static Scanner scanner=new Scanner(System.in);
   static String db = "fa_uni_poo";
   static String url = "jdbc:mysql://n1nlmysql19plsk.secureserver.net:3306/";
   static String user = "fa_uni_poo_user";
   static String password = "f5t5r34lb4";
   static String driver = "com.mysql.cj.jdbc.Driver";
   public static void conectarse(){
      try{ Class.forName(driver);
         conn = DriverManager.getConnection(url + db, user, password);
         System.out.println("CONECTADO");
      }catch(ClassNotFoundException|SQLException e){
         Logger.getLogger(Mel.class.getName()).log(Level.SEVERE,null,e);
      }
   }
 public static void buscar_alumno(String alumno) {
      try{String sql="SELECT * FROM fa_uni_poo.T_ALUMNO where tx_nombre='%"+alumno+"%'";
         s=conn.createStatement();
         rs=s.executeQuery(sql);
         while(rs.next()){
             String nombre=rs.getString("tx_nombre");
             String cod=rs.getString("tx_codigo");
             System.out.println(nombre+"\t"+cod);
         }



 }catch(SQLException e){
         Logger.getLogger(Mel.class.getName()).log(Level.SEVERE,null,e);
      }
   }

    public static void main(String[] args) {
        conectarse();
        String alumno;
        System.out.println("ingrese el nombre del alumno: ");
        alumno= scanner.nextLine();
        buscar_alumno(alumno);

    }
}
