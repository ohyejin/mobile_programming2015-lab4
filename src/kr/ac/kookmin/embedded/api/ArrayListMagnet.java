package kr.ac.kookmin.embedded.api;

import java.util.*;

public class ArrayListMagnet {
	
	public static void main (String[] args){
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("% java ArrayListMagnet");
		
		a.add(0, "zero");
		a.add(1, "one");
		a.add(2,"two");
		a.add(3, "three");
		printAL(a); // zero one two three
		
		a.remove(2);
		if (a.contains("two")){
			a.add("2.2");} //a doesn't have "two"
		
		if(a.contains("three")){
			a.add("four"); }
		printAL(a); //zero one three four
		
		
		if(a.indexOf("four")!=4){
			a.add(4, "4.2");}
		printAL(a); //zero one three four 4.2
		printAL(a); //zero one three four 4.2
		
	}

	public static void printAL(ArrayList<String> al){
		
		for(String element : al) {
			System.out.print(element+" ");}
		System.out.println(" ");
	
	}
}
