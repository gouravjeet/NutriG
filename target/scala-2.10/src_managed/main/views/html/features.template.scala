
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
object features extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Html("Features"))/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
<html>
  <head>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
    
      google.load("visualization", "1", """),format.raw/*8.41*/("""{"""),format.raw/*8.42*/("""packages:["corechart"]"""),format.raw/*8.64*/("""}"""),format.raw/*8.65*/(""");
      google.setOnLoadCallback(drawChart);

      function drawChart() """),format.raw/*11.28*/("""{"""),format.raw/*11.29*/("""
        var data = google.visualization.arrayToDataTable([
          ['Year', 'Sales', 'Expenses'],
          ['2004',  1000,      400],
          ['2005',  1170,      460],
          ['2006',  660,       1120],
          ['2007',  1030,      540]
        ]);

        var options = """),format.raw/*20.23*/("""{"""),format.raw/*20.24*/("""
          title: 'Company Performance',
          vAxis: """),format.raw/*22.18*/("""{"""),format.raw/*22.19*/("""title: 'Year',  titleTextStyle: """),format.raw/*22.51*/("""{"""),format.raw/*22.52*/("""color: 'red'"""),format.raw/*22.64*/("""}"""),format.raw/*22.65*/("""}"""),format.raw/*22.66*/("""
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""";

        var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      """),format.raw/*27.7*/("""}"""),format.raw/*27.8*/("""

      //========================
      

       function drawNew() """),format.raw/*32.27*/("""{"""),format.raw/*32.28*/("""
        var data = new google.visualization.DataTable(CountyTotalArea);
         
         for(var i in CountyTotalArea.results.bindings)"""),format.raw/*35.56*/("""{"""),format.raw/*35.57*/("""
          
          data.addRows(CountyTotalArea.results.bindings[i].county.value,CountyTotalArea.results.bindings[i].waterarea.value,CountyTotalArea.results.bindings[i].landarea.value);
  
          
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""

        var options = """),format.raw/*42.23*/("""{"""),format.raw/*42.24*/("""
          title: 'Company Performance',
          vAxis: """),format.raw/*44.18*/("""{"""),format.raw/*44.19*/("""title: 'county',  titleTextStyle: """),format.raw/*44.53*/("""{"""),format.raw/*44.54*/("""color: 'red'"""),format.raw/*44.66*/("""}"""),format.raw/*44.67*/("""}"""),format.raw/*44.68*/("""
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""";

        var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      """),format.raw/*49.7*/("""}"""),format.raw/*49.8*/("""


      //===============================
      function drawColumn() """),format.raw/*53.29*/("""{"""),format.raw/*53.30*/("""

        var data = google.visualization.arrayToDataTable([
          ['Year', 'Sales', 'Expenses'],
          ['2004',  1000,      400],
          ['2005',  1170,      460],
          ['2006',  660,       1120],
          ['2007',  1030,      540]
        ]);

        var options = """),format.raw/*63.23*/("""{"""),format.raw/*63.24*/("""
          title: 'Company Performance',
          vAxis: """),format.raw/*65.18*/("""{"""),format.raw/*65.19*/("""title: 'Year',  titleTextStyle: """),format.raw/*65.51*/("""{"""),format.raw/*65.52*/("""color: 'red'"""),format.raw/*65.64*/("""}"""),format.raw/*65.65*/("""}"""),format.raw/*65.66*/("""
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""";

        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      """),format.raw/*70.7*/("""}"""),format.raw/*70.8*/("""
      function togglestyle(el)"""),format.raw/*71.31*/("""{"""),format.raw/*71.32*/("""
        if(el.className == "line") """),format.raw/*72.36*/("""{"""),format.raw/*72.37*/("""
          el.className="bar";
          drawChart();

        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/(""" else """),format.raw/*76.16*/("""{"""),format.raw/*76.17*/("""
          el.className="line";
          drawColumn();
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""
      """),format.raw/*80.7*/("""}"""),format.raw/*80.8*/("""

      //Reading Json
      var output="<ul>"
      function readJson()"""),format.raw/*84.26*/("""{"""),format.raw/*84.27*/("""
        for(var i in CountyTotalArea.results.bindings)"""),format.raw/*85.55*/("""{"""),format.raw/*85.56*/("""
          console.log("Name of county is "+CountyTotalArea.results.bindings[i].county.value);
          console.log("Waterarea is "+CountyTotalArea.results.bindings[i].waterarea.value);
          console.log("Land area is "+CountyTotalArea.results.bindings[i].landarea.value);
          
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
       
      """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""

 


//document.getElementById('a').innerHTML=CountyTotalArea.bindings[0].waterarea.value;
console.log(CountyTotalArea.results.bindings[0].waterarea.value);
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 900px; height: 500px;"></div>
    <button id="but" class="btn primary" onclick="togglestyle(this);readJson();drawNew()"> Line chart</button>
    <p>
      
      <div is="abc"></div>
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
                    DATE: Thu Jun 05 18:21:18 EDT 2014
                    SOURCE: /Users/gouravjeet/Documents/play-2.2.3/samples/NutriG/app/views/features.scala.html
                    HASH: 39225f1b8ff6565e6426e7414366d8ad72caab0d
                    MATRIX: 867->2|897->24|935->25|1140->203|1168->204|1217->226|1245->227|1347->301|1376->302|1688->586|1717->587|1803->645|1832->646|1892->678|1921->679|1961->691|1990->692|2019->693|2055->702|2084->703|2248->840|2276->841|2373->910|2402->911|2568->1049|2597->1050|2835->1261|2864->1262|2916->1286|2945->1287|3031->1345|3060->1346|3122->1380|3151->1381|3191->1393|3220->1394|3249->1395|3285->1404|3314->1405|3478->1542|3506->1543|3605->1614|3634->1615|3947->1900|3976->1901|4062->1959|4091->1960|4151->1992|4180->1993|4220->2005|4249->2006|4278->2007|4314->2016|4343->2017|4510->2157|4538->2158|4597->2189|4626->2190|4690->2226|4719->2227|4809->2290|4838->2291|4872->2297|4901->2298|4992->2362|5021->2363|5055->2370|5083->2371|5183->2443|5212->2444|5295->2499|5324->2500|5648->2797|5677->2798|5719->2813|5747->2814
                    LINES: 29->2|29->2|29->2|35->8|35->8|35->8|35->8|38->11|38->11|47->20|47->20|49->22|49->22|49->22|49->22|49->22|49->22|49->22|50->23|50->23|54->27|54->27|59->32|59->32|62->35|62->35|67->40|67->40|69->42|69->42|71->44|71->44|71->44|71->44|71->44|71->44|71->44|72->45|72->45|76->49|76->49|80->53|80->53|90->63|90->63|92->65|92->65|92->65|92->65|92->65|92->65|92->65|93->66|93->66|97->70|97->70|98->71|98->71|99->72|99->72|103->76|103->76|103->76|103->76|106->79|106->79|107->80|107->80|111->84|111->84|112->85|112->85|117->90|117->90|119->92|119->92
                    -- GENERATED --
                */
            