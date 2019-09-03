package Bridge_jiayongdianqi;
public class Client {
    public static void main(String[] args) {
        ElectricEquipment quipment;
        ElectronicsMaker maker;

        maker = new Haier();//创建一个ElectronicsMaker的子类Haier的实例对象（海尔厂商）
        quipment = new Television();//创建一个ElectricEquipment的子类Television的实例对象
        maker.setEquipment(quipment);//将Haier的实例对象和Television的实例对象关联
        maker.produce();//调用Haier的对象produce()方法，让这方法去调用Television对象中的beProduce()方法

        quipment = new AirConditioner();//空调
        maker.setEquipment(quipment);//将海尔厂商与空调关联
        maker.produce();

        quipment = new Refrigeratory();//冰箱
        maker.setEquipment(quipment);//将海尔厂商与冰箱关联
        maker.produce();

        System.out.println("---------------------------");

        maker = new Hisense();//创建Hisense的实例对象（海信厂商）
        quipment = new Television();//创建Television的实例对象
        maker.setEquipment(quipment);//将Hisense的实例对象和Television的实例对象关联
        maker.produce();//调用Hisense对象的produce()方法，让这方法去调用Television对象中的beProduce()方法

        quipment = new AirConditioner();//空调
        maker.setEquipment(quipment);//将海信厂商与空调关联
        maker.produce();

        quipment = new Refrigeratory();//冰箱
        maker.setEquipment(quipment);//将海信厂商与冰箱关联
        maker.produce();
    }
}
