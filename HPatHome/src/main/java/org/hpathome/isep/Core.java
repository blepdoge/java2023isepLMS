package org.hpathome.isep;

import lombok.Getter;

public enum Core {
    PHOENIX_FEATHER("Phoenix Feather"),
    DRAGON_HEARTSTRING("Dragon Heartstring"),
    UNICORN_HAIR("Unicorn Hair"),
    VEELA_HAIR("Veela Hair"),
    THESTRAL_TAIL_HAIR("Thestral Tail Hair");

    @Getter
    public String core;
    Core(String core) {
        this.core = core;
    }

}

