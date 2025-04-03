        //   Insert a String in a Trie
        //   case 1: A Trie is Blank - APP
        //   case 2: New string's prefix is common to another strings prefix - API 
        //   case 3: New string's prefix is already present as complete string - APIS
        //   case 4: String to be inserted is already presented in Trie - APIS

        // Time Complexity : O(M)
        // Space Complexity : O(M)



package Trie.InsertStringInTrie;

public class Trie
{
    private TrieNode root;
    public Trie() 
    {
        root = new TrieNode();
        System.out.println("The Trie has been Created");
    }

    public void insert (String word)
    {
        TrieNode current = root;
        for (int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null)
            {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.print("Successfully inserted" + word+ " in trie");
    }

}



