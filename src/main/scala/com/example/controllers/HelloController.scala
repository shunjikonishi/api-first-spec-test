package com.example.controllers

import spray.routing._
import spray.http._
import MediaTypes._

trait HelloController extends HttpService {
  val helloRoute =
    path("") {
      get {
        respondWithMediaType(`text/html`) { // XML is marshalled to `text/xml` by default, so we simply override here
          complete {
            <html>
              <body>
                <h1>This is a test server for <a href="https://github.com/shunjikonishi/api-first-spec">api-first-spec</a>!</h1>
              </body>
            </html>
          }
        }
      }
    }
}

