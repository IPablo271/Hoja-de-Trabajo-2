import java.io.*;
import java.util.*;

public class StackVector<E> implements Stack<E>{
    protected Vector<E> data;

    public StackVector(){
        data =  new Vector<E>(100,1);
    }
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        
        return data.remove(data.size()-1);
    }

    @Override
    public E peek() {
        
        return data.lastElement();
    }

    @Override
    public boolean empty() {
        
        return data.isEmpty();
    }

    @Override
    public int size() {
        
        return data.size();
    }
    
}