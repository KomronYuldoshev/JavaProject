package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LibrarianController {
  public Button viewFilter;
  public Button logout;
  public Button students;
  public Button books;
  public Button returnBookBack;
  public TextField isbnBook;
  public TextField idStudent;
  public DatePicker dateReturn;
  public Button returnBook;
  public Button borrows;
  public Button overdue;
  public Button viewAndFilter;
  public Button monthlyReport;
  public Button issueBook;
  public Button issueFine;
  public Button blockUser;
  public Button viewBack;
  public Button viewBookBack;
  public Button viewBookSearch;
  public Button monthlyReportBack;
  public Button overdueBack;
  public Button overDueSearch;
  public MenuButton reasonForBlocking;
  public Button blockStudent;
  public Button viewFilterBack;
  public Button viewFilterApply;
  public Button issueBookBack;
  public Button issueFineBack;
  public Button blockUserBack;
  public Button issuing;
  public DatePicker days;
  public TextField idOfStudent;
  public TextField isbnOfBook;

  public void logoutHandler(ActionEvent event)            throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/login.fxml"));
    Stage stage = (Stage) logout.getScene().getWindow();
    stage.close();
    stage.setTitle("Login");
    stage.setScene(new Scene(root, 450, 450));
    stage.show();
    stage.setResizable(false);
  }
  public void bookHandler(ActionEvent event)              throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/book_menu.fxml"));
    Stage stage = (Stage) books.getScene().getWindow();
    stage.close();
    stage.setTitle("Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void viewHandler(ActionEvent event)              throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) viewFilter.getScene().getWindow();
    stage.close();
    stage.setTitle("View and Filter");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void studentHandler(ActionEvent event)           throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/admin/student_menu.fxml"));
    Stage stage = (Stage) viewFilter.getScene().getWindow();
    stage.close();
    stage.setTitle("Student Menu");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);

  }
  public void returnBackHandler(ActionEvent event)        throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) returnBookBack.getScene().getWindow();
    stage.close();
    stage.setTitle("View Returned Books");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);

  }
  public void borrowsHandler(ActionEvent event)           throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_borrows.fxml"));
    Stage stage = (Stage) borrows.getScene().getWindow();
    stage.close();
    stage.setTitle("Borrows Menu");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void overdueHandler(ActionEvent event)           throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_overdue.fxml"));
    Stage stage = (Stage) overdue.getScene().getWindow();
    stage.close();
    stage.setTitle("Overdue");
    stage.setScene(new Scene(root,900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void viewAndFilterHandler(ActionEvent event)     throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_view_filter.fxml"));
    Stage stage = (Stage) viewAndFilter.getScene().getWindow();
    stage.close();
    stage.setTitle("View Filter");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void monthlyReportHandler(ActionEvent event)     throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_monthly_report.fxml"));
    Stage stage = (Stage) monthlyReport.getScene().getWindow();
    stage.close();
    stage.setTitle("Monthly Report");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void issueBookHandler(ActionEvent event)         throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_view_issue_book.fxml"));
    Stage stage = (Stage) issueBook.getScene().getWindow();
    stage.close();
    stage.setTitle("Issue book");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void issueFineHandler(ActionEvent event)         throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_view_issue_fine.fxml"));
    Stage stage = (Stage) issueFine.getScene().getWindow();
    stage.close();
    stage.setTitle("Issue fine");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void blockUserHandler(ActionEvent event)         throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_view_block_student.fxml"));
    Stage stage = (Stage) blockUser.getScene().getWindow();
    stage.close();
    stage.setTitle("Block User");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);

  }
  public void viewBackHandler(ActionEvent event)          throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu.fxml"));
    Stage stage = (Stage) viewBack.getScene().getWindow();
    stage.close();
    stage.setTitle("");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void viewBookBackHandler(ActionEvent event)      throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) viewBookBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void monthlyReportBackHandler(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) monthlyReportBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void overdueBackHandler(ActionEvent event)       throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) overdueBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void viewFilterBackHandler(ActionEvent event)    throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) viewFilterBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void issueBookBackHandler(ActionEvent event)     throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) issueBookBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void issueFineBackHandler(ActionEvent event)     throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) issueFineBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void returnBookHandler(ActionEvent event)        throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view_view_return_book.fxml"));
    Stage stage = (Stage) returnBook.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  public void blockUserBackHandler(ActionEvent event)     throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/sample/View/theme/librarian/librarian_menu_view.fxml"));
    Stage stage = (Stage) blockUserBack.getScene().getWindow();
    stage.close();
    stage.setTitle("Menu View");
    stage.setScene(new Scene(root, 900, 650));
    stage.show();
    stage.setResizable(false);
  }
  //Here all the necessary actions performs the logical operations of particular frames
  public void viewFilterApplyHandler(ActionEvent event) {

  }
  public void viewBookSearchHandler(ActionEvent event) {

  }
  public void overdueSearchHandler(ActionEvent event) {

  }
  public void reasonForBlockingHandler(ActionEvent event) {

  }
  public void blockStudentHandler(ActionEvent event) {
  }
  public void returningBookHandler(ActionEvent event) {
  }

  public void issuingBook(ActionEvent event) {
  }
}
