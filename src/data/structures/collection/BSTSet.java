package data.structures.collection;

import data.structures.tree.BinarySearchTree;

/**
 * 类描述：底层使用二分搜索树实现set集合
 * @author zhangzhl
 *
 * @param <E>
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BinarySearchTree<E> bst;

    public BSTSet(){
        bst = new BinarySearchTree<>();
    }

    @Override
    public int getSize(){
        return bst.size();
    }

    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    @Override
    public void add(E e){
        bst.add(e);
    }

    @Override
    public boolean contains(E e){
        return bst.contains(e);
    }

    @Override
    public void remove(E e){
        bst.remove(e);
    }
}
