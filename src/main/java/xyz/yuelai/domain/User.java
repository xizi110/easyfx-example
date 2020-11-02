package xyz.yuelai.domain;

import java.util.Date;

/**
 * @author zhong
 * @date 2020-10-12 18:06:54 周一
 */
public class User {

    private String name;
    private Integer age;
    private String address;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
