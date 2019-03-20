package com.beibei.design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail){
        String outputString = "给{0}同学，邮件地址{1}，发送内容{2}";
        System.out.println(MessageFormat.format(outputString,mail.getName(),mail.getAddress(),mail.getContent()));
    }

    public static void saveOriginMail(Mail mail){
        System.out.println("存储的原始邮件内容是"+mail.getContent());
    }

}
