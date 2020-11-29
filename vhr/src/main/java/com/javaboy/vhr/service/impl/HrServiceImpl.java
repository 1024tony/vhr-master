package com.javaboy.vhr.service.impl;

import com.javaboy.vhr.dao.HrDao;
import com.javaboy.vhr.entity.Hr;
import com.javaboy.vhr.service.HrService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Hr)表服务实现类
 *
 * @author makejava
 * @since 2020-10-24 14:25:33
 */
@Service
public class HrServiceImpl implements HrService, UserDetailsService {

    @Resource
    private HrDao hrDao;

    /**
     * 根据用户名加载用户对象
     * @param username
     * @return UserDetails
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrDao.loadUserByUsername(username);
        if (hr == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        //hr.setRoles(hrMapper.getHrRolesById(hr.getId()));
        return hr;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hr queryById(Integer id) {
        return this.hrDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Hr> queryAllByLimit(int offset, int limit) {
        return this.hrDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hr 实例对象
     * @return 实例对象
     */
    @Override
    public Hr insert(Hr hr) {
        this.hrDao.insert(hr);
        return hr;
    }

    /**
     * 修改数据
     *
     * @param hr 实例对象
     * @return 实例对象
     */
    @Override
    public Hr update(Hr hr) {
        this.hrDao.update(hr);
        return this.queryById(hr.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hrDao.deleteById(id) > 0;
    }

}