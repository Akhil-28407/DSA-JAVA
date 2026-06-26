package LLIL;

public class Main {
    public static void main(String[] args){
        LinkedListCoding mylinkedlist=new LinkedListCoding(1);
        mylinkedlist.append(1);
        mylinkedlist.append(1);
        mylinkedlist.append(1);

        //System.out.println(mylinkedlist.FindKthNodeFromEnd(4).value);
        //mylinkedlist.removeDuplicates();

        System.out.println(mylinkedlist.BinaryToDecimal());
        mylinkedlist.printList();

        
        
        
    }

}
