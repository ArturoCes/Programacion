package ejemploLambdaStream;

public class Luchador implements Comparable <Luchador> {
	private String nombre;
	private double puntosVelocidad;
	private double puntosHp;
	private double puntosATK;
	private double puntosDEF;
	private double damage;

	// Constructor
	public Luchador(String nombre, double puntosVelocidad, double puntosHp, double puntosATK, double puntosDEF,
			double damage) {
		super();
		this.nombre = nombre;
		this.puntosVelocidad = puntosVelocidad;
		this.puntosHp = puntosHp;
		this.puntosATK = puntosATK;
		this.puntosDEF = puntosDEF;
		this.damage = damage;
	}
	// Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPuntosVelocidad() {
		return puntosVelocidad;
	}

	public void setPuntosVelocidad(double puntosVelocidad) {
		this.puntosVelocidad = puntosVelocidad;
	}

	public double getPuntosHp() {
		return puntosHp;
	}

	public void setPuntosHp(double puntosHp) {
		this.puntosHp = puntosHp;
	}

	public double getPuntosATK() {
		return puntosATK;
	}

	public void setPuntosATK(double puntosATK) {
		this.puntosATK = puntosATK;
	}

	public double getPuntosDEF() {
		return puntosDEF;
	}

	public void setPuntosDEF(double puntosDEF) {
		this.puntosDEF = puntosDEF;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	// To String

	@Override
	public String toString() {
		return "Luchador [nombre=" + nombre + ", puntosVelocidad=" + puntosVelocidad + ", puntosHp=" + puntosHp
				+ ", puntosATK=" + puntosATK + ", puntosDEF=" + puntosDEF + ", damage=" + damage + "]";
	}

	@Override
	public int compareTo(Luchador o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.getNombre());
	}

}
