
package POS;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class DashboardController implements Initializable {

    @FXML
    private Button btnadd;
    @FXML
    private Button btndel;
    @FXML
    private Button btnclose;
    @FXML
    private BorderPane rootPane;

    Scene fxmlFile;
    Parent root;
    Stage window;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void Add(ActionEvent event) {
          try{
        openModalWindow("Add.fxml","Tables");
        
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void Delete(ActionEvent event) {
          try{
        openModalWindow("Delete.fxml","Tables");
        
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void Close(ActionEvent event) {
        window = (Stage) rootPane.getScene().getWindow();
       window.close();
    }

    @FXML
    private void payment(MouseEvent event) {
           try{
        openModalWindow("Payment.fxml","Tables");
        
        }catch(Exception ex){
        }
    }
    
     private void openModalWindow(String resource, String title) throws IOException{
        root = FXMLLoader.load(getClass().getResource(resource));
        fxmlFile =new Scene(root);
        window = new Stage();
        window.setScene(fxmlFile);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setAlwaysOnTop(true);
        window.setIconified(false);
        window.setResizable(false);
        window.initStyle(StageStyle.UNDECORATED);
        window.setTitle(title);
        window.showAndWait();
        
    }

    @FXML
    private void pay(MouseEvent event) {
    }
 
}
