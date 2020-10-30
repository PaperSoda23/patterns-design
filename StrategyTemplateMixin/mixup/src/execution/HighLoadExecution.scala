package execution

import template.Application

trait HighLoadExecution extends Application {
  override def useLoadBalancers(): Unit = super.useLoadBalancers()
  override def optimizeAssets(): Unit = super.optimizeAssets()
}
