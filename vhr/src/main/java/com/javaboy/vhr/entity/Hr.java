package com.javaboy.vhr.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * (Hr)实体类
 *
 * @author makejava
 * @since 2020-10-24 14:25:31
 */
@Getter
@Setter
public class Hr implements Serializable, UserDetails {
    private static final long serialVersionUID = 573112710074500315L;
    /**
     * hrID
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 住宅电话
     */
    private String telephone;
    /**
     * 联系地址
     */
    private String address;

    private Boolean enabled;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    private String userface;

    private String remark;


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 为用户赋予角色
     * @return
     */
    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

}