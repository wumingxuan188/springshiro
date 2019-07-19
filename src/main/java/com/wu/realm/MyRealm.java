package com.wu.realm;

import com.wu.mapper.UsersMapper;
import com.wu.pojo.Users;
import com.wu.pojo.UsersExample;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 自定义Realm类,注入安全管理去中
 */
public class MyRealm extends AuthorizingRealm {
   @Autowired
   private UsersMapper usersMapper;
    //授权方法
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission("findList");
        info.addStringPermission("toList");
        return info;
    }
    //认证方法
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken passToken = (UsernamePasswordToken) token;
        String username = passToken.getUsername();
        UsersExample example = new UsersExample();
        example.createCriteria().andNamesEqualTo(username);
        List<Users> users = usersMapper.selectByExample(example);
        if (users==null){
            return  null;
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(users.get(0), users.get(0).getPass(), this.getName());

        return info;
    }
}
