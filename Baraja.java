package model;

import java.util.ArrayList;

public class Baraja {
	// Atributos
	ArrayList<Carta> lista_cartas = new ArrayList<Carta>();
	ArrayList<Baraja> barajado = new ArrayList<Baraja>();

	// Cosntructores
	public Baraja() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 11; j++) {
				Carta cartitasBaraja = new Carta(i, j);
				lista_cartas.add(cartitasBaraja);
			}
		}

	}

	public Baraja(int tipobaraja) {

	}

	public Baraja(int tipobaraja, boolean barajar) {
		int random = (int) (Math.random() * 41);
		barajar=false;
		// Cojemos las cartas aleatoriamente del arraylist lista_cartas y lo metemos en
		// barajado para guardar la baraja ya barajada.

		// lista_cartas.get(tipobaraja); -->> Math.random()
		for (int i = 0; i < 41; i++) {

			lista_cartas.get(random);
			lista_cartas.remove(random);
			barajado.add(random, null);
			barajar=true;
			
		}

	}

//	public void imprimirBaraja() {
//		for (carta p : lista_cartas) {
//			System.out.println(". " + p);
//			
//		}
//	}

}