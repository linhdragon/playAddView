package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Welcome Home"));
    }
    
    public static Result hello(String name) {
        return ok(index.render("Hello: "+name));
    }
    
    public static Result sayhi(String name) {
        return ok(index.render("Hello: "+name));
    }
    
    public static Result sayhello(String name, int age) {
    	
//        return ok(index.render("Hello: "+name + " age: "+age));
    	return ok(views.html.hello.render(name,age));
    }

}
