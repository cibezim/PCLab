package questions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Main {

        // Question 1
        public static int findLastIndex(String[] names) {
            return names.length - 1;
        }

        // Question 2
        public static int findSecondToLastIndex(String[] names) {
            return names.length - 2;
        }

        // Question 3
        public static String getFirstItem(String[] names) {
            return names[0];
        }

        // Question 4
        public static String getLastItem(String[] names) {
            return names[names.length - 1];
        }

        // Question 5
        public static String getSecondToLastItem(String[] names) {
            return names[names.length - 2];
        }

        // Question 6
        public static int calculateSum(int[] ints) {
            int sum = 0;
            for (int num : ints) {
                sum += num;
            }
            return sum;
        }

        // Question 8
        public static int calculateAverage(int[] ints) {
            int sum = 0;
            for (int num : ints) {
                sum += num;
            }
            return sum / ints.length;
        }

        // Question 9
        public static String extractOddNumbers(int[] numbers) {
            StringBuilder oddNums = new StringBuilder();
            for (int num : numbers) {
                if (num % 2 != 0) {
                    oddNums.append(num).append(" ");
                }
            }
            return oddNums.toString().trim();
        }

        // Question 10
        public static String extractEvenNumbers(int[] numbers) {
            StringBuilder evenNums = new StringBuilder();
            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenNums.append(num).append(" ");
                }
            }
            return evenNums.toString().trim();
        }

        // Question 11
        public static boolean containsElement(String[] names, String element) {
            for (String name : names) {
                if (name.equals(element)) {
                    return true;
                }
            }
            return false;
        }

        // Question 12
        public static int findIndexByElement(String[] names, String element) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(element)) {
                    return i;
                }
            }
            return -1;
        }

        // Question 13
        public static void printOddNumbersInRange(int start, int end) {
            StringBuilder oddNums = new StringBuilder();
            while (start <= end) {
                if (start % 2 != 0) {
                    oddNums.append(start).append(" ");
                }
                start++;
            }
            System.out.println(oddNums.toString().trim());
        }

        // Question 14
        public static String repeatFirstThreeCharacters(String str, int n) {
            String firstThreeChars = str.substring(0, Math.min(3, str.length()));
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < n; i++) {
                newStr.append(firstThreeChars);
            }
            return newStr.toString();
        }

        // Question 15
        public static int countWordsInString(String str) {
            String[] words = str.split("\\s+");
            return words.length;
        }

        // Question 16
        public static int countVowels(String str) {
            Pattern pattern = Pattern.compile("[aeiouyAEIOUY]");
            Matcher matcher = pattern.matcher(str);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            return count;
        }

        // Question 17
        public static String[] swapFirstAndLast(String[] stringArray) {
            if (stringArray.length >= 2) {
                String temp = stringArray[0];
                stringArray[0] = stringArray[stringArray.length - 1];
                stringArray[stringArray.length - 1] = temp;
            }
            return stringArray;
        }

        // Question 18
        public static String replaceLegendCharacters(String str) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                switch (chars[i]) {
                    case 'f', 'F' -> chars[i] = '7';
                    case 's', 'S' -> chars[i] = '$';
                    case '1' -> chars[i] = '!';
                    case 'a', 'A' -> chars[i] = '@';
                }
            }
            return new String(chars);
        }

        // Question 19
        public static String replaceWuTangTwoThreeDivisible(String stringInput) {
            String[] words = stringInput.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                if ((i + 1) % 2 == 0) {
                    words[i] = "Wu";
                } else if ((i + 1) % 3 == 0) {
                    words[i] = "Tang";
                }
            }
            return String.join(" ", words);
        }

        // Question 20
        public static String generateFibonacciSequence(int maxNumber) {
            StringBuilder sequence = new StringBuilder();
            int a = 0, b = 1;
            for (int i = 1; i <= maxNumber; i++) {
                sequence.append(a).append(" ");
                int temp = a + b;
                a = b;
                b = temp;
            }
            return sequence.toString();
        }

        public static void main(String[] args) {
            int[] numbers = {1, 3, 5, 7, 9};
            String[] names = {"Jaime", "Dushane", "Sully", "Dris", "Steff", "Kitz"};

            // Question 1
            System.out.println(findLastIndex(names));

            // Question 2
            System.out.println(findSecondToLastIndex(names));

            // Question 3
            System.out.println(getFirstItem(names));

            // Question 4
            System.out.println(getLastItem(names));

            // Question 5
            System.out.println(getSecondToLastItem(names));

            // Question 6
            System.out.println(calculateSum(numbers));

            // Question 7
            System.out.println(calculateAverage(numbers));

            // Question 8
            System.out.println(extractOddNumbers(numbers));

            // Question 9
            System.out.println(extractEvenNumbers(numbers));

            // Question 11
            System.out.println(containsElement(names, "Carol"));

            // Question 12
            System.out.println(findIndexByElement(names, "Stephen"));

            // Question 13
            printOddNumbersInRange(0, 10);

            // Question 14
            System.out.println(repeatFirstThreeCharacters("Apple", 3));

            // Question 15
            System.out.println(countWordsInString("The wizard of Oz is a book."));

            // Question 16
            System.out.println(countVowels("is this a list? years in the making"));

            // Question 17
            System.out.println(Arrays.toString(swapFirstAndLast(names)));

            // Question 18
            System.out.println(replaceLegendCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));

            // Question 19
            System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));

            // Question 20
            System.out.println(generateFibonacciSequence(5));
        }
    }
}
