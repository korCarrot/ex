package jungsuk.ch12;

import java.util.ArrayList;

public class Ex12_4 {

	public static <T extends Product> ArrayList<T> merge(
			ArrayList<T> list, ArrayList<T> list2) {
			ArrayList<T> newList = new ArrayList<>(list);
			newList.addAll(list2);
			return newList;
			}
	
	public static void main(String[] args) {
	
		ArrayList<Product> arrList1= new ArrayList<>();
		ArrayList<Product> arrList2= new ArrayList<>();
		
		arrList1.add(new Product("1"));
		arrList1.add(new Product("2"));
		
		arrList2.add(new Product("3"));
		arrList2.add(new Product("4"));
		
		ArrayList arr = merge(arrList1, arrList2);
		
		System.out.println(arr); 
	}
}

