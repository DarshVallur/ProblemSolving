//Defanging an IP Address

class Solution {
	public String defanIPaddr(String address) {
		String result = address.replace(".","[.]");
		return result
	}
}