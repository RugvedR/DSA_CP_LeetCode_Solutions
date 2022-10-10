class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<>());
                map.get(temp).add(strs[i]);
            }
            else{
                map.get(temp).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}