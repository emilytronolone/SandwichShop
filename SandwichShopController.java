/**
 * 
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class SandwichShopController implements Initializable {
	
	@FXML
	public ComboBox<String> sandwichType;
	ObservableList<String> types = FXCollections.observableArrayList("Chicken", "Beef", "Fish");

	@FXML
	private ListView<String> ingredientsIncluded;

	@FXML
	public ListView<String> ingredientSelections;

	@FXML
    private Button add;

    @FXML
    private Button remove;

    @FXML
    private ListView<?> extraIngredients;

    @FXML
    private TextArea price;

    @FXML
    private Button addToOrder;

    @FXML
    private Button showOrder;

    @FXML
    private TextArea output;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sandwichType.setItems(types);
		sandwichType.setValue("Chicken");
		ingredientSelections.getItems().add("Lettuce");
		ingredientSelections.getItems().add("Tomato");
		ingredientSelections.getItems().add("Bacon");
		ingredientSelections.getItems().add("Onion");
		ingredientSelections.getItems().add("Mushrooms");
		ingredientSelections.getItems().add("Spinach");
		ingredientSelections.getItems().add("Pickles");
		ingredientSelections.getItems().add("Provolone");
		ingredientSelections.getItems().add("American");
		ingredientSelections.getItems().add("Swiss");
	}
}