// @SOURCE:/Users/gouravjeet/Documents/play-2.2.3/nutrition/conf/routes
// @HASH:8dadd9a798fdafd284fae29ff197e0987665867a
// @DATE:Fri Jun 06 01:11:10 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
package controllers {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
class ReverseProduct {
    

// @LINE:12
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                                                
    
}
                          

// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def submit(): Call = {
   Call("POST", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
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
class ReverseProduct {
    

// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
class ReverseProduct {
    

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.index(), HandlerDef(this, "controllers.Product", "index", Seq(), "GET", """""", _prefix + """products""")
)
                      
    
}
                          

// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.submit(), HandlerDef(this, "controllers.Application", "submit", Seq(), "POST", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    