class Solution {
    public List<List<Integer>> generate(int numRows) {
        
    List<List<Integer>> result = new ArrayList<>();
        
    for(int i = 1; i <= numRows; i++){
        List<Integer> level = new ArrayList<>();
        for(int j = 1; j <= i; j++){
            
            if(j == 1 || j == i){
                level.add(1);
            }
            //처음과 끝에서는 1을 입력해준다.
            
            else{
                List<Integer> prevLevel = result.get(i-2); 
                level.add(prevLevel.get(j-2) + prevLevel.get(j-1));
            } // 원래 1 빼는데 제가 i,j를 0부터 시작하지않고 1로 시작해서 거기서 한번씩 더 빼줍니다.
        
        }
        
        result.add(level);
    }
    return result;
    }

}
//배열, 리스트 사용법.
// List 
//util.List 에 해당하고 생성할 때는 List<Type> 이름 = new ArrayList<Type>()
//list.add() 로 값을 입력하고 list.get()으로 값을 가져온다. 
