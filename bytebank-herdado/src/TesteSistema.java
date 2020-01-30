
public class TesteSistema {

	public static void main(String[] args) {
//		Gerente g = new Gerente();
//		g.setSenha(2222);
//
//		Administrador adm = new Administrador();
//		adm.setSenha(3333);
//
//		SistemaInterno sistemaInterno = new SistemaInterno();
//		sistemaInterno.autentica(g);
//		sistemaInterno.autentica(adm);

		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(cliente);
	}
}
