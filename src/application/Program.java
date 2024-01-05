package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		// São operações da clase Object utilizadasa para comparar se um objeto é igual a outro
		// equals: lento, resposta 100%
		// hashCode: rápido, porém resposta positiva não é 100%
		// Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações. Classes personalizadas precisam sobrepô-las.
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com"); // Observação Comparação somente com o nome
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
	}
}
