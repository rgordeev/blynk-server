package cc.blynk.server.handlers.hardware.auth;

import cc.blynk.server.model.auth.User;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 13.09.15.
 */
public class HardwareStateHolder {

    public final int dashId;
    public final User user;
    public final String token;

    public HardwareStateHolder(int dashId, User user, String token) {
        this.dashId = dashId;
        this.user = user;
        this.token = token;
    }

}