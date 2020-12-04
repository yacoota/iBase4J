package org.ibase4j;

import lombok.extern.slf4j.Slf4j;
import top.ibase4j.core.Constants;
import top.ibase4j.core.util.SecurityUtil;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("加密密码：{}", SecurityUtil.encryptDes("password", "90139119".getBytes()));
        log.info("解密密码：{}", SecurityUtil.decryptDes("0e3nTdVWvU8rErEfbag2qM==", "90139119".getBytes()));

        log.info("加密密码：{}", SecurityUtil.encryptDes("buzhidao", "90139119".getBytes()));
        log.info("解密密码：{}", SecurityUtil.decryptDes("68NKG7n1mN8rErEfbag2qM==", "90139119".getBytes()));
    }
}
