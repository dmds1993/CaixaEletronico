package br.com.caelum.banco.agência;
import br.com.caelum.banco.agência.Conta;


public class Ccorrente extends Conta implements Comparable<Ccorrente> {

	@Override
	protected
	void atualiza(double taxa) {
		this.saldo = this.saldo - taxa;
		
	}


	@Override
	public double calculoDeTributavel() {
		this.saldo = this.saldo * 0.01;
		return this.getSaldo();
	}
	
	public int compareTo(Ccorrente o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		return 0;

	}
	


	

	

	

	

}
