
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Losinfieles{

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/ojito";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from infieles");
            System.out.print("----INFIELES <3-----\n");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+ resultSet.getString(3)+" "+resultSet.getInt(4));
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
