package com.example.controllers

import spray.routing._
import spray.http._
import MediaTypes._

import org.json4s._
import org.json4s.jackson.Serialization

trait LoginController extends HttpService {

  implicit val formats = Serialization.formats(NoTypeHints)

  case class LoginResponse(code: Int, message: String)

  val loginRoute =
    path("auth" / "signin") {
      post {
        formFields('email, 'password) { (email, password) =>
          complete {
            val ret = if (email == "test@test.com" && password == "password") {
              LoginResponse(200, "OK")
            } else {
              LoginResponse(500, "Login failed.")
            }
            Serialization.write(ret)
          }
        }
      }
    }
}

