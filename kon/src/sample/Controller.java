package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class Controller {
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private TextField TextField1;
    @FXML
    private TextField TextField2;
    @FXML
    private Button button1;

    String user = "vagid";
    String pw = "fedorov";
    String checkUser, checkPw;

    @FXML
    private void click1(ActionEvent eventOne){
            checkUser = TextField2.getText().toString();
            checkPw = TextField1.getText().toString();
            if(checkUser.equals(user) && checkPw.equals(pw)){
                label1.setText("Hello Admin!");
            }
            else{
                label1.setText("Ошибка авторизации!");
            }
            TextField1.setText("");
            TextField2.setText("");
        }
    };



