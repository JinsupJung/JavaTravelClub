package chap03.interfaces;

public class Soccer extends Sport implements IBehavior{
    @Override
    public void play() {
        System.out.println("Play soccer");
    }
}
