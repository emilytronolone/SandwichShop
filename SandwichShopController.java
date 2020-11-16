/**
 * 
 */
package application;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SandwichShopController implements Initializable {

	private Sandwich sandwich = new Chicken();
	private ArrayList<Sandwich> sandwiches = new ArrayList<Sandwich>();
	
	@FXML
	public ComboBox<String> sandwichType;
	ObservableList<String> types = FXCollections.observableArrayList( "Chicken", "Beef", "Fish");

	@FXML
	private ListView<String> ingredientsIncluded;
	
	@FXML
    public ImageView sandwichImage;

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
				"Spinach", "American", "Swiss", "Avocado", "Mayonnaise");
		Image chickenImage = new Image("https://res.cloudinary.com/mealthy1/image/upload/ar_16:11,c_fill,f_auto,h_600,q_auto:best,w_800/v1539970541/cms_recipe_featured_image/oizv8eotmeopybgnjt3w.jpg");
		sandwichImage.setImage(chickenImage);
		this.sandwichTypeSelection(null);
	}

	@FXML
	private void sandwichTypeSelection(ActionEvent event) {
		switch (sandwichType.getValue()){
			case "Beef":{
				sandwich = new Beef();
				ingredientSelections.getItems().clear();
				ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
						"Spinach", "American", "Swiss", "Avocado", "Mayonnaise");
				ingredientsIncluded.getItems().clear();
				ingredientsIncluded.getItems().addAll("Roast Beef", "Provolone Cheese", "Mustard");
				price.setText("$" + sandwich.price());
				Image beefImage = new Image("http://ahintofwine.com/wp-content/uploads/2014/03/DSC_06721-1024x682.jpg");
				sandwichImage.setImage(beefImage);
				break;
			}
			case "Chicken":{
				sandwich = new Chicken();
				ingredientSelections.getItems().clear();
				ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
						"Spinach", "American", "Swiss", "Avocado", "Mayonnaise");
				ingredientsIncluded.getItems().clear();
				ingredientsIncluded.getItems().addAll("Fried Chicken", "Spicy Sauce", "Pickles");
				price.setText("$" + sandwich.price());
				Image chickenImage = new Image("https://res.cloudinary.com/mealthy1/image/upload/ar_16:11,c_fill,f_auto,h_600,q_auto:best,w_800/v1539970541/cms_recipe_featured_image/oizv8eotmeopybgnjt3w.jpg");
				sandwichImage.setImage(chickenImage);
				break;
			}
			case "Fish":{
				sandwich = new Fish();
				ingredientSelections.getItems().clear();
				ingredientSelections.getItems().addAll("Lettuce", "Tomato", "Bacon", "Onion", "Mushrooms",
						"Spinach", "American", "Swiss", "Avocado", "Mayonnaise");
				ingredientsIncluded.getItems().clear();
				ingredientsIncluded.getItems().addAll("Grilled Snapper", "Cilantro", "Lime");
				price.setText("$" + sandwich.price());
				Image fishImage = new Image("https://www.rachaelraymag.com/.image/t_share/MTYyNzM5NjE4NTA3MTM4OTE0/mexican-red-snapper-sandwiches-0365453d.jpg");
				sandwichImage.setImage(fishImage);
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
		sandwiches.add(sandwich);
		sandwichType.setValue("Chicken");
		this.sandwichTypeSelection(null);
	}

	@FXML
	private void showOrder(ActionEvent event) throws Exception {
		Main.swap();
	}
}