package Application.apps;

import Application.interfaces.InternetBrowser;

public class InternetApp implements InternetBrowser{

    @Override
    public void displayPage() {
       System.out.println("Mostrando pagina...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Nova aba...");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando pagina...");
    }
    
}
