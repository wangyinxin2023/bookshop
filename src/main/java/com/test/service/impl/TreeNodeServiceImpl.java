package com.test.service.impl;

import com.test.mapper.TreeNodeMapper;
import com.test.model.TreeNode;
import com.test.service.TreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class TreeNodeServiceImpl implements TreeNodeService {
    @Autowired
    private TreeNodeMapper treeNodeMapper;
    @Override
    public Map<String, Object> createMenu() {
        Map<String,Object> map =new HashMap<>();

        List<TreeNode> parents = treeNodeMapper.getParents();
        int code=900;
        String msg="没有数据";
        if (null!=parents&&parents.size()!=0){
             code=200;
             msg="操作成功";
            for (TreeNode parent : parents) {
                List<TreeNode> children = treeNodeMapper.getChildren(parent.getTreeNodeId());
                parent.setChildren(children);
            }
            map.put("obj",parents);
        }else{

        }
        return map;
    }

    @Override
    public List<TreeNode> menu(TreeNode treeNode) {
        List<TreeNode> menus = treeNodeMapper.getDgMenu(treeNode);
        if (menus!=null&&menus.size()!=0){
            for (TreeNode m : menus) {
                List<TreeNode> menu = menu(m);
                m.setChildren(menu);
            }
        }
        return menus;
    }
}
