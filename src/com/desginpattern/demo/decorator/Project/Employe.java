package com.desginpattern.demo.decorator.Project;

/**
 * The Decorator Of Desgin Pattern .
 * 工人
 *
 * @author wangbing
 * @version 1.0
 * @since 2017.03.31
 */
public class Employe implements Project{
    /**
     * 编码
     */
    public void doCoding(){
        System.out.println("代码工人 在编写代码，加班编啊编啊，终于编完了！");
    }
}