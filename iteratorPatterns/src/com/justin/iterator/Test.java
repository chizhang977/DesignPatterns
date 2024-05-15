package com.justin.iterator;

// 迭代器接口
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// 集合接口
interface Aggregate<T> {
    Iterator<T> createIterator();
}

// 具体迭代器实现
class ConcreteIterator<T> implements Iterator<T> {
    private T[] items;
    private int position = 0;

    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public T next() {
        T item = items[position];
        position++;
        return item;
    }
}

// 具体集合实现
class ConcreteAggregate<T> implements Aggregate<T> {
    private T[] items;

    public ConcreteAggregate(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}

public class Test {
    public static void main(String[] args) {
        // 创建具体集合对象
        Integer[] numbers = {1, 2, 3, 4, 5};
        Aggregate<Integer> aggregate = new ConcreteAggregate<>(numbers);

        // 使用迭代器遍历集合元素
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
