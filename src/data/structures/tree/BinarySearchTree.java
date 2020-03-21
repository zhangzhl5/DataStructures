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
	
	/**
	 * 方法描述：判断二分搜索树中是否包含e
	 * @param e
	 * @return
	 */
	public boolean contains(E e) {
		
		return contains(root,e);
	}
	
	/**
	 * 方法描述：以root为根判断是否包含某元素e，递归算法
	 * @param node
	 * @param e
	 * @return
	 */
	public boolean contains(Node node,E e) {
		if(node == null) 
			return false;
		if(e.compareTo(node.e) == 0) {
			return true;
		} else if(e.compareTo(node.e) < 0) {
			return contains(node.left,e);
		} else {
			return contains(node.right,e);
		}
	}
	
	/**
	 * 方法描述：二分搜索树的前序遍历
	 */
	public void preOrder() {
		preOrder(root);
	}

	/**
	 * 方法描述：前序遍历以node为根的二分搜索树，递归遍历
	 * @param node
	 */
	private void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	/**
	 * 方法描述：二分搜索树的中序遍历
	 */
	public void inOrder() {
		inOrder(root);
	}

	/**
	 * 方法描述：中序遍历以node为根的二分搜索树，递归遍历
	 * @param node
	 */
	private void inOrder(Node node) {
		if(node == null) {
			return;
		}
		preOrder(node.left);
		System.out.println(node.e);
		preOrder(node.right);
	}
	
	/**
	 * 方法描述：二分搜索树的后序遍历
	 */
	public void postOrder() {
		postOrder(root);
	}

	/**
	 * 方法描述：后序遍历以node为根的二分搜索树，递归遍历
	 * @param node
	 */
	private void postOrder(Node node) {
		if(node == null) {
			return;
		}
		preOrder(node.left);
		preOrder(node.right);
		System.out.println(node.e);
	}
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		int[] nums = {5,3,6,8,4,2};
		for(int s : nums) {
			bst.add(s);
		}
		bst.preOrder();
		System.out.println("---------");
		bst.inOrder();
		System.out.println("---------");
		bst.postOrder();
	}
}
