package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) {
		try {
		Parent root = FXMLLoader.load(getClass().getResource("magicSquare.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Magic Square");
		stage.setScene(scene);
		TextField t = new TextField();
		stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}