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

	public void denunciarSiniestro(Integer numDePoliza) throws PolizaInexistenteException {
		PolizaCombinadoFamiliar polizaEncontrada = buscarPolizaPorNum(numDePoliza);
		
		if(polizaEncontrada != null) {
			polizaEncontrada.setFueRobado(true);
			polizaEncontrada.setTuvoUnAccidente(true);
		}else {
			throw new PolizaInexistenteException();
		}
		
	}

	public PolizaCombinadoFamiliar buscarPolizaPorNum(Integer numDePoliza) {
		for (PolizaCombinadoFamiliar polizaCombinadoFamiliar : polizas) {
			if(polizaCombinadoFamiliar.getNumPoliza().equals(numDePoliza)) {
				return polizaCombinadoFamiliar;
			}
		}
		return null;
	}

}
