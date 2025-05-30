import java.util.ArrayList;

public class StackArray<T> implements Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(0, item); // LIFO: en üste ekleme
    }

    @Override
    public T pop() throws MyEmptyStackException {
        if (this.isEmpty()) {
            throw new MyEmptyStackException("Stack is empty, you can't pop any element");
        }
        return stack.remove(0);
    }

    @Override
    public void peek() {
        if (!isEmpty()) {
            System.out.println("The top is " + stack.get(0));
        } else {
            System.out.println("Stack is empty.");
        }
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
