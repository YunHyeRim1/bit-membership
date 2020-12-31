package hello;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HelloWorld {
    public String main() {
        return Arrays.asList(new String[] { "hello, ", "World ", "!!!!" })
        .stream().map(i -> String.valueOf(i))
        .collect(Collectors.joining());
    }
}