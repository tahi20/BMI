package org.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField weightText;
    @FXML
    private TextField heightText;
    @FXML
    private Label resultLabel;

    Calculate calc = new Calculate();
    @FXML
    private void onCalcBMI(){
        String weight = weightText.getText();
        weightText.setText("");
        calc.setWeight( Integer.parseInt(weight) );
        String height = heightText.getText();
        calc.setHeight( Integer.parseInt(height) );
        calc.calculateBMI();
        resultLabel.setText("Ваш BMI: " + calc.getResult() );

    }

}
