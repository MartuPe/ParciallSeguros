package dominio;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {

	private String nombre;
	private Set<PolizaCombinadoFamiliar> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		polizas = new HashSet<>();
	}

	public void agregarPoliza(PolizaCombinadoFamiliar polizaDeAuto) {

		polizas.add(polizaDeAuto);
		
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}

}
