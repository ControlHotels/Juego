package application;

import java.util.ArrayList;
import java.util.List;

// Inicialmente realizamos la importación de las librerías de JavaFx:  

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Creamos la clase Main que contendra los objetos y métodos del juego: 

public class Main extends Application {
	
	

	
  
// Creamos dos variables i, j para definir el array a usar según el tipo de juego que seleccionamos: 
	
    public int i = 0;
    public int j = 0;

    public int arreglo(int a , int b) {
        int num1 = 4;
		int num2 = 4;
		int resultado = num1 + num2;
        return resultado;
    }

// Aquí se encuentra el método principal que será ejecutado: 
    
    public void start(Stage s)
    {

// Luego, creamos los objetos tipo botón para que el usuario pueda seleccionar la asignatura en la que desea jugar:
    	
    	  Button tipo1 = new Button("Tipo 1");
    	  Button tipo2 = new Button("Tipo 2");
    	  Button tipo3 = new Button("Tipo 3");
      	  Button tipo4 = new Button("Tipo 4");
    	
 //Creamos las siguientes variables para definir la longitud de nuestro array:
    	
    	int game = 4;
    	int columns = 4;
        int rows = 3;
        int text = 3;
  
 //Aquí creamos nuestro array:
        
        String[][][][] newArray = new String[game][columns][rows][text];
        
// Asignatura 1 (Inglés): creamos la estructura del juego por campo del saber: texto, pregunta, respuesta.
// Serán tres textos para cada asignatura: 
        
        newArray[0][0][0][0] = "Sistema solar\r\n"
        		+ "El sistema solar esta formado por un sol y 8 planetas que giran alrededor de el en caminos llamados ¨orbitas¨. Además, los planetas también giran sobre sí mismo y algunos tienen unos objetos rocosos que orbitan a su alrededor llamados satélites o lunas. también tenemos a nuestro amigo júpiter uno de los planetas más grande del sistema solar con una gran mancha roja que cubre por completo todo el planeta.   \r\n";
        		
        newArray[0][0][0][1] = "¿Cuántos planetas hay en nuestro Sistema Solar?";
        newArray[0][0][1][0] = "8";
        
        newArray[0][1][0][0] = "Luna ***************************************************************";
        newArray[0][1][0][1] = "¿Qué es la Luna?";
        newArray[0][1][1][0] = "Un satélite";
        
        newArray[0][2][0][0] = "Planetas ***************************************************************";
        newArray[0][2][0][1] = ". ¿Cuál es el planeta más grande?";
        newArray[0][2][1][0] = "Júpiter";
// Asignatura 2 (Sociales):
        
        newArray[1][0][0][0] = "la madre tierra.\r\n"
        		+ "La Tierra es el planeta en el que vivimos. La Tierra pertenece al sistema solar y se mueve constantemente. Ejecuta dos movimientos a la vez, uno de traslación y otro de rotación. El movimiento de rotación de la Tierra se da durante 24 horas y gira sobre si misma en sentido contrario a las agujas del reloj. Esta esta formada de relieves, planicies y cadenas montañosas llamadas cordilleras que se desplazan a lo largo y ancho de toda la tierra. algo muy impórtate en nuestra madre tierra es que está dividida por mapas que nos sirven encontrar los diferentes continentes, mares, países etc\r\n";
        		
        newArray[1][0][0][1] = "¿Cuánto tiempo dura el movimiento de rotación de la Tierra?";
        newArray[1][0][1][0] = "24";
        
        newArray[1][1][0][0] = "Titulo *****************************************************************";
        newArray[1][1][0][1] = "Para qué sirven los mapas";
        newArray[1][1][1][0] = "Para localizar países y ciudades";
        
        newArray[1][2][0][0] = "Titulo ******************************************************************";
        newArray[1][2][0][1] = "Varias montañas forman una";
        newArray[1][2][1][0] = "Cordillera";
    	
        
// Asignatura 3 (Matemáticas):
        
        newArray[2][0][0][0] = "ser humano.\r\n"
        		+ "Los primates son los antepasados del ser humano y existieron antes de la Edad de Piedra. los homínidos son los ancestros más antiguos de los seres humanos La evolución humana tuvo su punto inicial cuando una población de primates del noroeste de África se dividió en dos linajes que evolucionaron de modo independiente: uno de ellos permaneció en los árboles, mientras el otro se adaptó a la llanura. Debido a presiones ambientales, las generaciones siguientes de este último linaje desarrollaron el bipedismo, o sea, la capacidad de caminar sobre los dos miembros inferiores, liberando así a los miembros superiores que vendrían a ser luego manos, para manipular herramientas\r\n";
        		
        newArray[2][0][0][1] = "¿En qué época vivieron los primeros primates?";
        newArray[2][0][1][0] = "edad de piedra";
        
        newArray[2][1][0][0] = "Titulo ********************************************************************";
        newArray[2][1][0][1] = "¿En qué continente vivieron los primeros primates?";
        newArray[2][1][1][0] = "africano";
        
        newArray[2][2][0][0] = "Titulo ********************************************************************";
        newArray[2][2][0][1] = "¿Cuáles fueron los primeros ancestros del ser humano?";
        newArray[2][2][1][0] = "homínidos";
        
        
// Asignatura 4 (Español): 
        
        newArray[3][0][0][0] = "Cuales son los numeros que se represrntan con la letra Z **********************************************************************";
        newArray[3][0][0][1] = "Cuales son los numeros que se represrntan con la letra Z ****************************************************************";
        newArray[3][0][1][0] = "Respuesta";
        
        newArray[3][1][0][0] = "Titulo **********************************************************************";
        newArray[3][1][0][1] = "Pregunta 3.1 *****************************************************************";
        newArray[3][1][1][0] = "Los numeros enteros";
        
    	
        newArray[3][2][0][0] = "Titulo ***********************************************************************";
        newArray[3][2][0][1] = "La siguiente secuencia Q=(4/6,10/2,5/5,6/2)" + "se le se conoce como los numeros...";
        newArray[3][2][1][0] = "Racionales";
        
        
//Creamos el objeto label a para visualizar las preguntas creadas en el array: 
        Label pregunta = new Label(newArray[j][i][0][0]);
    	
//Definimos el título del formulario del juego: 
        s.setTitle("VOCAPLUS!");
  
//Creamos el objeto de tipo texto para que el usuario escriba la respuesta a la pregunta:
        TextField b = new TextField("");
  
//Creamos un objeto panel del formulario:
        
        TilePane r = new TilePane();
        Label l = new Label(newArray[j][i][0][1]);
        Label l1 = new Label("");
        Label l2 = new Label("");

        pregunta.setText(newArray[j][i][0][0]);
        
// Creamos el botón Siguiente:
        l.setText( newArray[j][i][0][1]);
        Button pregunta1 = new Button("Siguiente");
           
// Creamos el método event para que se presente el contenido de la asignatura al seleccionarla: 
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	
// La pregunta está desactivada para que no se refleje en el juego hasta que el usuario seleccione la asignatura: 
            	 pregunta1.setDisable(false);  	 
            	 b.setDisable(true);
            	 
// Aquí se recupera el texto escrito en el campo de respuesta: 
                String palabra = b.getText().trim();
                 
// Y luego se busca en el array la respuesta de la pregunta: 
                String respuesta = newArray[j][i][1][0].trim();
                 
// Se crea un label para que el usuario visualice la respuesta correcta de la pregunta:
             	l2.setText(respuesta);
           
// Comparamos por medio de un condicional si la respuesta ingresada por el usuario coincide con la respuesta correcta:	
                if (palabra.equals(respuesta) )
                {
                	l1.setText("Palabra Correcta");
                }
                else
                {
                	l1.setText("Palabra InCorrecta");
                }	
            }
        };
        
        
        
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	
// Este evento inicializa el juego con la primera pregunta que se seleccione en la asignatura: 
            	
            	  i = i+1;
            	  l.setText( newArray[j][i][0][1]);
            	  l1.setText("");
            	  l2.setText("");
            	  b.setText("");
            	  b.setDisable(false);
            	  pregunta1.setDisable(true);
            	  pregunta.setText(newArray[j][i][0][0]);
            	  
            }
        };
        
        
                EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
         
