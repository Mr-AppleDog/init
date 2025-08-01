package com.base.springbootbase.mapper;

import com.base.springbootbase.common.core.domain.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author MrLu
 * @version 1.0
 * @description: 角色与菜单关联表 数据层
 * @date 2025/7/28 2:29
 */
@Mapper
public interface SysRoleMenuMapper {
    /**
     * 查询菜单使用数量
     *
     * @param menuId 菜单ID
     * @return 结果
     */
    int checkMenuExistRole(Long menuId);
    /**
     * 通过角色ID删除角色和菜单关联
     *
     * @param roleId 角色ID
     * @return 结果
     */
    void deleteRoleMenuByRoleId(Long roleId);
    /**
     * 批量新增角色菜单信息
     *
     * @param roleMenuList 角色菜单列表
     * @return 结果
     */
    int batchRoleMenu(List<SysRoleMenu> roleMenuList);
    /**
     * 批量删除角色菜单关联信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteRoleMenu(Long[] ids);
}
