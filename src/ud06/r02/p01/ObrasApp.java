package ud06.r02.p01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObrasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Libro> listaLibros = new ArrayList<>();
		List<AudioLibro> listaAudioLibros = new ArrayList<>();

		int opcionObra = 0;
		int opcion = 0;
		
		do {
			System.out.println("-----MENÚ-----");
			System.out.println("1.- AÑADIR PUBLICACIÓN.");
			System.out.println("2.- LISTAR PUBLICACIONES.");
			System.out.println("3.- ELIMINAR PUBLICACIONES.");
			System.out.println("0.- SALIR.");
			
			System.out.print("Introduce una opción: ");
			opcion = Integer.parseInt(sc.next());
			
			System.out.println("---------------------------");
			
			if (opcion == 1) {
				
				System.out.println("---AÑADIR PUBLICACIÓN.---");
				System.out.println("1.- AÑADIR LIBRO");
				System.out.println("2.- AÑADIR AUDIOLIBRO");
					
				System.out.print("Introduce una opción: ");
				opcionObra = Integer.parseInt(sc.next());
				
				System.out.println("---------------------------");
				//AÑADIR PUBLICACIONES
				if (opcionObra == 1) {
					menuAddLibro(sc, listaLibros);	
				} else if (opcionObra == 2) {
					menuAddAudioLibro(sc, listaAudioLibros);
				} else {
					System.err.println("Introduce una opción válida.");
				}			
				//LISTAR PUBLICACIONES
			} else if (opcion == 2) {
				
					System.out.println("---LISTAR PUBLICACIÓN.---");
					System.out.println("1.- LISTAR LIBROS");
					System.out.println("2.- LISTAR AUDIOLIBROS");
					
					System.out.print("Introduce una opción: ");
					opcionObra = Integer.parseInt(sc.next());		
					
					if (opcionObra == 1) {
						System.out.println(listaLibros);
					} else  if (opcionObra == 2) {
						System.out.println(listaAudioLibros);
					}
					
					System.out.println("---------------------------");
					//ELIMINAR PUBLICACIONES
			} else if (opcion == 3) {
				System.out.println("---ELIMINAR PUBLICACIÓN.---");
				System.out.println("1.- ELIMINAR LIBROS");
				System.out.println("2.- ELIMINAR AUDIOLIBROS");
				
				System.out.print("Introduce una opción: ");
				opcionObra = Integer.parseInt(sc.next());		
	
				if (opcionObra == 1) {
					eliminaLibro(sc, listaLibros);
				} else  if (opcionObra == 2) {
					eliminaAudioLibro(sc, listaAudioLibros);
				}
				
			} else {
				System.err.println("Introduce una opción válida.");
			}
		} while (opcion != 0);
		
	}

	private static void eliminaLibro(Scanner sc, List<Libro> listaLibros) {
		String libroAEliminar;
		System.out.print("Introduzca el título del libro a eliminar: ");
		libroAEliminar = sc.next();
		for (int i = 0; i < listaLibros.size(); i++) {
			if (listaLibros.get(i).getTitulo().equals(libroAEliminar)) {
				listaLibros.remove(i);
			}
		}
	}

	private static void eliminaAudioLibro(Scanner sc, List<AudioLibro> listaAudioLibros) {
		String audioLibroAEliminar;
		System.out.print("Introduzca el título del Audio Libro a eliminar: ");
		audioLibroAEliminar = sc.next();
		for (int i = 0; i < listaAudioLibros.size(); i++) {
			if (listaAudioLibros.get(i).getTitulo().equals(audioLibroAEliminar)) {
				listaAudioLibros.remove(i);
			}
		}
	}

	private static void menuAddAudioLibro(Scanner sc, List<AudioLibro> listaAudioLibros) {
		
		System.out.print("Introduce el precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("---------------------------");
		
		System.out.print("Introduce la duracion: ");
		double duracion = sc.nextDouble();
		
		System.out.println("---------------------------");
		
		System.out.print("Introduce un titulo: ");
		String titulo = sc.next();
		
		System.out.println("\n");
		
		AudioLibro audioLibro = new AudioLibro(titulo, precio, duracion);
		listaAudioLibros.add(audioLibro);
	}

	private static void menuAddLibro(Scanner sc, List<Libro> listaLibros) {
		System.out.print("Introduce el precio: ");
		double precio = sc.nextDouble();
		
		System.out.println("---------------------------");
		
		System.out.print("Introduce el número de páginas: ");
		int numeroPaginas = sc.nextInt();
		
		System.out.println("---------------------------");
		
		System.out.print("Introduce un titulo: ");
		String titulo = sc.next();
		
		System.out.println("\n");
		
		Libro libro = new Libro(titulo, precio, numeroPaginas);
		listaLibros.add(libro);
	}

}
