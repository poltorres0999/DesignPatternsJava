package Singleton.Exam20172018ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class RegisterSingleton {

    private Map<String, MachineComponent> componentes;
    private static RegisterSingleton rs;
    // Eeger public static final RegisterSingleton rse = new RegisterSingleton();


    private RegisterSingleton () {

    }

    //LAZY
    public RegisterSingleton createSinleton () {

        if (this.rs != null) {
            rs = new RegisterSingleton();
        }
        return rs;
    }

    public void addComponent (String s, MachineComponent mc) {
        componentes.put(s,mc);
    }

    public MachineComponent getComponent(String s) {
        return componentes.get(s);
    }

}
