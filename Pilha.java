
public class Pilha extends ListaEncadeada
{
	void empilha(String dado)
	{
		this.insere(dado);
	}
	
	String desempilha()
	{
		return this.delete(this.tamanhoLista() - 1);
	}
	
	void imprimePilha()
	{
		for (int pos = this.tamanhoLista()-1; pos >= 0; pos--)
		{
			System.out.println(this.buscaElemento(pos));
		}
	}
}
