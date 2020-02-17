package com.elysian.transport.ui;

import com.elysian.transport.logic.Broker;
import com.elysian.transport.logic.DefaultCalculator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private Circle exitBtn;

    @FXML
    private TextField palletTextField;

    @FXML
    private ComboBox<String> prioBox;
    private ObservableList<String> priorityOptions = FXCollections.observableArrayList("Foarte urgent",
                                                                                        "Urgent",
                                                                                        "Normal",
                                                                                        "Ieftin");

    @FXML
    private Button findBtn;

    @FXML
    private Label outputLabel;

    Broker broker = new Broker();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prioBox.setItems(priorityOptions);
    }

    @FXML
    void onCircleClick(MouseEvent event){
        if(event.getSource() == exitBtn)
            System.exit(0);
    }

    @FXML
    void findResult(){
            if(palletTextField.getText() == null || prioBox.getValue() == null || palletTextField.getText().equals("")){
                outputLabel.setText("Completeaza toate campurile!");
            }else{
                broker.setCostCalculator(new DefaultCalculator());

                int noOfPallets = Integer.parseInt(palletTextField.getText());
                int prio = 4;
                switch(prioBox.getValue())
                {
                    case "Foarte urgent":
                        prio = 0;
                        break;
                    case "Urgent":
                        prio = 1;
                        break;
                    case "Normal":
                        prio = 2;
                        break;
                    case "Ieftin":
                        prio = 3;
                        break;
                    default:
                        break;
                }
                outputLabel.setText(broker.getMinimumCost(noOfPallets, prio));

            }
    }

    @FXML
    void findByKey(KeyEvent event){
        if(event.getCode().equals(KeyCode.ENTER)) findResult();
    }

}
