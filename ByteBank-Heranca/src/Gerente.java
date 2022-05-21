
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;

	public double getBonus() {
		System.out.println("Chamando o metodo de bonificacao do gerente");
		return super.getSalary();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
