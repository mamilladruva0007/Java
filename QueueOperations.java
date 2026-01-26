import java.util.*;

public class QueueOperations {

    private Queue<String> queue = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);

    public void addElement() {
        String value = sc.next();
        queue.offer(value);
    }

    public void removeElement() {
        if (!queue.isEmpty()) {
            System.out.println(queue.poll());
        } else {
            System.out.println("Queue Empty");
        }
    }

    public void checkEmpty() {
        System.out.println(queue.isEmpty());
    }

    public void getSize() {
        System.out.println(queue.size());
    }

    public void containsElement() {
        String value = sc.next();
        System.out.println(queue.contains(value));
    }

    public void displayQueue() {
        System.out.println(queue);
    }

    public static void main(String[] args) {

        QueueOperations obj = new QueueOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1 Add");
            System.out.println("2 Remove");
            System.out.println("3 Is Empty");
            System.out.println("4 Size");
            System.out.println("5 Contains");
            System.out.println("6 Display");
            System.out.println("7 Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addElement();
                    break;
                case 2:
                    obj.removeElement();
                    break;
                case 3:
                    obj.checkEmpty();
                    break;
                case 4:
                    obj.getSize();
                    break;
                case 5:
                    obj.containsElement();
                    break;
                case 6:
                    obj.displayQueue();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
