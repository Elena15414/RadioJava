public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int newCurrentStation;
    private int station;

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMaxStation() {

        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int getMinStation() {

        if (currentStation <= 0) {
            currentStation = 9;
        }

        return currentStation;
    }


    private int increaseVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int newIncreaseVolume;

    public void setIncreaseVolume(int increaseVolume) {
        this.increaseVolume = increaseVolume;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setNewIncreaseVolume(int newIncreaseVolume) {
        this.newIncreaseVolume = newIncreaseVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int increaseVolumeMax() {
        if (increaseVolume <= 100) {
            increaseVolume = increaseVolume + 1;
        }
        return increaseVolume;
    }

    public int increaseVolumeMin() {
        if (increaseVolume >= 0) {
            increaseVolume = increaseVolume - 1;
        }
        return increaseVolume;
    }

}


