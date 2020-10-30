package security

import template.Application

trait PresentationalSecurity extends Application {
  override def performSecurityScan(): Unit = super.performSecurityScan()
  override def enableAttackWatcher(): Unit = super.enableAttackWatcher()
}
