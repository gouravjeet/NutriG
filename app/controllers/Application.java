package controllers;

import models.Contact;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import static play.data.Form.*;


public class Application extends Controller {
	
	 public static class Login {
	        
	        public String email;
	        public String password;
	        
	        public String validate() {
	        return null;    
	          }
	        
	    }
	
	final static Form<Login> loginform = form(Login.class);
	 
    public static Result index() {
        return ok(index.render());
    }
    public static Result features() {
        return ok(features.render());
    }
    public static Result login(){
    	return ok(login.render(loginform));
    	
    }
    public static Result authenticate() {
    	return TODO;
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
    	return TODO;
    }
  
}