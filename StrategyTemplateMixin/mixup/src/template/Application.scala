package template

abstract class Application {
  private def secure(): Unit = {
    encryptCommunication()
    performSecurityScan()
    enableAttackWatcher()
    setupFirewall()
  }

  private def execute(): Unit = {
    optimizeAssets()
    useLoadBalancers()
  }

  def start(): Unit = {
    secure()
    execute()
  }

  def optimizeAssets(): Unit = println("optimizing assets")
  def useLoadBalancers(): Unit = println("start balancers")


  def setupFirewall(): Unit = println("setup firewall")
  def encryptCommunication(): Unit = println("encrypt communication")
  def performSecurityScan(): Unit = println("apply security")
  def enableAttackWatcher(): Unit = println("enable attack watcher")
}
