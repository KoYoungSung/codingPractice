package StringAndArray;

public class Test1 {
    public static void main(String[] args) {
        Solution a = new Solution();dd
        String aa[] = {"H", "T", "H", "T", "H", "T", "H"};
        String bb[] = {"T", "T", "H", "H", "T", "T", "H"};
        a.solution(1000, aa, bb);

    }

    static class Solution {
        public int solution(int money, String[] expected, String[] actual) {

            int bat = 0;
            boolean isLoose = false;

            if (money > bat ) {
                bat = 100;

                for (int i = 0; i < expected.length; i++) {

                    if(isLoose){
                        bat = bat * 2;
                    } else {
                        bat = 100;
                    }

                    if (expected[i] == actual[i]) {
                        money += bat;
                        isLoose = false;
                    }
                    else{
                        money -= bat;
                        isLoose = true;
                    }
                }

            }






            System.out.println(money);
            return money;
        }


    }

}
