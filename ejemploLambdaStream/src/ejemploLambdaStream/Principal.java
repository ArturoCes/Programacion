package ejemploLambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int min =30, max=120, tope=0;
	String nombre = "pepito";
	Random num= new Random (System.nanoTime());
	Luchador ganador;
	ComparaPorPuntosHP cpphp = new ComparaPorPuntosHP();
	List <Luchador>lista= new ArrayList <Luchador>();
	
	
	Supplier <Double>crearRandom=()-> min+(max-min*num.nextDouble());
	Supplier <Luchador> generadorLuchadores = ()-> new Luchador("",crearRandom.get(),crearRandom.get()
			,crearRandom.get(),crearRandom.get(),crearRandom.get());
	
	
	}

}
