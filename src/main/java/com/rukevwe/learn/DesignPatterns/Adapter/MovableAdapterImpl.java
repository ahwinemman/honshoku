package com.rukevwe.learn.DesignPatterns.Adapter;

public class MovableAdapterImpl implements MovableAdapter {

    private Movable luxuryCars;

    // standard constructors

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
//    @Test
//    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
//        Movable bugattiVeyron = new BugattiVeyron();
//        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
//
//        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
//    }

