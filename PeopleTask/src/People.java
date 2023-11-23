import java.util.Scanner;

class Person {
    String surname;
    String firstName;
    String zipCode;
    String city;

    public void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your surname");
        this.surname = sc.nextLine();
        System.out.println("Enter first name");
        this.firstName = sc.nextLine();
        System.out.println("Enter your city");
        this.city = sc.nextLine();
        System.out.println("Enter your zip-code");
        this.zipCode = sc.nextLine();
    }


    public void print() {
        System.out.print("surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'');
    }
}

class Staff extends Person {
    String education;
    String position;

    public void initialize1() {
        Scanner sc = new Scanner(System.in);
        this.initialise();
        System.out.println("Enter your education");
        this.education = sc.nextLine();
        System.out.println("Enter your position");
        this.position = sc.nextLine();
    }

    public void print1() {
        this.print();
        System.out.print(' ' + "education='" + education + '\'' +
                ", position='" + position + '\'');
    }
}

public class People {
    public static void main(String[] args) {
        Staff man = new Staff();
        man.initialize1();
        man.print1();

    }
}
