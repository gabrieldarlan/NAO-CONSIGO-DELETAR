
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticacaoUtil;

	public Administrador() {
		autenticacaoUtil = new AutenticacaoUtil();

	}

	@Override
	public double getBonificacao() {
		return 50;
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
