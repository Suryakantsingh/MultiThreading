package multithreading;

import java.util.Comparator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet(new MyComperator());
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("k");
        treeSet.add("B");
        treeSet.add("a");

        System.out.println(treeSet);


    }
}

class MyComperator implements Comparator
{
    public int compare(Object obj1,Object obj2){
        String str1 = obj1.toString();
        String str2 = obj2.toString();
        return -str1.compareTo(str2);
    }
}