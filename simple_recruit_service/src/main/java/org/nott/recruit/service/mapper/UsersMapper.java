package org.nott.recruit.service.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.nott.recruit.bean.model.Users;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author nott
 * @since 2024-02-19
 */
public interface UsersMapper extends BaseMapper<Users> {

    @Select("select * from recruit_users ru where ru.username = #{username}")
    Users getUserByUserName(@Param("username") String username);
}
