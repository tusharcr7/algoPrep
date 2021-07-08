public class TrieImplementation {
	static final int ALPHABET_SIZE = 26;

	// trie node
	static class TrieNode {
		TrieNode[] children = new TrieNode[ALPHABET_SIZE];

		// isEndOfWord is true if the node represents
		// end of a word
		boolean isEndOfWord;

		TrieNode() {
			isEndOfWord = false;
			for (int i = 0; i < ALPHABET_SIZE; i++)
				children[i] = null;
		}
	};

	static TrieNode root;

	static void insert(TrieNode root, String key) {
		if (null == key || key.trim() == "")
			return;

		insert(root, key, 0, key.length());

	}

	static void insert(TrieNode root, String key, int i, int len) {

		if (i == len) {
			return;
		}

		TrieNode node = root.children[key.charAt(i) - 97];
		if (null != node) {
			if (len == i + 1) {
				root.isEndOfWord = true;
				return;
			}
			insert(node, key, i + 1, len);
		} else {
			TrieNode nodeNew = new TrieNode();
			root.children[key.charAt(i) - 97] = nodeNew;
			if (len == i + 1) {
				nodeNew.isEndOfWord = true;
			}
			insert(nodeNew, key, i + 1, len);

		}
	}

	// Function to use TRIE data structure and search the given string.
	static boolean search(TrieNode root, String key) {
		if (null == key || key.trim().equalsIgnoreCase("")) {
			return false;
		}

		TrieNode node = root.children[key.charAt(0) - 97];
		if (null == node)
			return false;

		if (key.length() == 1) {
			return node.isEndOfWord;
		}
		int len = key.length(), i = 1;

		while (len > i) {
			TrieNode temp = node.children[key.charAt(i) - 97];
			if (temp == null)
				return false;
			else {
				if (len == i + 1) {
					return temp.isEndOfWord;
				} else {
					i++;
					node = temp;
				}

			}

		}
		return false;
	}

}
