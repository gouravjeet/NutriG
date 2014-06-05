
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>NutriG</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*18.45*/routes/*18.51*/.Application.index())),format.raw/*18.71*/("""">NutriG</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "signup")))),format.raw/*20.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.SignUp.blank())),format.raw/*21.60*/("""">Sign up</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*23.37*/("active".when(nav == "contact")))),format.raw/*23.70*/("""">
                            <a href=""""),_display_(Seq[Any](/*24.39*/routes/*24.45*/.Contacts.blank())),format.raw/*24.62*/("""">Contacts</a>
                        </li>
						
	                    <li class=""""),_display_(Seq[Any](/*27.34*/("active".when(nav == "login")))),format.raw/*27.65*/("""">
                            <a href=""""),_display_(Seq[Any](/*28.39*/routes/*28.45*/.Application.login())),format.raw/*28.65*/("""">Login</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*30.37*/("active".when(nav == "features")))),format.raw/*30.71*/("""">
                            <a href=""""),_display_(Seq[Any](/*31.39*/routes/*31.45*/.Application.features())),format.raw/*31.68*/("""">Features</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*43.26*/title)),format.raw/*43.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*48.26*/content)),format.raw/*48.33*/("""
                    </div>
                </div>
                
            </div>

            <footer>
                <p>
                    <a href="http://www.playframework.com">www.playframework.com</a>
                </p>
            </footer>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 05 18:19:37 EDT 2014
                    SOURCE: /Users/gouravjeet/Documents/play-2.2.3/samples/NutriG/app/views/main.scala.html
                    HASH: b41364a0b652fb08c45a24525ed6742e70681baf
                    MATRIX: 783->1|923->47|1078->167|1092->173|1152->212|1243->268|1257->274|1312->308|1409->369|1424->375|1478->407|1539->432|1554->438|1621->483|1868->694|1883->700|1925->720|2047->806|2101->838|2178->879|2193->885|2230->900|2346->980|2401->1013|2478->1054|2493->1060|2532->1077|2653->1162|2706->1193|2783->1234|2798->1240|2840->1260|2954->1338|3010->1372|3087->1413|3102->1419|3147->1442|3463->1722|3490->1727|3656->1857|3685->1864
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|55->27|55->27|56->28|56->28|56->28|58->30|58->30|59->31|59->31|59->31|71->43|71->43|76->48|76->48
                    -- GENERATED --
                */
            