public class Main {
    public static void main(String[] args){

        StackLinkedList<Object> stack = new StackLinkedList<>();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push("This is a test");
        stack.displayStack();

        stack.peek(); // Stack'teki en üst elemanı yazdırır
        try {
            System.out.println(stack.pop()); // "This is a test"
        } catch (MyEmptyStackException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(stack.isEmpty());

        //stack.push("This is a test");

        /*
        ArrayList<String>stringList=new ArrayList<>();
        stringList.add("String");
        stringList.add("Beyza");
        System.out.println(stringList);

        HashMap<String,Double> grades=new HashMap();
        grades.put("Ali",10.0);
        grades.put("Pelin",75.4);
        grades.put("Koray",4.5);
        System.out.println(grades);
        grades.put("Ali",100.0);
        System.out.println(grades);
*/

    }
}