package ui;

import java.util.Arrays;

import domain.Bag;
import domain.Multimedia;
import domain.Texto;

public class Main {

	public static void main(String[] args) {
		System.out.println("Acá debería estar la UI");
		
		Bag b1 = new Bag("Jojo's Bizarre Adventures: Battle References", Arrays.asList(
							new Multimedia("Uragimono no Requiem", "", "/home/utnso/jojo/rEqUiEm.mp3"),
							new Texto("Reference #1", "Za warudo")
						));
		
		System.out.println(b1.getContenido().get(0).getTitulo());
		
//		new MainView(b1).startApplication();
	}
	
}
