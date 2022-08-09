	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}
  
  -----------------------------------------------
  
  public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head==null){
        	return head;
        }

        
		LinkedListNode<Integer> t1 = head; // taking a pointer to traverse through the linked list
        while(t1.next!=null){
            if(t1.data == t1.next.data){ // if the alternate elements are same 
                t1.next = t1.next.next;  // point the next of the pointer after leaving the same element i.e deleting the same one 
            }
            else{
                t1 = t1.next; // if the nodes are not same move the pointer to the next corresponding node
            }
        }
        return head;
    }

}
