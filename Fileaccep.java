/*+new file....in studentregistration  new class    
  package studentregistration;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static studentregistration.Registering.ss;
class Fileaccep {
   public static void writeToFile() throws IOException {
      
       try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
           o.writeObject(ss);
       }
       try ( /////////////////////////
               DataOutputStream s = new DataOutputStream(new FileOutputStream("registered.txt"))) {
           s.writeInt(Registering.t); //int data type
           /////////////////////////
       } //int data type
        }
    public static void readFromFile() throws FileNotFoundException, IOException,ClassNotFoundException {
            java.io.File file = new java.io.File("registered.txt");//creating readfrom file of registered student
       boolean b1 = file.exists();
       if (b1) {
           int t1;
                try (DataInputStream s = new DataInputStream(new FileInputStream("registered.txt"))) {
                    t1 = s.readInt();
                }
            Registering.t=t1;
            
         ////////////////////////////////////////////   
       file = new java.io.File("student.txt");//read file of student profile
      
        boolean ba = file.exists();
            if (ba) {  //if any one have profile
              if (t1 == 0); //id/ be t1 yetewosedew int data 0 kehone ykeral 
       else {  
                  try (
                          ObjectInputStream i = new ObjectInputStream(new FileInputStream("myfilestudent.txt"))
                          ) {
                      ss = (Student[]) //ss malet studentochu hulu yiyzal alnew...ss yalnbet hulu read yaregal
                              i.readObject();  //read alnew
                  } //read alnew
}
            } else {   //if no one has profile
                Registering.t = 0;  //else no one registered
            }
        }}
    
}
*/

