import java.util.*;

public class LinkedList {
     public static void main(String args[]) {
       LinkedList<String> linkedlist = new LinkedList<String>();
       linkedlist.add ("Syam");
       linkedlist.add ("Malik");
       linkedlist.add ("Sharif");
       linkedlist.add ("Srinu");
       linkedlist.add ("Anji");
       System.out.println ("Linked List Content: " +linkedlist);
       linkedlist.addFirst ("First Name");
       linkedlist.addLast ("Last Name");
        System.out.println ("LinkedList Content after addition: " +linkedlist);
       Object firstvar = linkedlist.get(0);
        System.out.println("First Name: " +firstvar);
       linkedlist.set(0, "Changed first Name");
       Object firstvar2 = linkedlist.get(0);
        System.out.println ("First Name after update by set method: " +firstvar2);
       linkedlist.removeFirst ();
       linkedlist.removeLast ();
        System.out.println ("LinkedList after deletion of first and last Name: " +linkedlist);
       linkedlist.add (0, "Dinesh");
       linkedlist.remove(2);
        System.out.println ("Final Content: " +linkedlist); 
     }
}
