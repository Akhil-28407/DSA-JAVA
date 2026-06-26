package LLIL;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class LinkedListCoding {
    private Node head;
    private Node tail;
    int length;

    public LinkedListCoding(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Find middle Node(without length and having constraints)[leetcode problem
    // number=876]

    public Node findMiddleNode() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Find middle and delete the middle node in linkedlist (without length and
    // having constraints)[leetcode problem number=2095]

    public Node deleteMiddle() {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return slow;
    }

    // HasLoop (does our linkedlist has loop or not)
    public boolean hasLoop() {
        if (head == null || head.next == null) {
            System.out.println("We cannot check ");
            return false;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("this linkedlist has loop");
                return true;
            }
        }
        System.out.println("There is no Loop in this linkedlist");
        return false;
    }

    public Node FindKthNodeFromEnd(int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // to convert the binary values into integer (leetcode problem number=1290)
    
    public int BinaryToDecimal() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int decimal = 0;
        while (current != null) {
            decimal = decimal * 2 + current.value;
            current = current.next;
        }
        return decimal;

    }

    //Partitioning the list based on x (leetcode problem number=86)
    public void partitionList(int x) {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node d1 = new Node(0); // Dummy for nodes < x
        Node d2 = new Node(0); // Dummy for nodes >= x

        Node prev1 = d1;
        Node prev2 = d2;
        Node current = head;

        while (current != null) {
            Node next = current.next; // Save next node
            current.next = null; // Disconnect current node

            if (current.value < x) {
                prev1.next = current;
                prev1 = prev1.next;
            } else {
                prev2.next = current;
                prev2 = prev2.next;
            }

            current = next;
        }

        // Join the two lists
        prev1.next = d2.next;

        // Update head
        head = d1.next;
    }

}
