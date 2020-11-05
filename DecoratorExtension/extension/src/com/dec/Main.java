package com.dec;

import com.dec.entity.Person;
import com.dec.extensions.BackrestChairExtension;
import com.dec.extensions.ChairExtensionTypes;
import com.dec.extensions.WheelsChairExtension;

public class Main {
    public static void main(String[] args) {
        var chair = new Chair(20);

        chair.addExtension(ChairExtensionTypes.BACKREST, new BackrestChairExtension(chair, 4));
        chair.addExtension(ChairExtensionTypes.WHEELS, new WheelsChairExtension(chair, 2));

        if (chair.hasExtension(ChairExtensionTypes.BACKREST)) {
            var backrestExtension = (BackrestChairExtension)chair.getExtension(ChairExtensionTypes.BACKREST);
            backrestExtension.lean(1200);
        }

        chair.move(DirectionType.RIGHT, 40);
        System.out.println(chair.getWeight());

        chair.removeExtension(ChairExtensionTypes.WHEELS);
        chair.move(DirectionType.RIGHT, 40);
        System.out.println(chair.getWeight());

        chair.sitOn(new Person());
    }
}
