import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> StringList = new LinkedList<String>();
        String a;
        String b;
        int positionA = 1;
        int positionB = 2;

        StringList.add("something 1");
        StringList.add("something 2");
        StringList.add("something 3");
        StringList.add("something 4");
        System.out.println(StringList);

        a = StringList.get(positionA);
        b = StringList.get(positionB);
        StringList.remove(a);
        StringList.remove(b);
        StringList.add(positionA,b);
        StringList.add(positionB,a);






        System.out.println(StringList);
    }


    }




