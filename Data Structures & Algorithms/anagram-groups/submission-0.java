class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> h = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String srted = new String(arr);
            if(h.containsKey(srted)) {
                h.get(srted).add(strs[i]);
            }
            else {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                h.put(srted,l);
            }
        }
        for(String k : h.keySet()) {
            ans.add(h.get(k));
        }
        return ans;
    }
}
