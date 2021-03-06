package com.github.youyinnn.common.intf;

/**
 * @author youyinnn
 */
public interface Const {

    interface RequestCode {
        String SUCCESS = "success";
        String FAIL = "fail";
    }

    String CHARSET = "utf-8";

    interface Server {
        String DEF_GROUP_CONTEXT_NAME = "you_im";
        int PORT = 5678;
        String LOCAL_SERVER_IP = "127.0.0.1";
        String REMOTE_SERVER_IP = "0.0.0.0";
    }
}
