// Last updated: 25/08/2025, 17:19:52
class Solution {
    public boolean judgeCircle(String moves) {
        int xaxis=0;
        int yaxis=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                xaxis--;
            }
            else if(moves.charAt(i)=='R'){
                xaxis++;
            }
            else if(moves.charAt(i)=='U'){
                yaxis++;
            }
            else{
                yaxis--;
            }

        }
        if(xaxis==0 && yaxis==0){
            return true;
        }
        return false;
    }
}