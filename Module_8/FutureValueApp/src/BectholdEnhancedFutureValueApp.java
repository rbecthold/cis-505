/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Jenkov, J. (2020, April 29). JavaFX GridPane. http://tutorials.jenkov.com/javafx/gridpane.html

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Oracle. (2015). Class Application. https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html#start-javafx.stage.Stage-

    Watch Cool IT Help. (2020). How to setup JavaFx Environment in Visual Studio code? [Video]. Youtube. https://youtu.be/H67COH9F718
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
 

public class BectholdEnhancedFutureValueApp extends Application {

    /**
     * Creating the following private variables for the needed components:
     *      tfMonthlyPayment .......-> TextField for the Monthly Payment value
     *      tfInterestRate .........-> TextField for the Interest Rate value
     *      taResult ...............-> TextArea for the output result
     *      lblMonthlyPayment ......-> Label for the Monthly Payment TextField
     *      lblInterestRate ........-> Label for the Interest Rate TextField
     *      lblInterestRateFormat ..-> Label for the Interest Rate Format helper text
     *      lblYears ...............-> Label for the Years ComboBox
     *      lblFutureValueDate .....-> Label for the date of creation to show above the output result TextArea
     *      btnClear ...............-> Button to clear all fields
     *      btnCalculate ...........-> Button to calculate Future Value based on values in MonthlyPayment, InterestRate, and Years
     *      cbYears ................-> ComboBox to display and allow a selection for the number of years desired into the future
     */
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
    
    /**
     * Overriding javafx.application.Application start() method:
     *      Called automatically on the JavaFX Application Thread,
     *      this method defines both what will be drawn onscreen.
     */
    @Override
    public void start(Stage primaryStage) {

        // Set window title to "Becthold Enhanced Future Value App"
        primaryStage.setTitle("Becthold Enhanced Future Value App");

        // Initialize private variables with the specified component objects and attributes
        tfMonthlyPayment = new TextField();
        tfInterestRate = new TextField();
        taResult = new TextArea();
        btnClear = new Button("Clear");
        btnCalculate = new Button("Calculate");
        lblMonthlyPayment = new Label("Monthly Payment:");
        lblInterestRate = new Label("Interest Rate:");
        lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblInterestRateFormat.setTextFill(Color.RED);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        lblYears = new Label("Years:");
        lblFutureValueDate = new Label();
        cbYears = new ComboBox<Integer>();
        cbYears.setPrefWidth(165); // Needed to make the Years ComboBox show as the correct width alongside the two TextFields

        // Create new GridPane object and set specified measurements
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Create new HBox object to organize Buttons btnClear and btnCalculate
        HBox btnContainer = new HBox();
        btnContainer.setPadding(new Insets(15, 0, 15, 30));
        btnContainer.setSpacing(10);
        btnContainer.getChildren().add(btnClear);
        btnContainer.getChildren().add(btnCalculate);

        // Add initialized components to the GridPane in the specified locations
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(tfMonthlyPayment, 1, 0);
        pane.add(lblInterestRate, 0, 1);
        pane.add(tfInterestRate, 1, 1);
        pane.add(lblInterestRateFormat, 1, 2);
        pane.add(lblYears, 0, 3);
        pane.add(cbYears, 1, 3);
        pane.add(btnContainer, 1, 4);
        pane.add(lblFutureValueDate, 0, 5);
        pane.add(taResult, 0, 6, 2, 1);

        // Define the size of the Scene object created from the GridPane and draw the window onscreen
        primaryStage.setScene(new Scene(pane, 300, 300));
        primaryStage.show();

    } // End start

    public static void main(String[] args) {
        
        launch(BectholdEnhancedFutureValueApp.class, args);
    } // End main

} // End BectholdEnhancedFutureValueApp class