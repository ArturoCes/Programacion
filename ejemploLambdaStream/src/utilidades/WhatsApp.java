package ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhatsApp {

	List<Mensaje> listaMensajes;

	// Constructor
	public WhatsApp(List<Mensaje> listaMensajes) {
		super();
		this.listaMensajes = listaMensajes;
	}

	// Getters & Setters
	public List<Mensaje> getListaMensajes() {
		return listaMensajes;
	}

	public void setListaMensajes(List<Mensaje> listaMensajes) {
		this.listaMensajes = listaMensajes;
	}

	// To String
	@Override
	public String toString() {
		return "WhatsApp [listaMensajes=" + listaMensajes + "]";
	}

	public List buscarMensajesDeUnContacto(Mensaje m) {
		List listaAux = null;
		Mensaje aux = null;
		Iterator<Mensaje> it = listaMensajes.iterator();
		Boolean salir = false;
		Mensaje auxiliar = null;
		while (it.hasNext() && !salir) {
			auxiliar = it.next();
			if (auxiliar.getNombreContacto().equalsIgnoreCase(m.getNombreContacto())) {
				listaAux.add(m);
				return listaAux;
			}else {
				listaAux=null;
			}
		}
		return listaAux;
	}

	public Mensaje buscarContacto(String nombreCont) {
		Iterator<Mensaje> it = listaMensajes.iterator();
		Boolean salir = false;
		Mensaje auxiliar = null;
		while (it.hasNext() && !salir) {
			auxiliar = it.next();
			if (auxiliar.getNombreContacto().equalsIgnoreCase(nombreCont)) {
				salir = true;
				return auxiliar;
			} else {
				auxiliar = null;
			}

		}
		return auxiliar;

	}

	public Mensaje buscarMensajePorID(int ind) {
		Iterator<Mensaje> it = listaMensajes.iterator();
		Boolean salir = false;
		Mensaje auxiliar = null;
		while (it.hasNext() && !salir) {
			auxiliar = it.next();
			if (auxiliar.getId() == ind) {
				salir = true;
				return auxiliar;
			} else {
				auxiliar = null;
			}

		}
		return auxiliar;

	}

	public void eliminarMensaje(Mensaje m) {
		if (m != null) {
			listaMensajes.remove(m);
			System.out.println("Borrado exitosamente");
		} else {
			System.out.println("Mensaje no encontrado");
		}

	}

	public void modificarDatos(Mensaje m, String texto) {
		m.setCuerpoMensaje(texto);

	}

	public void imprimirTodo() {
		Iterator<Mensaje> it = listaMensajes.iterator();
		Mensaje aux = null;
		while (it.hasNext()) {
			aux = it.next();
			System.out.println(aux);

		}
	}
}
