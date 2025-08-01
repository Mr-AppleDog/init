package com.base.springbootbase.common.enums;

/**
 * @author MrLu
 * @version 1.0
 * @description: 用户状态
 * @date 2025/7/26 0:20
 */
public enum UserStatus {
    OK("0", "正常"), DISABLE("1", "停用"), DELETED("2", "删除");

    private final String code;
    private final String info;

    UserStatus(String code, String info)
    {
        this.code = code;
        this.info = info;
    }

    public String getCode()
    {
        return code;
    }

    public String getInfo()
    {
        return info;
    }
}
