import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    Node head;
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void remove(int index) {
        if (index < 0 || head == null) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int count = 0;

        while (current != null && count != index) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid index.");
            return;
        }

        previous.next = current.next;
    }


    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to add to the linked list: ");
        int numberOfElements = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            list.add(element);
        }

        System.out.println("Initial LinkedList:");
        list.display();


        System.out.print("Enter the index of the element to remove: ");
        int index = sc.nextInt();
        list.remove(index);

        System.out.println("Updated LinkedList:");
        list.display();

    }
}
