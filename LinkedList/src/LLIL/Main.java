package LLIL;

public class Main {
    public static void main(String[] args){
        LinkedListCoding mylinkedlist=new LinkedListCoding(1);
        mylinkedlist.append(2);
        mylinkedlist.append(3);
        mylinkedlist.append(4);
        mylinkedlist.append(5);

        mylinkedlist.deleteMiddle();
        

        mylinkedlist.printList();
        
    }

}
