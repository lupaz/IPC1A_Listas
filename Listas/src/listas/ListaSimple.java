package listas;

class Nodo{
	int elemento;
	Nodo siguiente; 
	
	Nodo(int elemento){
		this.elemento=elemento;
		siguiente=null;
	}
	
}


public class ListaSimple {
	
	Nodo inicio;
	
	void agregar(int elemento){
		if(inicio==null)
			inicio= new Nodo(elemento);
		else{
		Nodo tmp=inicio;
		inicio= new Nodo(elemento);
		inicio.siguiente=tmp;
		}
	}	
	void mostrar(){
		Nodo tmp=inicio;
		
		if(tmp==null)
			System.out.println("Lista vacia.");
		else{
			System.out.print("[");
			while(tmp!=null){
				System.out.print(tmp.elemento+" ");
				tmp=tmp.siguiente;
			}
			System.out.print("]");
		}
	}
	
	void quitar(int elemento){
		Nodo tmp=inicio;
		Nodo anterior=null;
		if(tmp==null)
			System.out.println("Lista Vacia.");
		else{
			while(tmp!=null){
				if(tmp.elemento==elemento)
					if(anterior==null)
						inicio=inicio.siguiente;
					else{
						anterior.siguiente=tmp.siguiente;
					break;	
					}
				anterior=tmp;
				tmp=tmp.siguiente;
			}
		}	
	}
	
	
	public static void main(String[] args) {
		ListaSimple lista=new ListaSimple();
		lista.mostrar();
		lista.agregar(5);
		lista.agregar(6);
		lista.agregar(15);
		lista.agregar(9);
		lista.agregar(20);
		System.out.println();
		lista.mostrar();
		lista.quitar(15);
		System.out.println();
		System.out.println();
		lista.mostrar();
		
		
	}

}
