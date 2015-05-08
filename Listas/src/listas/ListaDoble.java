package listas;

class Nodo1{
	int elemento;
	Nodo1 siguiente;
	Nodo1 anterior;
	
	public Nodo1(int elemento,Nodo1 sig, Nodo1 ant){
		this.elemento=elemento;
		siguiente=sig;
		anterior=ant;
	}
		
	public Nodo1(int elemento){
		this.elemento=elemento;
	}
}

public class ListaDoble {
	
	Nodo1 inicio;
	Nodo1 fin;
	
	void agregarFinal(int elemento){
		if(inicio==null){
			fin= new Nodo1(elemento);
			inicio=fin;
		}
		else{
			fin=new Nodo1(elemento,null,fin);
			fin.anterior.siguiente=fin;
		}
	}
	void agregarInicio(int elemento){
		if(inicio==null){
			inicio= new Nodo1(elemento);
			fin=inicio;
		}
		else{
			inicio=new Nodo1(elemento,inicio,null);
			inicio.siguiente.anterior=inicio;
			
		}
		
	}
	void mostrarInicioFin(){
		Nodo1 tmp=inicio;
		if(tmp==null){
			inicio=fin;
			System.out.println("Lista Vacia.");
		}
			else{
			System.out.print("[");
			while(tmp!=null){
				System.out.print(tmp.elemento+" ");
				tmp=tmp.siguiente;
			}
			System.out.print("]");
		}
	}
	
	void mostrarFininicio(){
		Nodo1 tmp=fin;
		if(tmp==null){
			inicio=fin;
			System.out.println("Lista Vacia.");
		}
			else{
			System.out.print("[");
			while(tmp!=null){
				System.out.print(tmp.elemento+" ");
				tmp=tmp.anterior;
			}
			System.out.print("]");
		}
	}
	
	void eliminarInicioFin(int elemento){
		Nodo1 tmp=inicio;
		Nodo1 anterior=null;
		if(tmp==null)
			System.out.println("Lista vacia");
		else{
			while(tmp!=null){
				if(tmp.elemento==elemento);
					if(anterior==null)
					inicio=inicio.siguiente;
					else{
						anterior.siguiente=tmp.anterior;
					break;
					}
				anterior=tmp;
				tmp=tmp.siguiente;
			}
		}
	}
	void eliminarUltimo(){
		Nodo1 tmp=fin;
		Nodo1 anterior=null;
		if(tmp==null)
			System.out.println("Lista vacia");
		else{
			if(anterior==null)
				fin=fin.anterior;
		}
	}
	

	public static void main(String[] args) {
		ListaDoble l2= new ListaDoble();
		l2.mostrarInicioFin();
		l2.mostrarFininicio();
		//System.out.println();
		//System.out.println();
		/*l2.agregarFinal(5);
		l2.agregarFinal(10);
		l2.agregarFinal(15);
		l2.agregarFinal(20);
		l2.agregarFinal(25);
		l2.mostrarInicioFin();*/
		//l2.mostrarFininicio();
		System.out.println();
		l2.agregarInicio(5);
		l2.agregarInicio(10);
		l2.agregarInicio(15);
		l2.agregarInicio(20);
		l2.agregarInicio(25);
		l2.mostrarInicioFin();
		//System.out.println();
		//System.out.println();
		l2.eliminarInicioFin(5);
		l2.eliminarInicioFin(20);
		l2.eliminarUltimo();
		l2.eliminarUltimo();
		//l2.mostrarInicioFin();
		l2.agregarInicio(4);
		System.out.println();
		System.out.println();
		l2.mostrarInicioFin();
		System.out.println();
		l2.mostrarFininicio();
		System.out.println();
		System.out.println();
		System.out.println("Inicio: "+l2.inicio.elemento);
		System.out.println("Final: "+l2.fin.elemento);
	}

}
