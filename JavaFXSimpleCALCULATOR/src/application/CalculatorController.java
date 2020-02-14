package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

	@FXML
	private TextField txtNum1;

	@FXML
	private TextField txtNum2;

	@FXML
	private Label resultLabel;

	public void calculate(ActionEvent event) {
		Button btn = (Button) event.getSource();
		double numOne = Double.parseDouble(txtNum1.getText());
		double numTwo = Double.parseDouble(txtNum2.getText());
		double result = 0;

		switch (btn.getText()) {
		case "+":
			result = numOne + numTwo;
			break;
		case "-":
			result = numOne - numTwo;
			break;
		case "x":
			result = numOne * numTwo;
			break;
		case "\u00f7":
			result = numOne / numTwo;
			break;
		case "%":
			result = numOne % numTwo;
			break;			
		}
		resultLabel.setText(String.valueOf(result));
	}

}
