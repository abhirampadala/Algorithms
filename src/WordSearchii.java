import java.util.ArrayList;
import java.util.List;

public class WordSearchii {

	private class TrieNode {
		TrieNode[] children;
		boolean flag;

		public TrieNode() {
			children = new TrieNode[26];
			flag = false;
		}

	}
	
	public static void main(String[] args) {

	System.out.println(findWords());
	
	}
	private TrieNode root = new TrieNode();
	public void insert(String word) {
		
		TrieNode cur = root;

		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (cur.children[index] == null) {
				cur.children[index] = new TrieNode();
			}
			cur = cur.children[index];
		}
		cur.flag = true;
	}

	public static List<String> findWords() {
		
		

		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = { "oath", "pea", "eat", "rain" };
		
		List<String> res = new ArrayList<String>();
		
		if (board.length == 0)
			return res;
//		for (String word : words)
//					return null;
		return res;

	}

}
