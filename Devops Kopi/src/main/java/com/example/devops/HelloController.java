package com.example.devops;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    int regneart = 0;
    int resultat = 0;
    @FXML
    Button tryk;
    @FXML
    TextField text;
    @FXML
    Button clearknap;
    @FXML
    Button knap2;
    @FXML
    Button knap3;
    @FXML
    Button knap4;
    @FXML
    Button knap5;
    @FXML
    Button knap6;
    @FXML
    Button knap7;
    @FXML
    Button knap8;
    @FXML
    Button knap9;
    @FXML
    Button knap0;
    @FXML
    Button knapplus;
    @FXML
    Button knapminus;
    @FXML
    Button knapdividere;
    @FXML
    Button knapgange;
    @FXML
    Button knaplucky;
    @FXML
    Button knappi;
    @FXML
    Button knapslut;

    public HelloController() {
    }

    @FXML
    public void handler(Event e) {
        String t = this.tryk.getText();
        TextField var10000 = this.text;
        String var10001 = this.text.getText();
        var10000.setText(var10001 + t);
    }

    public void handleClear(Event e) {
        this.text.setText("");
        this.resultat = 0;
        this.regneart = 0;
    }

    public void handler2(Event e) {
        String t = this.knap2.getText();
        this.text.setText(this.text.getText() + "2");
    }

    public void handler3(Event e) {
        String t = this.knap3.getText();
        this.text.setText(this.text.getText() + "3");
    }

    public void handler4(Event e) {
        String t = this.knap4.getText();
        this.text.setText(this.text.getText() + "4");
    }

    public void handler5(Event e) {
        String t = this.knap5.getText();
        this.text.setText(this.text.getText() + "5");
    }

    public void handler6(Event e) {
        String t = this.knap6.getText();
        this.text.setText(this.text.getText() + "6");
    }

    public void handler7(Event e) {
        String t = this.knap7.getText();
        this.text.setText(this.text.getText() + "7");
    }

    public void handler8(Event e) {
        String t = this.knap8.getText();
        this.text.setText(this.text.getText() + "8");
    }

    public void handler9(Event e) {
        String t = this.knap9.getText();
        this.text.setText(this.text.getText() + "9");
    }

    public void handler0(Event e) {
        String t = this.knap0.getText();
        this.text.setText(this.text.getText() + "0");
    }

    public void handlerplus(Event e) {
        String input1 = this.text.getText();
        this.resultat = (int)this.beregnResultat(Float.parseFloat(input1), this.regneart, (float)this.resultat);
        this.text.setText("");
        this.regneart = 1;
    }

    public void handlerminus(Event e) {
        String input1 = this.text.getText();
        this.resultat = (int)this.beregnResultat(Float.parseFloat(input1), this.regneart, (float)this.resultat);
        this.text.setText("");
        this.regneart = 2;
    }

    public void handlerdividere(Event e) {
        String input1 = this.text.getText();
        this.resultat = (int)this.beregnResultat(Float.parseFloat(input1), this.regneart, (float)this.resultat);
        this.text.setText("");
        this.regneart = 3;
    }

    public void handlergange(Event e) {
        String input1 = this.text.getText();
        this.resultat = (int)this.beregnResultat(Float.parseFloat(input1), this.regneart, (float)this.resultat);
        this.text.setText("");
        this.regneart = 4;
    }

    public void handlerlucky(Event e) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=Yz6hTuK9yBo"));
            }
        } catch (Exception var3) {
            System.out.println(var3);
        }

    }

    public void handlerpi(Event e) {
        String input1 = this.text.getText();
        this.resultat = (int)this.beregnResultat(Float.parseFloat(input1), this.regneart, (float)this.resultat);
        this.regneart = 6;
    }

    public void handlerslut(Event e) {
        String input1 = this.text.getText();
        this.resultat = (int)this.beregnResultat(Float.parseFloat(input1), this.regneart, (float)this.resultat);
        this.regneart = 5;
        String faceit = Float.toString((float)this.resultat);
        this.text.setText(faceit);
    }

    private float beregnResultat(float input, int regneart, float resultat) {
        switch (regneart) {
            case 0:
                resultat = input;
                break;
            case 1:
                resultat += input;
                break;
            case 2:
                resultat -= input;
                break;
            case 3:
                resultat /= input;
                break;
            case 4:
                resultat *= input;
                break;
            case 5:
            default:
                resultat = resultat;
                break;
            case 6:
                resultat = (float)((double)resultat * Math.PI);
        }

        return resultat;
    }
}