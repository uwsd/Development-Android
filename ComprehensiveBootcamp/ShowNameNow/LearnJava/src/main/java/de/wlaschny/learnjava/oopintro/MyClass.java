package de.wlaschny.learnjava.oopintro;

public class MyClass {
    public static void main(String[] args) {
        Microphone microphone = new Microphone("Blue Yeti", "blue", 4711);
//        microphone.color = "blue";
//        microphone.name = "Blue Yeti";
//        microphone.model = 4711;
        microphone.setModel(4700);

        System.out.println(microphone);
        System.out.println(microphone.getColor() + " " + microphone.getName() + " " + microphone.getModel());

        Microphone gHMic = new Microphone("HMic", "red", 4712);
//        gHMic.model = 4712;
//        gHMic.name = "HMic";
//        gHMic.color = "red";

        System.out.println(gHMic);
        System.out.println(gHMic.getColor() + " " + gHMic.getName() + " " + gHMic.getModel());

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();

        gHMic.turnOn();
        gHMic.setVolume();
        gHMic.turnOff();

        System.out.println(microphone.showDescription());

        Microphone newMic = new Microphone("NewMic", "green", 123);

        Microphone otherMic = new Microphone();
        otherMic.setColor("red");
        System.out.println(otherMic.getColor());
//        System.out.println(otherMic.getModel());
//        System.out.println(otherMic.getName());

        Microphone grandMic = new Microphone("Grand", "yellow");

    }
}
