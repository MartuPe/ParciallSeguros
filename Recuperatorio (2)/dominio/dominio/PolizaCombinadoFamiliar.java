package dominio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PolizaCombinadoFamiliar{
	
	protected Integer numPoliza;
	protected Persona asegurado;
	protected Double sumaAsegurada;
	protected Double prima;
	protected Double premio;
	protected Boolean fueRobado;
	protected Boolean tuvoUnAccidente;
	protected final Integer impuesto = 1000;
	private Set<Bienes> bienesAsegurados;
	private Map<Integer, TipoDeBeneficiario> beneficiarios;
	

	public PolizaCombinadoFamiliar(Integer numPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numPoliza = numPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio = 0.0;
		fueRobado = false;
		beneficiarios = new HashMap<>();
		bienesAsegurados = new HashSet<>();
	}

	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		beneficiarios.put(hijo.getDni(), hijo2);	
	}

	public void agregarBienAsegurado(Bienes bien) {
		bienesAsegurados.add(bien);
		
	}

	public Integer obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}

	public Persona getAsegurado() {
		return asegurado;
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

	@Override
	public int hashCode() {
		return Objects.hash(numPoliza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		PolizaCombinadoFamiliar other = (PolizaCombinadoFamiliar) obj;
		return Objects.equals(numPoliza, other.numPoliza);
	}

	public Boolean getFueRobado() {
		return fueRobado;
	}

	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}

	public Boolean getTuvoUnAccidente() {
		return tuvoUnAccidente;
	}

	public void setTuvoUnAccidente(Boolean tuvoUnAccidente) {
		this.tuvoUnAccidente = tuvoUnAccidente;
	}
	

}
