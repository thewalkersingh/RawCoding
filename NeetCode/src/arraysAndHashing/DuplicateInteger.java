package arraysAndHashing;
public class DuplicateInteger {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 3};
		System.out.println(hasDuplicate(nums));
	}
	
	public static boolean hasDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
}