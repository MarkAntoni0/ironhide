//Mark Tharwat & Reham Said - AAST - CS - Advanced programming application course
//this class is the main driver of the owner login screen
package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	public static int countOfOrders=0;
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Start.fxml"));
			Scene scene = new Scene(root,650,500);
			scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Pet Care Solution - Owner App Login");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Credits credits = new Credits();
		credits.viewCredit();
		launch(args);
	}
}
