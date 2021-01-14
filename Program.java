package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.RoomsRent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RoomsRent[] vect = new RoomsRent[10];
		System.out.print("How many rooms will be rented? ");
		int rents = sc.nextInt();	
		
		for (int i=1; i<rents; i++) {
			sc.nextLine();
			System.out.println("Rent for " + i + " # :");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new RoomsRent(name, email, room);
		}
			System.out.println();
			System.out.println("Busy romms: ");
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
					System.out.println(i + " : " + vect[i]);
				}
				
		}
		sc.close();
	}

}
