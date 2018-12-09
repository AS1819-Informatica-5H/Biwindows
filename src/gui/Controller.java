/**
 * Sample Skeleton for 'winDue.fxml' Controller Class
 */

package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import modello.Model;

public class Controller {

	private Model model;
	private Stage stage;
	
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    void onBtn(ActionEvent event) {
    	System.out.println("Bottone Schiacciato");
    }

    @FXML
    void onNewWin(ActionEvent event) {
    	try {
    		// Carico la definizione della seconda scena
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("winDue.fxml"));
    		// Imposto questo come controller anche per la seconda scena,
    		// alternativamente bisognerebbe usare un controller nuovo e passargli
    		// modello e, se serve, lo stage...
    		loader.setController(this);
    		// Carico la scena
			BorderPane root = (BorderPane)loader.load(); 
			Scene scene = new Scene(root);
			// Mando la scena allo stage
			stage.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }

	public void setModel(Model m) {
		model = m;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
    
}