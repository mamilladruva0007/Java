
import java.util.*;

public class LinkedListOperations {

    private LinkedList<String> list = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);

    public void addElement() {
        String value = sc.next();
        list.add(value);
    }

    public void addAtIndex() {
        int index = sc.nextInt();
        String value = sc.next();
        if (index >= 0 && index <= list.size()) {
            list.add(index, value);
        }
    }

    public void addFirstElement() {
        String value = sc.next();
        list.addFirst(value);
    }

    public void addLastElement() {
        String value = sc.next();
        list.addLast(value);
    }

    public void removeFirstElement() {
        if (!list.isEmpty()) {
            System.out.println(list.removeFirst());
        } else {
            System.out.println("List Empty");
        }
    }

    public void removeLastElement() {
        if (!list.isEmpty()) {
            System.out.println(list.removeLast());
        } else {
            System.out.println("List Empty");
        }
    }

    public void containsElement() {
        String value = sc.next();
        System.out.println(list.contains(value));
    }

    public void getSize() {
        System.out.println(list.size());
    }

    public void displayList() {
        System.out.println(list);
    }

    public static void main(String[] args) {

        LinkedListOperations obj = new LinkedListOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1 Add");
            System.out.println("2 Add At Index");
            System.out.println("3 Add First");
            System.out.println("4 Add Last");
            System.out.println("5 Remove First");
            System.out.println("6 Remove Last");
            System.out.println("7 Contains");
            System.out.println("8 Size");
            System.out.println("9 Display");
            System.out.println("10 Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addElement();
                    break;
                case 2:
                    obj.addAtIndex();
                    break;
                case 3:
                    obj.addFirstElement();
                    break;
                case 4:
                    obj.addLastElement();
                    break;
                case 5:
                    obj.removeFirstElement();
                    break;
                case 6:
                    obj.removeLastElement();
                    break;
                case 7:
                    obj.containsElement();
                    break;
                case 8:
                    obj.getSize();
                    break;
                case 9:
                    obj.displayList();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
