
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticacaoUtil;

	public Gerente() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("chamando metodo bonificacao do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);
	}

}
