public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }

    public Integer getIndexOrNull(String string1, char letter) {
        if (string1.indexOf(letter) == -1) {
            return null;
        } else {
        return string1.indexOf(letter);
        }
    }
    public Integer getIndexOrNull(String string1, String string2) {
        if (string1.indexOf(string2) == -1) {
            return null;
        } else {
        return string1.indexOf(string2);
        }
    }

    public String concatSubstring(String string1, int num1, int num2, String string2) {
        return string1.substring(num1, num2).concat(string2);
    }
}