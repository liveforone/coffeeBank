package coffeeBank.coffeeBank.member.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    ADMIN("ROLE_ADMIN"),
    MEMBER("ROLE_MEMBER"),
    BLOCK("ROLE_BLOCK");

    private String value;
}
