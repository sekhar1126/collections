package LinkedList1;

public class Tester {
	 public static void main(String[] args) {
	        LinkedList list1 = new LinkedList();
	        list1.insert(10);
	        list1.insert(15);
	        list1.insert(21);
	        list1.insert(15);
	        list1.insert(10);
	        
	        list1.removeDuplicates();
	        System.out.println("After removing duplicates:");
	        list1.printList();

	        LinkedList list2 = new LinkedList();
	        list2.insert(51);
	        list2.insert(45);
	        list2.insert(45);
	        list2.insert(15);
	        list2.insert(82);
	        list2.insert(51);
	        list2.insert(10);
	       
	        list2.removeDuplicates();
	        System.out.println("After removing duplicates:");
	        list2.printList();
	    }
}
