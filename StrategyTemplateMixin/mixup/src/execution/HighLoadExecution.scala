package execution

import template.Application

trait HighLoadExecution extends Application {
  override def execute(): Unit = {
    println("execute high")
    optimizeAssets()
    startLoadBalancers()
    addHighSecurity
  }

  private def addHighSecurity: Unit = println("add high security")
}
