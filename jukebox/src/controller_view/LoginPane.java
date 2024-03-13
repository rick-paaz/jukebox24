package controller_view;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class LoginPane extends BorderPane {

  public LoginPane() {
    Label name = new Label("Build the login pane. See the spec for a suggested layout.");
    this.setCenter(name);
  }
}