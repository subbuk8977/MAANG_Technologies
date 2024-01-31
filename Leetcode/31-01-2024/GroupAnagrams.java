/*
	49. Group Anagrams

	Given an array of strings strs, group the anagrams together. You can return the answer in any order.

	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

*/



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        Map<String,List<String>> map=new HashMap<>();
        
        for(String str:strs){
            
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String word=new String(arr);
            
            if(!map.containsKey(word)){
                
                map.put(word,new ArrayList<>());
            }
            
            map.get(word).add(str);
        }
        
        return new ArrayList<>(map.values());
        
    }
}