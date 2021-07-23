public class PilhaPrincipal {
	public static void main(String args[]) {
		//Empilhavel pilha = new PilhaEstatica(5);
		Empilhavel pilha = new PilhaDinamica(5);
		pilha.empilhar("Claudio");
		pilha.empilhar("Rodolfo");
		pilha.empilhar("Sousa");
		String conteudo = (String) pilha.desempilhar();
		System.out.println("Pilha="+pilha.imprimir());
	}
}