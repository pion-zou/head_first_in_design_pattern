package chapter_6;

public class RemoteLoader {
    public static void main(String[] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLgihtOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLgihtOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0 , livingRoomLgihtOn , livingRoomLgihtOff);
//        remoteControl.setCommand(1 ,kitchenLightOn , kitchenLightOff);
//        remoteControl.setCommand(3 , stereoOnWithCD ,stereoOffWithCD);

//        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        System.out.println("----------------");


        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();


//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);

    }
}
