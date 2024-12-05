package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SomarController implements Initializable {

    private Stage stageSomar;

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnTela2;

    @FXML
    private Button btnSomar;

    @FXML
    private GridPane gridPane1;

    @FXML
    private GridPane gridPane2;

    @FXML
    private Label lblFinal;

    @FXML
    private Label lblNumero1;

    @FXML
    private Label lblNumero2;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    void onClickBtnFechar(ActionEvent event) {
        if (stageSomar != null) {
            stageSomar.close();
        }
        //System.exit(0);
    }

    //metodo atribui stage ao controller atual
    public void setStage(Stage stage) {
        this.stageSomar = stage;
    }

    @FXML
    void onClickBtnLimpar(ActionEvent event) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        lblFinal.setText("0");
        txtNumero1.requestFocus();
    }

    @FXML
    void onClickBtnSomar(ActionEvent event) {
        try {
            Double numero1 = Double.valueOf(txtNumero1.getText());
            Double numero2 = Double.valueOf(txtNumero2.getText());
            Double soma = numero1 + numero2;
            lblFinal.setText(soma.toString());
        } catch (NumberFormatException n) {
            System.out.println("Número Inválido");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
