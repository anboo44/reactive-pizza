package com.reactive.pizza.models.user

case class User(
  id:       User.Id,
  email:    String,
  username: String,
  password: String
) {
  //------------[ Validations ]-----------------
  require(1 <= email.length && email.length <= 255,       "Email must be from 1 to 255 characters")
  require(1 <= username.length && username.length <= 255, "Username must be from 1 to 255 characters")
  require(1 <= password.length && password.length <= 255, "Password must be from 1 to 255 characters")
  //------------[ Methods ]----------------
  /**
   * Check same username and encrypt(password)
   * @param password raw password
   * @return true | false
   */
  def isLogined(username: String, password: String): Boolean = ???
}

object User {
  //------------[ Typed ]--------------
  case class Id(v: String)
  //------------[ Methods ]------------
  // For Register
  def register(email: String, username: String, password: String, rePassword: String): User = ???

}
