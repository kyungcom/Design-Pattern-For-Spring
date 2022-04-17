package templateMethodPattern;

public class Dog extends Animal {
    public void playWithOwner() {
        System.out.println("댕댕아 이리온");

        System.out.println("꼬리콥터~");
        System.out.println("굿 잡");
    }

    @Override
    void play() {
        System.out.println("댕! 댕!");
    }
}
