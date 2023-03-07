package Codigos4;

public class Car {
    private Motor motorDep;

    public Car(Motor motor){
        this.motorDep = motor;
    }

    public void star(){
        motorDep.Star();
    }
}
