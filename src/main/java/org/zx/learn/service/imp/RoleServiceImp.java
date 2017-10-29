package org.zx.learn.service.imp;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.zx.learn.dao.SysRoleMapper;
import org.zx.learn.dto.SysRoleDTO;
import org.zx.learn.model.SysRole;
import org.zx.learn.service.RoleService;

/**
 * Created by xiang zeng on 2017/10/28.
 *
 * @author xiang zeng
 */
@Service("roleService")
public class RoleServiceImp implements RoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    private static final Logger log = LoggerFactory.getLogger(RoleServiceImp.class);

    @Override
    public List<SysRoleDTO> listAllRole() {
        List<SysRole> sysRoleList = sysRoleMapper.listAllRole();
        List<SysRoleDTO> resultList = new ArrayList<SysRoleDTO>();
        for (SysRole sysRole : sysRoleList) {
            SysRoleDTO temp = new SysRoleDTO();
            BeanUtils.copyProperties(sysRole, temp);
            resultList.add(temp);
        }
        return resultList;
    }

    @Override
    public SysRoleDTO getRoleById() {
        return null;
    }

    @Override
    public void updateRole(SysRoleDTO sysRoleDTO) {

    }

    @Override
    public void deleteRoleById(List<Integer> list) {
        sysRoleMapper.deleteRoleById(list);
    }
}
