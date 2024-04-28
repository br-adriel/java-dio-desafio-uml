package br.com.dio.challenge.models;

import br.com.dio.challenge.interfaces.InternetBrowser;
import br.com.dio.challenge.interfaces.MusicPlayer;
import br.com.dio.challenge.interfaces.Phone;

public class SmartPhone implements Phone, MusicPlayer, InternetBrowser {
    @Override
    public void newTab() {
        System.out.println("Nova guia aberta");
    }

    @Override
    public void showPage(String url) {
        System.out.println("Abrindo página \"" + url + "\"...");
    }

    @Override
    public void refresh() {
        System.out.println("Página atualizada");
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void selectSong(String song) {
        System.out.println("Tocando \"" + song + "\"");
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void answer() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Ligando para o correio de voz...");
    }
}
