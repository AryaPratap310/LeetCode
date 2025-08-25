// Last updated: 25/08/2025, 17:22:58
class Solution {
    public List<List<Integer>> combinationSum2(int[] coin, int target) {
        List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll=new ArrayList<>();
        Arrays.sort(coin);
		combination(coin,target,ll,0,ans);
		// System.out.println(ans);
        return ans;
    }
    public static void combination(int [] coin,int amt,List<Integer> ll,int idx,    List<List<Integer>> ans) {
		if(amt==0) {
			ans.add(new ArrayList<>(ll));               // important 
			return;
		}
		for (int i = idx; i < coin.length; i++) {
            if(i>idx && coin[i]==coin[i-1]) continue;
            if(amt<coin[i])break;
				ll.add(coin[i]);
				combination(coin,amt-coin[i],ll,i+1,ans);
				ll.remove(ll.size()-1);
			
		}
	}
}