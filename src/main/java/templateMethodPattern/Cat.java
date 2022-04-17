package templateMethodPattern;

public class Cat extends Animal {
    public void playWithOwner() {
        System.out.println("냥냥아 이리온");
        System.out.println("꼬리콥터~");
        System.out.println("굿 잡");
    }

    @Override
    void play() {

        System.out.println("냥! 냥!");
    }
}
