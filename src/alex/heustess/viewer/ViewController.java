package alex.heustess.viewer;


import alex.heustess.Grid;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    public Text outputText;
    Grid mygrid = new Grid();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        outputText.setText(mygrid.toString());
    }

    public void onclick(ActionEvent actionEvent) {
        mygrid.updateGrid();
        outputText.setText(mygrid.toString());
    }
}
