package com.xiao.feeds.service;

public class User {
    private Long id;
    private String name;
    private Integer age;
    private String[] tags;

    // 无参构造必须有，序列化反序列化需要
    public User() {}

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    public String[] getTags() { return tags; }
    public void setTags(String[] tags) { this.tags = tags; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}