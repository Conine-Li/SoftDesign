package Bridge_jiayongdianqi;

public class Hisense extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="海信 厂商生产 ";
        this.equipment.beProduce(makerName);
    }
}
