// Last updated: 25/08/2025, 17:17:07
class OrderedStream {
    int ptr;
    String[] res;
    
    public OrderedStream(int n) {
        ptr = 0;
        res = new String[n];
    }
    
    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>();
        
        res[id - 1] = value;
        while (ptr < res.length && res[ptr] != null) {
            list.add(res[ptr]);
            ptr++;
        }
        
        return list;
    }
}