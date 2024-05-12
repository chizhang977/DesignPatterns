package com.justin.composite;
// leaf
//叶节点对象，不包含子节点
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }
    @Override
    public void add(Component c) {
        System.out.println("不能添加子节点");
    }

    @Override
    public void remove(Component c) {
        System.out.println("不能删除子节点");
    }

    @Override
    public void display(int depth) {
        // 显示叶子节点
        System.out.println( " " + depth + "-" + name);
    }
}
