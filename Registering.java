package studentregistration;
//import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import otherpackage.Currentdate;  //this helps me how to comunicate with package
public class Registering  {
   static Student ss[]=new Student[100];  //number of student  student as reference/data type
       static int t=0;//id increment
     static int d;  //id holder
     //Main method here  has only display() method with in
    public static void main (String args[])throws
            IOException, FileNotFoundException, ClassNotFoundException{
          Currentdate.method();// by importing other package
              display();
    }
    //////////////////////////
    public static void display() throws IOException {
        Scanner s = new Scanner(System.in);
        int i;
       System.out.println("\t\t\t\t\tWelcome TO STUDENT REGISTRATION SYSTEM");
       System.out.println("\t\t\t\t**************-----------------------**************");
       System.out.println("\t\t\t\t***-----------------MENU-----------------------****");
       System.out.println("\t\t\t\t***\t1.Register\t\t\t\t***");
        System.out.println("\t\t\t\t***\t2.view my profile\t\t\t***" );
        System.out.println("\t\t\t\t***\t3.Office of registrar\t\t\t***\n"
                + "\t\t\t\t***\t\tStudent registered\t\t***\n"
                + "\t\t\t\t***\t\tAdd and Drop\t\t\t***\n"
                + "\t\t\t\t***\t\tCGPA\t\t\t\t***\n"
                + "\t\t\t\t***\t\tSlip\t\t\t\t***");
        System.out.println("\t\t\t\t***\t4.To put Comment\t\t\t***");
        System.out.println("\t\t\t\t***\t5.Groupe members\t\t\t***");
        System.out.println("\t\t\t\t***\t6.Exit\t\t\t\t\t***");
        System.out.println("\t\t\t\t********----------------------------------------***");
        System.out.println("\t\t\t\t***************************************************");
        System.out.println("\n\t\tEnter Your Choice :\n");
        i = s.nextInt();
        
switch (i) {
            case 1:
                ss[++t]=new Student();
                ss[t].register(t);
                break;
            case 2:
                try{
                 String  pa;
               String pp;
               do{
                System.out.println("enter your id");
               d=s.nextInt();
                 System.out.println("Enter your password to see your profile");
                 pa=s.next();
             pp =ss[d].getPassword();
  if(d>t){
                  System.out.println("you are not registered,please register");
              display();
         }
  if(pa.compareTo(pp) != 0){   //if password not equal
                  System.out.println(" your password is not correct,please try again.");  
               }
               }
               while(pa.compareTo(pp) != 0);
               profile(); //if not goto profile
                }catch(java.lang.NullPointerException e){
                    System.out.println("Your information is "+e.getMessage()+"Register first");
                    display();
                }
                break;
          case 3:
              Scanner op=new Scanner(System.in);
                System.out.println("\t\t\tAvailable only for Office Employee:\n");
                String pa1;
               String pa2="5678";
               do{
                   System.out.println("Enter admin password\t\t");
               pa1= s.next();
               if(pa1.compareTo(pa2) != 0)
              System.out.println(" your password is not correct,please try again.");
               }while(pa1.compareTo(pa2) != 0);
               System.out.println("\t**********************************");
               System.out.println("\t***   1.Registered student    ****\n"
                                + "\t***   2.Print slip:           ****\n"
                                + "\t***   3.Record CGPA:          ****\n"
                                 +"\t***   4.Drop and Add:         ****");
               System.out.println("\t**********************************");
               int r;
               System.out.println("Enter your option");
               Scanner p=new Scanner(System.in);
               r=p.nextInt();
               if(r==1)
                result(); //if yes or equal goto result
               else if(r==2) {
                   System.out.println("slip for du");
                   System.out.println("Select your department\n\t\t"
                           + "1.Computer science\n\t\t"
                           + "2.Information science\n\t\t"
                           + "3.Information technology\n\t\t"
                           + "4.Information science\n");
            System.out.println("\t\t:-");
            int key=op.nextInt();
            if(key==1) {
            Currentdate.method();
               Slip.slipmethod();
               Foralldepartment cs=new Foralldepartment();//how about other?
               cs.printslip();
               display();
               }
            
            else if(key==2||key==3||key==4){
                System.out.println("\t\tRecently not available\n");
            }
    else {
                System.out.println("\t\tInvalid key\n");
                 display();
            }
               }
    else if(r==3) {
                 System.out.println("\t\t********Select your department********\n\t\t"
                                      + "***  1.Computer science           ****\n\t\t"
                                      + "***  2.Information science        ****\n\t\t"
                                      + "***  3.Information technology     ****\n\t\t"
                                      + "***  4.Information science        ****");
                 System.out.println("\t\t**************************************");
            System.out.println("\t\t:-");
            int key=op.nextInt();
            if(key==1) {
         Gradetest gt=new Gradetest();// bring nothing
                   gt.menu();//menu method in class Gradetest
                   gt.printgrade();  
                   System.out.println("total GPA:by gt.cgpa and above by gt.printgrade"+gt.cgpa); 
                   profile();//show profile
                   //display();
               }
    else if(key==2||key==3||key==4){
             System.out.println("\t\tRecently not available\n");
            }
    else {
        System.out.println("Invalid key\n");
        display();
    }
                }
    else if(r==4) {
                DropandAddCourse dr=new DropandAddCourse();
                 dr.form();
                  }
    else //(r<1&&r>3)
                    exit(0);
                break;
                case 4:
              Commentimplmentor ci=new Commentimplmentor();
                ci.comment();
                ci.yourcomment();
                break;
          case 5:
    System.out.println("\t****************GROUPE MEMBERS******************");
    System.out.println("\t\t***------NAME---------------------ID.NO-----***");
    System.out.println("\t\t*** KIDIST YTAGESSU       *      0033/18    ***");
    System.out.println("\t\t*** MAHLET NIGUSSEI       *      1293/18    ***");
    System.out.println("\t\t*** TEKALEGN BERAKO       *      1600/18    ***");
    System.out.println("\t\t***********************************************");
          display();
          break;
          case 6:
             exit(0);
              break;
          }
}
////////////////
public static  void profile() throws IOException {
     Gradetest gt=new Gradetest();
    if(t==0)    {
        System.out.println("there is no registered account");
        }
    else  {
       
            // Fileaccep f=new Fileaccep();
    System.out.println("\t***you are succesfully registered thank you. ***");
    System.out.println("\t\t**-----------------------------------------***");
    System.out.println("\t\t** This is your profile.                   ***");
    System.out.println("\t\t** Student first Name: "+ss[d].getFirstName()+"             ***");
    System.out.println("\t\t** Student last name:-  "+ss[d].getLastName()+"             ***");
    System.out.println("\t\t** Age:-  "+ss[d].getAge()+"                ***");
    System.out.println("\t\t** University Entrance exam result: "+ss[d].getResult()+"   ***");
    System.out.println("\t\t** Student address: "+ss[d].getAddress()+"      ***");
    System.out.println("\t\t** Department: "+ss[d].getdep()+"               ***");
    System.out.println("\t\t**your ID is: TRCSC-"+ss[d].getId()+"/19"+"     ***");
    System.out.println("\t\t**Total GPA:"+gt.cgpa+"----------               ***");
    System.out.println("\t\t***-------------------------------------------*****");
    System.out.println("\t\t***************************************************");
    System.out.println("\t\tTHANK YOU FOR REGISTRATION\n");
    System.out.println("*******************************\n");
    System.out.println("***\t\t1.My Grade           ***\n");
    System.out.println("***\t\t2.See my Slip form   ***\n");
    System.out.println("***\t\t3.Back to main menu  ***\n");
    System.out.println("********************************\n");
    int mygrade;
    Scanner my=new Scanner(System.in);
    mygrade=my.nextInt();
    if(mygrade==1){
      gt.printgrade();
      System.out.println("GPA:"+gt.cgpa);
      
    }
    else if(mygrade==2) {
        Foralldepartment cs=new Foralldepartment();
        Foralldepartment ic=new ForIT();
        Foralldepartment sys=new Forsystem();
        Foralldepartment info=new Forinfosa();
        System.out.println("***----Enter your department choice----***\n");
        System.out.println("***    1.Computer science              ***\n");
        System.out.println("***    2.Information Technology        ***\n");
        System.out.println("***    3.Information System            ***\n");
        System.out.println("***    4.Information Science           ***\n");
        System.out.println("***    5.Back to Profile Menu          ***\n");
        System.out.println("***----*************************-------***\n");
        int x=my.nextInt();
        switch(x) {
            case 1:
               cs.printslip();
               break;
            case 2:
                ic.printslip();
                break;
            case 3:
                sys.printslip();
                break;
            case 4:
                info.printslip();
                break;
            case 5:
                profile();
                break;
            default:
                System.out.println("Invalid key");
                display();
                }
    }
    else if(mygrade==3) {
      display();  
    }
    }
}
private static void result() throws FileNotFoundException, IOException   {
      String Tekafile="C:\\Users\\hi\\Documents\\NetBeansProjects\\studentRegistration\\newfile.txt";
     int a[] = new int[t];
     System.out.println("STUDENTS REGISTERED IN THE COLLEGE");
     System.out.println("---------------------------------------------------");
     System.out.println("\t\tName\t\tLast name\t\tresult\t\tage\t\tAddress\t\tdepartment\t\tid");
            for (int i = 1; i <= t; i++) {
   System.out.println("\t" + ss[i].getFirstName() + "\t" + ss[i].getLastName() + "\t" + ss[i].getResult() +
           "\t"+ ss[i].getAge() + "\t" +ss[i].getAddress()+"\t"+ss[i].getdep()+"\tTRCSC-" +ss[i].getId() + "/19\t");
            }
   System.out.println("---------------------------------------------------\n\n");
   System.out.println("**************************************************");
   System.out.println("***\t\t1-----Search specific file            *****\n"
                    + "***\t\t2-----back                            *****\n"
                    + "***\t\t3-----Exit                            *****");
   System.out.println("**************************************************");
   Scanner s=new Scanner(System.in);
   int cas=s.nextInt();
   if(cas==1)  {
       System.out.println("\tEnter the student ID\n");
       String Id=s.nextLine();
   FileReader f=new FileReader(Tekafile);
   BufferedReader br=new BufferedReader(f);
   String line;
   while((line=br.readLine())!=null) {
       if(line.contains(Id)){
      System.out.println(line);
  }
       else {
         System.out.println("\tSomething get wrong\n\t\t\tsearching Failed..........\n"); 
         display();
       }
   }
   }
   else if(cas==2){
   result();
   }
   else if(cas==3){
       exit(0);
   }
   else
       display();
 }

}
  


          
        
  
