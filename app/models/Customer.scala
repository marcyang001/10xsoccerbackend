package models

import play.api.data._
import play.api.data.Forms._

/**
 * Created by marcyang on 2016-08-09.
 */

case class Customer(name: String, email: String, creditLimit: Int)

object Customer {
  val customerForm = Form(
    mapping(
      "Name" -> nonEmptyText,
      "Email"-> nonEmptyText,
      "Credit" -> number
    )(Customer.apply)(Customer.unapply)
  )
}
