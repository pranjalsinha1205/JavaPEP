class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListLecture {
    public static void traverseLinkedList(Node head){
        System.out.print("\nThe linked list is: ");
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(" ");
    }

    public static Node insert(Node head, int pos, int data) {
        if (pos < 1) {
            System.out.println("Cannot insert at non-positive positions");
            return head;
        }

        if (pos == 1) { // Insert at the head
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode; // Update head
        }

        Node current = head;
        int count = 1; // Start counting from position 1

        // Traverse to the position just before where we want to insert
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position does not exist");
            return head;
        }

        // Create a new node and insert it at the desired position
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void nthFromEnd(Node head, int pos){
        Node first = head;
        Node second = head;

        for (int i = 0; i < pos; i++){
            if (first == null){
                System.out.println("Not a valid position");
                return;
            }
            first = first.next;
        }

        while (first != null){
            first = first.next;
            second = second.next;
        }
        System.out.println("\n" + pos + " node from the last is: " + second.data);
        return;
    }

    public static boolean hasCycle(Node head){
        Node tortoise = head;
        Node hare = head;
        
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Value of head: " + head.data);
        traverseLinkedList(head);
        head = insert(head, 1, 5);
        traverseLinkedList(head);
        head = insert(head, 3, 15);
        traverseLinkedList(head);
        nthFromEnd(head, 2);
    }
}
