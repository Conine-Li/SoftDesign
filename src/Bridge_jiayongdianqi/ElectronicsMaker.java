package Bridge_jiayongdianqi;

public abstract class ElectronicsMaker {
protected ElectricEquipment equipment;//定义ElectricEquipment类型对象
    public void setEquipment(ElectricEquipment equipment) {
        this.equipment = equipment;
    }
    public abstract void produce();
}
