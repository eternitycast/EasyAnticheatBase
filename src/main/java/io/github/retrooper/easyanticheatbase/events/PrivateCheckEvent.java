package io.github.retrooper.easyanticheatbase.events;

import io.github.retrooper.packetevents.event.PacketEvent;

public final class PrivateCheckEvent extends CheckEvent {
    public PrivateCheckEvent(PacketEvent causeEvent) {
        super(causeEvent);
    }
}
