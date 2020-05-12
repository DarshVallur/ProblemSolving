//Kids with the Greatest Number of Candies

class Solution {
	public list<Boolean> kidswithCandies(int[] candies, int extraCandies) { 
		List<Boolean> result = new ArrayList<Boolean>();
		int max = 0;
		
		for(int candy: candies) {
			max = Math.max(candy,max);
		}
		for(int candy: candies) {
			if(candy + extraCandies >= max) {
				result.add(true);
			}else {
				result.add(false);
			}
		}
		
		return result;
	}
}