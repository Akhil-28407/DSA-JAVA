package LinkedList1;

public class Main {
    public static void main(String[] args){
        LinkedList mylinkedlist=new LinkedList(4);

        mylinkedlist.append(5);
        mylinkedlist.append(6);
        mylinkedlist.prepend(9);
        mylinkedlist.insert(2, 10);
        mylinkedlist.printList();
    }

}
