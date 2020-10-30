package execution

import template.Application

trait MediumLoadExecution extends Application {
  override def optimizeAssets(): Unit = super.optimizeAssets()
}
