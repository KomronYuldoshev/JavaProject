package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
public class StudentControl {
  public Button studentProfile;
  public Button logout;
  public Button studentViewFilter;
  public Button studentStatus;
  public Button reserveBook;
  public Button profileBack;
  public TextField studentId;
  public TextField studentEmail;
  public TextField studentFullName;
  public Button viewFilterBack;
  public Button studentStatusBack;
  public CheckBox title;
  public CheckBox author;
  public CheckBox borrowed;
  public CheckBox subject;
  public CheckBox isbn;
  public CheckBox publishDate;
  public Button viewFilterApply;
  public TextField filterBooks;

  public void studentPHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu_profile.fxml"));
    Stage stage = (Stage) studentProfile.getScene().getWindow();
    stage.close();
    stage.setTitle("Profile");
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
  public void studentViewFilterHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu_view_filter.fxml"));
    Stage stage = (Stage) studentViewFilter.getScene().getWindow();
    stage.close();
    stage.setTitle("View Filter");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentStatusHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu_current_fine.fxml"));
    Stage stage = (Stage) studentStatus.getScene().getWindow();
    stage.close();
    stage.setTitle("Current Status");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void reserveBookHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu_reserve_book.fxml"));
    Stage stage = (Stage) reserveBook.getScene().getWindow();
    stage.close();
    stage.setTitle("Reserve Book");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void profileBackHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu.fxml"));
    Stage stage = (Stage) profileBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Menu");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }

  public void viewFilterBackHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu.fxml"));
    Stage stage = (Stage) viewFilterBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Menu");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }

  public void studentStatusBackHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/student/student_management_main_menu.fxml"));
    Stage stage = (Stage) studentStatusBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Menu");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }

  public void viewFilterApplyHandler(ActionEvent event) {
  }
}
