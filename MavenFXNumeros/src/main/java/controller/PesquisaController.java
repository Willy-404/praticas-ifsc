    package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PesquisaController {
    
    private Stage stagePesquisa;
    RadioButton botaoLinguagensSelecionado;
    ToggleGroup tgLinguagens = new ToggleGroup();
    ToggleButton botaoSOSelecionado;
    ToggleGroup tgSO = new ToggleGroup();
    
    @FXML
    private Button btnFechar;
    
    @FXML
    private Button btnSubmeter;

    @FXML
    private CheckBox chkbxGostaDeProgramação;

    @FXML
    private CheckBox chkbxProgramaTodoDia;

    @FXML
    private Label lblLinguagemProg;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblPesquisa;

    @FXML
    private Label lblSOU;

    @FXML
    private RadioButton rdbtnC;

    @FXML
    private RadioButton rdbtnJava;

    @FXML
    private RadioButton rdbtnPython;

    @FXML
    private ToggleButton tglButtonLinux;

    @FXML
    private ToggleButton tglButtonMac;

    @FXML
    private ToggleButton tglButtonWindows;

    @FXML
    private TextField txtFieldNome;
    
    @FXML
    private ComboBox<String> comboIDE;
    
    @FXML
    private Label ferramentaIDE;

    @FXML
    void onClickBtnSubmeterPesquisa(ActionEvent event) {
        System.out.println("\n\n");
        if(!txtFieldNome.getText().isEmpty()){
        System.out.println("Nome: "+txtFieldNome.getText());
        }
        
        botaoSOSelecionado = (ToggleButton)tgSO.getSelectedToggle();
        System.out.print("Sistema Operacional Selecionado: ");
        if (botaoSOSelecionado!=null){
            System.out.println(botaoSOSelecionado.getText());
        }   else{
            System.out.println("Não Selecionado");
        }
        
        botaoLinguagensSelecionado = /*Converte o tgLinguagens*/(RadioButton)tgLinguagens.getSelectedToggle();
        System.out.print("Linguagem de Programação Preferida: ");
        if(botaoLinguagensSelecionado != null){
            System.out.println(botaoLinguagensSelecionado.getText());
        } else{
            System.out.println("Não Selecionado");
        }
        
        String ferramentaIDE = comboIDE.getValue();
        System.out.println("\nFerramenta IDE:"+ferramentaIDE);
        
        System.out.print("Programa todo dia? ");
        //isSelected() é operador terminal e pode ser usado no lugar do IF
        System.out.println(chkbxProgramaTodoDia.isSelected() == true ? "Sim" : "Não");
        System.out.print("Gosta de Programar? ");
        System.out.println(chkbxGostaDeProgramação.isSelected() == true ? "Sim" : "Não");
        
        //fazendo de outra forma
        String mensagem = "";
        mensagem += "Nome: "+txtFieldNome.getText();
        mensagem += "\nSistem Operacional: "+botaoSOSelecionado.getText();
        mensagem += "\nLinguagem de Programação Preferida: "+botaoLinguagensSelecionado.getText();
        mensagem += "\nFerramenta IDE: "+ferramentaIDE;
        mensagem += "\nPrograma todo dia? "+(chkbxProgramaTodoDia.isSelected() == true ? "Sim" : "Não");
        mensagem += "\nGosta de Programar? "+(chkbxGostaDeProgramação.isSelected() == true ? "Sim" : "Não");
        
        mostrarMensagem(mensagem);
    }
    
    @FXML
    void onClickBtnFechar(ActionEvent event){
        if (stagePesquisa != null) {
            stagePesquisa.close();
        }
    }
    void setStage (Stage stage){
        this.stagePesquisa = stage;
    }
    
    void ajustarElementosJanela (){
        System.out.println("Chamou a janela");
        tgLinguagens.getToggles().addAll(rdbtnJava, rdbtnPython, rdbtnC);
        tglButtonLinux.setToggleGroup(tgSO);
        tglButtonMac.setToggleGroup(tgSO);
        tglButtonWindows.setToggleGroup(tgSO);
        
        comboIDE.getItems().addAll("Netbeans","Eclipse","IntelliJ");
        comboIDE.setValue("Não Selecionado");
    }

    private void mostrarMensagem(String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Mostrar Dados");
        alerta.setHeaderText("Formulário da Pesquisa");
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}
