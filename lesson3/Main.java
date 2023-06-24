package lesson3;

public class Main {

    public static void main(String[] args) {
        
        LinkedListT<Integer> listT = new LinkedListT<>();
        
        listT.add(2);
        listT.add(4);
        listT.add(3);
        listT.add(1);
        listT.add(-3);

        listT.print();
        listT.sort();
        listT.print();
    
    }

}