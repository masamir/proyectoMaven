package org.intingsoftware.proyectoMaven;


public class App 
{
    public static void main( String[] args )
    {
    	ListaDoblemente lista = new ListaDoblemente();
    	   lista.InsertarAlfinal(10);
    	   lista.InsertarAlfinal(9);
    	   lista.InsertarAlfinal(8);
    	   lista.InsertarAlfinal(110);
    	   lista.InsertarAlfinal(11);
    	   lista.InsertarAlfinal(3);
    	   lista.InsertarAlfinal(4);
    	   lista.InsertarAInicio(0);
    	   lista.InsertarAlfinal(200);
    	   lista.MostrarListaAdelante();
    	   lista.MostrarListaDesdeAtras();
    }
}
