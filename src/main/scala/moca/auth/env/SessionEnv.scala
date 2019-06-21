package moca.auth.env

import com.mohiva.play.silhouette.api.Env
import com.mohiva.play.silhouette.impl.User
import com.mohiva.play.silhouette.impl.authenticators.{JWTAuthenticator, SessionAuthenticator}

trait SessionEnv extends Env {
  type I = User
  type A = SessionAuthenticator
}

trait JWTEnv extends Env {
  type I = User
  type A = JWTAuthenticator
}

class DefaultEnv
