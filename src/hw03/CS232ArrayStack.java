package hw03;

public class CS232ArrayStack implements CS232Stack<Object> {
private CS232ArrayList list;
    @Override
    public void push(Object obj) {
        list.add(obj);
    }

    @Override
    public Object pop() {
        if(list.size() == 0) {
            return null;
        }
        else {
          return list.remove(list.size() - 1);
        }
    }

    @Override
    public Object peek() {
        if (list.size() == 0) {
            return null;
        }
        else {
            return list.get(list.size());
        }
    }

    @Override
    public int size() {
        return list.size();
    }
    
}
