package ch.frankel.vaadin.workshop.ui;

import ch.frankel.vaadin.workshop.behavior.DummyClickListener;
import com.vaadin.server.Page;
import com.vaadin.ui.*;

import static com.vaadin.server.Sizeable.Unit.PIXELS;

public class LoginScreen extends CustomComponent {

    public LoginScreen(AbstractOrderedLayout layout) {
        super(layout);
        layout.setMargin(true);
        Button button = new Button("Click Me");
        button.addClickListener(new DummyClickListener(layout));
        layout.addComponent(new Label("Please enter credentials"));
        TextField login = new TextField("Login:");
        login.setWidth(250, PIXELS);
        layout.addComponent(login);
        layout.addComponent(new PasswordField("Password:"));
        layout.addComponent(button);
        Page.getCurrent().setTitle("Vaadin workshop (" + System.currentTimeMillis() + ")");
    }
}
