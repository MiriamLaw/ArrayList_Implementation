package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<String> futbolistas = new CustomArrayList<>();

		futbolistas.add("Rapinoe");
		futbolistas.add("Putellas");
		futbolistas.add("Kerr");
		futbolistas.add("Morgan");
		futbolistas.add("McCabe");
		futbolistas.add("Miedema");
		futbolistas.add("Hermoso");
		futbolistas.add("Bonmati");
		futbolistas.add("Ertz");
		futbolistas.add("O'Hara");
		futbolistas.add("Naeher");
		futbolistas.add("Dunn");
		futbolistas.add("Carmona");
		futbolistas.add("Coll");
		futbolistas.add("Paredes");

		for (int i = 0; i < futbolistas.getSize(); i++) {
			System.out.println(futbolistas.get(i));
		}
	}

}
