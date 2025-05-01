package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    final String theEnd = ", — смерть Кощея";

    @Override
    public String toString() {
        return this.theEnd;
    }
}