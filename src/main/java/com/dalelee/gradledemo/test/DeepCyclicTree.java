package com.dalelee.gradledemo.test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: mxz
 * @Description: 深度循环树
 * @Date: 2021/10/15 16:32
 */
public class DeepCyclicTree {

    public static void main(String[] args) {
        List<TreeNode> treeNodeList = Arrays.asList(new TreeNode[]{
                new TreeNode(1,0,"AA"),
                new TreeNode(2,1,"BB"),
                new TreeNode(4,1,"CC"),
                new TreeNode(3,2,"DD"),
                new TreeNode(6,2,"FF"),
                new TreeNode(8,4,"GG"),
                new TreeNode(9,4,"HH"),
                new TreeNode(10,9,"JJ"),
                new TreeNode(11,8,"KK"),
                new TreeNode(12,10,"LL"),
                new TreeNode(13,12,"ZZ"),
        });

        for (TreeNode treeNode : treeNodeList) {
            if (0 == treeNode.getParentId()){
                System.out.println(treeNode);
            }
        }

    }


    static class TreeNode {
        private String name;
        private int id;
        private int parentId;
        TreeNode(int id,int parentId,String name){
            this.name = name;
            this.parentId = parentId;
            this.id = id;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", parentId=" + parentId +
                    '}';
        }
    }
}
