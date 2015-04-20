package org.intingsoftware.proyectoMaven;

import javax.swing.JOptionPane;

public class ListaDoblemente<E> {
	private NodoDoble inicio,fin,nuevoNodo;
	public ListaDoblemente(){
		inicio = fin= null;
	}
	// saber si la lista esta vacia
	public boolean esVacia(){
		return inicio == null;
		
	}
	// Agregar nodo al final
	public void InsertarAlfinal(E elemento){
		if(!esVacia()){
			fin = new NodoDoble(elemento,null,fin);
			fin.ant.sig=fin;
		}else{
			inicio=fin= new NodoDoble(elemento);
		}
		
	}
	// Agregar al inicio
	public void InsertarAInicio(E elemento){
		if(!esVacia()){
			nuevoNodo = new NodoDoble(elemento,inicio,null);
			inicio.ant = nuevoNodo;
			inicio= nuevoNodo;
			//inicio = new NodoDoble(elemento,inicio,null);
			//inicio.ant.sig=inicio;
		}else{
			inicio=fin= new NodoDoble(elemento);
		}
		
	}
	// mostrar la lista hacia delante.
	public void MostrarListaAdelante(){
		if(!esVacia()){
			String datos = "==>";
			NodoDoble aux=inicio;
			while(aux!=null){
				datos = datos + "["+aux.dato+"]==>";
				
				aux=aux.sig;
			}
			System.out.println(datos);
			//JOptionPane.showMessageDialog(null, datos, "Recorrrer Lista hacia delante", JOptionPane.INFORMATION_MESSAGE);;
		}
	}
	
    // mostrar la lista hacia atras
	public void MostrarListaDesdeAtras(){
		if(!esVacia()){
			String datos = "==>";
			NodoDoble aux=fin;
			while(aux!=null){
				datos = datos + "["+aux.dato+"]==>";
				
				aux=aux.ant;
			}
			System.out.println(datos);
			//JOptionPane.showMessageDialog(null, datos, "Recorrrer Lista hacia delante", JOptionPane.INFORMATION_MESSAGE);;
		}
	}
}
