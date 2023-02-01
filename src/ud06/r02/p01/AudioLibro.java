package ud06.r02.p01;

public class AudioLibro extends Obra {
	

	private double duracion;

	public AudioLibro(String titulo, double precio, double duracion) {
		super(titulo, precio);
		setDuracion(duracion);
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		} else {
			duracion = 1;
		}
		
	}
	@Override
	public String toString() {
		return "AudioLibro [Duracion= " + duracion + ", " + "Título= " + super.getTitulo() + ", " + " Precio= " + super.getPrecio() + "\n";
	}

}
