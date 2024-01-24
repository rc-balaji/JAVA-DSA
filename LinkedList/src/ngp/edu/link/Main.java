package ngp.edu.link;

public class Main
{
    
	
	 static <T> void print(T str) {
		 System.out.println(str);
	 }
    
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		
		print("\nCreation");
		
		print("Empty : "+l1.isEmpty());
		
//		Integer a= 5;
		
//		System.out.println(Integer.toBinaryString(5));
		
		l1.printList();
		
		l1.insertEnd(1);
		l1.insertEnd(2);
		l1.insertEnd(3);
		l1.insertEnd(4);
		l1.insertEnd(5);
		
		print("Empty : "+l1.isEmpty());
		l1.printList();
		
		print("\nInsertion");
		
		print("\n1.Insert first");
		
		l1.insertFirst(0);
		
		l1.printList();
		
		print("\n2.Insert End");
		
		l1.insertEnd(6);
		
		l1.printList();
		
		print("\n3.Insert Before element");
		l1.insertBefore(22, 2);
		l1.printList();
		print("");
		l1.insertBefore(2, 23);
		l1.printList();
		
		
		print("\n4.Insert After element");
		l1.insertAfter(40, 4);
		l1.printList();
		print("");
		l1.insertAfter(2, 23);
		l1.printList();
		
		print("\n5.Insert in Position");
		l1.insertInPos(55, 3);
		l1.printList();
		print("");
		l1.insertInPos(77, 100);
		l1.printList();
		
		
		
		print("\nLength : "+l1.size);
		
		
		print("\nDeletion:-");
		
		
		l1.deleteFirst();
		
		l1.printList();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}
}













