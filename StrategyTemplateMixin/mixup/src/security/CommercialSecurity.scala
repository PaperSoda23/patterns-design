package security

import template.Application

trait CommercialSecurity extends Application {
  override def encryptCommunication(): Unit = super.encryptCommunication()
  override def performSecurityScan(): Unit = super.performSecurityScan()
  override def setupFirewall(): Unit = super.setupFirewall()
  override def enableAttackWatcher(): Unit = super.enableAttackWatcher()
}
