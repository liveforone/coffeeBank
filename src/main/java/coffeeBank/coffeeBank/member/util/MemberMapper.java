package coffeeBank.coffeeBank.member.util;

import coffeeBank.coffeeBank.member.dto.MemberRequest;
import coffeeBank.coffeeBank.member.dto.MemberResponse;
import coffeeBank.coffeeBank.member.model.Member;

public class MemberMapper {

    public static Member dtoToEntity(MemberRequest memberRequest) {
        return Member.builder()
                .id(memberRequest.getId())
                .email(memberRequest.getEmail())
                .password(memberRequest.getPassword())
                .auth(memberRequest.getAuth())
                .realName(memberRequest.getRealName())
                .build();
    }

    public static MemberResponse dtoBuilder(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .email(member.getEmail())
                .auth(member.getAuth())
                .realName(member.getRealName())
                .build();
    }
}
