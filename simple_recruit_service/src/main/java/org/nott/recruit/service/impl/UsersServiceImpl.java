package org.nott.recruit.service.impl;

import org.nott.recruit.entity.Users;
import org.nott.recruit.mapper.UsersMapper;
import org.nott.recruit.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nott
 * @since 2024-02-19
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
