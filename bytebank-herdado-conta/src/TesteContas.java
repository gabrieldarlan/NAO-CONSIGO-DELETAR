
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100.0);

		ContaPoupancao contaPoupancao = new ContaPoupancao(222, 222);
		contaPoupancao.deposita(200.0);

		boolean transfere = contaCorrente.transfere(10.0, contaPoupancao);

		System.out.println(transfere);
		System.out.println("CC " + contaCorrente.getSaldo());
		System.out.println("CP " + contaPoupancao.getSaldo());

	}
}
