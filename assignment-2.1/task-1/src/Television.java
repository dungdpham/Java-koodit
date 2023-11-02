public class Television {
    private boolean onStatus = false;
    private int channel = 1;

    public boolean isOn() {
        return onStatus;
    }

    public void pressOnOff() {
        onStatus = !onStatus;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (onStatus) {
            if (channel > 10) {
                this.channel = 1;
            } else {
                this.channel = channel;
            }
        }
    }
}
