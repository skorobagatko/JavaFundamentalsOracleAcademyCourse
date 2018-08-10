package lecture8;

public class Loundry {

    public void clean(Cleanable cleanable) {
        System.out.println(cleanable.getClass().getSimpleName()
                + " is cleaned up with " + cleanable.howToClean());
    }

}
