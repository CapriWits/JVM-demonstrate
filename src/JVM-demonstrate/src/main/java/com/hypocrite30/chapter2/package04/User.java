package com.hypocrite30.chapter2.package04;

/**
 * @Author: Hypocrite30
 * @Date: 2021/7/12 16:27
 */
public class User {
    private int id;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
