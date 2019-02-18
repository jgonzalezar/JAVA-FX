package intro.a.java.fx;



import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class INTROAJAVAFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK = new Button("Botonsillo");
        Button btOK1 = new Button("Botonete");
        HBox hbox = new HBox();
        HBox hbox2 = new HBox();
        
        //GRID PANE
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        
        //GRID PANE EJEMPLO 2
        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);//PORCENTAJE DE ESPACIO QUE OCUPA
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);
        gridpane.getColumnConstraints().addAll(col1,col2,col2,col1);
        Label text = new Label("Enter Address");
        gridpane.add(text, 0, 0, 4, 1); // (Columna 0, Fila 0) and colspan 4 DONDE VA SITUADO EL LABEL
        GridPane.setHalignment(text, HPos.CENTER); //VA CENTRADO
        
        Label direccion = new Label("Direccion");
        gridpane.add(direccion, 0, 1, 1, 1); // (Columna 0, Fila 1) and colspan 1
        GridPane.setHalignment(direccion, HPos.RIGHT);
        TextField txtDireccion = new TextField();
        gridpane.add(txtDireccion, 1, 1, 4, 1); // (Columna 0, Fila 1) and colspan 1
        Label direccion2 = new Label("Direccion");
        TextField txtDireccion2 = new TextField();
        gridpane.add(direccion2, 0, 2, 1, 2); // (Columna 0, Fila 1) and colspan 1
        gridpane.add(txtDireccion2, 1, 2, 4, 2); // (Columna 0, Fila 1) and colspan 1
        
        
        //TABLA
        TableView table = new TableView();
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        
        Label label2 = new Label("Search");
        FileInputStream input = new FileInputStream("piggy-bank.png");
        Image image = new Image(input);
        Label label1 = new Label("Save",new ImageView(image));
        //metodo más facil para agregar en hbox
        hbox.getChildren().add(btOK);
        hbox.getChildren().add(btOK1);
        hbox2.getChildren().add(label1);
        hbox2.getChildren().add(table);
        hbox2.getChildren().add(gridpane);
        
        VBox vbox = new VBox(hbox, hbox2);
        //vbox.getChildren().add(gridpane);
        
        Scene scene = new Scene(vbox, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show(); }
    
        public static void main(String[] args) {
        Application.launch(args);
        //primaryStage.show();
        }
    
}
