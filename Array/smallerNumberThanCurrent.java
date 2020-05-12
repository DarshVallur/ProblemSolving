//How Many Numbers Are Smaller Than the Current Number.

// Solution with : O(n^2)

class Solution {
		public int[] smallerNumberThanCurrent(int[] nums) {
			int data;
			int[] result = new int[nums.length];
			
			for(int i=0; i<nums.length; i++) {
				data = 0;
				for(int j=0; j<nums.length; j++) {
					if(j != i && (nums[j] < nums[i])) {
						data++;
					}
					result[i] = data;
				}
			}
				
			return result;
		}
}

//Solution with: Hashmap

class Solution {
	public int[] smallerNumberThanCurrent(int[] nums) {
			Map<Integer, Integer> map = new Hashmap<>();
			int[] copy = nums.clone();
			
			Arrays.sort(copy);
			
			for(int i = 0; i<nums.length; i++) {
				map.putIfAbsent(copy[i], i);
			}
			
			for(int i = 0; i<nums.length, i++) {
				copy[i] = map.get(nums[i]);
			}
			return copy;	
	}
}