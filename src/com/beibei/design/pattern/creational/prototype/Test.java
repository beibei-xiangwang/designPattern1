package com.beibei.design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化内容");
        System.out.println("初始化的mail"+mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("姓名"+i);
            mailTmp.setAddress("邮箱"+i);
            mailTmp.setContent("内容"+i);
            MailUtil.sendMail(mailTmp);
            System.out.println("克隆后的mail"+mailTmp);

        }
        MailUtil.saveOriginMail(mail);
    }
}
