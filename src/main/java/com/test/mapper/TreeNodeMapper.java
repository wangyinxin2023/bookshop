package com.test.mapper;

import com.test.model.TreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    List<TreeNode> getParents();

    List<TreeNode> getChildren(Integer treeNodeId);

    List<TreeNode> getDgMenu(TreeNode treeNode);
}