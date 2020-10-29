package template

abstract class Application {
  protected def secure(): Unit = {
    applySecurityHeaders()
    setupFirewall()
  }

  protected def execute(): Unit = {
    optimizeAssets()
    startLoadBalancers()
  }

  def start(): Unit = {
    secure()
    execute()
  }

  def optimizeAssets(): Unit = println("optimizing assets")
  def startLoadBalancers(): Unit = println("start balancers")
  def setupFirewall(): Unit = println("setup firewall")
  def applySecurityHeaders(): Unit = println("add headers")
}
