package listas;

class Nodo2{
	int elemento;
	Nodo2 siguiente;
	
	public Nodo2(int elemento,Nodo2 sig){
		this.elemento=elemento;
		siguiente=sig;
	}
	public Nodo2(int elemento){
		this.elemento=elemento;
		siguiente=null;
	}
	
}


public class ListaCircular {
	
	Nodo2 inicio;
	Nodo2 fin;
	
	void agregar(int elemento){
		
				
		if(inicio==null){
		inicio=new Nodo2(elemento);
		fin=inicio;
		//inicio.siguiente=inicio;
		}
		else{
			/*Nodo2 tmp=inicio;
			inicio=new Nodo2(elemento);
			inicio.siguiente=tmp;
			tmp.siguiente=inicio;*/
			Nodo2 tmp=inicio;
			inicio=new Nodo2(elemento);
			inicio.siguiente=tmp;
			tmp.siguiente=fin;
			fin.siguiente=inicio;
		}
	}

	
	void mostrar(){
		Nodo2 tmp=inicio;
		if(tmp==null)
			System.out.println("Lista vacia.");
		else{
			System.out.print("[");
			do{
				System.out.print(tmp.elemento+" ");
				tmp=tmp.siguiente;	
			}while(tmp!=inicio);
			System.out.print("]");
		}
	}

	public static void main(String[] args) {
		ListaCircular lc=new ListaCircular();
		lc.mostrar();
		lc.agregar(15);
		lc.agregar(20);
		lc.agregar(35);
		lc.agregar(22);
		//lc.agregar(54);
		//lc.agregar(100);
		System.out.println();
		lc.mostrar();
		System.out.println();

	}

}
