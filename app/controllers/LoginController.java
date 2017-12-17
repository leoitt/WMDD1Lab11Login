package controllers;



import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

// Import user models 
import models.users.*;

// Import views
import views.html.*;
 
public class LoginController extends Controller {
    
    /** Dependencey Injection */
    /** http://stackoverflow.com/questions/15600186/play-framework-dependency-injection */
    private FormFactory formFactory;

    /** http://stackoverflow.com/a/37024198 */
    private Environment env;

    /** http://stackoverflow.com/a/10159220/6322856 */
    @Inject
    public LoginController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    // Render and return the Login view
    public Result login(){

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Login> loginForm = formFactory.form(Login.class);

        // Render the Add Product view, passing the form object
        return ok(login.render(loginForm, User.getUserById(session().get("email"))));
    }

    public Result loginSubmit(){
        // Bind form instance to the values submitted from the form
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        // check for errors
        // Uses the validate method defined in the Login class
        if (loginForm.hasErrors()){
            return badRequest(login.render(loginForm));
        } else {
            // User logged in successfully
            // Clear the existing session - resets session id
            session("email", loginForm.get().getEmail());
        }
        // Return to home page
        return redirect(controllers.routes.HomeController.index(0));
    }

    // Logout
    public Result logout(){
        // Delete the current session
        // Generates a new session id
        session().clear();
        flash("success","You've been logged out");
        return redirect(routes.LoginController.login());
    }

}
