
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("NutriG"))/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""
    
    <h2></h2>
    
   
    
    <p>
<br>

Purposes:<br>
The objective of this project is to influence diet decisions by providing good visualizations of food data. <br>
Our application will provide a user with analyzing their diet pattern. <br>
We will add logging or personalizing feature that will enable the users to tailor the application to a wide range of uses. <br>
Since it is a tedious task to input what a person has eaten,<br>
 we will be having a good database of pre-existing food available at http://ndb.nal.usda.gov/<br>
<br>

Tools and Languages<br>
Java <br>
Play framework<br>
Html CSS<br>
Javascript<br>
Eclipse<br>
JUnit Testing Framework<br>

Attraction<br>
We believe that our product provides a unique glimpse into the future of how consumers will browse nutritional data <br>
and make decisions on that data. With a complete set of <br>
features to assist users in data input, social sharing,<br>
 and personalization, we could reach our goals of increasing consumer interest in good nutrition,<br>
  and combating obesity <br>
and other nutrition-related social issues. <br>
      </p>
      
     
      
    </body>
</html>
    
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 05 18:19:37 EDT 2014
                    SOURCE: /Users/gouravjeet/Documents/play-2.2.3/samples/NutriG/app/views/index.scala.html
                    HASH: c0a3819c118de725d48b295fb6f230c2bc15ca17
                    MATRIX: 864->1|892->21|931->23
                    LINES: 29->1|29->1|29->1
                    -- GENERATED --
                */
            