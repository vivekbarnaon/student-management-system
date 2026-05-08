import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {

        String url  = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "root@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO Student (id, name, marks) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 1);
            ps.setString(2, "Vivek Kumar");
            ps.setInt(3, 23);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted successfully!");
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}