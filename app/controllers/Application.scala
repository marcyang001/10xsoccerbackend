package controllers


import models.Customer._
import play.api.mvc._
import play.api.Play.current
import play.api.i18n.Messages.Implicits._



/**
 * Created by marcyang on 2016-08-09.
 */



class Application extends Controller {


  def index = Action {
    Ok(views.html.index(customerForm))
  }


  def createCustomer = Action { implicit request =>
    customerForm.bindFromRequest().fold(
      formWithErrors => BadRequest(views.html.index(formWithErrors)),
      customer => Ok(s"Customer ${customer.name} created successfully")
    )
  }


}