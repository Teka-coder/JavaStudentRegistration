package studentregistration;
//import java.util.Arrays;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.LinkedList;
import java.util.Scanner;

public class DropandAddCourse extends Gradetest{

     public void form() throws IOException  {
    System.out.println("\tDrop and add form");
    Scanner op=new Scanner(System.in);
    System.out.println("\t\t1.DROP and ADD with Grade.............Available"
                         +"\n\t\t2.Elective ADD and DROP"
                         + "enter your option:\n");
    int opi=op.nextInt();
    if(opi==1) {
    System.out.println("1.Warnning........for first year");
    System.out.println("2.Dissmissal............for second year and above");
    System.out.println("3.Pass..................promoted but with course fail/ [F]");
    System.out.println("\n\t\tPass is available");
    System.out.println("\n\t\tEnter your choice");
    int option=op.nextInt();
 
    switch(option) {
        case 1:
            System.out.println("\t\tavailable at the end of first semister"
                    + "the garde need to be greater than or equals to 1.5\n");
            break;
        case 2:
            System.out.println("\t\t 1.Permanent dismissal\n"
                                  + "2.Succisive warning,,,,,,,,,,,,,,,,,,Available"
                                     + "\n\n\t Sorry the system is running out");
            break;
        case 3:
            System.out.println("Select your department\n\t\t"
                    + "1.Computer science,,,,,,,,,,,,,,,,,,available\n\t\t"
                    + "2.Information science\n\t\t"
                    + "3.Information technology\n\t\t"
                    + "4.Information science\n");
            System.out.println("\t\t:-");
            int key=op.nextInt();
            if(key==1) {
            coursetobeadded(cgpa);
            }
            else if(key==2||key==3||key==4){
                System.out.println("\t\tRecently not available\n");
            }
            else {
                System.out.println("\t\tInvalid key\n");
                 display();
            }
            break;
        default:
            System.out.println("\t\tInvalid key\n");
            }
    }
    else if(opi==2) {
        System.out.println("It is not available for amoment\n");
        display();
    }
    else {
        System.out.println("Invalid option");
      display();
    }
    
    }
    public void coursetobeadded(float ccgpa) throws IOException {
        
        Scanner put=new Scanner(System.in);
    int prog2=5; int logic=5; int stat=5; int applied=7; int sophomer=5; int digitalelc=5;
    int java=6; int db=6; int ds=6; int num=5; int disc=5; int arch=5;
    int ects = 0,rem;
    int totalects1=65;
    int totalects2=68;
      System.out.println("enter your CGPA\n");
    float gpa=put.nextFloat();
    if(gpa==cgpa||gpa==ccgpa) {  //else your grade not found or not entered correctly
    if(gpa>=0&&gpa<2.5){
        System.out.println("you are not allowed to add and drop with GPA "
                + ""+gpa+"\n GPA need to be greater than 2.5\n");
        display();
        //or exit(0);
    }
    else if(gpa<0&&gpa>=4) {
        System.out.println("you entered invalid grade \n Grade must 0<GPA<4");
        display();
        //or exit(0);
    }
    else if(gpa>=2.5&&gpa<4) {
   System.out.println("............The course in the field of add and drop...........?\n");
   System.out.println("Here are All the course for computer science.....in the case of ADD and DROP\n"
                        +"\t\t\t\tThe course with # is closed\n"
                        +"\t\t1.fundamentals of programming1.......#\t\t7.data base\n"
                        +"\t\t2.statistics...........#\t              8.discret mathmatics\n"
                        +"\t\t3.Applied mathmatics..........#\t\t       9.object oriente programming\n"
                        +"\t\t4.Logic........#\t                      10.fundamentals of data structure\n"
                        +"\t\t5.sophomer....................#\t\t       11.numerics\n"
                        +"\t\t6.digital electronics..............#\t\t12.computer architecture\n");
        System.out.println("\n\n\tgive here the information appropriatly");
        System.out.println("Enter your all grade you scored in last semister"
                + "\n\t\t in [A , B , C , D , F] Form");
 
        System.out.println("Enter Grade of fundamental programming-II:");
                char pro=put.next().charAt(0);
                System.out.println("statistics:");
                char stati=put.next().charAt(0);
                System.out.println("Applied mathematics:");
               char app=put.next().charAt(0);
               System.out.println("Logic:");
                char log=put.next().charAt(0);
                System.out.println("Sophomer:");
               char sop=put.next().charAt(0);
                System.out.println("Digital electronics:");
                char dig=put.next().charAt(0);
  ///////////////////////////////////////////////
                if(pro=='F'){
                 System.out.println("YOU MUST DROP programming II");
                  System.out.println("Cause it basics for object oriented programming\n");
                 System.out.println("\n\t\t"
                         + "1.I agree\n\t\t"
                         + "2.Back to menu\n"
                         + "Press any key to Exit\n");
                 int agree=put.nextInt();
    //////////////////////////////////////////
                 switch(agree){
       case 1:
                        //remove
    String[] course1={"c++","stat","applied","logic","sophomer","digital"};
                         System.out.println("\nFirst year second semister courses: "+course1);
                         System.out.println("enter the course code of the course with F to confirm:\n"
                           + "Confirm [c++]... for progaramming II\n"
                           + " [stat]..... for statistcs\n"
                           + " [applied].... for applied mathematics\n"
                           + " [logic]..... for logic\n"
                           + " [soohomer] for writting skill\n"
                           + " [electronics]..... for digital electronics\n\t\t:-");
    System.out.println("enter the matching course name otherwise the machin will runout\n");
    String dropedcourse=put.next();
    if(dropedcourse.compareTo("c++")==0||dropedcourse.compareTo("C++")==0){
        prog2=0;logic=5;stat=5;applied=7;sophomer=5;digitalelc=5;
              System.out.println("programming II: ECTS:= "+prog2);
              System.out.println("Logic: ECTS= "+logic);
              System.out.println("Statistics: ECTS= "+stat);
              System.out.println("Applied Mathematics: ECTS= "+applied);
              System.out.println("Writting Skill: ECTS= "+sophomer);
              System.out.println("Digital Electronics: ECTS= "+digitalelc);
            System.out.println("\n\t\t"+dropedcourse+": Droped succesfully");
            System.out.println("\nEnter its ECTS\n");
              ects=put.nextInt();
    String[] course2={"java","db","ds","num","disc","arch"+"programming II"};
            System.out.println("now course "+dropedcourse+" added to second year first semister course\n");
             System.out.println("now Your courses for second year 1st semister are"+course2+"\n");
            rem=totalects2-ects;
            System.out.println("From your Total ects of the year,"+rem+" is left\n");
                        }
                         break;
     case 2:
                        display();
                         break;
                     default:
                         System.out.println("Invalid operand");
                         exit(0);
                 }
                }
       /////////////////////////////////////////////////
    else if(stati=='F'){
                  System.out.println("YOU NEED TO DROP statistics"); 
                  System.out.println("\t\t\t"
                          + "1.I agree\n\t\t\t"
                          + "2.Post pond\n");
                  int agree=put.nextInt();
                  switch(agree){
      case 1:
   String[] course1={"c++","stat","applied","logic","sophomer","digital"};
         System.out.println("\nFirst year second semister courses: "+course1);
         
         System.out.println("enter the course code of the course with F to confirm:\n"
                           + "Confirm [c++]... for progaramming II\n"
                           + " [stat]..... for statistcs\n"
                           + " [applied].... for applied mathematics\n"
                           + " [logic]..... for logic\n"
                           + " [soohomer] for writting skill\n"
                           + " [electronics]..... for digital electronics\n\t\t:-");
    System.out.println("enter the matching course name otherwise the machin will runout\n");
    String dropedcourse=put.next();
    if(dropedcourse.compareTo("stat")==0||dropedcourse.compareTo("STAT")==0){
        prog2=6;logic=5;stat=0;applied=7;sophomer=5;digitalelc=5;
              System.out.println("programming II: ECTS:= "+prog2);
              System.out.println("Logic: ECTS= "+logic);
              System.out.println("Statistics: ECTS= "+stat);
              System.out.println("Applied Mathematics: ECTS= "+applied);
              System.out.println("Writting Skill: ECTS= "+sophomer);
              System.out.println("Digital Electronics: ECTS= "+digitalelc);
            System.out.println("\n\t\t"+dropedcourse+": Droped succesfully");
            System.out.println("\nEnter its ECTS\n");
            ects=put.nextInt();
            
    String[] course2={"java","db","ds","num","disc","arch"+"Statistics"};
            System.out.println("now course "+dropedcourse+" added to second year first semister course\n");
            System.out.println("now Your courses for second year 1st semister are"+course2+"\n");
            rem=totalects2-ects;
            System.out.println("from your Total ects "+totalects2+","+rem+" is left\n");
    }
    else 
        System.out.println("you entered un maching course code!\n");
                          break;
                      case 2:
                         System.out.println("Enter the date of appointment");
                         String date=put.next();
                         System.out.println("Put your sign");
                         String sign=put.next();
                         System.out.println("\n\t\tyou Requiest CONFIRMED!!\n");
                          System.out.println("The service closed after "+date+"you need to be on the dead line\n");
                          System.out.println("You have approved your agreement by SIGN: "+sign+"\n");
                          display();
                          break;
                      default:
                        System.out.println("Invalid key\n");
                        display();
                  }
                }
    //////////////////////////////////////////////////
         else if(app=='F'){
                  System.out.println("\t\tYOU NEED TO DROP applied"); 
                  System.out.println("\t\t\t"
                          + "1.I agree\n\t\t\t"
                          + "2.not now");
                  int agree=put.nextInt();
                  switch(agree){
                      case 1:
                          //remove from the string array
                          
         String[] course1={"c++","stat","applied","logic","sophomer","digital"};
         System.out.println("\nFirst year second semister courses: "+course1);
                          System.out.println("enter the course code of the course with F to confirm:\n"
                           + "Confirm [c++]... for progaramming II\n"
                           + " [stat]..... for statistcs\n"
                           + " [applied].... for applied mathematics\n"
                           + " [logic]..... for logic\n"
                           + " [soohomer] for writting skill\n"
                           + " [electronics]..... for digital electronics\n\t\t:-");
    System.out.println("enter the matching course name otherwise the machin will runout\n");
    String dropedcourse=put.next(); 
    if(dropedcourse.compareTo("applied")==0||dropedcourse.compareTo("APPLIED")==0){
        prog2=5;logic=5;stat=5;applied=0;sophomer=5;digitalelc=5;
              System.out.println("programming II: ECTS:="+prog2);
              System.out.println("Logic: ECTS="+logic);
              System.out.println("Statistics: ECTS="+stat);
              System.out.println("Applied Mathematics: ECTS="+applied);
              System.out.println("Writting Skill: ECTS="+sophomer);
              System.out.println("Digital Electronics: ECTS="+digitalelc);
            System.out.println("\n\t\t"+dropedcourse+": Droped succesfully");
            System.out.println("\nEnter its ECTS\n");
            ects=put.nextInt();
            
    String[] course2={"java","db","ds","num","disc","arch"+"Statistics"+"Applied"};
            System.out.println("now course "+dropedcourse+" ADDED to second year first semister course\n");
            System.out.println("now Your courses for second year 1st semister are"+course2+"\n");
            rem=totalects2-ects;
            System.out.println("from your Total ects"+totalects2+" of the year:"+rem+" ECTS left\n");
    }
    else 
        System.out.println("you entered un maching course code!\n");
                      break;
                      case 2:
       System.out.println("Enter the date of appointment");
                         String date=put.next();
                         System.out.println("Put your sign");
                         String sign=put.next();
                         System.out.println("\n\t\tyou Requiest CONFIRMED!!\n");
                         System.out.println("The service closed after "+date+"you need to be on the dead line\n");
                         System.out.println("You have approved your agreement by SIGN: "+sign+"\n");
                         display();
                         break;
                      default:
                         System.out.println("Invalid key\n");
                        display();
                  }
                }
          ////////////////////////////////////////
    else if(log=='F'){
                  System.out.println("YOU NEED TO DROP logic");   
                  System.out.println("\n\t\t\t"
                          + "1.I agree\n\t\t\t"
                          + "2.not now");
                  int agree=put.nextInt();
                  switch(agree){
                      case 1:
                          //remove from the string array
           String[] course1={"c++","stat","applied","logic","sophomer","digital"};
         System.out.println("\nFirst year second semister courses: "+course1);
                          System.out.println("enter the course code of the course with F to confirm:\n"
                           + "Confirm [c++]... for progaramming II\n"
                           + " [stat]..... for statistcs\n"
                           + " [applied].... for applied mathematics\n"
                           + " [logic]..... for logic\n"
                           + " [soohomer] for writting skill\n"
                           + " [electronics]..... for digital electronics\n\t\t:-");
    System.out.println("Enter the matching course name otherwise the machin will runout\n");
    String dropedcourse=put.next(); 
    if(dropedcourse.compareTo("logic")==0||dropedcourse.compareTo("LOGIC")==0){
        prog2=5;logic=0;stat=5;applied=7;sophomer=5;digitalelc=5;
              System.out.println("programming II: ECTS:="+prog2);
              System.out.println("Logic: ECTS="+logic);
              System.out.println("Statistics: ECTS="+stat);
              System.out.println("Applied Mathematics: ECTS="+applied);
              System.out.println("Writting Skill: ECTS="+sophomer);
              System.out.println("Digital Electronics: ECTS="+digitalelc);
            System.out.println("\n\t\t"+dropedcourse+": Droped succesfully");
            System.out.println("\nEnter its ECTS\n");
            ects=put.nextInt();
            String[] course2={"java","db","ds","num","disc","arch"+"Statistics"+"Applied"};
            System.out.println("now course "+dropedcourse+" added to second year first semister course\n");
            System.out.println("now Your courses for second year 1st semister are"+course2+"\n");
            rem=totalects2-ects;
            System.out.println("from your Total ects "+totalects2+","+rem+" is left\n");
    }
    else 
        System.out.println("you entered un maching course code!\n");
                          break;
                      case 2:
      System.out.println("Enter the date of appointment");
                         String date=put.next();
                         System.out.println("Put your sign");
                         String sign=put.next();
                         System.out.println("\n\t\tyou Requiest CONFIRMED!!\n");
                          System.out.println("The service closed after "+date+"you need to be on the dead line\n");
                          System.out.println("You have approved your agreement by SIGN: "+sign+"\n");
                          break;
                      default:
                        System.out.println("Invalid key\n");
                        display();
                  }
                }
   /////////////////////////////////////////////////////////
    else if(sop=='F'){
                  System.out.println("YOU NEED TO DROP sophomer");   
                  System.out.println("\t\t\t"
                         + "1.I agree\n\t\t\t"
                         + "2.not now");
                  int agree=put.nextInt();
                  switch(agree){
                      case 1:
                          //remove from the string array
     String[] course1={"c++","stat","applied","logic","sophomer","digital"};
         System.out.println("\nFirst year second semister courses: "+course1);
                          System.out.println("enter the course code of the course with F to confirm:\n"
                           + "Confirm [c++]... for progaramming II\n"
                           + " [stat]..... for statistcs\n"
                           + " [applied].... for applied mathematics\n"
                           + " [logic]..... for logic\n"
                           + " [soohomer] for writting skill\n"
                           + " [electronics]..... for digital electronics\n\t\t:-");
    System.out.println("enter the matching course name otherwise the machin will runout\n");
    String dropedcourse=put.next(); 
    if(dropedcourse.compareTo("sophomer")==0||dropedcourse.compareTo("SOPHOMER")==0){
        prog2=5;logic=5;stat=5;applied=7;sophomer=0;digitalelc=5;
              System.out.println("programming II: ECTS:= "+prog2);
              System.out.println("Logic: ECTS"+logic);
              System.out.println("Statistics: ECTS= "+stat);
              System.out.println("Applied Mathematics: ECTS= "+applied);
              System.out.println("Writting Skill: ECTS= "+sophomer);
              System.out.println("Digital Electronics: ECTS= "+digitalelc);
            System.out.println("\n\t\t"+dropedcourse+": Droped succesfully");
            System.out.println("\nEnter its ECTS\n");
            ects=put.nextInt();
            
  String[] course2={"java","db","ds","num","disc","arch"+"Statistics"+"Applied"};
            System.out.println("now course "+dropedcourse+" added to second year first semister course\n");
            System.out.println("now Your courses for second year 1st semister are"+course2+"\n");
            rem=totalects2-ects;
            System.out.println("from your Total ects "+rem+" left\n");
    }
    else 
        System.out.println("you entered un maching course code!\n");
                          break;
                      case 2:
           System.out.println("Enter the date of appointment");
                         String date=put.next();
                         System.out.println("Put your sign");
                         String sign=put.next();
                         System.out.println("\n\t\tyou Requiest CONFIRMED!!\n");
                          System.out.println("The service closed after "+date+"you need to be on the dead line\n");
                          System.out.println("You have approved your agreement by SIGN: "+sign+"\n");
                          break;
                      default:
                        System.out.println("Invalid key\n");
                        display();
                  }
                }
    ///////////////////////////////////////////////////////////////
     else if(dig=='F'){
                  System.out.println("YOU NEED TO DROP digital electronics");
                  System.out.println("\t\t\t"
                         + "1.I agree\n\t\t\t"
                         + "2.not now");
                  int agree=put.nextInt();
                  switch(agree){
                      case 1:
                          //remove from the string array
    String[] course1={"c++","stat","applied","logic","sophomer","digital"};
         System.out.println("\nFirst year second semister courses: "+course1);
                          System.out.println("enter the course code of the course with F to confirm:\n"
                           + "Confirm [c++]... for progaramming II\n"
                           + " [stat]..... for statistcs\n"
                           + " [applied].... for applied mathematics\n"
                           + " [logic]..... for logic\n"
                           + " [sophomer] for writting skill\n"
                           + " [electronics]..... for digital electronics\n\t\t:-");
    System.out.println("Enter the matching course code otherwise the machin will runout\n");
    String dropedcourse=put.next(); 
    if(dropedcourse.compareTo("electronics")==0||dropedcourse.compareTo("ELECTRONICS")==0){
        prog2=5;logic=5;stat=5;applied=7;sophomer=5;digitalelc=0;
              System.out.println("programming II:ECTS:= "+prog2);
              System.out.println("Logic: ECTS= "+logic);
              System.out.println("Statistics: ECTS= "+stat);
              System.out.println("Applied Mathematics: ECTS= "+applied);
              System.out.println("Writting Skill: ECTS= "+sophomer);
              System.out.println("Digital Electronics: ECTS= "+digitalelc);
            System.out.println("\n\t\t"+dropedcourse+": DROPED SUCCESFULLY!");
            System.out.println("\nEnter its ECTS\n");
            ects=put.nextInt();
     String[] course2={"java","db","ds","num","disc","arch"+"Statistics"+"Applied"};
            System.out.println("now "+dropedcourse+" ADDED for you,into second year first semister course\n");
            System.out.println("now Your courses for second year 1st semister are"+course2+"\n");
            rem=totalects2-ects;
            System.out.println("from your Total ects "+totalects2+" of the year "+rem+"ECTS is left\n");
    }
    else 
        System.out.println("you entered un maching course code!\n");
                          break;
                      case 2:
    System.out.println("Enter the date of appointment");
                         String date=put.next();
                         System.out.println("Put your sign");
                         String sign=put.next();
                         System.out.println("\n\t\tyou Requiest CONFIRMED!!\n");
                          System.out.println("The service closed after "+date+"you need to be on the dead line\n");
                          System.out.println("You have approved your agreement by SIGN: "+sign+"\n");
                          break;
                      default:
                        System.out.println("Invalid key\n");
                        display();
                  }
                }
    }
    }//for if  
}
}
