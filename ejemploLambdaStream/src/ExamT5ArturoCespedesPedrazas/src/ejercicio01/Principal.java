package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0, id = 1, idLeido;
		String nombreCont, texto;
		System.out.println("Bienvenido");

		List<Mensaje> listaMensajes = new ArrayList<Mensaje>();
		listaMensajes.add(new Mensaje(id++, "Carlos", "Hooola como estas"));
		listaMensajes.add(new Mensaje(id++, "Carlos", "Hooola como estas"));
		listaMensajes.add(new Mensaje(id++, "Aarlos", "Hooola como estas"));
		listaMensajes.add(new Mensaje(id++, "Pedro", "kease"));
		listaMensajes.add(new Mensaje(id++, "Carlos", "Hooola crack"));
		listaMensajes.add(new Mensaje(id++, "Carmen", "Hooolanda que acelga"));

		WhatsApp whatsApp = new WhatsApp(listaMensajes);

		do {
			System.out.println("1)Buscar un mensaje por nombre del contacto");
			System.out.println("2)Buscar todos los mensajes de un contacto");
			System.out.println("3)Borrar un mensaje por id");
			System.out.println("4)Modificar datos de un mensaje");
			System.out.println("5)Ordenar la lista por orden alfabético");
			System.out.println("6)Ordenar la lista por orden natural");
			System.out.println("7)Calcular el recaudo total de un contacto");
			System.out.println("8)Imprimir lista de contactos");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el nombre del contacto");
				nombreCont = Leer.dato();
				System.out.println(whatsApp.buscarContacto(nombreCont));
				break;
			case 2:
				System.out.println("Ingrese el nombre del contacto");
				nombreCont = Leer.dato();
				System.out.println(whatsApp.buscarMensajesDeUnContacto(whatsApp.buscarContacto(nombreCont)));
				break;
			case 3:
				System.out.println("Ingrese el id del mensaje");
				idLeido = Leer.datoInt();
				whatsApp.eliminarMensaje(whatsApp.buscarMensajePorID(idLeido));
				break;
			case 4:
				System.out.println("ingrese el id del mensaje que quiere modificar");
				idLeido = Leer.datoInt();
				System.out.println("Ingrese el nuevo texto del mensaje");
				texto = Leer.dato();
				whatsApp.modificarDatos(whatsApp.buscarMensajePorID(idLeido), texto);
				break;
			case 5:
				Collections.sort(listaMensajes, new PorNombre());
				System.out.println(listaMensajes);
				break;
			case 6:
				Collections.sort(listaMensajes);
				System.out.println(listaMensajes);
				break;
			case 7:
				break;
			case 8:
				whatsApp.imprimirTodo();
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}

}
