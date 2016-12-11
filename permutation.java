public class Solution {
  public List<List<Integer>> permute(int[] nums){
    ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
    if (nums == null || nums.length == 0) {
      return rst;
    }
    boolean[] visited = new boolean[nums.length];
    ArrayList<Integer> list = new ArrayList<>();
    helper(rst, list, nums, visited);
    return rst;
  }
  public void helper(ArrayList<ArrayList<Interger>> rst, ArrayList<Integer> list, int[] nums, boolean[] visited){
    if(list.size() == nums.length){
      rst.add(new ArrayList<Integer>(list));
      return;
    }
    for (int i = 0; i < nums.length; i++){
      if (visited[i] == true){
        continue;
      }
      list.add(nums[i]);
      visited[i] = true;
      helper(rst, list, nums, visited);
      list.remove(list.size() - 1);
      visited[i] = false;
    }
  }
}
