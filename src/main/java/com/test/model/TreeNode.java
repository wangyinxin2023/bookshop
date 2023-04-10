package com.test.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class TreeNode {
    private Integer treeNodeId;

    private String treeNodeName;

    private Integer treeNodeType;

    private Integer parentNodeId;

    private String url;

    private Integer position;

    private String icon;

    private List<TreeNode> children=new ArrayList<>();

    public TreeNode(Integer treeNodeId, String treeNodeName, Integer treeNodeType, Integer parentNodeId, String url, Integer position, String icon) {
        this.treeNodeId = treeNodeId;
        this.treeNodeName = treeNodeName;
        this.treeNodeType = treeNodeType;
        this.parentNodeId = parentNodeId;
        this.url = url;
        this.position = position;
        this.icon = icon;
    }

    public TreeNode() {
        super();
    }


}