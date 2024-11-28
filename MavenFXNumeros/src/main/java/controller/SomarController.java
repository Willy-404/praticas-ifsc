package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SomarController {

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
        System.exit(0);
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

    @FXML
    void onClickBtnTela2(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PesquisaView.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();

        PesquisaController t2c = loader.getController();
        //Sc.setStage(stage);

        Scene cena2 = new Scene(root);
        stage.setTitle("Pesquisa");
        stage.setScene(cena2);
        stage.show();
    }
}
