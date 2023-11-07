package dominio;

public class Auto extends Bienes {

	private String marca;
	private String modelo;
	private Integer anio;
	private Double sumaAsegurada;

	public Auto(String marca, String modelo, Integer anio, Double sumaAsegurada) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.sumaAsegurada = sumaAsegurada;
	}

}
