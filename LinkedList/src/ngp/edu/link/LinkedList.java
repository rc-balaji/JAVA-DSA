package ngp.edu.link;

public class LinkedList {

	static Node head = null;
	static Node tail = null;
	static int size = 0;

	public void printList() {

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

		}

	}

	public void printFirst() {
		if (head != null) {
			System.out.println(head.data);
		} else {
			System.out.println("List is empty");
		}
	}

	public void printEnd() {
		if (head != null) {
			System.out.println(tail.data);
		} else {
			System.out.println("List is empty");
		}
	}

	public int length() {
		return size;
	}

	public void insertBefore(int x, int el) {
		if (head.data == el) {
			this.insertFirst(x);
		} else {
			Node newNode = new Node(x);

			Node temp = head;

			boolean isNonExist = true;

			while (isNonExist) {
				if (temp.next.data == el) {
					isNonExist = false;
					continue;
				} else if (temp.next == tail) {
					break;
				}
				temp = temp.next;
			}

			if (!isNonExist) {
				size++;
				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.err.println("Not Exist!!!!");
			}

		}
	}

	public void insertAfter(int x, int el) {

		if (tail.data == el) {
			this.insertEnd(x);
		} else {

			Node newNode = new Node(x);

			Node temp = head;
			boolean isNonExist = true;
			while (isNonExist) {
				if (temp.data == el) {
					isNonExist = false;
					continue;
				} else if (temp.next == tail) {
					break;
				}
				temp = temp.next;
			}

			if (!isNonExist) {
				size++;
				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.err.println("Not Exist!!!!");
			}

		}

	}

	public void insertInPos(int x, int pos) {

		if (0>=pos || pos > size) {
			System.err.println("invalid Position or limit Exceed");
		} else {
			if (pos == 1) {
				this.insertFirst(x);
			}

			else if (pos == size + 1) {
				this.insertEnd(x);
			} else {

				Node Newnode = new Node(x);
				size++;

				Node temp = head;

				for (int i = 1; i < pos - 1; i++) {

					temp = temp.next;

				}

				Newnode.next = temp.next;
				temp.next = Newnode;
			}
		}

	}

	public void insertEnd(int x) {

		Node Newnode = new Node(x);
		size++;

		if (head == null) {
			head = Newnode;
			tail = Newnode;
		} else {
			tail.next = Newnode;
			tail = tail.next;
		}

	}

	public void insertFirst(int x) {

		Node Newnode = new Node(x);
		Node temp = head;
		size++;
		if (temp == null) {
			head = Newnode;
			tail = Newnode;
		} else {
			Newnode.next = temp;
			head = Newnode;
		}

	}

	public void deleteFirst() {

		if (head == null) {
			System.out.println("List is Empty!!!!");
		} else if (head == tail) {
			size--;
			head = null;
			tail = null;
		} else {
			size--;
			Node temp = head;
			head = temp.next;
		}

	}

	public void deleteLast() {

		if (head == null) {
			System.out.println("List is Empty!!!!");
		} else if (head == tail) {
			size--;
			this.deleteFirst();
		}

		else {
			size--;
			Node temp = head;

			while (temp.next != tail) {
				temp = temp.next;
			}

			temp.next = null;
			tail = temp;

		}

	}

	public void deleteData(int el) {
		if (head == null) {
			System.out.println("List is Empty");
		} else if (head.data == el) {
			size--;
			this.deleteFirst();
		} else if (tail.data == el) {
			size--;
			this.deleteLast();
		} else {
			Node temp = head;
			boolean isNonExist = true;

			while (isNonExist) {
				if (temp.next.data == el) {
					isNonExist = false;
					continue;
				} else if (temp.next == tail) {
					break;
				}
				temp = temp.next;

			}

			if (!isNonExist) {
				size--;
				temp.next = temp.next.next;
			} else {
				System.err.println("Not Exist!!!");
			}

		}
	}

	public void deleteInPos(int pos) {
		if (head == null) {
			System.out.println("List is Empty");
		} else if (pos == 1) {
			size--;
			this.deleteFirst();
		} else if (pos == size) {
			size--;
			this.deleteLast();
		} else if (0>=pos || pos > size) {
			System.err.println("invalid Position or limit Exceed");
		} else {
			Node temp = head;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.next;
			}
			size--;
			temp.next = temp.next.next;

		}
	}
	
	public void searchElement(int el) {
		
		
		boolean isNonExist = true;
		int pos = 0;
		
		if(head.data==el) {
			isNonExist = false;
			pos = 1;
		}else if(tail.data==el) {
			isNonExist = false;
			pos = size;
		}else {
			Node temp = head.next;
			pos++;
			while(isNonExist) {
				pos++;
				if(temp.data==el) {
					isNonExist = false;
					continue;
				}else if(temp.next == tail) {
					break;
				}
				temp = temp.next;
			}
			
		}
		
		if(!isNonExist) {
			System.out.println("Found at Position : "+pos);
		}else {
			System.out.println("Not Found!!!");
		}
		
		
	}
	
	
	
	
	

}
