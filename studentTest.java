import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class studentTest {
    public static void main(String[] args) {
        System.out.println("Student Details, Department of ILT");
        System.out.println("Enter number of students:");
        Scanner in = new Scanner(System.in);
        int numSt = in.nextInt();
        student[] so = new student[numSt];

        //create num stud
        for (int n = 0; n < numSt; n++) {
            so[n] = new student();
            so[n].getStudentId();
            so[n].getFirstname();
            so[n].getLastname();
            so[n].getAddress();
            so[n].getCity();
            so[n].getState();
            so[n].getEmail();
            so[n].getClass_st();
            so[n].getZi();

                System.out.println(so[n].displayinfo());
            }
        System.out.println("Number of students:" + numSt);


    }


    }





