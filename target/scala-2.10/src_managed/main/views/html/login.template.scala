
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Login"))/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
<html>
    <head>
        <title>NutriG</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.59*/routes/*7.65*/.Assets.at("images/favicon.png"))),format.raw/*7.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*9.70*/routes/*9.76*/.Assets.at("stylesheets/boostrap.css"))),format.raw/*9.114*/("""">
    	<script type="text/javascript" src=""""),_display_(Seq[Any](/*10.43*/routes/*10.49*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*10.90*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*11.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*12.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*13.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*14.46*/routes/*14.52*/.Assets.at("javascripts/main.js"))),format.raw/*14.85*/(""""></script>
    </head>
    <body>
            <header>
           
                <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*20.78*/form("email")/*20.91*/.value)),format.raw/*20.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit" class="btn primary">Login</button>
                <a href="">    Forget Password</a>
            </p>
            
        </header>
    </body>
    </html>
""")))})),format.raw/*33.2*/("""    """))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 05 18:19:37 EDT 2014
                    SOURCE: /Users/gouravjeet/Documents/play-2.2.3/samples/NutriG/app/views/login.scala.html
                    HASH: 328e3dcdb172cae6315acbc5d376a7dd5f31e0b9
                    MATRIX: 791->1|916->32|953->35|980->54|1018->55|1160->162|1174->168|1227->200|1334->272|1348->278|1404->312|1511->384|1525->390|1585->428|1666->473|1681->479|1744->520|1837->577|1852->583|1920->629|2013->686|2028->692|2093->735|2186->792|2201->798|2264->839|2357->896|2372->902|2427->935|2628->1100|2650->1113|2678->1119|3054->1464
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|48->20|48->20|48->20|61->33
                    -- GENERATED --
                */
            