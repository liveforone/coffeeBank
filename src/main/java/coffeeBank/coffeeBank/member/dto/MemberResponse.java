package coffeeBank.coffeeBank.member.dto;

import coffeeBank.coffeeBank.member.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponse {

    private Long id;
    private String email;
    private String realName;
    private Role auth;
}
