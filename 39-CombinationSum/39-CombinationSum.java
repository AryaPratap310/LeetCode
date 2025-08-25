// Last updated: 25/08/2025, 17:23:00
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int target) {
        List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll=new ArrayList<>();
		combination(coin,target,ll,0,ans);
		// System.out.println(ans);
        return ans;
    }
    public static void combination(int [] coin,int amt,List<Integer> ll,int idx,    List<List<Integer>> ans) {
		if(amt==0) {
			ans.add(new ArrayList<>(ll));               // important 
//			System.out.println(ll);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if(amt>=coin[i]) {
				ll.add(coin[i]);
				combination(coin,amt-coin[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
}