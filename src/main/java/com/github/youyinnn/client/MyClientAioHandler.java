package com.github.youyinnn.client;

import com.github.youyinnn.client.handler.LoginResponseHandler;
import com.github.youyinnn.client.handler.P2PResponseHandler;
import com.github.youyinnn.common.AbstractAioHandler;
import com.github.youyinnn.common.AbstractMsgHandler;
import com.github.youyinnn.common.MsgType;
import com.github.youyinnn.common.packet.BasePacket;
import org.tio.client.intf.ClientAioHandler;
import org.tio.core.ChannelContext;
import org.tio.core.intf.Packet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author youyinnn
 */
public class MyClientAioHandler extends AbstractAioHandler implements ClientAioHandler {

    private static Map<Byte, AbstractMsgHandler<?>> handlerMap = new HashMap<>();

    static {
        handlerMap.put(MsgType.LOGIN_RESP, new LoginResponseHandler());
        handlerMap.put(MsgType.P2P_RESP, new P2PResponseHandler());
    }

    private static BasePacket heartbeatPacket = new BasePacket(MsgType.HEART_BEAT_REQ, null);

    @Override
    public Packet heartbeatPacket() {
        return heartbeatPacket;
    }

    @Override
    public void handler(Packet packet, ChannelContext channelContext) throws Exception {
        BasePacket basePacket = (BasePacket) packet;
        Byte msgType = basePacket.getMsgType();
        AbstractMsgHandler<?> msgHandler = handlerMap.get(msgType);
        msgHandler.handler(basePacket, channelContext);
    }
}