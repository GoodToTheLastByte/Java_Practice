package Exercism;



class Container<E> {
    private E object;

    public void set(E object) { this.object = object;}
    public E get() { return object; }
}

class Shape<T> {
    private T value;

    public void set (T value){ this.value = value;}

    public T getValue(){
        return value;
    }
}





public class Generics {
    public static void main(String[] args) {

        Container<String> stringContainer = new Container<String>();

        stringContainer.set("Some String...");

        String result = stringContainer.get();
        System.out.println(result); 


        Shape<String> myShape = new Shape<>();

        myShape.set("String ");

    }
}