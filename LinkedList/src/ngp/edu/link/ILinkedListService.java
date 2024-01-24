package ngp.edu.link;

public interface ILinkedListService {

//  Display
	public void printList();

	public void printFirst();

	public void printEnd();


//	Insertion
	public void insertFirst(int x);

	public void insertEnd(int x);

	public void insertBefore(int x, int el);

	public void insertAfter(int x, int el);

	public void insertInPos(int x, int pos);

//	Deletion
	public void deleteFirst();

	public void deleteLast();

	public void deleteData(int el);

	public void deleteInPos(int pos);

//	Search
	public void searchElement(int el);
		
//	Check whether empty or Not
	public boolean isEmpty();
}
