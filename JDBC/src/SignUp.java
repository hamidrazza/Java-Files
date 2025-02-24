import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {
    static Connect obj = new Connect();
    public static void main(String[] args){
        String query = "INSERT INTO login (username, password) VALUES (?,?)";
        try{
            Connection con = DriverManager.getConnection(obj.url, obj.username, obj.password);
            con.setAutoCommit(false);
            Scanner sc = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("--SIGN UP PAGE--");
            System.out.println("****************");
            System.out.print("Enter your username: ");
            String user = sc.next();
            System.out.print("Enter your password: ");
            String pass = sc.next();

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0){
                con.commit();
                System.out.println("Your data has been updated.");
            }else{
                con.rollback();
                System.out.println("Data hasn't been updated.");
            }
            ps.close();
            con.commit();
            sc.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
