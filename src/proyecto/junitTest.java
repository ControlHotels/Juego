package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javafx.application.Application;
import javafx.stage.Stage;


public class junitTest extends Main{


	@Test
	public void simpleTest()	
	{

		System.out.print("Esta es la primera prueba para nuestro juego aplicando Junit Test");  
        String str1="Este es el caso de prueba en esta clase.";
        Main principal = new Main();		
        assertTrue(principal.arreglo(j, i) == 8);
	}
	
	

	

}