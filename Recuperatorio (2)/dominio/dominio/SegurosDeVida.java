package dominio;

import java.util.HashMap;
import java.util.Map;

public class SegurosDeVida {

	private Integer numPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Map<Integer, TipoDeBeneficiario> beneficiarios;
	private final Integer impuesto = 1000;
	private Double premio;

	public SegurosDeVida(Integer numPoliza, Persona asegurado, Double sumaAsegurada,
			Double prima) {
		this.numPoliza = numPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio = 0.0;
		beneficiarios = new HashMap<>();
	}

	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		beneficiarios.put(hijo.getDni(), hijo2);
		
	}

	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}
	
	public Double getPremio() {
		premio = this.prima + impuesto;
		return premio;
	}

	public Persona getAsegurado() {
		return this.asegurado;
	}
	
}
