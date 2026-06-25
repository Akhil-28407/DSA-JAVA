package LLIL;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}

public class LinkedListCoding {
    private Node head;
    private Node tail;
    int length;

    public LinkedListCoding(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void printList(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    //Find middle Node(without length and having constraints)[leetcode problem number=876]

    public Node findMiddleNode(){
        Node fast=head;
        Node slow=head;

        while(fast != null &&  fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //Find middle and delete the middle node in linkedlist (without length and having constraints)[leetcode problem number=2095]

    public Node deleteMiddle(){
        if(head == null || head.next  == null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast != null && fast.next != null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return slow;
    }

    //HasLoop (does our linkedlist has loop or not)
    public boolean hasLoop(){
        if(head == null || head.next  == null){
            System.out.println("We cannot check ");
            return false;
        }
        Node fast=head;
        Node slow=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                System.out.println("this linkedlist has loop");
                return true; 
            }
        }
        System.out.println("There is no Loop in this linkedlist");
        return false;
    }

    public Node FindKthNodeFromEnd(int k){
        if(head==null || k<=0){
            return null;
        }
        Node fast=head;
        Node slow=head;
        for(int i=0;i<k;i++){
            if(fast == null){
                return null;
            }
            fast=fast.next;
        }
        while(fast != null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public void removeDuplicates(){
        Node current=head;
        while(current != null){
            Node runner=current;
            while(runner.next != null){
                if(runner.next.value == current.value){
                    runner.next=runner.next.next;
                }
                else{
                    runner=runner.next;
                }
            }
            current=current.next;
        }
    }

   

}
