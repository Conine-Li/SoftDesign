package Bridge_jiayongdianqi;

public class Refrigeratory implements ElectricEquipment {
    @Override
    public void beProduce(String makerName) {
        System.out.println(makerName + "冰箱~");
    }
}
