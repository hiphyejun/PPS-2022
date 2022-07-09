import java.util.*;
//Collections.sort (list에서), deque -> pollFirst/pollLast(), peek(), isEmpty

class Solution {
    public int solution(int[] people, int limit) {
        List<Integer> list = new ArrayList<>();
        for(int x : people) list.add(x);
        Collections.sort(list);

                                          // 오버플로우방지
        ArrayDeque<Integer> dq = new ArrayDeque<>(50000);
        for(int x : list) dq.add(x);

        int ans = 0;
        while(dq.isEmpty() == false) {
            int weight = dq.pollLast();
            if(dq.isEmpty() == false && weight + dq.peekFirst() <= limit) { dq.pollFirst(); }
            ans++;
        }

        return ans;
    }
}