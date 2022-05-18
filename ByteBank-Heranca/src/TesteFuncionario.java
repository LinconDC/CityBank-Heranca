
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("03030303-11");
		nico.setSalary(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonus());
		
		nico.salary = 300.0;

	}

}
