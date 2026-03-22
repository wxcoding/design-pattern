package com.guanwx.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Vector;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 2:16
 * @Description: 组合模式
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node) {
        children.add(node);
    }

}
