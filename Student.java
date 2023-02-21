
package studentregistration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static studentregistration.Registering.ss;
import static studentregistration.Slip.id;
class Student extends Person{
    private int result;
    private String dep;
    private char sex;
    public void setResult(int result) {
        this.result = result;
    }
 public int getResult() {
        return result;
    }
  public void setdep(String dep){
        this.dep=dep;
  }
  public String getdep(){
        return dep;
    }
   public void setsex(char sex){
        this.sex=sex;
   }
   public char getsex(){
        return sex;
    }
        
    
    
           String Tekafile="C:\\Users\\hi\\Documents\\NetBeansProjects\\studentRegistration\\newfile.txt";
     public void register(int position) throws IOException {
         
    
         BufferedWriter writer;
         // BufferedWriter writer; 
   /* try {
            writer = new BufferedWriter(new FileWriter("myfile.txt",true));//it was like this but we can leave it writer = new BufferedWriter(new FileWriter(path,true));
                        
writer.append(setId+" "+setFirstName()+" "setLastName()+" "+setdep());//appending text to file
writer.newLine();
 writer.flush();
			
writer.close();
		} catch (IOException e) {
		}    
 */   /* try {
           Fileaccep.writeToFile();
        } catch (IOException ex) {
        }  */
         Scanner s = new Scanner(System.in);
         String depa = null;
        System.out.println("---------------------------------------------------");
        System.out.println("\tREGISTERING\n");
        System.out.print("\tEnter Your First Name\n\t");
        String fnames=s.next();
        Registering.ss[position].setFirstName(fnames);
      // Registering.ss[position].setFirstName(s.next());
        System.out.print("\tEnter Your Last Name\n\t");
        String lnames=s.next();
        Registering.ss[position].setLastName(lnames);
        //Registering.ss[position].setLastName(s.next());
        System.out.print("\tEnter Sex\n\t");
        char sx=s.next().charAt(0);
        Registering.ss[position].setsex(sx);
        System.out.print("\tEnter Your age\n\t");
        int ages=s.nextInt();
        Registering.ss[position].setAge(ages);
        //Registering.ss[position].setAge(s.nextInt());
        System.out.print("\tEnter Your address\n\t");
        String adres=s.next();
        Registering.ss[position].setAddress(adres);
        //Registering.ss[position].setAddress(s.nextLine());
        System.out.print("\tEnter Your result\n\t");
        int reslt=s.nextInt();
        Registering.ss[position].setResult(reslt);
        //Registering.ss[position].setResult(s.nextInt());
        System.out.print("\tEnter Your password\n\t");
        String pass=s.next();
        Registering.ss[position].setPassword(pass);
        //Registering.ss[position].setPassword(s.next());
        int Idcounter=Registering.t;
        Registering.ss[position].setId(Idcounter);
        
        if(Registering.ss[position].getResult()>450){
            depa="computer science";
              Registering.ss[position].setdep(depa);
          }
          else if(Registering.ss[position].getResult()>400 && Registering.ss[position].getResult()<450){
              depa="information technology";
              Registering.ss[position].setdep(depa); 
          }
            else if(Registering.ss[position].getResult()>350 && Registering.ss[position].getResult()<400){
                depa="information system";
              Registering.ss[position].setdep(depa);
          }
          else if(Registering.ss[position].getResult()>300 && Registering.ss[position].getResult()<350){
              depa="information science";
              Registering.ss[position].setdep(depa);
          }
          else {
        System.out.println("Your result is not eligable for registration");
             Registering.ss[position].setdep("Not registered"); 
             Registering.display();
          }
        System.out.println("---------------------------------------------------");
        System.out.print("\tRegistration Successful !\n");
        
        if(Registering.ss[Idcounter].getdep().compareTo("Not registered")==0) {
        System.out.print("\nYou are not registered yet!\n");
        }
        else {
       // System.out.print("\tYour Id Is:TRCSC-" + Idcounter+ "/19\n");
        System.out.print("\tYour Id Is:TRCSC-" + Registering.t + "/19\n");
        }
        System.out.println("---------------------------------------------------");
        String Tekafile="C:\\Users\\hi\\Documents\\NetBeansProjects\\studentRegistration\\registeringfile.txt";
        try {
                     //FileWriter myWriter=new FileWriter(Tekafile);
                     //writer = new BufferedWriter(myWriter); we can use this above code also to write to thefile
   writer = new BufferedWriter(new FileWriter(Tekafile,true));//it was like this but we can leave it writer = new BufferedWriter(new FileWriter(path,true));
  // writer.append("Id.no"+" first name "+" lastnames"+" Sex"+" Age"+" Address"+" Department\n");
   writer.append(ss[Idcounter].getId()+"   "+ss[Idcounter].getFirstName()+"   "+ss[Idcounter].getLastName()+"   "
      +Registering.ss[Idcounter].getAge()+"   "+Registering.ss[Idcounter].getsex()+"   "+ss[Idcounter].getAddress()+"   "+ss[Idcounter].getdep());//appending text to file
	//writer.append(+Idcounter+" "+fnames+" "+lnames+" "+sx+" "+adres+" "+" "+depa);//appending text to file
			writer.newLine();
                        writer.flush();
			writer.close();
		} catch (IOException e) {
		}
      Registering.display();
     }
 }
