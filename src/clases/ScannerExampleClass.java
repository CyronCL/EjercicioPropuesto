package clases;

import java.util.ArrayList;
import java.util.Scanner;

import entities.persona;

public class ScannerExampleClass {

	public ArrayList<persona> scanear() {
		String s = "Hello, This is JavaTpoint.";
		// Create scanner Object and pass string in it
		Scanner scan = new Scanner(s);
		// Check if the scanner has a token
		System.out.println("Boolean Result: " + scan.hasNext());
		// Print the string
		System.out.println("String: " + scan.nextLine());
		scan.close();
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		String opcion;
		ArrayList<persona> listaPersona = new ArrayList<persona>();
		
		do {
			System.out.print("Enter your name: ");
			String nombre = in.next();
			System.out.println("Name: " + nombre);
			System.out.print("Enter your apellido: ");
			String apellido = in.next();
			System.out.println("apellido: " + apellido);
			System.out.print("Enter your altura: ");
			String altura = in.next();
			System.out.println("altura: " + altura);
			System.out.print("Enter your nacionalidad: ");
			String nacionalidad = in.next();
			System.out.println("nacionalidad: " + nacionalidad);
			System.out.println("Desea finalizar?");
			opcion = in.next();
			persona personita = new persona(nombre, apellido, altura, nacionalidad);
			listaPersona.add(personita);
		} while (!opcion.equalsIgnoreCase("si"));
		in.close();
		return listaPersona;
	}

}
