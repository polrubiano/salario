package salario;

public class Salario {

	private String tipo;
	private double salarioBase;
	private double ventasMes;
	private int horasExtra;

	Salario() {
		this.tipo = null;
		this.salarioBase = 0;
		this.ventasMes = 0;
		this.horasExtra = 0;
	}
	
	Salario(String tipo, int salarioBase, double ventasMes, int horasExtra){
		this.tipo = tipo;
		this.salarioBase = salarioBase;
		this.ventasMes = ventasMes;
		this.horasExtra = horasExtra;
	}

	public double calculaSalarioBruto(String tipo, double ventasMes, int horasExtra) {
		double salarioBruto = 0;

		if (tipo == "vendedor") {
			this.salarioBase = 1000;
		} else if (tipo == "encargado") {
			this.salarioBase = 1500;
		}
		if (ventasMes >= 1000 && ventasMes < 1500) {
			this.salarioBase += 100;
		}else if (ventasMes >= 1500){
			this.salarioBase += 200;
		}
		int horas = horasExtra*20;
		this.salarioBase += horas;

		salarioBruto = this.salarioBase;

		return salarioBruto;
	}

	public double calculaSalarioNeto(double salarioBruto) {
		double salarioNeto = salarioBruto;

		if (salarioBruto >= 1000 && salarioBruto < 1500) {
			salarioNeto -= (salarioBruto * 0.16);
		} else if (salarioBruto >= 1500) {
			salarioNeto -= (salarioBruto * 0.18);
		}

		return salarioNeto;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getVentasMes() {
		return this.ventasMes;
	}

	public void setVentasMes(int ventasMes) {
		this.ventasMes = ventasMes;
	}

	public int getHorasExtra() {
		return this.horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public String toString() {
		return "tipo: " + this.tipo + "\nsalario base: " + this.salarioBase + "\nventas mes: " + ventasMes
				+ "\nhoras extra: " + this.horasExtra;
	}

}