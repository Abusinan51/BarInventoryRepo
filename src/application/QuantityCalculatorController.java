package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class QuantityCalculatorController {

    @FXML
    private TextField bottle_150ml;

    @FXML
    private TextField bottle_1000ml;

    @FXML
    private TextField bottle_100ml;

    @FXML
    private TextField bottle_500ml;

    @FXML
    private Label total_used;
    
    @FXML
    void calculate_quantity(ActionEvent event) {
    	int quantity_1 = 100;
    	int quantity_2 = 150;
    	int quantity_3 = 500;
    	int quantity_4 = 1000;
    	
    	int total_quantity = 0;
    	
    	String bottle_quantity1 = bottle_100ml.getText();
    	total_quantity = (int) Double.parseDouble(bottle_quantity1) * quantity_1;
    	
    	String bottle_quantity2 = bottle_150ml.getText();
    	total_quantity += (int) Double.parseDouble(bottle_quantity2) * quantity_2;
    	
    	String bottle_quantity3 = bottle_500ml.getText();
    	total_quantity += (int) Double.parseDouble(bottle_quantity3) * quantity_3;
    	
    	String bottle_quantity4 = bottle_1000ml.getText();
    	total_quantity += (int) Double.parseDouble(bottle_quantity4) * quantity_4;
    	
    	total_used.setText("Total in ml " + total_quantity);
    }

}
