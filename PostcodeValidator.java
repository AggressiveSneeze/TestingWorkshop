public class PostCodeValidator {

	List<String> validPostCodes = new List<String>();

	public static void addPostcodes(List<String> validPostCodes) {

		for(String postcode: validPostCodes) validPostCodes.add(postcode);
		
	}


	public static boolean isValid(String postcode) {
		return validPostCodes.contains(postcode);
	}


}