// Valor del botón Asignatura Nº0 para que se posicione en el array: 
            	
            	j=0;
                pregunta.setText(newArray[j][i][0][0]);
                
                l.setText( newArray[j][i][0][1]);
                
// La propiedad getchildren permite visualizar los objetos dando un orden en el formulario:
                r.getChildren().add(pregunta);
                r.getChildren().add(l);
                r.getChildren().add(b);           
                r.getChildren().add(l1);            
                r.getChildren().add(l2);
                
                r.getChildren().add(pregunta1);
                pregunta1.setOnAction(event1);
               
// La propiedad setvisible no deja visulizar  los botones de selección de la materia cuando el usuario ya ingreso en una de estas: 
            	tipo1.setVisible(false);       	
            	tipo2.setVisible(false);  
            	tipo3.setVisible(false);
            	tipo4.setVisible(false);
            	
            }
        };
        
        
        
        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {

// Valor del botón materia Nº1:
            	j= 1;
            	
                pregunta.setText(newArray[j][i][0][0]);
                
                l.setText( newArray[j][i][0][1]);
                
                r.getChildren().add(pregunta);
                r.getChildren().add(l);
    
                r.getChildren().add(b);        
                r.getChildren().add(l1);                
                r.getChildren().add(l2);              
                r.getChildren().add(pregunta1);
                pregunta1.setOnAction(event1);
               
// La propiedad setvisible no deja visulizar  los botones de selección de la materia cuando el usuario ya está adentro de una de estas:              
            	tipo1.setVisible(false);            	
            	tipo2.setVisible(false);  
            	tipo3.setVisible(false);
            	tipo4.setVisible(false);
            	
            }
        };
        
        
        
        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	
