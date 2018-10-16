package task6;

public class ArrayWrapper<T> {
    T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    public T get(int i) {
        if (i < 1 || i > array.length) throw new IncorrectArrayWrapperIndex();
        else return array[i - 1];
    }

    public boolean replace(int i, T element) {
        if (i < 1 || i > array.length) throw new IncorrectArrayWrapperIndex();
        else {
            if (element instanceof String && array[i -1] instanceof String) {
                String tempStr = (String) array[i - 1];
                if (((String) element).length() > tempStr.length()) {
                    array[i - 1] = element;
                    return true;
                } else return false;
            }
            if (element instanceof Integer && array[i - 1] instanceof Integer) {
                if ((Integer) element > (Integer) array[i - 1]) {
                    array[i - 1] = element;
                    return true;
                } else return false;

            }
            return false;
        }
    }

}
