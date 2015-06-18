package br.com.caelum.banco.agência;

import br.com.caelum.banco.util.Cliente;

abstract class Conta {
	protected int numero;
	protected double limite;
	protected double saldo;
	protected Cliente titular;
	protected static int numeroDeContas;
	int total = Conta.getnumeroDeContas();
	
	Conta (Cliente titular){
		this.titular = titular;
		System.out.println ("Cliente conta :"+this.titular);
	}
	
	public String toString(){
		return "Uma conta com valor: R$" + this.saldo;
	}
	
	public boolean equals(Object object) {
		  if (!(object instanceof Conta)) 
		    return false;
		  Conta outraConta = (Conta) object;
		  return this.saldo == outraConta.saldo;
		}
		public int getNumero() {
			return numero;
		}
	

	Conta (int numero, Cliente titular){
		this.titular = titular;	
	}
	
	Conta (){
		this.numeroDeContas = this.numeroDeContas + 1;
	}
	
	public static int getnumeroDeContas(){
		return Conta.numeroDeContas;	
	}

	public double getSaldo(){
		return this.saldo;
	}
	
	public Cliente setTitular(String titular){
		System.out.println ("Titular da conta corrente :"+titular);
		return this.titular;	
	}
	
	public Cliente geTtitular(){
		return this.titular;
	}
	
	public void saca (double quantidade){
		if (quantidade>this.saldo+this.limite){
			System.out.println ("Valor indisponivel");
					  	 
	   }else{
		   System.out.println("Deposito realizado com sucesso" + quantidade);
			this.saldo-=quantidade;
			
	   }
	}
			
	public void deposita (double quantidade){
		if (quantidade<0){
			System.out.println ("Valor incorreto");	
	   }else{
		   this.saldo+=quantidade;			
	   }	 
	}
	
	abstract void atualiza(double taxa);

	public double calculoDeTributavel() {
		// TODO Auto-generated method stub
		return 0;
	}

	
			 
}



			
				// TODO Auto-generated method stub