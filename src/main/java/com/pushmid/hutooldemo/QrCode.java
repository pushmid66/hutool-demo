package com.pushmid.hutooldemo;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hutool工具类
 *
 * @author pushmid
 * @date 2020/8/20
 */
@RestController
public class QrCode {

    /**
     * 二维码
     */
    @GetMapping("/qrcode")
    public String generateQrCode(String url) throws Exception {
        QrCodeUtil.generate(url, 300, 300, FileUtil.file("f:/qrcode.jpg"));
        return "ok";
    }


}
