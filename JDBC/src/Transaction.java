import java.sql.*;
import java.util.Scanner;

public class Transaction {
    static Connect obj = new Connect();

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String withdraw = "UPDATE customers SET balance = balance - ? WHERE ac_no = ?";
        String credit = "UPDATE customers SET balance = balance + ? WHERE ac_no = ?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(obj.url, obj.username, obj.password);
            System.out.println("Connection Established Successful");
            con.setAutoCommit(false);
            PreparedStatement withdrawStatement = con.prepareStatement(withdraw);
            PreparedStatement creditStatement = con.prepareStatement(credit);

            System.out.print("Enter your username: ");
            String user = sc.next();
            System.out.print("Enter your password: ");
            String pass = sc.next();

            if(checkData(user, pass)){
                System.out.println("LOGIN SUCCESSFULLY");
            }else{
                System.out.println("Incorrect Username or Password !!");
            }

//            withdrawStatement.setDouble(1, 500.00);
//            withdrawStatement.setString(2, "account456");
//
//            creditStatement.setDouble(1, 500.00);
//            creditStatement.setString(2, "account123");

            int affectedRow1 = withdrawStatement.executeUpdate();
            int affectedRow2 = creditStatement.executeUpdate();

            if (affectedRow1 > 0 && affectedRow2 > 0){
                con.commit();
                System.out.println("Transaction Successful");
            }else{
                con.rollback();
                System.out.println("Transaction Failed !!");
            }
            creditStatement.close();
            withdrawStatement.close();
            con.close();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private static boolean checkData(String user, String pass){
        String check = "SELECT username, password FROM login WHERE username = ? AND password = ?";

        try(Connection con = DriverManager.getConnection(obj.url, obj.username, obj.password);
            PreparedStatement ps = con.prepareStatement(check)){
                ps.setString(1, user);
                ps.setString(2, pass);

                try(ResultSet rs = ps.executeQuery()){
                    // Checking if the records is available or not
                    if(rs.next()){
                        return true;
                    }
                }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        return false;
    }
}
