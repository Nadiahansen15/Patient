import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Connect {

    public void connf(){

    try {

        // 1. get a connection to database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientsystem?useTimezone=true&serverTimezone=UTC", "root", "Morfar1559");
        // 2. create a statement
        Statement myStatement = con.createStatement();
        // 3. Execute sql query
        ResultSet rSet = myStatement.executeQuery("select*from patient");
        //.4 Process the result Set
        while (rSet.next()) {
            System.out.println(rSet.getString("patient_last") + ", " + rSet.getString("patient_first"));
        }

        // 5. close the connection
        con.close();


    } catch (Exception e) {
        System.out.println(e);
    }
    }
}