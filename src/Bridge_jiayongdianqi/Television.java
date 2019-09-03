package Bridge_jiayongdianqi;

import BridgePenandColor.Color;

public class Television implements ElectricEquipment {
    @Override
    public void beProduce(String makerName) {
        System.out.println(makerName + "电视机~");
    }
}
