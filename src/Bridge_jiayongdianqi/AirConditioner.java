package Bridge_jiayongdianqi;

public class AirConditioner implements ElectricEquipment {
    @Override
    public void beProduce(String makerName) {
        System.out.println(makerName + "空调~");
    }
}