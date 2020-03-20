package data.structures.tree;

/**
 * 类描述： 二分搜索树
 * 
 * @author zhangzhl
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<E>> {

	// 树节点
	private class Node {
		public E e;
		public Node right, left;

		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}

	}

	private Node root;
	private int size;

	public BinarySearchTree() {
		root = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public void add(E e) {
		root = add(root, e);
	}

	
	/**
	 * 方法描述：向以node为根的二分搜索树中插入元素e，递归算法
	 * 返回值插入新节点后的二分搜索树的根
	 * @param node
	 * @param e
	 * @return
	 */
	private Node add(Node node, E e) {
		if (node == null) {
			size++;
			return new Node(e);
		}
		// 递归添加
		if (e.compareTo(node.e) < 0) {
			node.left = add(node.left, e);
		} else if (e.compareTo(node.e) > 0) {
			node.right = add(node.right, e);
		}
		return node;
	}

}
