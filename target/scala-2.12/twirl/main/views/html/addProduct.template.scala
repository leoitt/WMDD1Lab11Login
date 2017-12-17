
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add product", user)/*7.27*/{_display_(Seq[Any](format.raw/*7.28*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*9.6*/if(flash.containsKey("success"))/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
        """),format.raw/*12.9*/("""</div>
    """)))}),format.raw/*13.6*/("""

    """),format.raw/*15.5*/("""<!--Use the views.html.helpers package to create the form -->
    """),_display_(/*16.6*/form(action=routes.HomeController.addProductSubmit() , 'class -> "form-horizontal", 'role -> "form")/*16.106*/{_display_(Seq[Any](format.raw/*16.107*/("""

        """),format.raw/*18.37*/("""
        """),format.raw/*19.99*/("""
        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""
        
        """),format.raw/*22.9*/("""<!--Build the form, adding an input for each field -->
        <!-- Note the label parameter -->

        """),_display_(/*25.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
        """),_display_(/*26.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*26.99*/("""
        """),_display_(/*27.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*32.10*/("""
        
        """),_display_(/*34.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*34.87*/("""
        """),_display_(/*35.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*35.87*/("""

        """),format.raw/*37.9*/("""<!-- Hidden ID field - required for updates-->
        """),_display_(/*38.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*38.74*/("""

        """),format.raw/*40.9*/("""<!--Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary" onclick="return confirmAddedUpdated();">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.HomeController.index(0)),format.raw/*43.53*/(""""><!--index() ??? or index -->
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*48.22*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 17 13:28:11 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab11Login/app/views/addProduct.scala.html
                  HASH: 068aaa317d7d5857cd4977821fa90be5c78cef15
                  MATRIX: 985->1|1118->64|1163->61|1191->80|1220->84|1253->109|1291->110|1322->115|1390->158|1430->190|1468->191|1504->200|1578->247|1592->252|1628->267|1664->276|1706->288|1739->294|1832->361|1942->461|1982->462|2020->500|2057->599|2094->609|2107->613|2138->623|2183->641|2317->748|2413->823|2450->833|2560->922|2597->932|2854->1168|2900->1187|2998->1264|3035->1274|3133->1351|3170->1361|3253->1417|3338->1481|3375->1491|3600->1689|3615->1695|3660->1719|3824->1868
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|48->16|48->16|48->16|50->18|51->19|52->20|52->20|52->20|54->22|57->25|57->25|58->26|58->26|59->27|64->32|66->34|66->34|67->35|67->35|69->37|70->38|70->38|72->40|75->43|75->43|75->43|80->48
                  -- GENERATED --
              */
          