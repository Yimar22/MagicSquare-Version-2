package ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import model.MagicSquare;
import javafx.scene.control.TextField;

public class MagicSquareController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ScrollPane scrollPane;

	@FXML
	private ComboBox<String> cbbox;

	@FXML
	private ComboBox<String> cbbox1;

	@FXML
	private TextField order;



	/*@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> sides = FXCollections.observableArrayList("Up", "Left", "Down", "Right");
		ObservableList<String> address = FXCollections.observableArrayList("NE", "NO", "SE", "SO");
		cbbox.setItems(sides);
		cbbox1.setItems(address);

		String cadena = String.valueOf(sides.getValue());
		address=""+address;

	}*/

	@FXML
	void initialize() {


		assert scrollPane != null : "fx:id=\"scrollPane\" was not injected: check your FXML file 'magicSquare.fxml'.";
		assert cbbox != null : "fx:id=\"cbbox\" was not injected: check your FXML file 'magicSquare.fxml'.";
		assert cbbox1 != null : "fx:id=\"cbbox1\" was not injected: check your FXML file 'magicSquare.fxml'.";
		assert order != null : "fx:id=\"order\" was not injected: check your FXML file 'magicSquare.fxml'.";

		cbbox.getItems().add("Up");
		cbbox.getItems().add("Left");
		cbbox.getItems().add("Down");
		cbbox.getItems().add("Right");
		cbbox1.getItems().add("NE");
		cbbox1.getItems().add("NO");
		cbbox1.getItems().add("SE");
		cbbox1.getItems().add("SO");


	}

	@FXML
	
	void checkButtom(ActionEvent event) {
		String sides=cbbox.getValue();
		String address=cbbox1.getValue();
		int size = Integer.parseInt(order.getText());
		MagicSquare ms = new MagicSquare(3,"UP","NW");
		ms.generate();
		GridPane gp = new GridPane();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				gp.add(new Label(ms.showArray()), j, i);
			}
		}
		
		scrollPane.autosize();
		scrollPane.setContent(gp);
		
		
	}



}
