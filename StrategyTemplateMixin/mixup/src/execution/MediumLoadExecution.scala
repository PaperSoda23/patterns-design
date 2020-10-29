package execution

import template.Application

trait MediumLoadExecution extends Application {
  override def execute(): Unit = {
    println("execute medium")
  }
}
