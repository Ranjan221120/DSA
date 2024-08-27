// reversing(Swapping) node according to their position
package LinkedList;
import java.util.*;

public class ReverseLinkedList {
    
Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }




    static ReverseLinkedList rll = new ReverseLinkedList(); 
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        rll.chooseMethod();

    }


    private void chooseMethod() {

        while(true){
            System.out.println("press 1 for ADD :");
            System.out.println("press 2 for swapping :");
            System.out.println("press 3 for print :");
            System.out.println("press 4 for Exit :");
            
            int n = sc.nextInt();
            switch (n) {
                case 1:
                System.out.println("---------------------");
                addData();
                break;
                case 2:
                reversingData();
                System.out.println("---------------------");
                break;
                case 3:
                printData();
                System.out.println("---------------------");
                break;
                case 4:
                System.exit(0);
                    break;
            
                default:
                System.out.println("You have enter Invalid no.");
                    break;
            }

        }
    }


    private void reversingData() {
        System.out.println("Enter the left index! ");
        int l=sc.nextInt();
        System.out.println("Enter the right index! ");
        int r=sc.nextInt();

        if(l>r || head==null){
            System.out.println("Invalid entry");
            return;
        }

    // Initialize pointers to traverse to left and right
    Node current = head;
    Node prevL = null, leftNode = null, rightNode = null, rightNext = null;
    
    int i = 1;

    // Traverse the list to get left and right nodes
    while (current != null && i <= r) {
        if (i < l) {
            prevL = current; // Node before left index
        }
        if (i == l) {
            leftNode = current; // Node at left index
        }
        if (i == r) {
            rightNode = current; // Node at right index
            rightNext = current.next; // Node after right index
            break;
        }
        current = current.next;
        i++;
    }

    // If any of the leftNode or rightNode is null, return (invalid indexes)
    if (leftNode == null || rightNode == null) {
        System.out.println("Invalid index range");
        return;
    }

    // Reverse the sublist from l to r
    Node prev = rightNext; // Start with the node after the right index
    current = leftNode;

    while (current != rightNext) {
        Node next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        System.out.println("rightNext "+rightNext.data);
        System.out.println("leftNode "+leftNode.data);
        System.out.println("current.next "+current.next.data);
        System.out.println("prev "+prev.data);
        System.out.println("current "+current.data);
    }

    System.out.println();
    // Fix the connections before and after the reversed sublist
    if (prevL != null) {
        prevL.next = rightNode; // Connect node before left to rightNode (new head of reversed sublist)
    } else {
        head = rightNode; // If reversing starts from head
    }

        chooseMethod();
    }


    private void printData() {

        Node currentNode = head;
        if(currentNode==null){
            System.out.println("No data available");
            return;
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
        System.out.println();
    }


    private void addData() {
        System.out.println("Enter the i/p data :");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if(head == null){
            head= newNode;
            return;
        }

        newNode.next= head;
        head= newNode;
        chooseMethod();
    }
}
