        //   Delete a String from Trie
        //   case 1: Some other prefix of string is same as the one that we want to delete. (API, APPLE)

        //   case 2: The string is a prefix of another string. (API, APIS)

        //   case 3: Other string is a prefix of this string. (APIS, AP)

        //   case 4: Not any node depends on this String (K).

        // Time Complexity : O(M)
        // Space Complexity : O(1)



package Trie.DeleteStringFromTrie;

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

    // Search for a word in Trie  

    public boolean search(String word)
    {
        TrieNode currentNode = root;
        for (int i=0; i<word.length(); i++)
        {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                System.out.println("Word :" +word+ " does not exist in Trie");
                return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString == true)
        {
            System.out.println("Word :" +word+ " Exist in Trie");
                return true;
        }else{
            System.out.println("Word :" +word+ " does not exist in Trie. But it is a prefix of another string");
        }
        return currentNode.endOfString;
    }

    // Delete a String from Trie

    private boolean delete(TrieNode parentNode, String word, int index)
    {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (currentNode.children.size() > 1)
        {
            delete(currentNode, word, index+1);
            return false;
        }

        if (index == word.length() - 1)
        {
            if (currentNode.children.size() >= 1)
            {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }

        if (currentNode.endOfString == true)
        {
            delete(currentNode, word, index+1);
            return false;
        }

        canThisNodeBeDeleted = delete(currentNode, word, index+1);
        if (canThisNodeBeDeleted == true)
        {
            parentNode.children.remove(ch);
            return true;
        }else {
            return false; 
        }
    }
    public void delete(String word) {
        if (search(word) == true)
        {
            delete (root, word, 0);
        }
    }
}



