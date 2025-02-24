package one.jpro.hellojpro;

import com.jpro.webapi.JProApplication;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Hello JPro application.
 *
 * @author Florian Kirmaier
 */

public class HelloJPro extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello JPro!");
        label.setFont(new Font(50));
        label.setAlignment(Pos.CENTER);
        stage.setScene(new Scene(label));
        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
        this.getWebAPI().getWebServer().start(port);

        stage.setTitle("Hello JPro on Render!");
        stage.show();
    }

    /**
     * Application entry point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
