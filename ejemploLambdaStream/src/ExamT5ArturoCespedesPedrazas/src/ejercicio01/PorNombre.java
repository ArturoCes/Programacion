package ejercicio01;

import java.util.Comparator;

public class PorNombre implements Comparator <Mensaje>{

	@Override
	public int compare(Mensaje o1, Mensaje o2) {

		return o1.getNombreContacto().toLowerCase().compareTo(o2.getNombreContacto().toLowerCase());
	}

}
