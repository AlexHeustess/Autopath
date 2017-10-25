package alex.heustess.viewer;


import alex.heustess.Grid;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    public Text outputText;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Grid mygrid = new Grid();
        outputText.setText(mygrid.toString());
    }

}
