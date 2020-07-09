package com.briup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.briup.util.QRCodeUtil;

@SpringBootApplication
public class SpringBootQrCodeApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootQrCodeApplication.class, args);
		// 存放在二维码中的内容
        // 二维码中的内容可以是文字，可以是链接等
        String text = "菜鸡加油哦";
        // 嵌入二维码的图片路径
        String imgPath = "C:\\Users\\Administrator.DESKTOP_LEISHEN\\Pictures\\1.jpeg";
        // 生成的二维码的路径及名称
        String destPath = "F:" + System.currentTimeMillis() + ".jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
	}

}
