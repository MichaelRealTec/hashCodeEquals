package application;

public class Program {
	public static void main(String[] args) {
		// São operações da clase Object utilizadasa para comparar se um objeto é igual a outro
		// equals: lento, resposta 100%
		// hashCode: rápido, porém resposta positiva não é 100%
		// Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações. Classes personalizadas precisam sobrepô-las.
		
		String a = "Maria";
		String b = "Alex";
		
		//System.out.println(a.equals(b)); // Resposta = false 
		// motivo porque o String a não é igual ao String b
		
		// HashCode é o método que retorna um número representando um código gerado a partir das informações do objeto.
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}
