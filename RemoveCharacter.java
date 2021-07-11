class RemoveCharacter{
    static String removeChars(String s1, String s2){
     	for (int i = 0; i < s2.length(); i++) {
			if (s1.indexOf(s2.charAt(i)) != -1) {

				s1 = s1.replaceAll(String.valueOf(s2.charAt(i)), "");
			}

		}
		return s1;
    }
}
