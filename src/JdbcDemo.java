import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2", "root", "root123");
            // default port of my sql is 3306
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from person");
            while (result.next()){
                System.out.println(result.getString("name"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
