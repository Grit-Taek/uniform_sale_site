package uniform.sale.mybatis;

import org.apache.ibatis.annotations.Mapper;
import uniform.sale.domain.login.Login;
import uniform.sale.domain.member.Member;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);
    Login findByEmail(String email);

}
