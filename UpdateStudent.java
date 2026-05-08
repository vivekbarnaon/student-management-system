import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {

        String url  = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "root@123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, user, pass);


            String sql = "UPDATE Student SET marks = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);


            ps.setInt(1, 95);
            ps.setInt(2, 1);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("Record not found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}