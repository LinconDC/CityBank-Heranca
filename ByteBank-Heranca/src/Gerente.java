
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonus() {
		System.out.println("Chamando o metodo de bonificacao do gerente");
		return super.getBonus() + super.getSalary();
	}
}
