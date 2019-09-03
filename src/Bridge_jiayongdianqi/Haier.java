package Bridge_jiayongdianqi;

public class Haier extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="海尔 厂商生产 ";
        this.equipment.beProduce(makerName);
    }
}