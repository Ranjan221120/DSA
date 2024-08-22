/* Q) Given a linked list, swap every two adjacent nodes and return its head. 
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.) 

    i/p:- 1->2->3->4->null
    o/p:- 2->1->4->3->null
 */
package LinkedList;

import java.util.*;

public class SwapAdjacentNodes {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static SwapAdjacentNodes san;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        san = new SwapAdjacentNodes();
        san.chooseMethod();

    }

    private void chooseMethod() {
        while (true) {
            System.out.println("Choose below option: ");
            System.out.println("For add press 1");
            System.out.println("For swap press 2");
            System.out.println("For print press 3");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    addData();
                    break;
                case 2:
                    swappingData();
                    break;
                case 3:
                    showNodeData();
                    break;

                default:
                    System.out.println("Invalid no.");
            }

        }

    }

    private void swappingData() {

        if (head == null || head.next == null) {
            System.out.println("No swapping is possible.");
            return;
        }

        Node current = head;
        head = head.next;  

        while (current != null && current.next != null) {
            Node first = current;
            Node second = current.next;

            // Swapping the nodes
            first.next = second.next;
            second.next = first;

            if (first.next != null && first.next.next != null) {
                current = first.next;
                first.next = first.next.next;
            } else {
                break;
            }
        }
        showNodeData();
    }

    public void showNodeData() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("Your list is Empty");
            return;
        }

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }

        System.out.print("null");
        System.out.println();
        chooseMethod();
    }

    public void addData() {
        System.out.println("------------------------------");
        System.out.println("Enter the input data in Node: ");
        String d = sc.next();

        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

}
