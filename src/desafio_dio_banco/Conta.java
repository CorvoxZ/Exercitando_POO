package desafio_dio_banco;

public abstract class Conta implements iConta{
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;

	public Conta() {
	this.agencia = Conta.AGENCIA_PADRAO;
	this.numero = SEQUENCIAL++;
		
	}
	
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo - valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo = saldo + valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
}
