package Application.apps;

import Application.interfaces.Phone;

public class TelephoneApp implements Phone {

    @Override
    public void call() {
        System.out.println("Chamando...");
    }

    @Override
    public void answer() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void beginMailVoicer() {
        System.out.println("Iniciando correio de voz...");
    }
    
}
