package LinkedList;

import java.util.*;;

public class DeleteLinkedList {

    static DeleteLinkedList dll;
    Node head;
    int size;

    DeleteLinkedList(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void main(String[] args) {

        dll = new DeleteLinkedList();
        choosingMethod();
    }

    private static void choosingMethod() {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("press 1 : for adding Data");
            System.out.println("press 2 : for deleting first data");
            System.out.println("press 3 : for deleting last data");
            System.out.println("press 4 : for printing data");
            System.out.println("press 5 : for exit");
            System.out.println("press 6 : Get the Size of list");

            int no = sc.nextInt();
            switch (no) {
                case 1:
                    System.out.println("Enter the data :");
                    String inputData = sc.next();
                    dll.addData(inputData);
                    break;
                case 2:
                    dll.deleteFirstData();
                    break;
                case 3:
                    dll.deleteLastData();
                    break;
                case 4:
                    dll.showData();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    System.exit(no);
                    break;
                case 6 :
                dll.getSize();
                break;
                default:
                    System.out.println("Invalid option,please try again...");
                    break;
            }

        }
        sc.close();

    }

    public void addData(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        choosingMethod();
    }

    void showData() {
        Node currentNode = head;
        if (head == null) {
            System.out.println(" List is empty");
            return;
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
        choosingMethod();
    }

    void deleteFirstData() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        choosingMethod();
    }

    void deleteLastData() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        choosingMethod();
    }

    void getSize(){
        System.out.println(size);
    }

}
