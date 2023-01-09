public class ArrayAlgorithms {

    public static String longestString(String[] stringList) {
        String bigString = "";
        for (String string : stringList) {
            if (string.length() >= bigString.length()) {
                bigString = string;
            }
        }
        return bigString;
    }

    public static boolean containsPositive(int[] numList) {
        for (int num: numList) {
            if (num > 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] makeLowercase(String[] wordList) {
        String[] newStr = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            newStr[i] = wordList[i].toLowerCase();
        }
        return newStr;
    }

    public static int endsInExclamations(String[] stringList) {
        int counter = 0;
        for (String string: stringList) {
            if ((string.substring(string.length() - 1).equals("!"))) {
                counter++;
            }
        }
        return counter;
    }

    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] newArr = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] > intArr2[i]) {
                newArr[i] = intArr1[i];
            }   else   {
                newArr[i] = intArr2[i];
            }
        }
        return newArr;
    }

    public static int countConsecutiveDoubles(int[] numList) {
        int counter = 0;
        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] == numList[i + 1]) {
                counter++;
            }
        }
        return counter;
    }

    public static int longestStreak(int[] nums) {
        int tempCounter = 0;
        int counter = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                tempCounter++;
                if (tempCounter > counter) {
                    counter = tempCounter;
                }
            }   else   {
                tempCounter = 0;
            }
        }
        return counter;
    }


}

