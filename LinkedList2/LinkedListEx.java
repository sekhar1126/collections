package LinkedList2;

import java.util.HashSet;

public class LinkedListEx {

	 public int data;
	    public LinkedListEx next;
	    
	    public LinkedListEx(int data) {
	        this.data = data;
	    }
	}

	 class LinkedList1 {
	    public LinkedListEx head;
	    
	    public void append(int data) {
	        if (head == null) {
	            head = new LinkedListEx(data);
	            return;
	        }
	        
	        LinkedListEx current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = new LinkedListEx(data);
	    }
	    
	    public static LinkedList1 findCommonElements(LinkedList1 listOne, LinkedList1 listTwo) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        LinkedList1 result = new LinkedList1();
	        
	        LinkedListEx current = listOne.head;
	        while (current != null) {
	            set.add(current.data);
	            current = current.next;
	        }
	        
	        current = listTwo.head;
	        while (current != null) {
	            if (set.contains(current.data)) {
	                result.append(current.data);
	            }
	            current = current.next;
	        }
	        
	        return result;
	    }
	}
