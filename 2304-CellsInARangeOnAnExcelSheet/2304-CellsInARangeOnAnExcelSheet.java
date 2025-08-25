// Last updated: 25/08/2025, 17:15:52

class Solution {
    public List<String> cellsInRange(String s) {

    // runtime 1 ms

    //cs= Column Start //ce= Column End
    //rs= Row Start   //re= Row End
    char cs=s.charAt(0),ce=s.charAt(3);
    char rs=s.charAt(1),re=s.charAt(4);

    List<String> ls=new ArrayList<>();
    //c - cell
    for(char c=cs;c<=ce;c++){
        // r - row
        for(char r=rs;r<=re;r++){
            ls.add(new String(new char[]{c,r} ));
        }
    }

    return ls;


  
    }
}