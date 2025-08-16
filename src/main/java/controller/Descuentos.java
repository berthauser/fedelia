package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Descuentos {

	@FXML
	private JFXTextField txtDescuento;
	@FXML
	private JFXButton btnAceptar;
	
	public String[] dev = new String[2];

	private Stage stage;
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	public void initialize() {
		
		dev[0] = "FALSE";
		dev[1] = null; 
		
		btnAceptar.setOnAction(event -> {
			dev[0] = "TRUE";
			dev[1] = txtDescuento.getText();
			stage.close();
		});
	
	}
	
	public void setDialogStage(Stage stage) {
		this.stage = stage;
	}
	
}
