import java.sql.*;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {

    System.out.println(" 1. opret patient \n 2. se patienter \n 3. tilføj konsultation");
    Scanner sc = new Scanner(System.in);
    int valg = sc.nextInt();


    switch (valg)
    {
        case 1:
            OpretPatient p = new OpretPatient();
            p.opretPatient();
        case 2:
            SePatient s = new SePatient();
            s.sePatient();
        case 3:
            TilføjKonsultation t = new TilføjKonsultation();
            t.tilføjKonsul();

    }




    Connect c = new Connect();
    c.connf();



}

}


