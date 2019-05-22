package com.beibei.design.pattern.behavior.chainofresponsibility;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(course.getArticle()!=null&& course.getArticle().length()>0){
            System.out.println(course.getName()+"含有手记，通过");
            if(approver!=null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有手记，不通过,流程结束");
            return;
        }
    }
}
