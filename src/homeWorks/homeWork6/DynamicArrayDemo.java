package homeWorks.homeWork6;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(6);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.print();
        System.out.println(dynamicArray.getByIndex(3));
        System.out.println(dynamicArray.getByIndex(26));
        dynamicArray.add(2);
        dynamicArray.add(14);
        dynamicArray.add(25);
        dynamicArray.add(46);
        dynamicArray.add(37);
        dynamicArray.add(29);
        dynamicArray.print();


    }

}
