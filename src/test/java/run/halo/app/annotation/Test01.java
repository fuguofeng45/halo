package run.halo.app.annotation;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public class Test01 {

    static String getTestString(@NonNull String string){
        return string;
    }

    public static void main(String[] args) {
        System.out.println(getTestString(null));
    }

}
