package LinkedListNodes;

public class LinkedList {
	Node head;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}


void deleteNode(int key) {
	Node temp=head;
	Node prev= null;
	if(temp!=null && temp.data==key) {
		head= temp.next;
		return ;
	}
	while(temp!=null && temp.data!=key) {
		prev= temp;
		temp = temp.next;
	}
	if(temp==null)
		return;
	prev.next=temp.next;
		
}
public void printList() {
	Node tNode=head;
	while(tNode!=null) {
		System.out.print(tNode.data +" ");
		tNode=tNode.next;
	}
	
}
public void insertFrontNode(int key) {
	Node new_node = new Node(key);
	new_node.next=head;
	head= new_node;
}


public static void main(String [] args) {
	LinkedList tLinkedList = new LinkedList();
	tLinkedList.insertFrontNode(7);
	tLinkedList.insertFrontNode(1);
	tLinkedList.insertFrontNode(3);
	tLinkedList.insertFrontNode(2);
	
	// Now delete Node 3 
	System.out.print("\nCreated Linked list is:");
	tLinkedList.printList();

	tLinkedList.deleteNode(1);
	System.out.print("\nCreated Linked list is:");
	tLinkedList.printList();
}

}
