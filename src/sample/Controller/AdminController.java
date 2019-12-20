package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminController {
  public Button librarian;
  public Button student;
  public Button book;
  public Button adminSettings;
  public Button search;
  public Button logout;
  public Button addButton;
  public Button editButton;
  public Button searchButton;
  public Button deleteButton;
  public Button backButton;
  public Button studentAdd;
  public Button studentEdit;
  public Button studentDelete;
  public Button bookBack;
  public Button studentBack;
  public Button librarianAdd;
  public Button librarianEdit;
  public Button librarianBack;
  public Button librarianDelete;
  public Button librarianBackMain;
  public void librarianHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/library_menu.fxml"));
    Stage stage = (Stage) librarian.getScene().getWindow();
    stage.close();
    stage.setTitle("Librarians");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/student_menu.fxml"));
    Stage stage = (Stage) student.getScene().getWindow();
    stage.close();
    stage.setTitle("Students");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void bookHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/book_menu.fxml"));
    Stage stage = (Stage) book.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void logoutHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/login.fxml"));
    Stage stage = (Stage) logout.getScene().getWindow();
    stage.close();
    stage.setTitle("Login");
    stage.setScene(new Scene(root, 450, 450));
    stage.show();
    stage.setResizable(false);
  }
  public void addHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/book_add.fxml"));
    Stage stage = (Stage) addButton.getScene().getWindow();
    stage.close();
    stage.setTitle("Add Book");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void editHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/book_edit.fxml"));
    Stage stage = (Stage) editButton.getScene().getWindow();
    stage.close();
    stage.setTitle("Edit Book");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void deleteHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/book_delete.fxml"));
    Stage stage = (Stage) deleteButton.getScene().getWindow();
    stage.close();
    stage.setTitle("Book delete");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void backHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/admin_view.fxml"));
    Stage stage = (Stage) backButton.getScene().getWindow();
    stage.close();
    stage.setTitle("Admin page");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentAddHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/student_add.fxml"));
    Stage stage = (Stage) studentAdd.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Add");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentEditHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/student_edit.fxml"));
    Stage stage = (Stage) studentEdit.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Edit");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentDeleteHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/student_delete.fxml"));
    Stage stage = (Stage) studentDelete.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Delete");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void bookBackHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/book_menu.fxml"));
    Stage stage = (Stage) bookBack.getScene().getWindow();
    stage.close();
    stage.setTitle("");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentBackHandler(ActionEvent event) throws IOException {
    //Here you should consider the session ID of Admin and Librarian
    //Like if(getSessionId() == getAdminSessionId()){...} OR if(getSessionId() == getLibrarianSessionId()){...}
    //Please make sure that in Database you have the table of statuses and sessions
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/student_menu.fxml"));
    Stage stage = (Stage) studentBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Menu");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void librarianAddHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/librarian_add.fxml"));
    Stage stage = (Stage) librarianAdd.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void librarianEditHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/librarian_edit.fxml"));
    Stage stage = (Stage) librarianEdit.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void librarianBackHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/library_menu.fxml"));
    Stage stage = (Stage) librarianBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void librarianDeleteHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/librarian_delete.fxml"));
    Stage stage = (Stage) librarianDelete.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void librarianBackMainHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/admin_view.fxml"));
    Stage stage = (Stage) librarianBackMain.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void settingsHandler(ActionEvent event) throws IOException {

  }
  public void searchHandler(ActionEvent event) throws IOException {

  }
}
