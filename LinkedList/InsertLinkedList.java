package LinkedList;

import java.util.*;

public class InsertLinkedList {

    static InsertLinkedList ill;
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirstData(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        callingMethod();
    }

    public void addLastData(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;

        while(lastNode.next!=null){
            lastNode.next= lastNode;
        }
        lastNode.next=newNode;
        callingMethod();
    }

    public void printLinkedList() {
        Node currentNode = head;

        if (currentNode == null) {
            System.out.println("Your data is Empty");
            return;
        }

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public static void main(String[] args) {
        ill = new InsertLinkedList();
        callingMethod();

    }

    private static void callingMethod() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose the below Option: ");
            System.out.println("For adding data press 1 :");
            System.out.println("For showing data press 2 :");
            System.out.println("For adding data at last press 3 :");
            System.out.println("For exit press 4 :");

            int selectedNo = sc.nextInt();

            switch (selectedNo) {
                case 1:
                    System.out.println("Add data : ");
                    String enterData = sc.next();
                    ill.addFirstData(enterData);
                    break;
                case 2:
                    ill.printLinkedList();
                    break;
                case 3:
                System.out.println("Add last data : ");
                    String lastData = sc.next();
                    ill.addLastData(lastData);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting....");
                    System.exit(selectedNo);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }

        }
        sc.close();
    }
}