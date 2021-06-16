import java.util.ArrayList;

public class FruitPlant extends MyElement{
    private ArrayList list =new ArrayList();
    public void add(MyElement elem){
        list.add(elem);
    }
    public void remove(MyElement elem){
        list.remove(elem);
    }
    @Override
    public void eat() {
        for(Object obj:list){
            ((MyElement)obj).eat();
        }
    }
}
