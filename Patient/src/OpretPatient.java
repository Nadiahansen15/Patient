import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OpretPatient
{
    public void opretPatient() {
        Scanner scan = new Scanner(System.in);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientsystem?useTimezone=true&serverTimezone=UTC", "root", "Morfar1559");

            Statement st = con.createStatement();

            System.out.println("CPR: ");
            String patient_cpr_id = scan.next();

            System.out.println("Fornavn: ");
            String patient_first = scan.next();

            System.out.println("Efternavn: ");
            String patient_last = scan.next();

            System.out.println("Adresse: ");
            scan.next();
            String patient_adress = scan.next();

            System.out.println("by: ");

            String patient_city = scan.next();

            System.out.println("tel: ");
            String patient_phone = scan.next();

            System.out.println("køn: ");
            String patient_sex = scan.next();

            st.executeUpdate("insert into patient value ('"
                    + patient_cpr_id + "', '"
                    + patient_first + "', '"
                    + patient_last + "', '"
                    + patient_adress + "', '"
                    + patient_city + "', '"
                    + patient_phone + "', '"
                    + patient_sex + "')");

            System.out.println("oprettet");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
