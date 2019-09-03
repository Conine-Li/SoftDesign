package Bridge_jiayongdianqi;

public class TCL extends ElectronicsMaker {
    @Override
    public void produce() {
        String makerName="TCL 厂商生产 ";
        this.equipment.beProduce(makerName);
    }
}
