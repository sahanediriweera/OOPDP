import java.util.Scanner;

public class Store implements Arguments{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id");
        String id = scanner.nextLine();
        System.out.print("Enter the name");
        String name = scanner.nextLine();
        Database database = new HashDB();
        database.StoreData(id,name);
        System.out.println("Successfully completed");
        scanner.close();
    }
}
