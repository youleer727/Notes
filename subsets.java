
public class Solution{
  public ArrayList<ArrayList<Integer>> subsets(int[] nums){
    ArrayList<ArrayList<Integer>> rst = new ArrayList<>();
    if (nums == null || nums.length == 0){
      return rst;
    }
    Arrays.sort(nums);
    ArrayList<Integer> list = new ArrayList<>();
    getsubset(rst, list, nums, 0);
  }
  
  public void getsubset(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list, int[] nums, int pos){
    rst.add(new ArrayList<Integer>(list));
    for (int i = pos; i < nums.length; i++){
      list.add(nums[i]);
      getsubset(rst, list, nums, i + 1);
      list.remove(list.size() - 1);
    }
  }
}
