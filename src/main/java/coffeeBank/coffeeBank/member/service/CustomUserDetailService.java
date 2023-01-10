package coffeeBank.coffeeBank.member.service;

import coffeeBank.coffeeBank.member.model.Member;
import coffeeBank.coffeeBank.member.model.Role;
import coffeeBank.coffeeBank.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return createUserDetails(memberRepository.findByEmail(email));
    }

    private UserDetails createUserDetails(Member member) {
        if (member.getAuth() == Role.ADMIN) {
            return User.builder()
                    .username(member.getEmail())
                    .password(member.getPassword())
                    .roles("ADMIN")
                    .build();
        }

        if (member.getAuth() == Role.MEMBER) {
            return User.builder()
                    .username(member.getEmail())
                    .password(member.getPassword())
                    .roles("MEMBER")
                    .build();
        }

        return User.builder()
                .username(member.getEmail())
                .password(member.getPassword())
                .roles("BLOCK")
                .build();
    }
}
