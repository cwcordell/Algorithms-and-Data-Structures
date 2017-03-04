/**
 * Created by corycordell on 2/20/17.
 */

package Trees;

import java.util.HashMap;
import java.util.Iterator;

public class Tries {
    HashMap<Character, Tries> hm = new HashMap<Character, Tries>();

    public void add(String s, int index) {
        Tries trie = hm.getOrDefault(s.charAt(index), null);
        if(trie == null) {
            trie = hm.put(s.charAt(index), new Tries());
        }

        if(s.length() > ++index)
            trie.add(s, index);
    }

    public boolean contains(String s, int index) {
        if(index == s.length())
            return true;

        Tries trie = hm.getOrDefault(s.charAt(index), null);
        if(trie != null)
            return trie.contains(s, ++index);

        return false;
    }

    public void remove(String s, int index) {
        if(index == s.length()) return;

        Tries trie = hm.getOrDefault(s.charAt(index), null);
        if(trie == null) return;

        trie.remove(s, index + 1);
        if(trie.getBranchCount() == 0)
            hm.remove(s.charAt(index));
    }

    public int getBranchCount() {
        return hm.size();
    }

    public int getTotalBranchCount() {
        int count = 0;
        Iterator<Tries> iter = hm.values().iterator();
        while(iter.hasNext()) {
            count += iter.next().getTotalBranchCount();
        }
        return count + getBranchCount();
    }

    public int getStringCount() {
        int count = 0;
        if(hm.size() == 0) return 1;
        Iterator<Tries> iter = hm.values().iterator();
        while(iter.hasNext()) {
            count += iter.next().getStringCount();
        }
        return count + getBranchCount();
    }
}
