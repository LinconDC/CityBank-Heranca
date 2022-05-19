
public class SistemaInterno {
	
	private int senha = 2222;

	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("pode entra no sistema");
		} else {
			System.out.println("nao pode entrar no sistema");
		}
	}
}
