
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Gabriel");
		gerente.setSalario(2600.0);
		gerente.setCpf("123112312");

		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());

//		funcionario.salario = 2000;
	}
}
