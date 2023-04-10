package com.test.service;

import com.test.model.TreeNode;

import java.util.List;
import java.util.Map;

public interface TreeNodeService {

    Map<String,Object> createMenu();

    List<TreeNode> menu(TreeNode treeNode);
}
