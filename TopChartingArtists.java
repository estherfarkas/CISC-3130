
public class TopChartingArtists {
			public Artists first;
			
			public void TopChartingArtists() { //Constructor
				first=null;}
			
			
	
		public void addNode(String name, String hits) { 
			
			/* Creates a node based on the input
			 * If list is empty, inserts node after "first"
			 * If list is not empty, program loops through the list
			 * until the last node points to null
			 * Compares the new node with every node and places it before or after
			 */
			
			Artists newNode= new Artists(name, hits, null);
			
			
			if (first.next==null) {
				first.next=newNode;}
			
			else { 
				Artists current=first;
				while (current.next!=null) {
					
					if (newNode.getName().compareToIgnoreCase(current.getName())<=0) {
						
						newNode.next=current;
						current=newNode;}
					
					else if(newNode.getName().compareToIgnoreCase(current.getName())>0) {
						
						Artists temp= current.next;
						current.next=newNode;
						newNode.next=temp;}
					
					current=current.next;
					}}}}
				
					
				
			
		
			
				
		
		
			
			
		
		
		

