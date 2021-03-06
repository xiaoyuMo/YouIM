package com.github.youyinnn.common.packets.request;

import com.github.youyinnn.common.packets.BaseBody;

/**
 * @author youyinnn
 */
public class RemoveAdminRequestBody extends BaseBody {

    private String ownerId;

    private String groupId;

    private String fromUserId;

    public RemoveAdminRequestBody() {
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public RemoveAdminRequestBody(String ownerId, String groupId, String fromUserId) {
        this.ownerId = ownerId;
        this.groupId = groupId;
        this.fromUserId = fromUserId;
    }
}
