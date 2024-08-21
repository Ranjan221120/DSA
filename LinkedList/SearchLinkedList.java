//using map type of LinkedList or u can say using default class of LinkedList which ias already define in java

package LinkedList;

import java.util.*;

public class SearchLinkedList {
    LinkedList<Integer> ll = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SearchLinkedList sll = new SearchLinkedList();
        sll.addLinkedListData();

    }

    void addLinkedListData() {

        System.out.println("Note: Enter the input data between range 1 to 50 otherwise its not acceptable ");
        while (true) {
            System.out.println("Enter the data: ");
            int n = sc.nextInt();
            if ((n > 1) && (n < 50)) {
                ll.add(n);
                asking();
            } else {
                System.out.println("Input data is out of range");
            }
        }
    }

    void asking() {
        System.out.println();
        System.out.println("1) Is this enough for adding data in linkedList?: Press y ");
        System.out.println("2) Searching data in linkedList: Press s ");
        System.out.println("3) Deleting data in linkedList which is greater than 25: Press d ");
        System.out.println("4) Adding data in linkedList: Press a ");
        System.out.println("5) Show data in linkedList: Press p ");
        System.out.println("6) Show reverse data in linkedList: Press r ");
        System.out.println("7) For exit: Press e ");
        String isAddingData = sc.next();

        switch (isAddingData.toLowerCase()) {
            case "y":
                showData();
                System.exit(0);
                break;
            case "s":
                searchingElement();
                break;
            case "d":
                deleteElement();
                break;
            case "a":
                addLinkedListData();
                break;
            case "p":
                showData();
                asking();
                break;
            case "r":
                reverseLinkedList();
                asking();
                break;
            case "e":
                System.exit(0);
                break;

            default:
                asking();
                System.out.println("Invalid input");
        }

    }

    void searchingElement() {

        System.out.println("Enter the searching data");
        int sd = sc.nextInt();
        boolean isDataFound = false;

        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) == sd) {
                System.out.println("The number " + sd + " you are searching is at " + i + " index of list");
                isDataFound = true;
                break;
            }
        }
        if (!isDataFound) {
            System.out.println("The no. " + sd + " you are searching is not in list");
        }

        asking();
    }

    void deleteElement() {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) > 25) {
                ll.remove(i);
                i--;
            }
        }
        asking();
    }

    void showData() {
        if (ll.size() > 0) {
            System.out.print("Data : ");
            for (int data : ll) {
                System.out.print(data + "->");
            }
        }
        System.out.print("null");
        System.out.println();
    }

    void reverseLinkedList() {
        if (ll.size() > 0) {
            Collections.reverse(ll);  // Reverses the list
            System.out.print("Reversed Data: ");
            for (int data : ll) {
                System.out.print(data + "->");
            }
            System.out.print("null");
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
 
    }

}
// 20->21->11->18->null