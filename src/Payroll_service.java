import java.sql.*;

public class Payroll_service {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root123");
            // default port of my sql is 3306
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from emp_payroll");
            while (result.next()){
                System.out.println(result.getString("name"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
