package com.dec;

import com.dec.entity.ISitter;
import com.dec.extensions.ChairExtensionTypes;
import com.dec.extensions.IChairExtension;
import com.dec.extensions.IWeightable;
import com.dec.extensions.WheelsChairExtension;

import java.util.HashMap;

public class Chair implements IChair, IExtendableChair, IWeightable {
    private final HashMap<String, IChairExtension> extensionMap = new HashMap<>();
    private ISitter sitter = null;
    private double weight = 0;


    public Chair(double baseWeight) {
        weight = baseWeight;
    }


    @Override
    public boolean sitOn(ISitter sitter) {
        if (this.sitter != null) return false;

        this.sitter = sitter;
        return true;
    }

    @Override
    public int move(DirectionType directionType, int distance) {
        int time = 10;

        if (weight > 20) {
            time =  20;
        }

        if (weight > 30) {
            time = 30;
        }

        if (hasExtension(ChairExtensionTypes.WHEELS)) {
            var wheelsExtension =  (WheelsChairExtension)getExtension(ChairExtensionTypes.WHEELS);
            return wheelsExtension.move(directionType, distance, time);
        }

        return time;
    }

    public void addExtension(ChairExtensionTypes extensionName, IChairExtension extension) {
        extensionMap.put(extensionName.toString(), extension);
    }

    public IChairExtension getExtension(ChairExtensionTypes extensionName) {
        return extensionMap.get(extensionName.toString());
    }

    public boolean hasExtension(ChairExtensionTypes extensionName) {
        return extensionMap.containsKey(extensionName.toString());
    }

    public IChairExtension removeExtension(ChairExtensionTypes extensionName) {
        var extension =  extensionMap.remove(extensionName.toString());
        removeExtensionWeight(extension);

        return extension;
    }

    private void removeExtensionWeight(IChairExtension chairExtension) {
        var weightableExtension = (IWeightable)chairExtension;
        var extensionWeight = weightableExtension.getWeight();
        this.weight -= extensionWeight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
