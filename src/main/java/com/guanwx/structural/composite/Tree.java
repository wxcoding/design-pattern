package com.guanwx.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 2:28
 * @Description:
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class Tree {

    TreeNode root = null;

    public static void main(String[] args) {

        Tree tree = new Tree(new TreeNode("A"));

        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");

        b.add(c);

        tree.root.add(b);

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(tree.toString());
    }

}
