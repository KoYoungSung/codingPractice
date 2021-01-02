package StringAndArray;

public class Money {
    public static void main(String[] args) {
        int input1 = 50237;
        int input2 = 15000;

        System.out.println(solve(input1));

    }

    private static int[] solve(int money) {
        //5만, 만 ,오천, 천, 오백, 백, 오십, 십, 일
        int[] result = new int[9];
        int[] sort_money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < sort_money.length; i++) {
            if (i == 0) {
                result[i] = (money / sort_money[i]);
            } else {
                result[i] = (money % sort_money[i - 1]) / sort_money[i];
            }

        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

            return result;
    }

}

