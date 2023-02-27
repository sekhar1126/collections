package LinkedList2;

public class Tester {
	public static void main(String[] args) {
        // Test case 1
        LinkedList1 listOne = new LinkedList1();
        listOne.append(10);
        listOne.append(12);
        listOne.append(21);
        listOne.append(1);
        listOne.append(53);
        
        LinkedList1 listTwo = new LinkedList1();
        listTwo.append(11);
        listTwo.append(21);
        listTwo.append(25);
        listTwo.append(53);
        listTwo.append(47);
        
        LinkedList1 result = LinkedList1.findCommonElements(listOne, listTwo);
        LinkedListEx current = result.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
        
        // Test case 2
        listOne = new LinkedList1();
        listOne.append(51);
        listOne.append(45);
        listOne.append(63);
        listOne.append(15);
        listOne.append(82);
        
        listTwo = new LinkedList1();
        listTwo.append(19);
        listTwo.append(63);
        listTwo.append(51);
        listTwo.append(87);
        listTwo.append(82);
        
        result = LinkedList1.findCommonElements(listOne, listTwo);
        current = result.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("");
    }
}
