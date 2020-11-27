package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }


    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(21);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }
    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(21);
        conditioner.setMinTemperature(11);
        conditioner.setCurrentTemperature(12);
        assertEquals(12, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }
    @Test
    public void MaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(21);
        assertEquals(21, conditioner.getMaxTemperature());
    }
    @Test
    public void MinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(11);
        assertEquals(11, conditioner.getMinTemperature());
    }

    @Test
    public void isOn() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        assertEquals(true, conditioner.isOn());
    }
    @Test
    public void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(21);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(20, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(9);
        assertEquals(20, conditioner.getCurrentTemperature());
    }
}


