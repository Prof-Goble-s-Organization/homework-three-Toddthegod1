package hw03;
public class Pair <T, U> {
    private T first;
    private U second;


public Pair(T first, U second) {
    this.first = first;
    this.second = second;
}

public T getFirst() {
    return first;
}

public U getSecond() {
    return second;
}

public void setFirst(T first) {
    this.first = first;
}

public void setSecond(U second) {
    this.second = second;
}

public static void main(String[] args) {
    Pair<Integer, Integer> intPair = new Pair<>(1,2);
    Pair<Double, String> mixPair = new Pair<>(2.4, "String");
    Pair<Pair<Integer, Integer>, Pair<Double,String>> pairPair = new Pair<>(intPair, mixPair);
}
}