/**
 * @author Devin Gulati, Emily Tronolone
 */
package application;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class OrderSummaryController implements Initializable {
	
	@FXML
    private ListView<?> orderSummary;

    @FXML
    private Button sameLine;

    @FXML
    private Button removeLine;

    @FXML
    private Button backButton;

    @FXML
    private TextArea orderTotal;

    @FXML
    private Button saveToFile;

    ArrayList<Sandwich> sandwiches = new ArrayList<Sandwich>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}