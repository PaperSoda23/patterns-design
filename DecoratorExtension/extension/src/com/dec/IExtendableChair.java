package com.dec;

import com.dec.extensions.ChairExtensionTypes;
import com.dec.extensions.IChairExtension;

public interface IExtendableChair {
    void addExtension(ChairExtensionTypes extensionName, IChairExtension extension);
    IChairExtension getExtension(ChairExtensionTypes extensionName);
    boolean hasExtension(ChairExtensionTypes extensionName);
    IChairExtension removeExtension(ChairExtensionTypes extensionName);
}
