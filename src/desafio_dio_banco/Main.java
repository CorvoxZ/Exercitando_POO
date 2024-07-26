package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		
		cc.depositar(100);
		cc.depositar(100);
		cc.transferir(cp, 100);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
