import java.sql.*;
import java.util.Scanner;

public class SePatient

{
    public void sePatient()
    {
        //Scanner sc = new
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientsystem?useTimezone=true&serverTimezone=UTC", "root", "Morfar1559");

            Statement st = con.createStatement();


            ResultSet rSet = st.executeQuery("select*from patient");


            con.close();
        } catch (ClassNotFoundException e) {
          e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
