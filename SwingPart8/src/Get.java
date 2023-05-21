import java.util.Scanner;

public class Get implements Arguments{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id :");
        String id = scanner.nextLine();
        Database database = new HashDB();
        String name =  database.GetData(id);
        System.out.print("The name is "+name);
    }
}
