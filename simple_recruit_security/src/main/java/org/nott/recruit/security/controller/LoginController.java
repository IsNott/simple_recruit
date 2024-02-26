package org.nott.recruit.security.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.nott.recruit.common.exception.BusinessException;
import org.nott.recruit.common.model.Result;
import org.nott.recruit.bean.model.Users;
import org.nott.recruit.security.jwt.RecruitTokenService;
import org.nott.recruit.security.manager.AuthenticationTokenImpl;
import org.nott.recruit.service.IUsersService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/")
public class LoginController {

    @Resource
    private IUsersService usersService;
    @Resource
    private RecruitTokenService tokenService;

    @PostMapping(value = "/logout")
    public Result<Boolean> logout(HttpServletRequest request) {
        boolean removedAuthentication = tokenService.removeAuthentication(request);
        return Result.success(removedAuthentication);
    }

    @PostMapping("/resource")
    public Result<Users> resource(){
        Users users = usersService.getById(1);
        return Result.success(users);
    }

}
