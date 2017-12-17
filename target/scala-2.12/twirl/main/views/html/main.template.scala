
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/(""" 

"""),format.raw/*3.1*/("""<!DOCTYPE html> 
<html lang="en"> 

<head> 
  <meta charset="utf-8"> 
  <title>Online Shop - """),_display_(/*8.25*/title),format.raw/*8.30*/("""</title> 
  <!-- Bootstrap Core CSS --> 
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />   
  <!-- Custom CSS --> 
  <link href=""""),_display_(/*12.16*/routes/*12.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.63*/("""" rel="stylesheet" /> 
  <link href=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("stylesheets/numeric.css")),format.raw/*13.66*/("""" rel="stylesheet" /> 
</head> 

<body> 
  <nav class="navbar navbar-inverse"> 
      <div class="container-fluid"> 
          <div class="navbar-header"> 
          <a class="navbar-brand" href="#">Online Shop</a> 
          </div> 

          <ul class="nav navbar-nav"> 
            <li """),_display_(/*24.18*/if(title == "Products page")/*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""class="active"""")))}),format.raw/*24.62*/("""><a href=""""),_display_(/*24.73*/routes/*24.79*/.HomeController.index()),format.raw/*24.102*/("""">Products</a></li>
            <li """),_display_(/*25.18*/if(title == "Customer page")/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""class="active"""")))}),format.raw/*25.62*/("""><a href=""""),_display_(/*25.73*/routes/*25.79*/.HomeController.customers()),format.raw/*25.106*/("""">Customer</a></li>
            <li """),_display_(/*26.18*/if(title == "Services page")/*26.46*/{_display_(Seq[Any](format.raw/*26.47*/("""class="active"""")))}),format.raw/*26.62*/("""><a href=""""),_display_(/*26.73*/routes/*26.79*/.HomeController.index()),format.raw/*26.102*/("""">Services</a></li>
            <li """),_display_(/*27.18*/if(title == "Contact page")/*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""class="active"""")))}),format.raw/*27.61*/("""><a href=""""),_display_(/*27.72*/routes/*27.78*/.HomeController.index()),format.raw/*27.101*/("""">Contact</a></li>
            <li """),_display_(/*28.18*/if(title == "About Us")/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""class="active"""")))}),format.raw/*28.57*/("""><a href=""""),_display_(/*28.68*/routes/*28.74*/.HomeController.index()),format.raw/*28.97*/("""">About</a></li>
            <li """),_display_(/*29.18*/if(title == "Login")/*29.38*/{_display_(Seq[Any](format.raw/*29.39*/("""class="active"""")))}),format.raw/*29.54*/(""">
                """),_display_(/*30.18*/if(user != null)/*30.34*/{_display_(Seq[Any](format.raw/*30.35*/("""
                    """),format.raw/*31.21*/("""<a href=""""),_display_(/*31.31*/routes/*31.37*/.LoginController.logout()),format.raw/*31.62*/("""">Logout """),_display_(/*31.72*/user/*31.76*/.getName()),format.raw/*31.86*/("""</a></li>
                """)))}/*32.18*/else/*32.22*/{_display_(Seq[Any](format.raw/*32.23*/("""
                """),format.raw/*33.17*/("""<a href=""""),_display_(/*33.27*/routes/*33.33*/.LoginController.login()),format.raw/*33.57*/("""">Login</a>
                """)))}),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""</li>
          </ul> 
      </div> 
  </nav>     
  <container> 
      <row> 
          <div class="col-md-12">             
              """),_display_(/*42.16*/content),format.raw/*42.23*/(""" 
          """),format.raw/*43.11*/("""</div> 
      </row> 
  </container> 
  <container> 
      <row> 
          <div class="col-md-12">             
              Copyright <strong>Online Shop</strong> 
          </div> 
      </row> 
  </container> 
  <script src=""""),_display_(/*53.17*/routes/*53.23*/.Assets.versioned("javascripts/main.js")),format.raw/*53.63*/(""""></script>
</body> 
</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 17 13:28:11 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab11Login/app/views/main.scala.html
                  HASH: 11caf56b063127ccbea6355b5970a18a7fbc0244
                  MATRIX: 970->1|1120->56|1149->59|1269->153|1294->158|1504->341|1519->347|1581->388|1646->426|1661->432|1726->476|2044->767|2081->795|2120->796|2166->811|2204->822|2219->828|2264->851|2328->888|2365->916|2404->917|2450->932|2488->943|2503->949|2552->976|2616->1013|2653->1041|2692->1042|2738->1057|2776->1068|2791->1074|2836->1097|2900->1134|2936->1161|2975->1162|3021->1177|3059->1188|3074->1194|3119->1217|3182->1253|3214->1276|3253->1277|3299->1292|3337->1303|3352->1309|3396->1332|3457->1366|3486->1386|3525->1387|3571->1402|3617->1421|3642->1437|3681->1438|3730->1459|3767->1469|3782->1475|3828->1500|3865->1510|3878->1514|3909->1524|3955->1551|3968->1555|4007->1556|4052->1573|4089->1583|4104->1589|4149->1613|4209->1642|4250->1655|4418->1796|4446->1803|4486->1815|4744->2046|4759->2052|4820->2092
                  LINES: 28->1|33->1|35->3|40->8|40->8|44->12|44->12|44->12|45->13|45->13|45->13|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|59->27|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|60->28|60->28|61->29|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|63->31|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|65->33|66->34|67->35|74->42|74->42|75->43|85->53|85->53|85->53
                  -- GENERATED --
              */
          