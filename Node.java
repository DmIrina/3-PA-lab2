public class Node {
    int n;
    int[] key = new int[2 * BTree.T - 1];
    Node[] child = new Node[2 * BTree.T];
    boolean leaf = true;


    public int find(int k) {
        for (int i = 0; i < this.n; i++) {
            if (this.key[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
