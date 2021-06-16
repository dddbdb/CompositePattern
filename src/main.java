public class main {
    public static void main(String[] args) {
        MyElement obj1,obj2,obj3,obj4,obj5;
        FruitPlant plant1,plant2,plant3;

        obj1=new Apple();
        obj2=new Banana();
        obj3=new Pear();
        obj4=new Banana();
        obj5=new Apple();
        plant1=new FruitPlant();
        plant2=new FruitPlant();
        plant3=new FruitPlant();

        plant1.add(obj1);
        plant1.add(obj2);
        plant2.add(obj3);
        plant2.add(obj4);
        plant3.add(plant1);
        plant3.add(plant2);
        plant3.add(obj5);
        plant3.eat();
    }
}
