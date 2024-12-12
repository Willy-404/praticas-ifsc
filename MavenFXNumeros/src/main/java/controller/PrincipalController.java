package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class PrincipalController {

    @FXML
    private MenuBar barraMenu1;

    @FXML
    private Menu menuAjuda;

    @FXML
    private Menu menuArquivo;

    @FXML
    private Menu menuCalculadora;

    @FXML
    private MenuItem menuPesquisa;

    @FXML
    private MenuItem menuSair;

    @FXML
    private MenuItem menuSobre;

    @FXML
    private MenuItem menuSomar;

    @FXML
    void btnPesquisaClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PesquisaView.fxml"));
        Parent root = loader.load();

        Stage stagePesquisa = new Stage();

        PesquisaController pc = loader.getController();
        pc.setStage(stagePesquisa);
        
        stagePesquisa.setOnShown(evento -> {
        pc.ajustarElementosJanela();
    });

        Scene cenaPesquisa = new Scene(root);
        stagePesquisa.setTitle("Pesquisa");
        stagePesquisa.setScene(cenaPesquisa);
        stagePesquisa.show();
    }

    @FXML
    void btnSairClick(ActionEvent event) {
        if (fecharSistema()) {
            System.exit(0);
        } else {
            event.consume();
        }
    }

    @FXML
    void btnSobreClick(ActionEvent event) {
        Alert sobre = new Alert(Alert.AlertType.INFORMATION);
        sobre.setTitle("Sobre");
        sobre.setHeaderText("Informações do Sistema");
        sobre.setContentText("Sistema Aula PDS-1");
        sobre.showAndWait();
    }

    @FXML
    void btnSomarClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SomarView.fxml"));
        Parent root = loader.load();

        Stage telaSomar = new Stage();
        
        //Passar a instância do controller para a nova tela para manipular por meio do controller
        SomarController sc = loader.getController();
        sc.setStage(telaSomar);

        Scene cena = new Scene(root);

        telaSomar.setTitle("Soma de Numeros");
        telaSomar.setScene(cena);
        telaSomar.show();

    }

    public boolean fecharSistema() {
        Alert confirmar = new Alert(Alert.AlertType.CONFIRMATION);
        confirmar.setTitle("Confirmação");
        confirmar.setHeaderText("Tem Certeza que Deseja Sair?");
        confirmar.setContentText("Todas as alterações não salvas serão perdidas");
        return confirmar.showAndWait().filter(response -> response == ButtonType.OK).isPresent();
    }
}
