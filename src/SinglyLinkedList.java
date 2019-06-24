
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    	
    	// Set head to null sll constructor (don't think code is necessary here)
    	//this.head = null;
    }
    
    
    
    // Print all nodes in the list
    public void printValues() {
    	if(head == null) {
    		return;
    	}
    	Node current = head;
    	while(current != null) {
    		
    		System.out.println(current.value);
    		current = current.next;
    		
    	}
    	System.out.println(current);
    }
    
    
    
    // Append new node to list:  
    public void add(int value) {
    	// instantiation of new node (reference back to the node constructor)
        Node newNode = new Node(value);
        // establish the starting node of the linked list
        if(head == null) {
            head = newNode;
        } else {
        	// start loop at the beginning of the linked list with the first node "Head"
            Node runner = head;
            // run the loop over the "Next" values of each node until you get to the end of the linked list or "Null"
            while(runner.next != null) {
            	// walk the loop down through the list (one node at a time)
                runner = runner.next;
            }
            // once at the end of the linked list "Next" values or "Null" add a new node
            runner.next = newNode;
        }
    }
    
    
    
    // SSL method to remove the last node from the list
    public void remove() {
    	// establish the starting point of the linked list
        if(head == null) {
        }
        // remove the pointer to the last node (making it the head of it's own single node link list) effectively removing it from the original linked list
        Node last = head;
        // setting the previous node to "Null" so it is the end of the list now
        Node previous = null;
        // run the loop until you get to the end of the linked list or "Null"
        while(last.next != null) {
        	// setting the last node to head so it removes it from the original linked list
        	previous = last;
        	// walk the loop down through the list (one node at a time)
        	last = last.next;
        }
        // set the node that was just before the last one we deleted to "Null" making it the end of the list now
        previous.next = null;
    }

}
