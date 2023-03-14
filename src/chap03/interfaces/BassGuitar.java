package chap03.interfaces;

public class BassGuitar extends Guitar implements IBehavior{
    @Override
    public void play() {
        System.out.println("Play BassGuitar");
    }

}
