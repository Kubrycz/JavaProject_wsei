package sample;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.lang.Math.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class Controller {

    public Button btnMain;
    int clickCounter = 0;
    boolean isStalowa = false;
    boolean isNierdzewna = false;

    public TextField txtLicznikPromien;
    public TextField txtLicznikWysokosc;
    public TextField txtLicznikGrubosc;
    public RadioButton rdbBlachaStalowa;
    public RadioButton rdbBlachaNierdz;
    public TextField txtMasa;
    public TextField txtCena;

    static double stalowaPricePerKg = 4.5;
    static double stalowaKgPerOneDM = 7.75;
    static double nierdzewnaPricePerKg = 4.7;
    static double nierdzewnaKgPerOneDM = 7.9;

    static DecimalFormat format = new DecimalFormat("#.##");

    public void onBtnAction(ActionEvent actionEvent)
    {
        System.out.println("Proszę wpisać promień i wysokość walca, oraz grubość blachy aby oblicztć ciężar i koszt materiału" +
        "potrzebnego go wykonania walca (pustego w środku");
        double price = 0;
        double mass = 0;
        double r = 0;
        double h = 0;
        double g = 0;
        try
        {
            r = Double.parseDouble(txtLicznikPromien.getText());
            h = Double.parseDouble(txtLicznikWysokosc.getText());
            g = Double.parseDouble(txtLicznikGrubosc.getText());
        }
        catch(Exception ex)
        {
            return;
        }

        if(isNierdzewna)
        {
            mass = CalculateMassFromVolume(CalculatePipeVolume(r,h,g), nierdzewnaKgPerOneDM);
            price = CalculatePriceFromMass(mass, nierdzewnaPricePerKg);
        }
        else
            {
                mass = CalculateMassFromVolume(CalculatePipeVolume(r,h,g), stalowaKgPerOneDM);
                price = CalculatePriceFromMass(mass , stalowaPricePerKg);
            }
        txtCena.setText(format.format(price));
        txtMasa.setText(format.format(mass));
    }

    private double CalculatePipeVolume(double r, double h, double g)
    {
        return (2*Math.PI*(Math.pow(r,2))+(2*Math.PI*r*h))*g;
    }

    private double CalculateMassFromVolume(double volume, double multiplier)
    {
        return volume/1000*multiplier;
    }

    private double CalculatePriceFromMass(double mass, double multiplier)
    {
        return mass*multiplier;
    }

    public void onRDBNierdz(ActionEvent actionEvent)
    {
        isNierdzewna = true;
        isStalowa = false;

    }
    public void onRDBStal(ActionEvent actionEvent)
    {
        isStalowa = true;
        isNierdzewna = false;
    }
}
