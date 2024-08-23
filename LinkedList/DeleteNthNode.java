/* Given the head of a linked list, remove the nth node from the end of the list and return its head.
n=2
    i/p:- 1->2->3->4->5
    o/p:- 1->2->3-->5
*/
package LinkedList;

import java.util.*;

public class DeleteNthNode {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static DeleteNthNode dnn;
    // LinkedList<Integer> ll = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        dnn = new DeleteNthNode();
        dnn.chooseMethod();
    }

    private void chooseMethod() {
        while (true) {
            System.out.println("For Adding data press 1: ");
            System.out.println("For delete data press 2: ");
            System.out.println("For showing data press 3: ");
            System.out.println("For Exit press 4: ");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    addData();
                    break;
                case 2:
                    deleteNode();
                    break;
                case 3:
                    printData();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid no.");
                    break;
            }
        }
    }

    private void deleteNode() {

        Node temp = head;
        int l = 0;

        if (head == null) {
            System.out.println("No data in linkedList");
            return;
        }
        System.out.println("Enter no. of node which is delete from end of linkedList");
        int k = sc.nextInt();

        // 1->2->3->4->5->null
        while (temp != null) {
            l++;
            temp = temp.next;
        }

        if (k > l) {
            System.out.println("There is no node at " + k);
            return;
        }

        int t = l-k;
        
        if(t==0){
            head = head.next;
            return;
        }

        Node currentNode = head;
        for(int i=1;i<t;i++){
            currentNode = currentNode.next;
        }

        if(currentNode.next!=null){
            currentNode.next=currentNode.next.next;
        }
        System.out.println("--------------------");
    }

    private void printData() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("No data in linkedList");
            return;
        }

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    private void addData() {
        System.out.println("--------------------");
        System.out.println("Enter the i/p data");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // --------using default class-----------------

    /*
     * private void deleteNode() {
     * System.out.println("--------------------");
     * System.out.println("Enter no. of node which is delete from end of linkedList"
     * );
     * int k = sc.nextInt();
     * 
     * if (k > ll.size()) {
     * System.out.println("you can choose no. under " + ll.size());
     * return;
     * }
     * ll.remove(ll.size() - k);
     * System.out.println("remove successfully");
     * }
     * 
     * private void printData() {
     * for (int data : ll) {
     * System.out.print(data + "->");
     * }
     * System.out.print("null");
     * System.out.println();
     * 
     * }
     * 
     * private void addData() {
     * System.out.println("--------------------");
     * System.out.println("Enter the i/p data");
     * int data = sc.nextInt();
     * ll.add(data);
     * chooseMethod();
     * }
     */
}
