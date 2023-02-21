
package studentregistration;

//import java.io.Serializable;
class Person {//implements Serializable{
    private String firstName;
    private String lastName;
    private String address;
    
    private int age;
    private int id;
    private String password;
   
    public void setPassword(String password) {
        this.password = password;
    }
   
    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void display() {
        System.out.println();
    }
    
}

