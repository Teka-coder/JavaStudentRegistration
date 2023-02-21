
package studentregistration;

public class Foralldepartment {
    void printslip() {
       // throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("course prepared for Computer science\n");
    }
}
class ForIT extends Foralldepartment  {
      @Override
    void printslip() {
       // throw new UnsupportedOperationException("Not supported yet.");
       //To change body of generated methods, choose Tools | Templates.
       System.out.println("course prepared for Information technology\n");
    }
}
class Forsystem extends Foralldepartment  {
    @Override
    void printslip() {
       // throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("course prepared for Information system\n");
    }
}
class Forinfosa extends Foralldepartment {
    @Override
    public void printslip() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("course prepared for Information science\n");
    }
}
/*
if(ss[d].getdep().compareTo("Computer science")==0) {
    Slip.printcomposaslip();
                       }
    if(ss[d].getdep().compareTo("Information technology")==0) {
    Slip.printITslip();
                       }
    if(ss[d].getdep().compareTo("Information system")==0) {
    Slip.printsystemslip();
                       }
    else if(ss[d].getdep().compareTo("Information science")==0) {
        Slip.printinfosaslip();
    }
*/
