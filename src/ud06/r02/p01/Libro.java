package ud06.r02.p01;

public class Libro extends Obra {
	
	private int numeroPaginas;

	public Libro(String titulo, double precio, int numeroPaginas) {
		super(titulo, precio);
		setNumeroPaginas(numeroPaginas);
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		if (numeroPaginas > 0) {
			this.numeroPaginas = numeroPaginas;
		} else {
			numeroPaginas = 1;
		}
	}

	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + "]";
	}
	
}
