package run.halo.app.jdk;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test(){
        System.out.println(Optional.of(null)
                            .orElseThrow(() -> new NullPointerException()));
    }
}
