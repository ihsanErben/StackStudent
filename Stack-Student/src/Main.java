
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Class x = new Class();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("0-exit");
            System.out.println("1-push");
            System.out.println("2-pop");
            System.out.println("3-top");
            System.out.println("4-count");
            System.out.println("5-print");
            System.out.print("option: ");
            int option = input.nextInt();
            System.out.println("");
            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.print("id: ");
                    int id = input.nextInt();
                    System.out.print("name: ");
                    String name = input.next();
                    x.push(id, name);
                    x.print();
                    break;
                case 2:
                    x.pop();
                    x.print();
                    break;
                case 3:
                    x.top();
                    x.print();
                    break;
                case 4:
                    System.out.println("total students: " + x.count);
                    break;
                case 5:
                    x.print();
                    break;
            }

        }
    }
}
