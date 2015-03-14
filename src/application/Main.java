package application;
	
import java.awt.Color;

import javax.swing.text.TextAction;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Marcus_fx");
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setPadding(new Insets(25, 25, 25, 25));
		gridpane.setHgap(10);
		gridpane.setVgap(5);
		
		Scene scene = new Scene(gridpane, 300,275);
		primaryStage.setScene(scene);		
		
		Text textMess = new Text("Welcome to login section!");		
		textMess.setFont(Font.font("Times new roman ", FontWeight.BOLD, 20));
		gridpane.add(textMess, 0, 0, 2, 1);
		
		Label labelName = new Label();
		labelName.setText("User name: ");		
		TextField tfName = new TextField();
		gridpane.add(labelName, 0, 1, 1, 1);
		gridpane.add(tfName, 1, 1, 1, 1);
		
		Label labPwd = new Label("Password: ");
		PasswordField pwdF = new PasswordField();
		gridpane.add(labPwd, 0, 2);
		gridpane.add(pwdF, 1, 2);
		
		Button buttonSignIn = new Button("Sign in");
		
		HBox hbSignIn = new HBox(10);
		hbSignIn.setAlignment(Pos.BOTTOM_RIGHT);
		hbSignIn.getChildren().add(buttonSignIn);
		gridpane.add(hbSignIn, 1, 4);
		
		Text textAction = new Text();
		gridpane.add(textAction, 1, 6);
		
		EventHandler<ActionEvent> myEventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				textAction.setFill(javafx.scene.paint.Color.GREEN);
				textAction.setText("Signed in!");				
			}
		}; 
		
		buttonSignIn.setOnAction(myEventHandler);
		gridpane.setGridLinesVisible(true);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

