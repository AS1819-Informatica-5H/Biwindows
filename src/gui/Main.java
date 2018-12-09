package gui;
	
import javafx.application.Application;
import javafx.stage.Stage;
import modello.Model;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("winUno.fxml"));
			BorderPane root = (BorderPane)fxmlLoader.load();
			// Ottiene il riferimento del controller
			Controller wUc=fxmlLoader.getController();
			// Passa lo stage al controller
			wUc.setStage(primaryStage);
			// Crea il modello 
			Model modello=new Model();
			// Passa il modello al controller
			wUc.setModel(modello);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
