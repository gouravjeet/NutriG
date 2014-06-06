
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
object products extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(created:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),_display_(Seq[Any](/*2.2*/main("Example")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""

"""),_display_(Seq[Any](/*4.2*/created/*4.9*/.email)),format.raw/*4.15*/("""

"""),_display_(Seq[Any](/*6.2*/created/*6.9*/.password)),format.raw/*6.18*/("""
""")))})))}
    }
    
    def render(created:User): play.api.templates.HtmlFormat.Appendable = apply(created)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (created) => apply(created)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 06 01:34:50 EDT 2014
                    SOURCE: /Users/gouravjeet/Documents/play-2.2.3/nutrition/app/views/products.scala.html
                    HASH: e34ab98048f8c2c59cb4797c230b249706ec4644
                    MATRIX: 775->1|883->15|919->17|942->32|980->33|1017->36|1031->43|1058->49|1095->52|1109->59|1139->68
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4|32->4|34->6|34->6|34->6
                    -- GENERATED --
                */
            