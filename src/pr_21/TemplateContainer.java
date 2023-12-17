package pr_21;

import java.util.ArrayList;
import java.util.List;

public class TemplateContainer <T>{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; ++i){
            list.add((int)(Math.random() * 10));
        }
        TemplateContainer<Integer> templateContainer = new TemplateContainer<>(list);
        System.out.println("Initial list: " + templateContainer.getList());
        list.clear();
        for (int i = 0; i < 7; ++i){
            list.add((int)(Math.random() * 10));
        }
        System.out.println("Data with index 3: " + templateContainer.getData(3));
        templateContainer.SaveAndShow(list);
        System.out.println("New list: " + templateContainer.getList());
    }
    private List<T> list;

    public TemplateContainer(List<T> list){
        this.list = new ArrayList<>(list.size());
        this.list.addAll(list);
    }

    public T getData(int index){
        return list.get(index);
    }

    public List<T> getList(){
        return list;
    }
    public void SaveAndShow(List<T> list){
        int i = 0;
        for (T item : list) {
            this.list.add(item);
            ++i;
        }
    }
}
