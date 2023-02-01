package ud06.r01.p04;

public class Consultor extends Empleado {

	private int horasTrabajadas;
	private double precioHora;
	public Consultor(String nombre, String dni, int telefono, int horasTrabajadas, double precioHora) {
		super(nombre, dni, telefono);
		setHorasTrabajadas(horasTrabajadas);
		setPrecioHora(precioHora);
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getPrecioHora() {
		return precioHora;
	}
	
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
	public double getSalario(int horasTrabajadas, double precioHora) {
		double salario = horasTrabajadas * precioHora;
		return salario;
	}
}
