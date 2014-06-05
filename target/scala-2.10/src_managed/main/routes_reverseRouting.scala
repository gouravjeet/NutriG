// @SOURCE:/Users/gouravjeet/Documents/play-2.2.3/samples/NutriG/conf/routes
// @HASH:d29d8a1491a3872bd396ebdb324b733c24cde506
// @DATE:Thu Jun 05 18:19:37 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseContacts {
    

// @LINE:16
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contacts/fakecontact")
}
                                                

// @LINE:15
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contacts")
}
                                                

// @LINE:17
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "contacts")
}
                                                
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseSignUp {
    

// @LINE:11
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/fakeuser")
}
                                                

// @LINE:10
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:12
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def features(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "features")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseContacts {
    

// @LINE:16
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts/fakecontact"})
      }
   """
)
                        

// @LINE:15
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
      }
   """
)
                        

// @LINE:17
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
      }
   """
)
                        
    
}
              

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseSignUp {
    

// @LINE:11
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/fakeuser"})
      }
   """
)
                        

// @LINE:10
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:12
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        
    
}
              

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def features : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.features",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "features"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:22
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
// @LINE:16
// @LINE:15
class ReverseContacts {
    

// @LINE:16
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.edit(), HandlerDef(this, "controllers.Contacts", "edit", Seq(), "GET", """""", _prefix + """contacts/fakecontact""")
)
                      

// @LINE:15
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.blank(), HandlerDef(this, "controllers.Contacts", "blank", Seq(), "GET", """ Contact""", _prefix + """contacts""")
)
                      

// @LINE:17
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.submit(), HandlerDef(this, "controllers.Contacts", "submit", Seq(), "POST", """""", _prefix + """contacts""")
)
                      
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseSignUp {
    

// @LINE:11
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.edit(), HandlerDef(this, "controllers.SignUp", "edit", Seq(), "GET", """""", _prefix + """users/fakeuser""")
)
                      

// @LINE:10
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Seq(), "GET", """ Signup""", _prefix + """signup""")
)
                      

// @LINE:12
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Seq(), "POST", """""", _prefix + """signup""")
)
                      
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def features(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.features(), HandlerDef(this, "controllers.Application", "features", Seq(), "GET", """""", _prefix + """features""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    