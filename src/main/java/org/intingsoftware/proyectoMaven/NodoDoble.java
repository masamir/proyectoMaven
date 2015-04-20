package org.intingsoftware.proyectoMaven;

public class NodoDoble<E> {
	public E dato;
	NodoDoble sig,ant;
	public NodoDoble(E el,NodoDoble s,NodoDoble a){
		dato =el;
		sig=s;
		ant=a;
	}
	public NodoDoble(E el){
		this(el,null,null);
	}
	
	
	
	

}
