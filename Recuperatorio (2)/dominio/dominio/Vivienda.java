package dominio;

public class Vivienda extends Bienes{

	private String direccion;
	private String ciudad;
	private String partido;
	private String provincia;

	public Vivienda(String direccion, String ciudad, String partido, String provincia) {
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.partido = partido;
		this.provincia =provincia;
	}

}
