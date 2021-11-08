/*
    Baeldung. (2020, July 14). Reading a CSV File into an Array. https://www.baeldung.com/java-csv-file-array

    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeBookApp extends Application {

    /**
     * Creating the following private variables for the needed components:
     *      tfFirstName ...-> TextField for the First Name value
     *      tfLastName ....-> TextField for the Last Name value
     *      tfCourse ......-> TextField for the Course value
     *      cbGrade .......-> ComboBox for the Grade value
     *      lblFirstName ..-> Label for the tfFirstName TextField
     *      lblLastName ...-> Label for the tfLastName TextField
     *      lblCourse .....-> Label for the tfCourse TextField
     *      lblGrade ......-> Label for the tfGrade TextField
     *      btnClear ......-> Button to clear all fields
     *      btnSave .......-> Button to save new Grade Book entry
     *      btnView .......-> Button to view saved Grade Book entries
     */
    private TextField tfFirstName, tfLastName, tfCourse;
    private ComboBox<String> cbGrade;
    private Label lblFirstName, lblLastName, lblCourse, lblGrade;
    private Button btnClear, btnView, btnSave;
    private TableView<Student> tableView;

    public static void main(String[] args) throws Exception {
        launch(GradeBookApp.class, args);
    } // end main

    @Override
    public void start(Stage primaryStage) {
        // Set window title to "Becthold Grade Book App"
        primaryStage.setTitle("Becthold Grade Book App");

        // Initialize private variables with the required component objects and attributes
        tfFirstName = new TextField();
        tfLastName = new TextField();
        tfCourse = new TextField();
        cbGrade = new ComboBox<String>();
        cbGrade.getItems().setAll("A", "B", "C", "D", "F");
        lblFirstName = new Label("First Name:");
        lblLastName = new Label("Last Name:");
        lblCourse = new Label("Course Name:");
        lblGrade = new Label("Grade:");
        btnClear = new Button("Clear");
        btnClear.setStyle("-fx-background-color: #FD7A8E;");
        btnClear.setOnAction(e -> clearFormFields());
        btnSave = new Button("Save");
        btnSave.setStyle("-fx-background-color: #DAF7A6;");
        btnView = new Button("View Saved Entries");
        btnView.setStyle("-fx-background-color: #D6EAF8;");
        btnView.setOnAction(e -> {
                try {
                    viewSavedEntries();
                } catch (Exception e1) {
                    // TODO: Auto-generated catch block
                    e1.printStackTrace();
                }
            });

        // Create new GridPane object
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        //gridPane.setGridLinesVisible(true); // REMOVE WHEN COMPLETED

        // Create new HBox to organize buttons
        HBox btnContainer = new HBox();
        btnContainer.setPadding(new Insets(10, 10, 10, 10));
        btnContainer.setSpacing(10);
        btnContainer.setAlignment(Pos.CENTER);
        btnContainer.getChildren().add(btnClear);
        btnContainer.getChildren().add(btnSave);
        btnContainer.getChildren().add(btnView);

        // Create new TableView to organize output
        tableView = new TableView<>();
        TableColumn<Student, String> colFirstName = new TableColumn<>("First Name");
        TableColumn<Student, String> colLastName = new TableColumn<>("Last Name");
        TableColumn<Student, String> colCourse = new TableColumn<>("Course");
        TableColumn<Student, String> colGrade = new TableColumn<>("Grade");
        tableView.getColumns().add(colFirstName);
        tableView.getColumns().add(colLastName);
        tableView.getColumns().add(colCourse);
        tableView.getColumns().add(colGrade);

        // Add elements to GridPane
        gridPane.add(lblFirstName, 0, 0, 1, 1);
        gridPane.add(lblCourse,    2, 0, 1, 1);
        gridPane.add(lblLastName,  0, 1, 1, 1);
        gridPane.add(lblGrade,     2, 1, 1, 1);
        gridPane.add(tfFirstName,  1, 0, 1, 1);
        gridPane.add(tfCourse,     3, 0, 1, 1);
        gridPane.add(tfLastName,   1, 1, 1, 1);
        gridPane.add(cbGrade,      3, 1, 1, 1);
        gridPane.add(btnContainer, 0, 2, 4, 1);
        gridPane.add(tableView,    0, 3, 4, 1);

        Scene scene = new Scene(gridPane, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    } // end start

    /**
     *  void method clearFormFields:
     *      Resets form fields to blank values
     *      for use with the 'btnClear' component
     */
    private void clearFormFields() {
        tfFirstName.setText("");
        tfLastName.setText("");
        tfCourse.setText("");
        cbGrade.setValue("");
    }

    private void viewSavedEntries() throws Exception {
        // Read csv file contents into List<List<String>> records
        List<List<String>> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/data/grades.csv"));
        String line;

        while((line = br.readLine()) != null) {
            String[] values = line.split(",");
            students.add(Arrays.asList(values));
        }

        br.close();

        // map 'records' contents to Student objects
        for(int i=1; i<students.size(); i++) {
            Student s = new Student(students.get(i).get(0), students.get(i).get(1), students.get(i).get(2), students.get(i).get(3));
            System.out.println(s.toString());
            // TODO: Calling s.toString() here should add Students to tableView
        }
        
    } // end viewSavedEntries

    // Student inner class
    public class Student {
    
        private String firstName;
        private String lastName;
        private String course;
        private String grade;
    
        public Student(){}
        public Student(String firstName, String lastName, String course, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
            this.grade = grade;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getFirstName() {
            return firstName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getLastName() {
            return lastName;
        }
    
        public void setCourse(String course) {
            this.course = course;
        }
        public String getCourse() {
            return course;
        }
    
        public void setGrade(String grade) {
            this.grade = grade;
        }
        public String getGrade() {
            return grade;
        }
    
        @Override
        public String toString() {
            return String.format("Student{firstName=%s, lastName=%s, course=%s, grade=%s}", firstName, lastName, course, grade);
        }
    } // end Student class

} // end GradeBookApp class