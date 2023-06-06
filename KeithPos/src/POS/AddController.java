
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AddController implements Initializable {

 @FXML
    private Button btnclose;
    
    Scene fxmlFile;
    Parent root;
    Stage window;

    
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button btncategory;
    @FXML
    private Button btnprod;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void Close(ActionEvent event) {
        
         window = (Stage) rootPane.getScene().getWindow();
       window.close();
    }

    @FXML
    private void Category(ActionEvent event) {
          try{
        openModalWindow("Category.fxml","Tables");
        
        }catch(Exception ex){
        
        
        }
    }

    @FXML
    private void Products(ActionEvent event) {
        
         try{
        openModalWindow("Product.fxml","Tables");
        
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
}