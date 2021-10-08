
public class Fila extends ListaEncadeada{
	
	void insert(String dado)
	{
		this.insere(dado);
	}
	
	String remove() {
		return this.delete(0);
	}
	
	void imprimePilha()
	{
		for (int pos = 0; pos < this.tamanhoLista(); pos++)
		{
			System.out.println(this.buscaElemento(pos));
		}
	}
}
