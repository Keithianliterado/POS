
package POS;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DeleteController implements Initializable {

 @FXML
    private Button btnclose;
    
    Scene fxmlFile;
    Parent root;
    Stage window;
    @FXML
    private AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void Close(ActionEvent event) {
        
         window = (Stage) rootPane.getScene().getWindow();
       window.close();
    }
    }
