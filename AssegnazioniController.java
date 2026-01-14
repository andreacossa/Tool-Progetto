package org.example.tool;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class AssegnazioniController {

    @FXML private ComboBox<String> comboProgettoTop;
    @FXML private ComboBox<String> comboMeseTop;
    @FXML private ComboBox<String> comboAnnoTop;
    @FXML private TextField txtOreTop;

    @FXML private TableView<String> tableRisorse;
    @FXML private ComboBox<String> comboRisorsa;
    @FXML private ComboBox<String> comboProgetto;
    @FXML private ComboBox<String> comboAnno;

    @FXML private ComboBox<String> comboMese;
    @FXML private ComboBox<String> comboOre;

    @FXML private Button btnValida;
    @FXML private Button btnSalva;
    @FXML private Button btnPulisci;

    @FXML private ListView<String> listDisponibilita;
    @FXML private Button btnPulisciFoglio;
    @FXML private Button btnAggiungi;
    @FXML private Button btnElimina;

    @FXML private void handleValida() { System.out.println("Valida cliccato!"); }
    @FXML private void handleSalva() { System.out.println("Salva cliccato!"); }

    @FXML private void handlePulisci() { System.out.println("Pulisci cliccato!"); }

    @FXML private void handlePulisciFoglio() { System.out.println("Pulisci Foglio cliccato!"); }

    @FXML private void handleAggiungi() { System.out.println("Aggiungi cliccato!"); }

    @FXML private void handleElimina() { System.out.println("Elimina cliccato!"); }

    @FXML public void initialize() { System.out.println("Fxml collegato!"); }



}