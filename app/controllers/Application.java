package controllers;

import play.*;
import play.mvc.*;
import models.User;

import views.html.*;

import play.data.*;
import play.data.validation.Constraints.Required;
public class Application extends Controller {

	
	final static Form<User> userForm=Form.form(User.class);
	
    public static Result index() {
        return ok(login.render(userForm));
    }
    
        
    public static Result submit() {
    	Form<User> filledForm=userForm.bindFromRequest();
    	User created=filledForm.get();
    	session("email", filledForm.get().email);
    	return ok(products.render(created));
    	 
   
    	 
    }
    
}
