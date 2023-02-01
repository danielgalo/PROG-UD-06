package ud06.r02.p01;

public abstract class Obra {
	
	private String titulo;
	private double precio;
	
	public Obra(String titulo, double precio) {
		this.titulo = titulo;
		setPrecio(precio);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		} else {
			precio = 0;
		}
	}

}

/* Una editorial produce tanto libros en papel como audiolibros en CD. Los libros en
papel tienen un título (único, que no se puede repetir), un precio y el número de
páginas. Los audiolibros tienen también título (tampoco se puede repetir), un precio y
la duración en minutos del CD.

Crea una aplicación que permita manejar el catálogo de la editorial. Se deben
proporcionar operaciones para: añadir una publicación de cualquiera de los dos tipos,
listar las publicaciones existentes, mostrando toda la información de cada una y
eliminar una publicación partiendo de su título.
El catálogo lo puedes implementar usando una lista.
Revisa la información de libros y audiolibros y genera una estructura de clases usando
herencia. */