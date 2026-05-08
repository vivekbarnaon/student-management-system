import java.sql.*;
import java.util.Scanner;

public class SearchStudent {
    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "root@123";
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            String sql = "SELECT * FROM Student WHERE name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                int id = rs.getInt("id");
                String sname = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println("\nRecord Found:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + sname);
                System.out.println("Marks: " + marks);
            }
            if (!found) {
                System.out.println("No student found!");
            }
            rs.close();
            ps.close();
            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}