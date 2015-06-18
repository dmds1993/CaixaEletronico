package br.com.caelum.banco.teste;


import br.com.caelum.banco.agência.Ccorrente;
public class testeContasIguais {

	public static void main(String[] args) {
		Ccorrente ccorrente = new Ccorrente();
		Ccorrente ccorrente2 = new Ccorrente();
		
		ccorrente.setTitular("Daniel");
		ccorrente2.setTitular("Daniel");
		ccorrente.deposita(1200);
		ccorrente2.deposita(1200);
	   
	    System.out.print(ccorrente.equals(ccorrente2));
		
	}
	
}