// Valor del botón materia Nº2:
            	j= 2;

                pregunta.setText(newArray[j][i][0][0]);
                
                l.setText( newArray[j][i][0][1]);
                
                r.getChildren().add(pregunta);
                r.getChildren().add(l);
                r.getChildren().add(b);             
                r.getChildren().add(l1);              
                r.getChildren().add(l2);
                
                r.getChildren().add(pregunta1);
                pregunta1.setOnAction(event1);
               
// La propiedad setvisible no deja visulizar  los botones de seleccion de la materia cuando el usuario ya está adentro:
            	tipo1.setVisible(false);          	
            	tipo2.setVisible(false);  
            	tipo3.setVisible(false);
            	tipo4.setVisible(false);
            	
            }
        };
   
        
        EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
            	
// Valor del botón materia Nº3-.
            	j= 3;

                pregunta.setText(newArray[j][i][0][0]);
                
                l.setText( newArray[j][i][0][1]);
                
// La propiedad getchildren permite visualizar los objetos dando un orden en el formulario:
                r.getChildren().add(pregunta);
                r.getChildren().add(l);
                r.getChildren().add(b);         
                r.getChildren().add(l1);            
                r.getChildren().add(l2);              
                r.getChildren().add(pregunta1);
                pregunta1.setOnAction(event1);
               
// La propiedad setvisible no deja visualizar  los botones de selección de la materia: 
            	tipo1.setVisible(false);          	
            	tipo2.setVisible(false);  
            	tipo3.setVisible(false);
            	tipo4.setVisible(false);
            	
            }
        };
   
// La propiedad getchildren permite visualizar los objetos dando un orden en el formulario:
	      
	        r.getChildren().add(tipo1);
	        r.getChildren().add(tipo2);
	        r.getChildren().add(tipo3);
	        r.getChildren().add(tipo4);
	  
	        pregunta1.setDisable(true);
	  
	        // cuando se presiona enter
	        b.setOnAction(event);
	        tipo1.setOnAction(event2);
	        tipo2.setOnAction(event3);
	        tipo3.setOnAction(event4);
	        tipo4.setOnAction(event5);
	        
// Creación de la escena como tamaño de largo y ancho del formulario:
	        Scene sc = new Scene(r, 1600, 600);
	        s.setScene(sc);
	        s.show();           
    }
  
    public static void main(String args[])
    {
        
// Iniciar la aplicacion
        launch(args);
    }
    



}