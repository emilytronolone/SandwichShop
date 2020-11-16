/**
 * @author Devin Gulati, Emily Tronolone
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

//package application;

public class OrderSummaryController implements Initializable {

    public Button backButton;
    @FXML
    private TextArea output;
    @FXML
    private ListView orderList;
    Order order = new Order();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void update(){
        orderList.getItems().clear();
        Double price = 0d;
        for(OrderLine o: order.orderlines){
            orderList.getItems().add(o.toString() + "\tSerial Number : " + o.lineNumber);
            price += o.price;
        }
        price = (price * 100d) / 100d;
        output.setText("$" + price);
    }

    public void back(ActionEvent event) throws Exception{
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("SandwichShop.fxml"));
            Parent root = fxmlLoader.load();
            OrderSummaryController orderSummaryController = (OrderSummaryController) fxmlLoader.getController();
            orderSummaryController.order = order;
        }catch (Exception e) {
        }
        ((Stage) backButton.getScene().getWindow()).close();
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    @FXML
    private void remove(ActionEvent event) {
        try {
            int selected = (int) orderList.getSelectionModel().getSelectedIndices().get(0);
            order.orderlines.remove(selected);
            for (int i = 0; i < order.orderlines.size(); i++) {
                order.orderlines.get(i).lineNumber = i;
            }
            this.update();
        }catch (Exception e){
        }
    }

    @FXML
    private void duplicate(ActionEvent event) {
        try {
            int selected = (int) orderList.getSelectionModel().getSelectedIndices().get(0);
            System.out.println(selected);
            OrderLine duplicate = new OrderLine(order.orderlines.get(selected).sandwich);
            duplicate.lineNumber = order.orderlines.size() + 1;
            order.add(duplicate);
            this.update();
        }catch (Exception e){
        }
    }

    @FXML
    private void clear(ActionEvent event) {
        order = new Order();
        this.update();
    }

    @FXML
    private void toFile(ActionEvent event) {
        try {
            FileWriter myWriter = new FileWriter("order.txt");
            for(OrderLine o: order.orderlines){
                myWriter.write(o.toString() + "\tSerial Number : " + o.lineNumber +"\n");
            }
            myWriter.close();
        } catch (Exception e) {
        }
    }
}

