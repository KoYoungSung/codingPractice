package StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public static void main(String[] args) {
        UniqueEmailAddress a = new UniqueEmailAddress();
        String[] emails = { "test.email+james@coding.com",
                            "test.e.mail+toto.jane@coding.com",
                            "testemail+tom@cod.ing.com"};
        System.out.println(a.numUniqueEmails(emails));
    }

    private int numUniqueEmails(String[] emails) {
        //1
        Set<String> set = new HashSet<>();

        //2
        for (String email : emails) {
            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);
            set.add(localName + domainName);
        }
        return set.size();
    }

    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {

            //1
            if (email.charAt(i) == '.') {
                continue;
            }
            if (email.charAt(i) == '+' ||email.charAt(i) == '@') {
                break;
            }
            //2
            String str = String.valueOf(email.charAt(i));
            sb.append(str);
        }
        return sb.toString();
    }

    private String makeDomainName(String email) {
        return email.substring(email.indexOf('@'));
    }
}

/*
input : [
"test.email+james@coding.com",
"test.e.mail+toto.jane@coding.com",
"testemail+tom@cod.ing.com"
]
output
"testemail@coding.com"
"testemail@cod.ing.com"
----
1) Continue 로 뺀다
2) +break 로 뺀다
3) Set<String>
 */
