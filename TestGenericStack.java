public class TestGenericStack {
    public static void main(String[] args) {
        // Test with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        if (stringStack.isEmpty()){
            System.out.println("String list is empty");
        }
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");
        //stringStack.push(73); Throws Exception even in try try/catch

        if (stringStack.isEmpty()){
            System.out.println("String list is empty");
        }

        System.out.println("String Stack: " + stringStack);
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.getSize());
        System.out.println("String Stack: " + stringStack);
        System.out.println();

        // Test with Integers
        GenericStack<Integer> intStack = new GenericStack<>();
        if (intStack.isEmpty()) {
            System.out.println("Integer list is empty");
            try{
                intStack.pop();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        //intStack.push("Thirtyfive"); Throws exception even in try/catch

        if (intStack.isEmpty()){
            System.out.println("Integer list is empty");
        }
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.getSize());
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println();

        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(7.8);
        doubleStack.push(6.9);
        //doubleStack.push(12); Throws exception even in try/catch
        System.out.println("\nDouble Stack: " + doubleStack);
        System.out.println("Peek: " + doubleStack.peek());
        System.out.println("Pop: " + doubleStack.pop());
        System.out.println("Size: " + doubleStack.getSize());
        System.out.println("\nDouble Stack: " + doubleStack);
        System.out.println();
    }
}
