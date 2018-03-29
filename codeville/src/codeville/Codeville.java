/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeville;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import codeville.ui.utils.UIUtils;

/**
 *
 * @author star
 */
public class Codeville extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/codeville/ui/welcome/welcome.fxml"));        
        UIUtils.setStage(stage, new Scene(root), StageStyle.UNDECORATED, false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(
            " _     _               _ _ _       _     \n" +
            "| |   (_)             (_) | |     | |    \n" +
            "| |__  _ ___ _ __ ___  _| | | __ _| |__  \n" +
            "| '_ \\| / __| '_ ` _ \\| | | |/ _` | '_ \\ \n" +
            "| |_) | \\__ \\ | | | | | | | | (_| | | | |\n" +
            "|_.__/|_|___/_| |_| |_|_|_|_|\\__,_|_| |_|"
        );

        launch(args);
    }
}
