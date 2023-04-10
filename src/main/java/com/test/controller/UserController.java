package com.test.controller;

import com.test.model.TreeNode;
import com.test.model.User;
import com.test.service.TreeNodeService;
import com.test.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
   private UserLoginService userLoginService;

    @Autowired
    private TreeNodeService treeNodeService;

     @RequestMapping("/tologin")
    public Map<String, Object> Login(User user){
        return userLoginService.Login(user);
    }

    @RequestMapping("/toregister")
    public Map<String, Object> Register(User user){
         return userLoginService.Register(user);
    }

    @RequestMapping("/tomenu")
    public Map<String,Object> createMenu(){
      return treeNodeService.createMenu();
    }
    @RequestMapping("/menu")
    public List<TreeNode> menu(TreeNode treeNode){
         return treeNodeService.menu(treeNode);
    }
}



