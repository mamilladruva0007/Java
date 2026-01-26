import java.util.*;


public class PriorityQueueOperations {

    private Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
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

    public void peekElement() {
        if (!queue.isEmpty()) {
            System.out.println(queue.peek());
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

        PriorityQueueOperations obj = new PriorityQueueOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1 Add");
            System.out.println("2 Remove");
            System.out.println("3 Peek");
            System.out.println("4 Is Empty");
            System.out.println("5 Size");
            System.out.println("6 Contains");
            System.out.println("7 Display");
            System.out.println("8 Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addElement();
                    break;
                case 2:
                    obj.removeElement();
                    break;
                case 3:
                    obj.peekElement();
                    break;
                case 4:
                    obj.checkEmpty();
                    break;
                case 5:
                    obj.getSize();
                    break;
                case 6:
                    obj.containsElement();
                    break;
                case 7:
                    obj.displayQueue();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
