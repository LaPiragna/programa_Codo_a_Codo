package clases;

public class Auto {
	private String marca;
	private String modelo;
	private String patente;
	private String color;
	private String km;
	private boolean airbag;
	public Auto(String marca, String modelo, String patente, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.color = color;
		this.airbag = false;
		this.km = "0";
	}	
	public Auto(String marca, String modelo, String patente, String color, boolean airbag) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.color = color;
		this.airbag = airbag;
		this.km = "0";
	}	
	public Auto(String marca, String modelo, String patente, String color, boolean airbag, String km) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.color = color;
		this.airbag = airbag;
		this.km = km;
	}
	
	public String tieneAirbag(boolean entrada) {
		if (entrada) return "si";
		else return "no";
	}
	
	public String toString() {
		return "marca: " + this.marca + ",\n" +
				"modelo: " + this.modelo+ ",\n" +
				"patente: " + this.patente+ ",\n" +
				"color: " + this.color+ ",\n" +
				"airbag: " + this.tieneAirbag(this.airbag) + ",\n" +
				"kilometraje: " + this.km + "km.";
	}
}
