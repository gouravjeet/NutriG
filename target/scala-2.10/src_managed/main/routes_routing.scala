// @SOURCE:/Users/gouravjeet/Documents/play-2.2.3/nutrition/conf/routes
// @HASH:8dadd9a798fdafd284fae29ff197e0987665867a
// @DATE:Fri Jun 06 01:11:10 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:10
private[this] lazy val controllers_Application_submit1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:12
private[this] lazy val controllers_Product_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix,"""controllers.Application.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Product.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:10
case controllers_Application_submit1(params) => {
   call { 
        invokeHandler(controllers.Application.submit(), HandlerDef(this, "controllers.Application", "submit", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:12
case controllers_Product_index2(params) => {
   call { 
        invokeHandler(controllers.Product.index(), HandlerDef(this, "controllers.Product", "index", Nil,"GET", """""", Routes.prefix + """products"""))
   }
}
        

// @LINE:14
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     