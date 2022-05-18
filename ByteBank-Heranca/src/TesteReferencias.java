
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalary(5000.0);

		Funcionario f = new Funcionario();
		f.setSalary(2000.0);

		EditorDeVideo ev = new EditorDeVideo();
		f.setSalary(2500.0);
		
		Designer ds = new Designer();
		ds.setSalary(2000.0);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(ds);

		System.out.println(controle.getSoma());
	}

}
