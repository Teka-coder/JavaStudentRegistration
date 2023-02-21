package studentregistration;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import static studentregistration.Registering.d;
import static studentregistration.Registering.ss;
public class Slip extends Student {    //the instance variable also be static
   static String nameinBlockletter;
   static String id;
    static String nationality;
    static String department;
    static String cafteriastatuse;
    static String academicyear;
    static char semister;
    static String programme;  //degree or.....
    static char classyear;
    static char sex;
    static String admissiontype;  //regular..weekend,..extension..summer
    String files="slipfile.txt";
public static void slipmethod(){ //static access by slip.slipmethod();
    BufferedWriter writer;
    Scanner take=new Scanner(System.in);
    System.out.println("enter your id:only the digit\n");  
        int idi=take.nextInt();
    System.out.println("enter your name\n");
        String name=take.next();
  if((ss[idi].getFirstName().compareTo(name)==0)&&ss[idi].getId()==idi) { 
    String nam,nat,dep,caf,ayear,prog,admtype;
    char sem,cyear,gend;
    String idd;
    Scanner in=new Scanner(System.in);
    System.out.println("enter your name in BLOCK LETTER!");
   nam=in.nextLine();
   String str=name.toUpperCase();
   nameinBlockletter=str;
   System.out.println("enter your id!");
    idd=in.nextLine();
    id=idd;
    System.out.println("enter your sex!........in [M] OR [F] format");
    gend=in.next().charAt(0);
    sex=gend;
    System.out.println("enter your nationality!");
    nat=in.next();
    nationality=nat;
    System.out.println("enter your department!");
    dep=in.next();
    department=dep;
    System.out.println("enter your cafteria statuse!........NON or CAFE");
    caf=in.next();
    cafteriastatuse=caf;
    System.out.println("enter the academic yeaer!.........only the year");
    ayear=in.next();
    academicyear=ayear;
    System.out.println("enter the current semister!.......[1]/[2]");
    sem=in.next().charAt(0);
    semister=sem;
    System.out.println("enter the programme level!.....Degree/Msc/Phd");
    prog=in.next();
    programme=prog;
    System.out.println("enter your class year!.....in[1,2,3,4]format");
    cyear=in.next().charAt(0);
    classyear=cyear;
    System.out.println("enter the admission type!....Regular/Extension/Weekend/Summer");
    admtype=in.next();
    admissiontype=admtype;
    String files="slipfile.txt";
    try {
                     //FileWriter myWriter=new FileWriter(path);
                     //writer = new BufferedWriter(myWriter); we can use this above code also to write to thefile
			writer = new BufferedWriter(new FileWriter(files,true));//it was like this but we can leave it writer = new BufferedWriter(new FileWriter(path,true));
  //writer.append("Id.no"+" first name "+" lastnames"+" Sex"+" Age"+" Address"+" Department\n");             
writer.append(idd+" "+nam+" "+gend+" "+nat+" "+dep+" "+caf+" "+ayear+" "+sem+" "+prog+" "+cyear+" "+admtype);//appending text to file
			writer.newLine();
                        writer.flush();
			
			writer.close();
		} catch (IOException e) {
		}
    print();
        }
        else {
           System.out.println("You are not registered....register first!"); 
        }
}
static void print() {   //b/c non static method can.t accessed in main class slip.print();
    System.out.println();
    System.out.println("student Name in Block letter: "+nameinBlockletter);
  System.out.println("Id "+id);
  System.out.println("nationality "+nationality);
  System.out.println("department: "+department);
  System.out.println("cafteria statuse "+cafteriastatuse);
  System.out.println("Academic year "+academicyear);
  System.out.println("semister "+semister);
  System.out.println("programme: "+programme);
  System.out.println("class year "+classyear);
  System.out.println("sex "+sex);
  System.out.println("admmission type: "+admissiontype);
}
}

                /*
public void setname(String name) {
    nameinBlockletter=name;
}

public String getname(String name ) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your name in BLOCK LETTER!");
   name=in.next();
   return name;
}
public void setid(int idd) {
    id=idd;
}
public int getid(int idd ) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your id!");
   idd=in.nextInt();
   return idd;
}
public void setnation(String nat){
    nationality=nat;
}
public String getnation(String nat) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your id!");
   nat=in.next();
   return nat;
}
public void setdepa(String dep){  //weather ovverid or use other name
    department=dep;
}
public String getdepa(String dep) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your department!");
   dep=in.next();
   return dep;
}
public void setcafe(String caf){
    cafteriastatuse=caf;
}
public String getcafe(String caf) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your cafe statuse!");
   caf=in.next();
   return caf;
}
public void setacadyear(String Ayear) {
    academicyear=Ayear;
}
public String getacadyear(String Ayear) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your academic year!");
   Ayear=in.next();
   return Ayear;
}
public void setsem(char sem){
    semister=sem;
}
public char getsem(char sem) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your semister!");
   sem=in.next().charAt(0);
   return sem;
}
public void setprog(String prog){
    programme=prog;
}
public String getprog(String prog) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your programme level!");
   prog=in.next();
   return prog;
}
public void setcyear(char cyear){
    classyear=cyear;
}
public char getcyear(char cyear) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your class year!");
   cyear=in.next().charAt(0);
   return cyear;
}
public void setsex(char gend){
    sex=gend;
}
public char getsex(char gend) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your sex!");
   gend=in.next().charAt(0);
   return gend;
}
public void setadmtype(String Admtype){
    admissiontype=Admtype;
}
public String getadmtype(String Admtype) {
   Scanner in=new Scanner(System.in);
   System.out.println("enter your admission type!");
   Admtype=in.next();
   return Admtype;
}

    //Registering.print();
}                             */
/*
void print() {
    System.out.println();
    System.out.println("student Name: "+nameinBlockletter);
  System.out.println("Id "+id);
  System.out.println("nationality "+nationality);
  System.out.println("department: "+department);
  System.out.println("cafteria statuse "+cafteriastatuse);
  System.out.println("Academic year "+academicyear);
  System.out.println("semister "+semister);
  System.out.println("programme: "+programme);
  System.out.println("class year "+classyear);
  System.out.println("sex "+sex);
  System.out.println("admmission type: "+admissiontype);
}
}
*/