public class ReturnLongestString {

    public String longest(String[] arr){

        String longestStr = arr[0];

        for (String str : arr) {
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }

        return longestStr;
    }
}