class Solution {
    public List<String> summaryRanges(int[] nums) {
        //nums : 숫자 배열 
        //연속되었는지 확인한다. 연속되었다면 수를 저장한다. 연속이 끝나면 저장된 수를 범위의 끝으로 하고 출력. 
        //연속되지 않았다면 그 수를 출력한다. 
        List<String> list = new ArrayList<>();
        int stack=0;
        int start=0;
        int end=99999; //0으로 초기화를 했었는데 0이 한개만 입력되는 겨우에 0->0으로 출력이 되어서 임의로 값을 지정해줌.
        
        for (int i =0; i<nums.length; i++) {
            if(i == nums.length-1) // 마지막 부분 따로 설정
            {
                if(end == nums[i]) //연속인채로 마지막에 도달.
                    list.add(""+start+ "->" + ""+end);
                else 
                    list.add(""+nums[i]);
            }
            
            else //마지막이 아닌경우
            {
                if(stack==1)//연속중일때 
                {
                    if(nums[i+1]==nums[i]+1){
                        end =nums[i+1]; 
                        stack = 1;
                        }
                    else {
                    list.add(""+start+ "->" + ""+end);
                    stack =0;  //스택초기화  
                    }
                }
                else if(stack ==0)  
                {
                if(nums[i+1]==nums[i]+1){
                    start = nums[i];
                    stack = 1;
                    end = nums[i+1];
                } else {
                    list.add(""+nums[i]);
                    stack =0;    
                }
            
                } 
     
        }
    }
    return list;
    } 
}