
public class Laboratorio 
{

	public static void main(String[] args) 
	{
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.insere("Dado 1");
		lista.insere("Dado 2");
		lista.insere("Dado 3");
		lista.insere("Dado 4");
		lista.insere("Dado 5");
		lista.insere("Dado 6");
		
		lista.insere(0, "Dado 0");
		lista.insere(6,"Dado 5.5");
		lista.insere(8,"Dado 7");
		lista.insere("Dado 8");
		
		
		System.out.println(lista.delete(2));
		System.out.println(lista.delete(1));
		System.out.println(lista.delete(5));
		System.out.println(lista.delete(6));
		
		
		lista.imprimeLista();
		
		System.out.println(lista.tamanhoLista());
		
		
	}
}
