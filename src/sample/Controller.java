package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.awt.event.MouseEvent;

public class Controller {
    @FXML
    private PasswordField campo_contrasena;
    @FXML
    private Label ver_contrasena;
    @FXML
    private Button Boton_click;

    Password contrasena = new Password();

    @FXML
    public void showContrasena_hover(){
        contrasena.setContrasena(campo_contrasena.getText());
        ver_contrasena.setText(contrasena.getContrasena());
    }
    @FXML
    public void showContrasena_hover_out(){
        ver_contrasena.setText("Mostrar contraseña");
    }
    @FXML
    public void cambiarBoton(){
        Boton_click.setText("Boton pulsado");
    }

}
