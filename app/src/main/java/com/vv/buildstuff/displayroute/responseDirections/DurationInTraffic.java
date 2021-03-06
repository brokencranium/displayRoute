package com.vv.buildstuff.displayroute.responseDirections;

/**
 * Created by vvennava on 10/4/14.
 */
public class DurationInTraffic {
    private String text;
    private int value;

    public DurationInTraffic() {
    }

    public DurationInTraffic(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "duration{" +
                "text=" + text +
                ", value=" + value +
                '}';
    }
}
