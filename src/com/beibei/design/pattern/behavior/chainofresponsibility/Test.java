package com.beibei.design.pattern.behavior.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Android课程");
        course.setArticle("手记");
        course.setVideo("视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);

    }
}
