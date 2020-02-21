
public class Artists {
			private String artistName; //Data fields for the Nodes
			private String hits;
			public Artists next;
			

			public Artists(String name, String num, Artists pointer) { //Constructor
				artistName= name;
				hits=num;
				next=pointer;}
			
			public Artists(Artists info) { //Copy Constructor
				artistName= info.artistName;
				hits= info.hits;
				next=info.next;
			}
			
			public String toString() { //toString method
				return artistName;}
			
			public void setName(String name) { //Setters
				artistName=name;}
			
			public void setHits(String streams) {
				hits=streams;}
			
			public String getName() { //Getters
				return artistName;}
			
			public String getHits() {
				return hits;}
			
			
			
			
			

		
		
	
			}
