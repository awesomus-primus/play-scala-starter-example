package controllers

import javax.inject._
import play.api.mvc._
import views.html.sidebar

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class PortfolioController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    Ok(views.html.portfolio("My Portfolio Website"))
  }

  def login = Action {
    Ok(views.html.login("Login to your account"))
  }

  def signup = Action {
    Ok(views.html.signup("Create an account"))
  }

  def contact = Action {
    Ok(views.html.contact("Create an account"))
  }

  def influencers = Action {
    Ok(views.html.influencers("Create an account"))
  }
}
