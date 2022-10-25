public class Solution {

    public int romanToInt(String s) {
        int x = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            if(i==s.length() - 1){
                if (s.charAt(i) == 'I'){
                    x = 1;
                    sum += x;
                    return sum;
                } else if (s.charAt(i) == 'V') {
                    x = 5;
                    sum += x;
                    return sum;
                } else if (s.charAt(i) == 'X') {
                    x = 10;
                    sum += x;
                    return sum;

                } else if (s.charAt(i) == 'L') {
                    x = 50;
                    sum += x;
                    return sum;

                } else if (s.charAt(i) == 'C') {
                    x = 100;
                    sum += x;
                    return sum;

                } else if (s.charAt(i) == 'D') {
                    x = 500;
                    sum += x;
                    return sum;

                } else if (s.charAt(i) == 'M') {
                    x = 1000;
                    sum += x;
                    return sum;
                }

                }

            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                x = 4;
                sum += x;
                i++;

            } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                x = 9;
                sum += x;
                i++;

            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                x = 40;
                sum += x;
                i++;

            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                x = 90;
                sum += x;
                i++;

            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                x = 400;
                sum += x;
                i++;

            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                x = 900;
                sum += x;
                i++;

            } else if (s.charAt(i) == 'I') {
                x = 1;
                sum += x;

            } else if (s.charAt(i) == 'V') {
                x = 5;
                sum += x;

            } else if (s.charAt(i) == 'X') {
                x = 10;
                sum += x;

            } else if (s.charAt(i) == 'L') {
                x = 50;
                sum += x;

            } else if (s.charAt(i) == 'C') {
                x = 100;
                sum += x;

            } else if (s.charAt(i) == 'D') {
                x = 500;
                sum += x;

            } else if (s.charAt(i) == 'M') {
                x = 1000;
                sum += x;
            }

        }
        System.out.println(sum);
        return sum;
    }
}
