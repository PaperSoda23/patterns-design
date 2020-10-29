package com.trip;

import com.trip.template.*;

public class Main {
    public static void main(String[] args) {
	    var hlca = new HighLoadCommercialApplication();
	    var hlpa = new HighLoadPresentationalApplication();
	    var mlca = new MediumLoadCommercialApplication();
        var mlpa = new MediumLoadPresentationalApplication();
        var def = new DefaultApplication();

        hlca.start();
        System.out.println("\n");
        hlpa.start();
        System.out.println("\n");
        mlca.start();
        System.out.println("\n");
        mlpa.start();

        def.start();
    }
}
