import java.sql.*;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class callvet {
    static Connection conn=null;
    static ResultSet rs=null;
    static Statement s=null;
    static Scanner sc=new Scanner(System.in);
    static String driver="com.mysql.cj.jdbc.Driver";
    static String username="root";
    static String url="jdbc:mysql://localhost:3306/ojito";
    static String password="";
    public static void conectar(){
        try{ Class.forName(driver);
            conn= DriverManager.getConnection(url,username,password);
    }catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(callvet.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    public static void buscar_animal(String animal){
        try{
            String sql="select * from mascotasatendidas where especie=UPPER('"+ animal+ "')";
            s= conn.createStatement();
            rs=s.executeQuery(sql);
            while(rs.next()){
                String id=rs.getString("id");
                String nombre=rs.getString("nombre");
                String especie=rs.getString("especie");
                System.out.println(id+"\t"+nombre+"\t"+especie);
            }

        }catch(SQLException e){
            Logger.getLogger(callvet.class.getName()).log(Level.SEVERE,null,e);

        }
    }
    public static void main(String[] args) {
        String animal;
    conectar();System.out.println("ingrese a qué animal buscar: ");
    animal=sc.nextLine();
    buscar_animal(animal);


    }
    }


