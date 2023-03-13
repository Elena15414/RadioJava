import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 0;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxStationBoundary() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int expected = 9;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStationBoundary() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 9;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStationBound() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(0);
        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();

        radio.setNewIncreaseVolume(100);
        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();

        radio.setNewIncreaseVolume(0);
        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(99);
        int expected = 100;
        int actual = radio.increaseVolumeMax();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMaxBoundary() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(100);
        int expected = 101;
        int actual = radio.increaseVolumeMax();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMaximum() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(101);
        int expected = 101;
        int actual = radio.increaseVolumeMax();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(5);
        int expected = 4;
        int actual = radio.increaseVolumeMin();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMinBoundary() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(-1);
        int expected = -1;
        int actual = radio.increaseVolumeMin();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMini() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(0);
        int expected = -1;
        int actual = radio.increaseVolumeMin();

        Assertions.assertEquals(expected, actual);
    }
}
