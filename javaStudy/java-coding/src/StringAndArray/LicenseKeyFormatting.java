package StringAndArray;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String str = "8F3Z-2e-9-w";
        String str2 = "8-5g-3-J";
        int k =4;
        solve(str,k);
//        solve(str2,k);
    }

    private static String solve(String str, int k) {
        String newStr = str.replace("-", "");
        newStr = newStr.toUpperCase();

        System.out.println("newStr = " + newStr);
        int leng = newStr.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < leng; i++) {
            sb.append(newStr.charAt(i));
        }
        for (int i = k; i < leng; i = i + k) {
            sb.insert(leng - i, '-');
        }
        System.out.println("sb = " + sb);
        return newStr;
    }
}
/*
<Problem>
input
String str = "8F3Z-2e-9-w";
String str = "8-5g-3-J";
int k =4;

output : 8F3Z-2E9W, 8-5G3J
-------------
1) 하이픈 제거
2) 끝에서 4자리 끊기

 */
