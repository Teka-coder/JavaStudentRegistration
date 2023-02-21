
package studentregistration;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static studentregistration.Registering.d;// to check if the student is known
import static studentregistration.Registering.ss;//

public class Gradetest extends Registering {
   // static String a,b,c,D,e,f;
    float cgpa; 
    public void menu() throws IOException {
    Scanner take=new Scanner(System.in);
    System.out.println("enter your ID...........use only the digit\n");
      int idi=take.nextInt();
        System.out.println("enter your name\n");
        String name=take.next();
        System.out.println("enter your department.....................be careful to enter maching name");
        String depar=take.next();
        if((ss[idi].getFirstName().compareTo(name)==0)&&ss[idi].getId()==idi&&ss[idi].getdep().compareTo(depar)==0) { 
    composa(cgpa);
        }
           else {
            System.out.println("sorry your profile can't reached/non registered:........see your advisor\n");  
            display();
        }
    }
    public double composa(float cgpa) {
        float quizj,quizdb,quizds,quizdisc,quiznum,quizarch;
        float quizjscore=0.0f,quizdbscore=0.0f,quizdsscore=0.0f,quizdiscscore=0.0f,quiznumscore=0.0f,quizarchscore=0.0f;
        float gradej ,gradedb,gradeds,gradenum,gradedisc,gradearch;
        float finalexamj=0.0f,finalexamdb=0.0f,finalexamds=0.0f,finalexamdisc=0.0f,finalexamnum=0.0f,finalexamarch=0.0f;
        float projectj=0.0f,projectdb=0.0f,projectds=0.0f,projectdisc=0.0f,projectnum=0.0f,projectarch=0.0f;
        float testexamj,testexamdb,testexamds,testexamnum,testexamdisc,testexamarch;
        float  testscorej=0.0f,testscoredb=0.0f,testscoreds=0.0f,testscorenum=0.0f,testscoredisc=0.0f,testscorearch=0.0f;
        float ccgpa = 0;
        char letter = 0;
        float java = 0,db = 0,ds = 0,discret = 0,numerics = 0,arch = 0;
        
   Scanner take=new Scanner(System.in);
        for(int i=1;i<=6;i++) {
            System.out.println("\n\n\n1.java\n2.DB\n3.DS\n4.Discret\n5.Numerics\n6.Arch\n");
                System.out.println("\tenter full information for course-"+i);
                for(int j=1;j<=3;j++) {
                System.out.println("\t\tenter the result of QUIZ-"+j+"......%5");
                if(i==1) {
                quizj=take.nextFloat();
                quizjscore+=quizj;
                }
                if(i==2){
                quizdb=take.nextFloat();
                quizdbscore+=quizdb;
                }
                if(i==3) {
                quizds=take.nextFloat();
                quizdsscore+=quizds;
                }
                if(i==4){
                quizdisc=take.nextFloat();
                quizdiscscore+=quizdisc;
                }
                if(i==5){
                quiznum=take.nextFloat();
                quiznumscore+=quiznum;
                }
                if(i==6) {
                quizarch=take.nextFloat();
                quizarchscore+=quizarch;
                }
                }  //mini loop
            for(int k=1;k<=2;k++){
               System.out.println("\t\tenter the result of test exam-"+k+".......%10\n");
                if(i==1) {
                testexamj=take.nextFloat();
                testscorej=+testexamj;
                }
                if(i==2) {
                testexamdb=take.nextFloat();
                testscoredb=+testexamdb;
                }
                if(i==3) {
                testexamds=take.nextFloat();
                testscoreds=+testexamds;
                }
                if(i==4) {
                testexamnum=take.nextFloat();
                testscorenum=+testexamnum;
                }
                if(i==5) {
                testexamdisc=take.nextFloat();
                testscoredisc=+testexamdisc;
                }
                if(i==6) {
                testexamarch=take.nextFloat();
                testscorearch=+testexamarch;
                }
            }     //mini loop
            
            System.out.println("\t\tenter the resuslt of project:................%25");
            if(i==1) {
            projectj=take.nextFloat();
            }
              if(i==2) {
            projectdb=take.nextFloat();
            }
             if(i==3) {
            projectds=take.nextFloat();
            } 
             if(i==4) {
            projectnum=take.nextFloat();
            }
             if(i==5) {
            projectdisc=take.nextFloat();
            }
             if(i==6) {
            projectarch=take.nextFloat();
            }
              
            System.out.println("\t\tenter the resuslt of final exam:..............%40");
            if(i==1) {
            finalexamj=take.nextFloat();
            }
            if(i==2) {
            finalexamdb=take.nextFloat();
            }
            if(i==3) {
            finalexamds=take.nextFloat();
            }
            if(i==4) {
            finalexamnum=take.nextFloat();
            }
            if(i==5) { 
            finalexamdisc=take.nextFloat();
            }
            if(i==6) { 
            finalexamarch=take.nextFloat();
            }
        if(i==1) {
           gradej=quizjscore+testscorej+finalexamj+projectj;
           System.out.println("your total result out of 100% for course-"+i+":="+gradej+"\n");
            if(gradej>=85&&gradej<=100) {
                System.out.println("Excellent! you got A:\n");
            letter='A';
            }
            else if(gradej>=75&&gradej<85){
                System.out.println("well done! you got B:\n");
                letter='B';
            }
            else if(gradej>=65&&gradej<75) {
                System.out.println("satisfactory! you got C:\n");
                letter='C';
            }
            else if(gradej>=55&&gradej<65) {
                System.out.println("in danger! you got D:\n");
                letter='D';
            }
            else {
                System.out.println("Oh! that is awfully you FALL this course grading F:\n");
            letter='F';
            }
           }
           if(i==2) {
           gradedb=quizdbscore+testscoredb+finalexamdb+projectdb;
           System.out.println("your total result out of 100% for course-"+i+":="+gradedb+"\n");
            if(gradedb>=85&&gradedb<=100) {
                System.out.println("Excellent! you got A:\n");
            letter='A';
            }
            else if(gradedb>=75&&gradedb<85){
                System.out.println("well done! you got B:\n");
                letter='B';
            }
            else if(gradedb>=65&&gradedb<75) {
                System.out.println("satisfactory! you got C:\n");
                letter='C';
            }
            else if(gradedb>=55&&gradedb<65) {
                System.out.println("in danger! you got D:\n");
                letter='D';
            }
            else {
                System.out.println("Oh! that is awfully you FALL this course grading F:\n");
            letter='F';
            }
           }
           if(i==3) {
           gradeds=quizdsscore+testscoreds+finalexamds+projectds;
           System.out.println("your total result out of 100% for course-"+i+":="+gradeds+"\n");
            if(gradeds>=85&&gradeds<=100) {
                System.out.println("Excellent! you got A:\n");
            letter='A';
            }
            else if(gradeds>=75&&gradeds<85){
                System.out.println("well done! you got B:\n");
                letter='B';
            }
            else if(gradeds>=65&&gradeds<75) {
                System.out.println("satisfactory! you got C:\n");
                letter='C';
            }
            else if(gradeds>=55&&gradeds<65) {
                System.out.println("in danger! you got D:\n");
                letter='D';
            }
            else {
                System.out.println("Oh! that is awfully you FALL this course grading F:\n");
            letter='F';
            }
           }
           if(i==4) {
           gradenum=quiznumscore+testscorenum+finalexamnum+projectnum;
           System.out.println("your total result out of 100% for course-"+i+":="+gradenum+"\n");
            if(gradenum>=85&&gradenum<=100) {
                System.out.println("Excellent! you got A:\n");
            letter='A';
            }
            else if(gradenum>=75&&gradenum<85){
                System.out.println("well done! you got B:\n");
                letter='B';
            }
            else if(gradenum>=65&&gradenum<75) {
                System.out.println("satisfactory! you got C:\n");
                letter='C';
            }
            else if(gradenum>=55&&gradenum<65) {
                System.out.println("in danger! you got D:\n");
                letter='D';
            }
            else {
                System.out.println("Oh! that is awfully you FALL this course grading F:\n");
            letter='F';
            }
           }
           if(i==5) {
           gradedisc=quizdiscscore+testscoredisc+finalexamdisc+projectdisc;
           System.out.println("your total result out of 100% for course-"+i+":="+gradedisc+"\n");
            if(gradedisc>=85&&gradedisc<=100) {
                System.out.println("Excellent! you got A:\n");
            letter='A';
            }
            else if(gradedisc>=75&&gradedisc<85){
                System.out.println("well done! you got B:\n");
                letter='B';
            }
            else if(gradedisc>=65&&gradedisc<75) {
                System.out.println("satisfactory! you got C:\n");
                letter='C';
            }
            else if(gradedisc>=55&&gradedisc<65) {
                System.out.println("in danger! you got D:\n");
                letter='D';
            }
            else {
                System.out.println("Oh! that is awfully you FALL this course grading F:\n");
            letter='F';
            }
           }
           if(i==6) {
           gradearch=quizjscore+testscorej+finalexamarch+projectarch;
           System.out.println("your total result out of 100% for course-"+i+":="+gradearch+"\n");
            if(gradearch>=85&&gradearch<=100) {
                System.out.println("Excellent! you got A:\n");
            letter='A';
            }
            else if(gradearch>=75&&gradearch<85){
                System.out.println("well done! you got B:\n");
                letter='B';
            }
            else if(gradearch>=65&&gradearch<75) {
                System.out.println("satisfactory! you got C:\n");
                letter='C';
            }
            else if(gradearch>=55&&gradearch<65) {
                System.out.println("in danger! you got D:\n");
                letter='D';
            }
            else {
                System.out.println("Oh! that is awfully you FALL this course grading F:\n");
            letter='F';
            }
           }
           
 switch(letter) {   //b/c if statment needs alot of condition
    
                case 'A':
                    if(i==1)
                        java=4*6;
                    else if(i==2)
                        db=4*6;
                    else if(i==3)
                        ds=4*6;
                    else if(i==4)
                        discret=4*5;
                    else if(i==5)
                        numerics=4*5;
                    else 
                        arch=4*5;
                    
              System.out.println("\tA:\n");
                    
                    break;
            case 'B':
                    if(i==1)
                        java=3*6;
                    else if(i==2)
                        db=3*6;
                    else if(i==3)
                        ds=3*6;
                    else if(i==4)
                        discret=3*5;
                    else if(i==5)
                        numerics=3*5;
                    else 
                        arch=3*5;
                    System.out.println("\tB:\n");
                    break;
            case 'C':
                     if(i==1)
                        java=2*6;
                    else if(i==2)
                        db=2*6;
                    else if(i==3)
                        ds=2*6;
                    else if(i==4)
                        discret=2*5;
                    else if(i==5)
                        numerics=2*5;
                    else 
                        arch=2*5;
                    System.out.println("\tC:\n");
                    break;
            case 'D':
                    if(i==1)
                        java=1*6;
                    else if(i==2)
                        db=1*6;
                    else if(i==3)
                        ds=1*6;
                    else if(i==4)
                        discret=1*5;
                    else if(i==5)
                        numerics=1*5;
                    else 
                        arch=1*5;
                    System.out.println("\tD:\n");
                    break;
            default:
                    if(i==1)
                        java=0*6;
                    else if(i==2)
                        db=0*6;
                    else if(i==3)
                        ds=0*6;
                    else if(i==4)
                        discret=0*5;
                    else if(i==5)
                        numerics=0*5;
                    else 
                        arch=0*5;
                    System.out.println("\tF:\n");
            }    //end of switch    
        cgpa=(java+db+ds+discret+numerics+arch)/33;
            }  //end of first forloop
        ccgpa=(java+db+ds+discret+numerics+arch)/33;
        String statuse;
        System.out.println("GPA:"+ccgpa+"\n");
        if(ccgpa>=2&&ccgpa<=4) {
            statuse="Pass";
        System.out.println("Statuse:"+statuse+"\n");
        }
        else if(ccgpa<2) {
            statuse="Fail";
            System.out.println("Statuse:"+statuse+"\n");
        }
        else
            System.out.println("Statuse:invalid grade\n");
  return cgpa;
            
        }
    
   public void printgrade() {
     
        System.out.println("your grade/GPA is:"+cgpa);
    
            }

   
   
   
}



                    /*
System.out.println("enter your name\n");
        String name=take.next();
        
        System.out.println("enter your id:only the digit\n");  
        int id=take.nextInt();
        System.out.println("enter your department");
        
        //if((ss[d].getFirstName().compareTo(name)==0)&&ss[d].getId()==id) { 
    //calculate grade
      else.....
           else {
            System.out.println("sorry your profile can't reached/non registered:");   
        }
                            */