// Last updated: 25/08/2025, 17:19:15
import java.util.Stack;

class StockSpanner {
    Stack<Integer> s;     // stores indices
    ArrayList<Integer> prices;  // stores prices
    int index;

    public StockSpanner() {
        s = new Stack<>();
        prices = new ArrayList<>();
        index = 0;
    }

    public int next(int price) {
        prices.add(price);

        while (!s.isEmpty() && prices.get(s.peek()) <= price) {
            s.pop();
        }

        int span;
        if (s.isEmpty()) {
            span = index + 1;
        } else {
            span = index - s.peek();
        }

        s.push(index);
        index++;
        return span;
    }
}