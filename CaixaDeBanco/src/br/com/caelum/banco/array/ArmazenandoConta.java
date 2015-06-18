package br.com.caelum.banco.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.banco.agência.Ccorrente;



public class ArmazenandoConta extends Ccorrente  {

	public static <T> void main(String[] args) {

		List<Ccorrente> contas = new ArrayList<>();
		Ccorrente c = new Ccorrente();
		c.deposita(1334);
		Ccorrente c2 = new Ccorrente();
		c2.deposita(120);
		Ccorrente c3 = new Ccorrente();
		c3.deposita(1654);

		contas.add(c);
		contas.add(c2);
		contas.add(c3);

		System.out.println(contas.contains(c2));
		System.out.println(contas.size());

		for (int i = 0; i < contas.size(); i++) {
			Ccorrente cc = contas.get(i);
			System.out.println(cc.getSaldo());
		}

	}



}
