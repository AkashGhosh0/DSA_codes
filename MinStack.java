class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (s2.empty() || val <= s2.peek()) {
            s2.push(val);
        }
        st.push(val);
    }

    public void pop() {
        if (s2.peek().equals(st.peek())) {
            s2.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
