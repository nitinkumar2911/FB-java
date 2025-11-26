import java.util.*;
public class Practise {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add("nitin");
        list.add(70.89);
        System.out.println(list);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
        System.out.println();
        iterator.remove();
        System.out.println(list);
        ListIterator listIterator = list.listIterator();
        System.out.println("forward Traversal --->");
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+ " ");

        }
        System.out.println();
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+ " ");
        }

    }
    
}
