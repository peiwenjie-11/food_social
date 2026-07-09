package com.xiao.feeds.service;



import cn.hutool.json.JSON;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

import java.util.List;

public class FastJsonDemo {
    public static void main(String[] args) {
        // 1. Java对象转JSON字符串（序列化）
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(22);
        user.setTags(new String[]{"Java", "后端"});
        String jsonStr = JSON.toJSONString(user);
        System.out.println("对象转JSON：" + jsonStr);

        // 2. JSON字符串转Java对象（反序列化）
        String json = "{\"id\":2,\"name\":\"李四\",\"age\":25,\"tags\":[\"Go\",\"Python\"]}";
        User parseUser = JSON.parseObject(json, User.class);
        System.out.println("JSON转对象：" + parseUser);

        // 3. 不使用实体，直接解析JSONObject（灵活获取字段）
        JSONObject jsonObj = JSON.parseObject(json);
        Long id = jsonObj.getLong("id");
        String name = jsonObj.getString("name");
        JSONArray tagArr = jsonObj.getJSONArray("tags");
        System.out.println("动态取值 id=" + id + ", name=" + name + ",标签第一个：" + tagArr.get(0));

        // 4. JSON数组解析
        String arrayJson = "[{\"id\":1,\"name\":\"A\"},{\"id\":2,\"name\":\"B\"}]";
        List<User> userList = JSON.parseArray(arrayJson, User.class);
        System.out.println("数组解析：" + userList);
    }
}