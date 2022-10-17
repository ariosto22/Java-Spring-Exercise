package co.develhope.dependencyInjectionExercise.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Emanuele Di Gregoli";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponent has been called");
        return myComponentName;
    }


}
