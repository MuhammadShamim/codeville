/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeville.ui.welcome;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import codeville.ui.utils.UIUtils;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author star
 */
public class WelcomeController implements Initializable {

    @FXML
    private Button btnMain;
    @FXML
    private Color x41;
    @FXML
    private Font x31;
    @FXML
    private Color x413;
    @FXML
    private Font x313;
    @FXML
    private Color x4131;
    @FXML
    private Font x3131;
    @FXML
    private Color x41311;
    @FXML
    private Font x31311;
    @FXML
    private Color x411;
    @FXML
    private Font x311;
    @FXML
    private Color x4;
    @FXML
    private Font x3;
    @FXML
    private Color x412;
    @FXML
    private Font x312;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnMainHandler(ActionEvent event) {
        closeStage();
        loadMain();
    }
    
    private void closeStage() {
        ((Stage) btnMain.getScene().getWindow()).close();
    }
    
    void loadMain() {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/codeville/ui/main/main.fxml"));
            UIUtils.setStage(stage, new Scene(root), StageStyle.DECORATED, true);
        } catch (IOException ex) {
            Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
