package ud06.r01.p04;

public class EmpleadoFijo extends Empleado {
	
	private double salarioFijo;

	public EmpleadoFijo(String nombre, String dni, int telefono, double salarioFijo) {
		super(nombre, dni, telefono);
		setSalarioFijo(salarioFijo);
	}

	public double getSalarioFijo() {
		return salarioFijo;
	}

	public void setSalarioFijo(double salarioFijo) {
		this.salarioFijo = salarioFijo;
	}

	
}
