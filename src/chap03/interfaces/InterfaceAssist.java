package chap03.interfaces;

public class InterfaceAssist {
    public static void main(String[] args) {
        play( new BassGuitar());
        play( new Soccer());
    }

    public static void play(IBehavior iBehavior) {
        iBehavior.play();
    }
}
