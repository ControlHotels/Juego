/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Proyecto extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     launch(args);
    }
    public int i = 0;
    public int j = 0;

    public int arreglo(int a , int b) {
        int num1 = 4;
		int num2 = 4;
		int resultado = num1 + num2;
        return resultado;
    }

    @Override
    public void start(Stage stage) throws Exception {
        
       	Parent root = FXMLLoader.load(getClass().getResource("juego.fxml")); 
        Scene scene = new Scene(root);
    	stage.setTitle("VOCAPLUS!");
    	stage.setScene(scene);
    	stage.show();
        
    }
    
}
