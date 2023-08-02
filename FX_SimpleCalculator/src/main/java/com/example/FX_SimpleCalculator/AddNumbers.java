package com.example.FX_SimpleCalculator;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.fxml.FXMLLoader; //NEW

public class AddNumbers extends Application{   //3
    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage primaryStage){


        //cái load buộc phải put vào try/catch
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddNumbersView.fxml"));


            Scene scene = new Scene(root);
            primaryStage.setTitle("Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println("Error loading scene fxml");
            //e.printStackTrace();          //dòng này để phát hiện lỗi nếu code k chạy
        }




    }
}
