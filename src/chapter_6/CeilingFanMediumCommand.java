package chapter_6;

public class CeilingFanMediumCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();

    }

    @Override
    public void undo() {
        if(prevSpeed == ceilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
