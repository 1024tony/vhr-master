package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.HrMapper;
import org.javaboy.vhr.model.Hr;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: gaoyang
 * @Date: 2020/6/30  9:07
 * @Description:
 */
@Service
public class HrService implements UserDetailsService {

    @Resource
    HrMapper hrMapper;

    //根据用户名加载用户对象
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        //hr.setRoles(hrMapper.getHrRolesById(hr.getId()));
        return hr;
    }
}
