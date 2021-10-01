
//ArrayList
//LinkedList

public class ListaEncadeada 
{
	//Nos de referencia para inicio e fim da lista
	No cabeca = null;
	No rabo = null;
	
	//retorna a quantidade de elementos na lista
	int tamanhoLista()
	{
		int qtdElementos = 0;
		
		for (No temp = cabeca ; temp != null ; temp = temp.prox, qtdElementos++);
		
		return qtdElementos;
		
	}
	
	
	
	public String delete(int posicao) {
		int tamanhoLista = tamanhoLista();
		if (posicao < 0 || posicao > tamanhoLista)
		{
			
			return null;
		}
		if (posicao == 0)
		{
			No retorno=this.cabeca;
			this.cabeca = cabeca.prox;
			
			return retorno.dado;
		}
		//Aponta para o primeiro elemento da lista
		
		No anterior = cabeca;
		No retorno;
		//Percorre a lista ate o elemento anterior a posicao de insercao
		for (int pos = 0; pos < posicao - 1; pos++, anterior = anterior.prox);
		
		//Insere o novo elemento na lista
		//verifica se a insercao e no rabo
		if (anterior.prox == null)
		{
			
			return null;
		}
		retorno=anterior.prox;
		anterior.prox=(anterior.prox).prox;
		return retorno.dado;
		
	
		
	}
	
	//Insercao de um dado em qq posicao da lista
	void insere(int pos, String dado)
	{
		//variavel local armazena o tamanho da lista
		int tamanhoLista = tamanhoLista();
		
		//Testa se a posicao e valida
		if (pos < 0 || pos > tamanhoLista)
		{
			return;
		}
		
		//Se passou dos testes de posicao ja cria o novo no a ser inserido
		No novo = new No(dado);
		
		//verifica se a posicao de insercao e a primeira
		if (pos == 0)
		{
			novo.prox = cabeca;
			this.cabeca = novo;
			
			return;
		}
		
		//Insercao em uma posicao diferente de zero
		
		//Aponta para o primeiro elemento da lista
		No anterior = cabeca;
		
		//Percorre a lista ate o elemento anterior a posicao de insercao
		for (int posicao = 0; posicao < pos - 1; posicao++, anterior = anterior.prox);
		
		//Insere o novo elemento na lista
		//verifica se a insercao e no rabo
		if (anterior.prox == null)
		{
			rabo = novo;
		}
		
		//Realiza a insercao do novo No
		novo.prox = anterior.prox;
		anterior.prox = novo;
	}
	
	//Imprime os dados da lista
	public void imprimeLista()
	{
		for (No temp = cabeca ; temp != null ; temp = temp.prox)
		{
			System.out.print(" [ " + temp.dado + " ] ");
		}
	}
	
	//Insere um novo elemento na ultima posicao da lista
	public void insere(String dado)
	{
		//Cria o novo no que sera inserido na lista
		No novo = new No(dado);
		
		//A lista esta vazia?
		if (cabeca == null)
		{
			cabeca  = rabo = novo;
			return;
		}
		
		//Revalida a variavel de referencia que aponta para o ultimo elemento
		rabo.prox  = novo;
		rabo = novo;	
	}	
}






