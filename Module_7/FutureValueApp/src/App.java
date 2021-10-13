import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.paint.Color;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private TextField tfMonthlyPayment;
    private TextField tfInterestRate;
    private TextArea taResult;
    private Label lblMonthlyPayment;
    private Label lblInterestRate;
    private Label lblInterestRateFormat;
    private Label lblYears;
    private Label lblFutureValueDate;
    private Button btnClear;
    private Button btnCalculate;
    private ComboBox<Integer> cbYears;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Becthold Future Value App");

        tfMonthlyPayment = new TextField();
        tfInterestRate = new TextField();
        taResult = new TextArea();

        btnClear = new Button("Clear");
        btnCalculate = new Button("Calculate");

        lblMonthlyPayment = new Label("Monthly Payment:");
        lblInterestRate = new Label("Interest Rate:");
        lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblYears = new Label("Years:");
        lblFutureValueDate = new Label("testing");

        cbYears = new ComboBox<Integer>();

        
        tfInterestRate.setPrefWidth(165);
        tfMonthlyPayment.setPrefWidth(165);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(tfMonthlyPayment, 1, 0);
        pane.add(lblInterestRate, 0, 1);
        pane.add(tfInterestRate, 1, 1);

        lblInterestRateFormat.setTextFill(Color.RED);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        pane.add(lblInterestRateFormat, 1, 2);

        pane.add(lblYears, 0, 3);
        cbYears.setPrefWidth(165);
        pane.add(cbYears, 1, 3);

        HBox btnContainer = new HBox();
        btnContainer.setPadding(new Insets(15, 0, 15, 30));
        btnContainer.setSpacing(10);
        btnContainer.getChildren().add(btnClear);
        btnContainer.getChildren().add(btnCalculate);
        pane.add(btnContainer, 1, 4);

        pane.add(lblFutureValueDate, 0, 5);
        pane.add(taResult, 0, 6, 2, 1);

        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();
    }
}