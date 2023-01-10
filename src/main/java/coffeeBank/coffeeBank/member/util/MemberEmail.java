package coffeeBank.coffeeBank.member.util;

import coffeeBank.coffeeBank.member.model.Member;
import coffeeBank.coffeeBank.utility.CommonUtils;

public class MemberEmail {
    public static boolean isDuplicateEmail(Member member) {

        return !CommonUtils.isNull(member);
    }
}
