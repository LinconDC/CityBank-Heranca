
public class Gerente extends Funcionario{

	public double getBonus() {
		System.out.println("Chamando o metodo de bonificacao do gerente");
		return super.getSalary();
	}
}
