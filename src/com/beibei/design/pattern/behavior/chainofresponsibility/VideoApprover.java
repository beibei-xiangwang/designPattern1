package com.beibei.design.pattern.behavior.chainofresponsibility;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(course.getVideo()!=null&&course.getVideo().length()>0){
            System.out.println(course.getName()+ "含有视频，通过");
            if(approver!=null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+ "不含有视频，不通过");
            return;
        }

    }
}
