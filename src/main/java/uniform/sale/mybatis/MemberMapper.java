package uniform.sale.mybatis;

import org.apache.ibatis.annotations.Mapper;
import uniform.sale.domain.member.Member;

@Mapper
public interface MemberMapper {

    void save(Member member);

}
