import java.util.Scanner;

public class Employee {

    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + jobTitle);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите должность: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        System.out.print("Введите телефон: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Введите зарплату: ");
        double salary = scanner.nextDouble();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        Employee employee = new Employee(fullName, jobTitle, email, phoneNumber, salary, age);
        employee.printInfo();
    }
}
