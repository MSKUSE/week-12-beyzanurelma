public class StackLinkedList<T> implements Stack<T> {
    StackItem<T> top;

    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        newBox.setNext(top);
        top = newBox;
    }

    @Override
    public T pop() throws MyEmptyStackException {
        if (top == null) {
            throw new MyEmptyStackException("Stack is empty");
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    @Override
    public void peek() {
        if (top != null) {
            System.out.println("The top is " + top.getData());
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void displayStack(){
        if(this.top==null){
            System.out.println("This stack is empty!!!");
        }else{
            StackItem <T>tempNode=top;
            while(tempNode!=null){
                System.out.println(tempNode.getData());
                tempNode=tempNode.getNext();

            }
        }

    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }

}
