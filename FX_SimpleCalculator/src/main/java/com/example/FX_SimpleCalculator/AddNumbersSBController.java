package com.example.FX_SimpleCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddNumbersSBController {

    @FXML //cái notation này link TextField của JavaFX với TextField của SceneBuilder
    private TextField txtFirstNumber;

    @FXML
    private TextField txtResult;

    @FXML
    private TextField txtSecondNumber;

    AddNumbersSBModel model = new AddNumbersSBModel();
    @FXML
    void addNumbers(ActionEvent event) {
        setResult(model.add(getFirstNumber(),getSecondNumber()));
    }

    @FXML
    void divideNumber(ActionEvent event) {
        setResult(model.subtract(getFirstNumber(),getSecondNumber()));

    }

    @FXML
    void multiNumber(ActionEvent event) {
        setResult(model.multi(getFirstNumber(),getSecondNumber()));
    }

    @FXML
    void subtractNumber(ActionEvent event) {
        setResult(model.divide(getFirstNumber(),getSecondNumber()));
    }

    public double getFirstNumber(){
        return Double.parseDouble(txtFirstNumber.getText());
    }

    public double getSecondNumber(){
        return Double.parseDouble(txtSecondNumber.getText());
    }

    public void setResult(double value){
        txtResult.setText(value +"");
    }
}
