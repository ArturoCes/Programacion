package ejercicio01;

import java.util.Objects;

public class Mensaje implements Comparable<Mensaje> {
	private int id;
	private String nombreContacto;
	private String cuerpoMensaje;

	// Constructor
	public Mensaje(int id, String nombreContacto, String cuerpoMensaje) {
		super();
		this.id = id;
		this.nombreContacto = nombreContacto;
		this.cuerpoMensaje = cuerpoMensaje;
	}
	// Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}

	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}
	// To String

	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", nombreContacto=" + nombreContacto + ", cuerpoMensaje=" + cuerpoMensaje + "]";
	}
	// hashCode & equals

	@Override
	public int hashCode() {
		return Objects.hash(cuerpoMensaje, id, nombreContacto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(cuerpoMensaje, other.cuerpoMensaje) && id == other.id
				&& Objects.equals(nombreContacto, other.nombreContacto);
	}

	@Override
	public int compareTo(Mensaje o) {
		if (id < o.getId()) {
			return -1;
		}
		if (id > o.getId()) {
			return 1;
		} else {
			return 0;

		}

	}

}
