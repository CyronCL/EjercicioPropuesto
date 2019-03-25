package main;

import java.util.ArrayList;

import clases.ScannerExampleClass;
import entities.persona;

public class ejecutable {

	public static void main(String[] args) {
		ScannerExampleClass a = new ScannerExampleClass();
		ArrayList<persona> listaPersona = a.scanear();
	for (int i = 0; i < listaPersona.size(); i++) {
		System.out.println(listaPersona.get(i).getAltura());
		System.out.println(listaPersona.get(i).getApellido());
		System.out.println(listaPersona.get(i).getNombre());
		System.out.println(listaPersona.get(i).getNacionalidad());
	}
		
	}

}
