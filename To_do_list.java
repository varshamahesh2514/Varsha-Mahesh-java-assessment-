import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todo = new ArrayList<>();

       
        todo.add("Buy groceries");
        todo.add("Do homework");
        todo.add("Call mom");

        
        todo.remove("Do homework");

       
        for (String task : todo) {
            System.out.println(task);
        }
    }
}
