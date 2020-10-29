package security

import template.Application

trait CommercialSecurity extends Application {
  override def secure(): Unit = {
    println("apply commercial security rules")
  }
}
