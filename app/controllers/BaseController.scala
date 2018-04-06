package controllers

import javax.inject._
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._

@Singleton
class BaseController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("The beginning of the end"))
  }

  val userForm = Form(
    mapping(
      "name" -> text,
      "age" -> number
    )(UserData.apply)(UserData.unapply)
  )

  val userData = userForm.bindFromRequest.get

  val userPost = Action(parse.form(userForm)) { implicit request =>
    val userData = request.body
    val newUser = models.User(userData.name, userData.age)
    val id = models.User.create(newUser)
    Redirect(routes.BaseController.index)
  }

}

case class UserData(name: String, age: Int)
