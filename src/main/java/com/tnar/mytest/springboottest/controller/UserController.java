package com.tnar.mytest.springboottest.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tnar.mytest.springboottest.model.User;
import com.tnar.mytest.springboottest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 陈丰
 * @since 2018-11-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @PostMapping("/getbyid")
    public JSONObject selectUserById(Integer id){
        JSONObject object = new JSONObject();
        User user = userService.selectById(id);
        object.put("message",user);
        return object;
    }

    @GetMapping("/getlist")
    public JSONObject selectUserList(){
        JSONObject object = new JSONObject();
        List<User> users = userService.selectList(new EntityWrapper<User>());
        object.put("message",users);
        return  object;
    }

    @GetMapping("/getpage")
    public JSONObject selectUserPage(){
        JSONObject object = new JSONObject();
        Page<User> page = new Page<>(1,3);
        Page<User> page1 = userService.selectPage(page, new EntityWrapper<User>());
        object.put("message",page1);
        return object;
    }

    @PostMapping("/getmap")
    public JSONObject selectUserMap(Integer id){
        JSONObject object = new JSONObject();
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        System.out.println(map);
        List<User> users = userService.selectByMap(map);
        object.put("message",users);
        return object;
    }

    @PostMapping("/insertuser")
    public JSONObject insertUser(User user){
        JSONObject object = new JSONObject();
        boolean insert = userService.insert(user);
        object.put("message",insert);
        return object;
    }

    @PutMapping("/updateuser")
    public JSONObject updateUser(User user){
        JSONObject object = new JSONObject();
        boolean id = userService.update(user, new EntityWrapper<User>().eq("id", user.getId()));
        object.put("message",id);
        return object;
    }

    @PutMapping("/updatebyid")
    public JSONObject updateByIdUser(User user){
        JSONObject object = new JSONObject();
        boolean b = userService.updateById(user);
        object.put("message",b);
        return object;
    }

    @DeleteMapping("/deleteuser")
    public JSONObject deleteUser(Integer id){
        JSONObject object =new JSONObject();
        boolean id1 = userService.delete(new EntityWrapper<User>().eq("id", id));
        object.put("message",id1);
        return object;
    }

    @GetMapping("/getconnect")
    public JSONObject getConnectById(Integer id){
        JSONObject object = new JSONObject();
        List<User> users = userService.selectConnectById(id);
        object.put("message",users);
        return object;
    }

    @GetMapping("/getconnectlist")
    public JSONObject getConnectList(){
        JSONObject object = new JSONObject();
        List<User> users = userService.selectConnect();
        object.put("message",users);
        return object;
    }

    @GetMapping("/getconnectpagelist")
    public JSONObject getConnectPageList(){
        JSONObject object = new JSONObject();
        Page<User> page = new Page<>(1,3);
        Page<User> page1 = userService.selectConnect(page);
        object.put("message",page1);
        return object;
    }

    @GetMapping("/getdynamiclist")
    public JSONObject getDynamicUserList(User user){
        JSONObject object = new JSONObject();
        List<User> users = userService.selectDynamic(user);
        object.put("message",users);
        return object;
    }

}

