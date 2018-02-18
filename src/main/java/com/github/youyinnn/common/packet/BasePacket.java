package com.github.youyinnn.common.packet;

import org.tio.core.intf.Packet;

/**
 * @author youyinnn
 */
public class BasePacket extends Packet {

    public static final int HEADER_LENGTH = 5;
    public static final String CHARSET = "utf-8";

    private byte msgType;

    private byte[] msgBody;

    public byte getMsgType() {
        return msgType;
    }

    public void setMsgType(byte msgType) {
        this.msgType = msgType;
    }

    public byte[] getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(byte[] msgBody) {
        this.msgBody = msgBody;
    }

    public BasePacket(byte msgType, byte[] msgBody) {
        this.msgType = msgType;
        this.msgBody = msgBody;
    }
}