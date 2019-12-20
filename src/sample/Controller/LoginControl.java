package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Model.Users;

import javax.swing.*;
import java.io.IOException;

public class LoginControl {
    public Button librarian;
    public PasswordField passwordField;
    public TextField usernameField;
    public Button login;
    public void loginHandler(ActionEvent event) {
        try {
            bookPage(login);
        } catch (Exception b) {
            b.printStackTrace();
        }
    }
    //book management here
    public void bookPage(Button button) throws IOException {
        Users users = new Users();
        //Here you can use users.getLogin() and users.getPassword()
        if (usernameField.getText().equals("admin") && passwordField.getText().equals("1")){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/admin_view.fxml"));
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
            stage.setTitle("Admin page");
            stage.setScene(new Scene(root, 900, 650));
            stage.show();
            stage.setResizable(false);
        }
        //Here you can use users.getLogin() and users.getPassword()
        else if (usernameField.getText().equals("student") && passwordField.getText().equals("5")){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu.fxml"));
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
            stage.setTitle("Student");
            stage.setScene(new Scene(root, 900, 650));
            stage.show();
            stage.setResizable(false);
        }
        //Here you can use users.getLogin() and users.getPassword()
        else if (usernameField.getText().equals("librarian") && passwordField.getText().equals("10")){
            Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu.fxml"));
            Stage stage = (Stage) button.getScene().getWindow();
            stage.close();
            stage.setTitle("Librarian");
            stage.setScene(new Scene(root, 900, 650));
            stage.show();
            stage.setResizable(false);
        }
        else {
            JOptionPane.showMessageDialog(null,"Something wrong");
        }
    }
}
