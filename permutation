public class Solution {
  public List<List<Integer>> permute(int[] nums){
    ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
    if(nums == null){
      return rst;
    }
    
    if(nums.length == 0){
      rst.add(new ArrayList<Integer>());
      return rst;
    }
    
    ArrayList<Integer> list = new ArrayList<>();
    helper(rst, list, nums);
    return rst;
  }
  public void helper(ArrayList<ArrayList<Interger>> rst, ArrayList<Integer> list, int[] nums){
    if(list.size() == nums.length){
      rst.add(new ArrayList<Integer>(list));
      return;
    }
  }
}
