
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="col-xs-4">
        <h3>Sign in</h3>
        <!-- Display login errors if they exist -->
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/{_display_(Seq[Any](format.raw/*10.40*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/loginForm/*12.27*/.globalError.message),format.raw/*12.47*/("""
            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/{_display_(Seq[Any](format.raw/*15.41*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
                """),_display_(/*17.18*/flash/*17.23*/.get("loginRequired")),format.raw/*17.44*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""<!-- The login form -->
        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.80*/{_display_(Seq[Any](format.raw/*21.81*/("""
            """),format.raw/*22.41*/("""
            """),format.raw/*23.103*/("""
            """),_display_(/*24.14*/CSRF/*24.18*/.formField),format.raw/*24.28*/(""" 

            """),format.raw/*26.13*/("""<div class="form-group">
                """),_display_(/*27.18*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*27.122*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                """),_display_(/*30.18*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*30.132*/("""
            """),format.raw/*31.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sing In" class="btn btn-primary">
            </div>

        """)))}),format.raw/*36.10*/(""" """),format.raw/*36.28*/("""
    """),format.raw/*37.5*/("""</div>
    <!-- End of content form main -->
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 17 13:28:11 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab11Login/app/views/login.scala.html
                  HASH: bd004d1bcd0cd42f16ea87057ae9c0880fb6d379
                  MATRIX: 984->1|1119->65|1164->63|1191->81|1219->154|1246->156|1273->175|1311->176|1342->181|1523->335|1561->364|1600->365|1641->378|1717->427|1735->436|1776->456|1817->469|1862->483|1899->493|1938->523|1977->524|2018->537|2094->586|2108->591|2150->612|2191->625|2236->639|2272->648|2332->681|2347->687|2420->751|2459->752|2500->793|2542->896|2583->910|2596->914|2627->924|2670->939|2739->981|2865->1085|2906->1098|2994->1159|3130->1273|3171->1286|3353->1437|3382->1455|3414->1460
                  LINES: 28->1|31->2|34->1|35->3|36->4|37->5|37->5|37->5|38->6|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|53->21|53->21|53->21|53->21|54->22|55->23|56->24|56->24|56->24|58->26|59->27|59->27|60->28|62->30|62->30|63->31|68->36|68->36|69->37
                  -- GENERATED --
              */
          