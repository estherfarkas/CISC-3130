import java.util.*;
import java.io.*;

public class spotifyChart {

	public static void main(String[] args) throws IOException{
		
		File infile= new File("/Users/estherfarkas/Desktop/spotifyChart.csv"); //Import the csv file
		Scanner input= new Scanner(infile);
		

		int rows=300;
		int columns= 2;
		String [][] topArtists= new String [rows][columns]; //create two identical arrays
		String [][] topSongs= new String [rows][columns]; 
		
		int count=0;
		while(input.hasNext()==true) { //loop runs through csv file and sets the array up
			
			String line=input.nextLine();
			String [] tokens= line.split(",");
			
			topArtists[count][0]= tokens[2];
			topArtists[count][1]= tokens[1];
			
			topSongs[count][0]= tokens[2];
			topSongs[count][1]=tokens[1];
			
			
			count++;}
		
		String [][] artists= new String [count][2];
		
		for(int i=1; i<count; i++) { //checks one array against the other, erases the second array as it goes along
		
			int num=0;
			for (int j=1; j<count-1; j++) {
			if (topArtists[i][0].equals(topSongs[j][0])) {
				num++;
				topSongs[j][0]="nope";}}
			if (num!=0) {							//Fills a new array with the number of hits
				artists[i][0]= topArtists[i][0];
				artists[i][1]=num + "";
				
				System.out.println(topArtists[i][0] +" " + num);
				}}
		
		TopChartingArtists list= new TopChartingArtists(); //create list object
		
		for (int i=0; i<count; i++) { //loops through the array and creates a linked list
			if (!artists[i][0].equals(" ")){
			list.addNode(artists[i][0], artists[i][1]);}}
		
		Artists temp= list.first;
		while (temp!=null) {  
			System.out.println(temp.getName()+ " " + temp.getHits());{
			temp=temp.next;}}
		
	
			
			
		}
				
		
			
			
		
		
	
	
	
	
	
	
	}
		
		
	
	
	
	
	
	
	
	
		
				
		
		
		

		


