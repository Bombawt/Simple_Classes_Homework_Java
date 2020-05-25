public class WaterBottle {

    private int volume;

    public WaterBottle (int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(int num1){
        this.volume -= num1;
        return this.volume;
    }

    public int empty(){
        this.volume = 0;
        return this.volume;
    }

    public int fill(){
        this.volume = 100;
        return this.volume;
    }
}
