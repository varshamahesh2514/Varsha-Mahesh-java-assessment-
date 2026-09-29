import java.util.Scanner:
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 21);
        Student s2 = new Student("Asha", 22);

        System.out.println(s1);  s1.toString()
        System.out.println(s2.toString());
    }
}
