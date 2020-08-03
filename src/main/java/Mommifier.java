public class Mommifier {

    private float count = 0;
    private static String MOMMY = "mommy";

    public String convert(String string) {
        if(string.isEmpty()) {
            return "";
        }

        for (int i = 0; i < string.length(); ++i) {
            if(isVowels(string.charAt(i))) {
                ++count;
            }
        }

        if(count / string.length() <= 0.3) {
            return string;
        }

        StringBuffer stringBuffer = new StringBuffer(string);
        int insertTimes = 0;
        for (int i = 0; i < string.length() - 1; ++i) {
            if(isVowels(string.charAt(i)) && isVowels(string.charAt(i + 1))) {
                stringBuffer.insert(i + 1 + insertTimes * 5, MOMMY);
                ++insertTimes;
            }

        }
        return stringBuffer.toString();
    }

    private boolean isVowels(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
            return false;
    }

}
