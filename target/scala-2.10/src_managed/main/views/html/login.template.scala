
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Example")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""
<html>
<title="NutriG"></title>

<head>
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("stylesheets/main.css"))),format.raw/*10.86*/("""">
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.62*/routes/*11.68*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*11.107*/("""">

<body>
<h1>NutriG</h1>

 


"""),_display_(Seq[Any](/*19.2*/helper/*19.8*/.form(action = routes.Application.submit(),'id -> "userForm")/*19.69*/ {_display_(Seq[Any](format.raw/*19.71*/("""
    
    """),_display_(Seq[Any](/*21.6*/helper/*21.12*/.inputText(userForm("email")))),format.raw/*21.41*/("""
    
    """),_display_(Seq[Any](/*23.6*/helper/*23.12*/.inputPassword(userForm("password")))),format.raw/*23.48*/("""
    
    <input type="submit" class="btn-primary" value="Login">
    """)))})),format.raw/*26.6*/("""



</body>
</head>
</html>
""")))})),format.raw/*33.2*/("""
"""))}
    }
    
    def render(userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 06 01:51:31 EDT 2014
                    SOURCE: /Users/gouravjeet/Documents/play-2.2.3/nutrition/app/views/login.scala.html
                    HASH: d3ef4a331e56f1ab1044a64ea40b381ebb0e1128
                    MATRIX: 778->1|944->23|971->75|1007->77|1030->92|1068->93|1190->179|1205->185|1261->219|1361->283|1376->289|1438->328|1506->361|1520->367|1590->428|1630->430|1676->441|1691->447|1742->476|1788->487|1803->493|1861->529|1963->600|2023->629
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|39->10|39->10|39->10|40->11|40->11|40->11|48->19|48->19|48->19|48->19|50->21|50->21|50->21|52->23|52->23|52->23|55->26|62->33
                    -- GENERATED --
                */
            