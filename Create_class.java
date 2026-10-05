class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(name + " - " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Neethu", 85);
        Student s2 = new Student("Rekha", 90);

        s1.display();
        s2.display();
    }
}
