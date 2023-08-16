package br.com.alura.projeto.java.minhasmusicas.principal;
import br.com.alura.projeto.java.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.projeto.java.minhasmusicas.modelos.Musica;
import br.com.alura.projeto.java.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Faroeste Caboclo");
        minhaMusica.setCantor("Legião Urbana");
        minhaMusica.setGenero("Rock Nacional");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bombeiros Salvadores");
        meuPodcast.setApresentador("Luiz Henrique");

        for (int i = 0; i < 4000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
