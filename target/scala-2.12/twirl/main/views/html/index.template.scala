
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""


"""),_display_(/*4.2*/main("Products Page",user)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/(""" 
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p> 
  <div class="row">
        <div class="col-sm-2">
          <h4>Categories</h4>
          <div class="list-group">
              <!-- A link to display all the products-->
              <a href=""""),_display_(/*11.25*/routes/*11.31*/.HomeController.index(0)),format.raw/*11.55*/("""" class="list-group-item">All categories</a>
              <!-- Start of for loop = for each c in categories add a list item -->
              <!-- Also show the number of products in each category -->
             
              """),_display_(/*15.16*/for(c<-categories) yield /*15.34*/{_display_(Seq[Any](format.raw/*15.35*/("""
                  """),format.raw/*16.19*/("""<a href=""""),_display_(/*16.29*/routes/*16.35*/.HomeController.index(c.getId)),format.raw/*16.65*/("""" class="list-group-item">"""),_display_(/*16.92*/c/*16.93*/.getName),format.raw/*16.101*/("""
                        """),format.raw/*17.25*/("""<span class="badge">"""),_display_(/*17.46*/c/*17.47*/.getProducts.size()),format.raw/*17.66*/("""</span>
                  </a>
              """)))}),format.raw/*19.16*/("""
          """),format.raw/*20.11*/("""</div>
        </div>
        <div class="col-sm-10">
            """),format.raw/*23.77*/("""
            """),_display_(/*24.14*/if(flash.containsKey("success"))/*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""
                """),format.raw/*25.17*/("""<div class="alert alert-success">
                    """),_display_(/*26.22*/flash/*26.27*/.get("success")),format.raw/*26.42*/("""
                """),format.raw/*27.17*/("""</div>
            """)))}),format.raw/*28.14*/("""

            """),format.raw/*30.13*/("""<table class="table table-bordered table-hover table-condensed"> 
                <thead> 
                <!-- The header row--> 
                <tr> 
                    <th>ID</th> 
                    <th>Name</th> 
                    <th>Category</th>
                    <th>Description</th> 
                    <th>Stock</th> 
                    <th>Price</th> 
                </tr> 
                </thead> 
                <tbody> 
                    <!-- Product row(s) --> 
                    """),format.raw/*44.72*/("""
                    """),_display_(/*45.22*/for(p<-products) yield /*45.38*/{_display_(Seq[Any](format.raw/*45.39*/("""
                        """),format.raw/*46.25*/("""<tr> 
                            <td>"""),_display_(/*47.34*/p/*47.35*/.getId),format.raw/*47.41*/("""</td> 
                            <td>"""),_display_(/*48.34*/p/*48.35*/.getName),format.raw/*48.43*/("""</td> 
                            <td>"""),_display_(/*49.34*/p/*49.35*/.getCategory.getName),format.raw/*49.55*/("""</td>
                            <td>"""),_display_(/*50.34*/p/*50.35*/.getDescription),format.raw/*50.50*/("""</td> 
                            <td>"""),_display_(/*51.34*/p/*51.35*/.getStock),format.raw/*51.44*/("""</td> 
                            <td id="priceAlRight">&euro; """),_display_(/*52.59*/("%.2f".format(p.getPrice))),format.raw/*52.86*/("""</td>
                            <!-- Edit product button -->
                            <td>
                                <a href=""""),_display_(/*55.43*/routes/*55.49*/.HomeController.updateProduct(p.getId)),format.raw/*55.87*/("""" class="btn-xs btn-danger" >
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </td>
                            <!-- Delete product button-->
                            <td>
                                <a href=""""),_display_(/*61.43*/routes/*61.49*/.HomeController.deleteProduct(p.getId)),format.raw/*61.87*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        </tr> 
                    """)))}),format.raw/*66.22*/(""" """),format.raw/*66.44*/("""
                """),format.raw/*67.17*/("""</tbody> 
            </table> 
             <p><a href=""""),_display_(/*69.27*/routes/*69.33*/.HomeController.addProduct()),format.raw/*69.61*/("""">
                <button class="btn btn-primary">Add a product</button>
            </a></p>
        </div>
    </div>
  """)))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 17 13:28:11 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab11Login/app/views/index.scala.html
                  HASH: da4096f22b9386a866f289289972de5a7a94c543
                  MATRIX: 1002->1|1189->93|1218->97|1252->123|1291->125|1321->129|1584->365|1599->371|1644->395|1902->626|1936->644|1975->645|2022->664|2059->674|2074->680|2125->710|2179->737|2189->738|2219->746|2272->771|2320->792|2330->793|2370->812|2447->858|2486->869|2580->999|2621->1013|2662->1045|2701->1046|2746->1063|2828->1118|2842->1123|2878->1138|2923->1155|2974->1175|3016->1189|3556->1752|3605->1774|3637->1790|3676->1791|3729->1816|3795->1855|3805->1856|3832->1862|3899->1902|3909->1903|3938->1911|4005->1951|4015->1952|4056->1972|4122->2011|4132->2012|4168->2027|4235->2067|4245->2068|4275->2077|4367->2142|4415->2169|4580->2307|4595->2313|4654->2351|5000->2670|5015->2676|5074->2714|5372->2981|5401->3003|5446->3020|5531->3078|5546->3084|5595->3112
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|43->11|43->11|43->11|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|51->19|52->20|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|87->55|87->55|87->55|93->61|93->61|93->61|98->66|98->66|99->67|101->69|101->69|101->69
                  -- GENERATED --
              */
          