package security

import template.Application

trait PresentationalSecurity extends Application {
  override def secure(): Unit = {
    println("apply presentational security rules")
  }
}
