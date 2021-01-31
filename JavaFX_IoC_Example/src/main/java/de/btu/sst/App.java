package de.btu.sst;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {			
	public static void main(String[] args) {
		// Starte das Fenster
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		// Erstelle Button und seine Logik.	
		Button btn = new Button("Meine Logik wurde injiziert!");
		btn.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				System.out.println("Eine Log-Nachricht.");				
			}
		});
		// Button im Fenster anzeigen.
		StackPane p = new StackPane();
		p.getChildren().add(btn);
		Scene s = new Scene(p, 100, 100);				
		stage.setScene(s);
		stage.show();				
	}	
}