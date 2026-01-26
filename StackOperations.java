import java.util.*;


public class StackOperations {

    private Stack<Integer> stack = new Stack<>();
    private Scanner sc = new Scanner(System.in);

    public void pushElement() {
        int value = sc.nextInt();
        stack.push(value);
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println(stack.pop());
        } else {
            System.out.println("Stack Empty");
        }
    }

    public void peekElement() {
        if (!stack.isEmpty()) {
            System.out.println(stack.peek());
        } else {
            System.out.println("Stack Empty");
        }
    }

    public void searchElement() {
        int value = sc.nextInt();
        System.out.println(stack.search(value));
    }

    public void isStackEmpty() {
        System.out.println(stack.isEmpty());
    }

    public void getStackSize() {
        System.out.println(stack.size());
    }

    public void displayStack() {
        System.out.println(stack);
    }

    public static void main(String[] args) {

        StackOperations obj = new StackOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Peek");
            System.out.println("4 Search");
            System.out.println("5 Is Empty");
            System.out.println("6 Size");
            System.out.println("7 Display");
            System.out.println("8 Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.pushElement();
                    break;
                case 2:
                    obj.popElement();
                    break;
                case 3:
                    obj.peekElement();
                    break;
                case 4:
                    obj.searchElement();
                    break;
                case 5:
                    obj.isStackEmpty();
                    break;
                case 6:
                    obj.getStackSize();
                    break;
                case 7:
                    obj.displayStack();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
