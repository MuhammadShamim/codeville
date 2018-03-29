/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeville.ui.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author star
 */
public class UIUtils {
    private static final String BRAND_ICON_IMAGE_LOC = "codeville/resources/app-icon.png";
    private static final String BRAND_NAME = "Codeville";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");

    public static void setStage(Stage stage, Scene scene, StageStyle style, boolean fullScreen) throws IOException {
        stage.setScene(scene);
        stage.initStyle(style);        
        stage.getIcons().add(new Image(BRAND_ICON_IMAGE_LOC));
        stage.setTitle(BRAND_NAME);
        if ( fullScreen ) {
            stage.setMaximized(true);
        }        
        stage.show();
    }
}