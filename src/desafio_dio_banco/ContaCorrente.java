package desafio_dio_banco;

public class ContaCorrente extends Conta{

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("======= Extrato conta corrente=========");
		super.imprimirInfosComuns();
	}



}
