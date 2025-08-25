// Last updated: 25/08/2025, 17:22:30
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll=new ArrayList<>(); 
		combination(1,n,k,ll,ans);
        return ans;
    }
    public static void combination(int idx,int n,int k,List<Integer> ll,List<List<Integer>> ans) {
		if(k==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=idx;i<=n;i++) {
			ll.add(i);
			combination(i+1,n, k-1, ll, ans);
			ll.remove(ll.size()-1);
		}
	}

}