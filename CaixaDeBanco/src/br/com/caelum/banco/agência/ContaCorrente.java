package br.com.caelum.banco.agência;

public class ContaCorrente extends Conta{

	public void atualiza (double taxa){
		this.saldo+= this.saldo * taxa * 2;
	}
	
	public void deposita (double quantidade){
		this.saldo+=quantidade - 0.10;
	}

	
	
}
