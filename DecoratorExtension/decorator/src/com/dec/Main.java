package com.dec;

import com.dec.decorators.BackrestChairDecorator;
import com.dec.decorators.WheelsChairDecorator;
import com.dec.decorators.wheels.BusinessWheels;
import com.dec.decorators.wheels.HotWheels;
import com.dec.entity.Person;

public class Main {

    public static void main(String[] args) {
        var modernChair = new BackrestChairDecorator(
                new WheelsChairDecorator(new Chair(), new BusinessWheels()), 90, 160);
        var officeChair = new WheelsChairDecorator(new Chair(), new HotWheels());

        modernChair.move(Direction.RIGHT, 20);
        modernChair.sitOn(new Person("Jack"));
        modernChair.lean(120);
        modernChair.setAngle(130);
        System.out.println("weight: " + modernChair.getWeight());

        System.out.println("\n");

        officeChair.sitOn(new Person("Frank"));
        officeChair.move(Direction.LEFT, 40);
        System.out.println("weight: " + officeChair.getWeight());
        // can't lean
    }
}
