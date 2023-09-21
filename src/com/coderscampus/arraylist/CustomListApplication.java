package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<Integer> futbolistas = new CustomArrayList<>();
		
		for (int i = 0; i < 51; i++) {
			futbolistas.add(i);
			System.out.println(futbolistas.getSize());
		}
		System.out.println("-------");
		System.out.println(futbolistas.get(44));
		System.out.println(futbolistas.get(7));
		System.out.println(futbolistas.get(41));
		System.out.println(futbolistas.get(33));



//		for (int i = 0; i < futbolistas.getSize(); i++) {
//			System.out.println(futbolistas.get(i));
//		}
	}

}
