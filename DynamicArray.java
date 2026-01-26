import java.util.*;

public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size++] = data;
    }

    public void insert(int index, Object data) {
        if (index < 0 || index > size) {
            return;
        }
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++; 
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[--size] = null;
                if (size > 0 && size <= capacity / 2) {
                    shrink();
                }
                return;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void shrink() {
        capacity /= 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += array[i];
            if (i < size - 1) result += ", ";
        }
        return result + "]";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DynamicArray arr = new DynamicArray();

        while (true) {

            System.out.println("1 Add");
            System.out.println("2 Insert");
            System.out.println("3 Delete");
            System.out.println("4 Search");
            System.out.println("5 Is Empty");
            System.out.println("6 Display");
            System.out.println("7 Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    arr.add(sc.next());
                    break;
                case 2:
                    arr.insert(sc.nextInt(), sc.next());
                    break;
                case 3:
                    arr.delete(sc.next());
                    break;
                case 4:
                    System.out.println(arr.search(sc.next()));
                    break;
                case 5:
                    System.out.println(arr.isEmpty());
                    break;
                case 6:
                    System.out.println(arr);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
