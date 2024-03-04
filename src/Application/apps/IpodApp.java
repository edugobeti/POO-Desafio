package Application.apps;

import Application.interfaces.MusicReproducer;

public class IpodApp implements MusicReproducer {

    @Override
    public void selectMusic() {
        System.out.println("Musica selecinada...");
    }

    @Override
    public void playMusic() {
        System.out.println("Reproduzindo musica...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Musica pausada...");
    }
    
}
