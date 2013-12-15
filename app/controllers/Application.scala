package controllers

import play.api._
import play.api.mvc._
import com.mongodb.casbah.Imports._
import models.Player

object Application extends Controller {

  def index = Action {

    //prepare dashboard

    //prepare userRole
    val player=Player("dzr",0,0)

    //return to view
    Ok(views.html.index(player))
  }
  val model= MongoDBObject
}