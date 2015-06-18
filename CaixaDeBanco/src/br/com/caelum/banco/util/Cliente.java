package br.com.caelum.banco.util;




public class Cliente implements Autenticavel{
protected String nome;
protected int idade;
protected String endereco;
protected String cpf;

			
		@Override
		public boolean AutenticaSenha(int senha) {
			if (senha!=5678){
			System.out.println ("Senha incorreta!");
			return false;	
			}else{
			System.out.println ("Acesso liberado");
			return true;
				}
		}
			public void mudaCPF (String cpf){
			if(idade>60){
			mudaCPF(cpf);
			}else{
			this.cpf = cpf;
				}
			}

	}

