
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""


"""),_display_(/*4.2*/main("Customer page", user)/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/(""" 
  """),format.raw/*5.3*/("""<p class="lead">Product list</p> 

  """),format.raw/*7.68*/("""
  """),_display_(/*8.4*/if(flash.containsKey("success"))/*8.36*/{_display_(Seq[Any](format.raw/*8.37*/("""
      """),format.raw/*9.7*/("""<div class="alert alert-success">
          """),_display_(/*10.12*/flash/*10.17*/.get("success")),format.raw/*10.32*/("""
      """),format.raw/*11.7*/("""</div>
  """)))}),format.raw/*12.4*/("""
  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed"> 
      <thead> 
      <!-- The header row--> 
      <tr> 
          <th>ID</th> 
          <th>First Name</th> 
          <th>Last Name</th> 
          <th>Address</th> 
           
      </tr> 
      </thead> 
      <tbody> 
          <!-- Product row(s) --> 
          """),format.raw/*26.62*/("""
        """),_display_(/*27.10*/for(p<-customers) yield /*27.27*/{_display_(Seq[Any](format.raw/*27.28*/("""
            """),format.raw/*28.13*/("""<tr> 
                <td>"""),_display_(/*29.22*/p/*29.23*/.getId),format.raw/*29.29*/("""</td> 
                <td>"""),_display_(/*30.22*/p/*30.23*/.getFName),format.raw/*30.32*/("""</td> 
                <td>"""),_display_(/*31.22*/p/*31.23*/.getLName),format.raw/*31.32*/("""</td> 
                <td>"""),_display_(/*32.22*/p/*32.23*/.getAddress),format.raw/*32.34*/("""</td> 
                <!-- Edit customer button -->
                <td>
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.HomeController.updateCustomer(p.getId)),format.raw/*35.76*/("""" class="btn-xs btn-danger">
                        <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                </td>
                <td>
                    <a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.deleteCustomer(p.getId)),format.raw/*40.76*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td> 
            </tr> 
        """)))}),format.raw/*45.10*/("""
      """),format.raw/*46.7*/("""</tbody> 
  </table> 

  <p>
        <a href=""""),_display_(/*50.19*/routes/*50.25*/.HomeController.addCustomer()),format.raw/*50.54*/("""">
            <button class="btn btn-primary">Add a customer</button>
        </a>
  </p>
  """)))}))
      }
    }
  }

  def render(customers:List[models.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customers,user)

  def f:((List[models.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customers,user) => apply(customers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 17 13:28:11 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab11Login/app/views/customers.scala.html
                  HASH: a2f5014606092d4b3dd17ce4865af2052418d68e
                  MATRIX: 985->1|1138->59|1167->63|1202->90|1241->92|1271->96|1335->198|1364->202|1404->234|1442->235|1475->242|1547->287|1561->292|1597->307|1631->314|1671->324|1701->327|2065->714|2102->724|2135->741|2174->742|2215->755|2269->782|2279->783|2306->789|2361->817|2371->818|2401->827|2456->855|2466->856|2496->865|2551->893|2561->894|2593->905|2724->1009|2739->1015|2799->1054|3026->1254|3041->1260|3101->1299|3340->1507|3374->1514|3448->1561|3463->1567|3513->1596
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|67->35|67->35|67->35|72->40|72->40|72->40|77->45|78->46|82->50|82->50|82->50
                  -- GENERATED --
              */
          