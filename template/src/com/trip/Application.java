package com.trip;

abstract public class Application {
    private void secure() {
        optimizeAssets();
        useLoadBalancer();
    }

    protected void optimizeAssets() {
        System.out.println("optimizing assets");
    }

    protected void useLoadBalancer() {
        System.out.println("using load balancer");
    }

    private void execute() {
        System.out.println("default execution");
    }

    protected void setupFirewall() {
        System.out.println("setuping firewall");
    }

    protected void enableAttackWatcher() {
        System.out.println("enable attack watcher");
    }

    protected void encryptCommunication() {
        System.out.println("encrypting communication");
    }

    protected void performSecurityScan() {
        System.out.println("performing security scans");
    }

    public void start() {
        secure();
        execute();
    }
}
