/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class JuegoController implements Initializable {
       public int i = 0;
        public int j = 0;
        int game = 4;
    	int columns = 4;
        int rows = 3;
        int text = 3;
       
public String[][][][] newArray = new String[game][columns][rows][text];
    @FXML
    private Button btnsecundarioclick;
    
 
    @FXML
    private Label Pregunta;
    @FXML
    private Label Respuesta;
    @FXML
    private Label Respuesta1;
    @FXML
    private TextField textores;
    @FXML
    private TextField validacion;
    @FXML
    private TextField RespuestaValida;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //Creamos las siguientes variables para definir la longitud de nuestro array:
    	
    	
  
 //Aquí creamos nuestro array:
        
        
        
// Asignatura 1 (Ciencias Naturales y Sociales): creamos la estructura del juego por campo del saber: texto, pregunta, respuesta.
// Serán tres textos para cada asignatura: 
        
        newArray[0][0][0][0] = " Naturales y Sociales \r\n"
        		+ "El sistema solar está formado por un sol y ocho planetas que giran alrededor de sí mismos y de caminos llamados ¨órbitas¨. \r\n";
        		
        newArray[0][0][0][1] = "¿Cuántos planetas hay en nuestro Sistema Solar?";
        newArray[0][0][1][0] = "8";
        
        newArray[0][1][0][0] = "Los primates son los antepasados del ser humano y existieron antes de la Edad de Piedra en el continente africano. ";
        newArray[0][1][0][1] = "Los primero primates se ubicaron en el continente:";
        newArray[0][1][1][0] = "africano";
        
        newArray[0][2][0][0] = "Las cordilleras son un conjunto de montañas alineadas a lo largo de un eje que forman una unidad.\"";
        newArray[0][2][0][1] = "Varias montañas unidas forman una:";
        newArray[0][2][1][0] = "cordillera";
        
// Asignatura 2 (Inglés):
        
        newArray[1][0][0][0] = "Inglés.\r\n"
        		+ " El perro es mi mejor amigo y mi mascota se escribe en inglés: Dog is my best friend and my pet. \r\n";
        		
        newArray[1][0][0][1] = "Dog significa en inglés";
        newArray[1][0][1][0] = "perro";
        
        newArray[1][1][0][0] = "Hola es una palabra muy usada para saludar en inglés.Puedo decir hello o de manera corta decir hi.";
        newArray[1][1][0][1] = "¿Cómo se dice hola de manera corta en inglés?";
        newArray[1][1][1][0] = "hi";
        
        newArray[1][2][0][0] = "Para decir que necesito ir al baño digo: can I go to the bathroom please?";
        newArray[1][2][0][1] = "Baño en inglés se escribe:";
        newArray[1][2][1][0] = "bathroom";
    	
        
// Asignatura 3 (Matemáticas):
        
        newArray[2][0][0][0] = "Matemáticas.\r\n"
        		+ " La suma es una de las cuatro operaciones básicas que consiste en la adición de dos o más elementos para llegar a un resultado.  \r\n";
        		
        newArray[2][0][0][1] = "¿Cuál es el resultado de sumar 2 + 5";
        newArray[2][0][1][0] = "7";
        
        newArray[2][1][0][0] = "Restar es quitar una cantidad de otra para hallar la diferencia entre ambas.";
        newArray[2][1][0][1] = "¿Cuál es es resultado de la resta 10 - 8 ?";
        newArray[2][1][1][0] = "2";
        
        newArray[2][2][0][0] = "La multiplicación se representa a través del símbolo x";
        newArray[2][2][0][1] = "Para multiplicar ueso el símbolo";
        newArray[2][2][1][0] = "x";
        
        
// Asignatura 4 (Español): 

        newArray[3][0][0][0] = "Español.\r\n"
        		+ "Los adjetivos son palabras para describir, caracterizar o dar cualidad a los sustantivfos.\r\n";
        
        newArray[3][0][0][1] = "Escribe el adjetivo de la oración: Juliana es muy bonita";
        newArray[3][0][1][0] = "bonita";
        
        newArray[3][1][0][0] = "Las vocales en el español son: a, e, i, o , u y el resto de letras del abecedario son consonantes.";
        newArray[3][1][0][1] = "La n es una:";
        newArray[3][1][1][0] = "consonante";
        
    	
        newArray[3][2][0][0] = "Las oraciones en español inician con mayúscula y terminan con punto.";
        newArray[3][2][0][1] = "A la oración - Mañana nos vemos - le hace falta al final el: ";
        newArray[3][2][1][0] = "punto";
    }    

 

    @FXML
    private void tipo1(ActionEvent event) {
      
         j=0;
         Pregunta.setText(newArray[j][i][0][0]);
         Respuesta.setText(newArray[j][i][0][1]);
        
        // Button source = (Button) event.getSource();
       // source.setVisible(false);
       // System.out.println("pick: "+source.getUserData());
    }

    @FXML
    private void tipo2(ActionEvent event) {
         j=1;
         Pregunta.setText(newArray[j][i][0][0]);
         Respuesta.setText(newArray[j][i][0][1]);
    }

    @FXML
    private void tipo3(ActionEvent event) {
         j=2;
         Pregunta.setText(newArray[j][i][0][0]);
         Respuesta.setText(newArray[j][i][0][1]);
    }

    @FXML
    private void tipo4(ActionEvent event) {
         j=3;
         Pregunta.setText(newArray[j][i][0][0]);
         Respuesta.setText(newArray[j][i][0][1]);
    }

    @FXML
    private void Siguiente(ActionEvent event) {
        i = i+1;
        Pregunta.setText(newArray[j][i][0][0]);
        Respuesta.setText(newArray[j][i][0][1]);
        validacion.setText("");
        textores.setText("");
        RespuestaValida.setText("");
    }

    @FXML
    private void texto_Action(ActionEvent event) {
       
        String palabra = textores.getText().trim();
        String respuesta = newArray[j][i][1][0].trim();
        
        if (palabra.equals(respuesta) )
                {
                    System.out.println("Palabra Correcta");  
                    validacion.setText("Palabra Correcta");
                }
                else
                {
                     System.out.println("Palabra InCorrecta");  
                     validacion.setText("Palabra InCorrecta");
                }	
        
            RespuestaValida.setText(newArray[j][i][1][0].trim());
    }
    
}
