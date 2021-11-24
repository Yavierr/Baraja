package model;

public class Carta {
	// Atributos
	private int numero;
	private int palo;
	private int id;
	private String nombreNumero;
	private String nombrePalo;
	private String nombreCarta;
	private int valorTute;
	private int valorMus;
	private int valor7ymedia;

	// Constructores
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	public Carta(int id) {

	}

	// Setters y getters

	public int getId() {
		return id;
	}

	public int getNumero() {
		return numero;
	}

	public int getPalo() {
		return palo;
	}

	public String getNombreNumero() {
		return nombreNumero;
	}

	public String getNombrePalo() {
		return nombrePalo;
	}

	public String getNombreCarta() {
		return nombreCarta;
	}

	public int getValorTute() {
		return valorTute;
	}

	public int getValorMus() {
		return valorMus;
	}

	public int getValor7ymedia() {
		return valor7ymedia;
	}

	// Métodos

}
