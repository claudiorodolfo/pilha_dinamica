public class PilhaDinamica implements Empilhavel {
	private int tamanho;
	private int quantidade;
	private NoDuplo ponteiroTopo;
	
	public PilhaDinamica() {
		this(10);
	}
	
	public PilhaDinamica(int tamanho) {
		this.tamanho = tamanho;
		quantidade = 0;
		ponteiroTopo = null;
	}
	
	public void empilhar(Object elemento) {
		if (!estaCheia()) {
			NoDuplo noTemporario = new NoDuplo();
			noTemporario.setDado(elemento);
			noTemporario.setAnterior(ponteiroTopo);
			if (!estaVazia())
				ponteiroTopo.setProximo(noTemporario);
			ponteiroTopo = noTemporario;
			quantidade++;
		} else {
			System.out.println("Pilha Cheia!");
		}
	}
	
	public Object desempilhar() {
		Object elementoTopo = null;
		if (!estaVazia()) {
			elementoTopo = ponteiroTopo.getDado();
			ponteiroTopo = ponteiroTopo.getAnterior();
			if (quantidade > 1)
				ponteiroTopo.setProximo(null);
			quantidade--;
		} else {
			System.out.println("Pilha Vazia!");
		}
		return elementoTopo;
	}
	
	public Object topo() {
		Object elementoTopo = null;
		if (!estaVazia()) {
			elementoTopo = ponteiroTopo.getDado();
		} else {
			System.out.println("Pilha Vazia!");
		}
		return elementoTopo;
	}
	
	public boolean estaVazia() {
		return (quantidade == 0);
	}
	
	public boolean estaCheia() {
		return (quantidade == tamanho);
	}
	
	public String imprimir() {
		NoDuplo ponteiroAuxiliar = ponteiroTopo;
		String resultado = "[";
		for (int i = quantidade - 1; i >= 0; i--) {
			if (i == 0) {
				resultado += ponteiroAuxiliar.getDado();
			} else {
				resultado += ponteiroAuxiliar.getDado() + ",";
			}
			ponteiroAuxiliar = ponteiroAuxiliar.getAnterior();
		}
		return resultado + "]";
	}
}
