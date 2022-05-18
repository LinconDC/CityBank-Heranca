
public class EditorDeVideo extends Funcionario{

	public double getBonus() {
		System.out.println("chamando o metodo de bonificacao do EV");
		return super.getBonus() + 100;
	}
}
