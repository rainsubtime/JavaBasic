package lambda;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * @BelongsProject: javaBasic
 * @BelongsPackage: lambda
 * @Author: cywork
 * @CreateTime: 2023-12-28  09:23
 * @Description: TODO
 * @Version: 1.0
 */
public class LambdaMethodReference {

    static class MyClass {
        private String name;

        MyClass(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Function<String,MyClass> constructor = new Function<String, MyClass>() {
            @Override
            public MyClass apply(String name) {
                return new MyClass(name);
            }
        };
    }

}
