package OOP;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setAge(int age) {
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
    public int getAge() {
        return this.age;
    }

}
public class EncapsulationExample {
    public static void main(String[] args) {
    Person person = new Person();
    person.setFirstName("Quan");
    person.setLastName("Tran");
    person.setAge(12);
    System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
    }
}
