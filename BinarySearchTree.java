 

public class BinarySearchTree<K extends Comparable<K>, V> {
     private Node root;
     
     void insert(K key, V value) {
    	    if (search(this.root, key) != null) return; // key already present
    	    add(root, key, value);
    	}

    	public void add(Node node, K key, V value) {
    	    if (key.compareTo((K) node.key) < 0)
    	    	add(node.left, key, value);
    	    else
    	    	add(node.right, key, value);
    	}
	
	public V search(Node node, K key) {
		if(node == null) return null;
		
		int cmp = key.compareTo((K) node.key);
	    if (cmp < 0)
	        return search(node.left, key);
	    else if (cmp > 0)
	        return search(node.right, key);
	    else
	        return (V) node.val;
	}
	
	private Node getMin(Node node) {
	    if (node.left != null)
	        return getMin(node.left);
	    else
	        return node;
	}
	private Node getMax(Node node) {
	    if (node.left != null)
	        return getMax(node.right);
	    else
	        return node;
	}
	private class Node<K, V> {
		private K key;
		private V val;
		private Node left, right;
		public Node(K key, V val) {
			this.key = key;
			this.val = val;
		}
	}
    
   
	
} 