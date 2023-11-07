package dominio;

import java.util.HashSet;
import java.util.Set;

public class SegurosGenerales {

	private Integer numPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private final Integer impuesto = 1000;
	private Double premio;
	private Set<Bienes> bienesAsegurados;


	public SegurosGenerales(Integer numPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numPoliza = numPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio = 0.0;
		bienesAsegurados = new HashSet<>();
	}

	public void agregarBienAsegurado(Bienes auto) {
		bienesAsegurados.add(auto);
		
	}

	public Double getPremio() {
		premio = this.prima + impuesto;
		return premio;
	}

	public Integer getNumPoliza() {
		return numPoliza;
	}

	public void setNumPoliza(Integer numPoliza) {
		this.numPoliza = numPoliza;
	}

	public Persona getAsegurado() {
		return this.asegurado;
	}
	
	







	
}
