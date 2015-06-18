package br.com.caelum.banco.teste;

import br.com.caelum.banco.agência.GuardadorDeObjetos;
import br.com.caelum.banco.agência.Ccorrente;
import br.com.caelum.banco.array.ArmazenandoConta;

public class TesteGuardadosDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
		Ccorrente contaCorrente = new Ccorrente();
		guardadorDeObjetos.adicionaObjeto (contaCorrente);
		Object object = guardadorDeObjetos.pegaObjeto(0);	
		Ccorrente contaResgatada = (Ccorrente)object;
		 
		int i = 5;
		Integer x = new Integer(i);
		guardadorDeObjetos.adicionaObjeto(x);
		
	int numeroDeVolta = x.intValue();
	
	System.out.println (numeroDeVolta);
		Integer z = 9;
		int y = z;
		
		String b = new String ("fj11s");
		String c = new String ("fj11");
		
		
		System.out.println (b);
		System.out.println (c);
		
			if (b.equals(c)){
				System.out.println("Valor iguais");
			}else{
				System.out.println("Valores diferentes");
			}
		
				String frase = "Java é foda mais eu consigo rs";
				String palavras [] = frase.split ("");

			
		
		
	}	
	
}

