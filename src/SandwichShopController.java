/**
 * 
 */
//package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SandwichShopController implements Initializable {

	private Sandwich sandwich = new Chicken();
	public Order order = new Order();
	
	@FXML
	public ComboBox<String> sandwichType;
	ObservableList<String> types = FXCollections.observableArrayList( "Chicken", "Beef", "Fish");

	@FXML
	private ListView<String> ingredientsIncluded;

	@FXML
	public ListView<String> ingredientSelections;

	@FXML
    private Button add;

    @FXML
    private Button remove;

    @FXML
    private ListView<String> extraIngredients;

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
		ingredientsIncluded.setEditable(false);
		ingredientSelections.setEditable(false);
		price.setEditable(false);
		extraIngredients.setEditable(false);
		ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
				"Spinach", "Pickles", "Provolone", "American", "Swiss", "Avocado", "Mayonnaise");
		this.sandwichTypeSelection(null);
	}

	@FXML
	private void sandwichTypeSelection(ActionEvent event) {
		switch (sandwichType.getValue()){
			case "Beef":{
				sandwich = new Beef();
				ingredientSelections.getItems().clear();
				ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
						"Spinach", "Pickles", "American", "Swiss", "Avocado", "Mayonnaise");
				ingredientsIncluded.getItems().clear();
				ingredientsIncluded.getItems().addAll("Roast Beef", "Provolone Cheese", "Mustard");
				price.setText("$" + sandwich.price());
				break;
			}
			case "Chicken":{
				sandwich = new Chicken();
				ingredientSelections.getItems().clear();
				ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
						"Spinach","Provolone", "American", "Swiss", "Avocado", "Mayonnaise");
				ingredientsIncluded.getItems().clear();
				ingredientsIncluded.getItems().addAll("Fried Chicken", "Spicy Sauce", "Pickles");
				price.setText("$" + sandwich.price());
				break;
			}
			case "Fish":{
				sandwich = new Fish();
				ingredientSelections.getItems().clear();
				ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
						"Spinach", "Pickles","Provolone", "American", "Swiss", "Avocado", "Mayonnaise");
				ingredientsIncluded.getItems().clear();
				ingredientsIncluded.getItems().addAll("Grilled Snapper", "Cilantro", "Lime");
				price.setText("$" + sandwich.price());
				break;
			}
		}
	}

	@FXML
	private void add(ActionEvent event) {
		String selected = ingredientSelections.getSelectionModel().getSelectedItem();
		if(selected == null) return;
		if(!sandwich.add(selected)) return;
		ingredientSelections.getItems().removeIf(n -> (n.equals(selected)));
		extraIngredients.getItems().add(selected);
		price.setText("$" + sandwich.price());
	}

	@FXML
	private void remove(ActionEvent event) {
		String selected = extraIngredients.getSelectionModel().getSelectedItem();
		if(selected == null) return;
		if(!sandwich.remove(selected)) return;
		extraIngredients.getItems().removeIf(n -> (n.equals(selected)));
		ingredientSelections.getItems().add(selected);
		price.setText("$" + sandwich.price());
	}

	@FXML
	private void addToOrder(ActionEvent event) {
		OrderLine orderLine = new OrderLine(sandwich);
		order.add(orderLine);
		sandwichType.setValue("Chicken");
		extraIngredients.getItems().clear();
		this.sandwichTypeSelection(null);
	}

	@FXML
	private void showOrder(ActionEvent event) throws Exception {
		//Main.swap();
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("OrderSummary.fxml"));
			Parent root = fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root, 600,600));
			stage.show();
			OrderSummaryController orderSummaryController = (OrderSummaryController) fxmlLoader.getController();
			orderSummaryController.setOrder(order);
			orderSummaryController.update();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public Order getOrder(){
		return order;
	}
}