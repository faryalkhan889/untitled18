import java.util.Scanner;
import java.util.regex.Pattern;
public class student { //class names start with an uppercase letter

    int studentId;
     String firstname;
     String lastname;
     String Class_st;
     int H_n;
     String address;
     String city;
     String state;
     String email;
     int Zi;

   public student() {
       Scanner ko = new Scanner(System.in);
       System.out.println("Enter your first name");
       this.firstname = ko.nextLine();
       System.out.println("Enter your last name");
       this.lastname = ko.nextLine();
       System.out.println("Enter your class standing(Freshman, sophomore, junior, senior");
       this.Class_st = ko.nextLine();
       System.out.println("Enter your Peoplesoft id");
       this.studentId = ko.nextInt();
       System.out.println("Enter your House number ");
       this.H_n = ko.nextInt();
       this.address = ko.nextLine();
       System.out.println("Enter your street");
       this.address = ko.nextLine();
       System.out.println("Enter city");
       this.city = ko.nextLine();
       System.out.println("Enter State: AK, AL, AR, AZ, CA, CO, CT, DC, DE, FL, GA, HI, IA, ID, IL, IN, KS, KY, LA, MA, MD, ME, MI, MN,MO, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA, RI, SC, SD, TN, TX, UT, VA, VT, WA, WI, WV, WY");
       this.state = ko.nextLine();
       System.out.println("Enter Zip code");
       this.Zi = ko.nextInt();
       this.email = ko.nextLine();
       System.out.println("Enter Email:");
       this.email = ko.nextLine();

   }

    private void setStudentId(){
        studentId++;
        for (int i=0;i<7;i++) {
            i= i + studentId;
            this.studentId = studentId;
        }

    }
    private void setZi(){
        Zi++;
        for(int i=0;i<5;i++){
            i=i+Zi;
            this.Zi=Zi;
        }
    }

    public void setH_n(int h_n) {
        H_n = h_n;
    }

    public void setAddress(String c){
        address=c;
    }
    public void setCity(String d){
        city=d;
    }
    public void setState(String e){
        state=e;
    }
    public void setEmail(){
        this.email=email;

    }

    public void setClass_st(String class_st) {
        Class_st = class_st;
    }

    public int getH_n() {
        return H_n;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getClass_st() {
        return Class_st;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;

    }
    public String getCity(){
        return city;
    }

    public int getZi() {
        return Zi;
    }

    public String getState() {
        return state;
    }

    public String displayinfo(){
        return "Student id"+" "+ studentId+ "\n"+"first name" + firstname+ "\n"+"lastname:"+ " "+ lastname+ "\n"+"address:"+H_n+" "+address+ "\n"+"city:"+" "+city+"\n"+"State:"+" "+state+"\n"+"Zip code:"+Zi+"\n"+"Email:"+" "+email;
    }

    public String getEmail() {
        String emailRegex ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


        Pattern pat = Pattern.compile(emailRegex);
        return emailRegex;
    }


}



