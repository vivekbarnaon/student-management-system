import java.sql.*;

public class DisplayStudent {
    public static void main(String[] args) {

        String url  = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "root@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "SELECT * FROM Student";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("ID\tName\t\tMarks");
            System.out.println("--------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println(id + "\t" + name + "\t" + marks);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}