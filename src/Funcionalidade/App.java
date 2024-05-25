package Funcionalidade;

import Excecoes.ExcecaoVerificada;
import Excecoes.ExcecaoNaoVerificada;

public class App {
    public static void main(String[] args){

            Facebook facebook = new Facebook();
            Twitter twitter = new Twitter();
            GooglePlus googlePlus = new GooglePlus();
            Instagram instagram = new Instagram();

            facebook.senha = "face123";
            facebook.numAmigos = 200;

            twitter.senha = "tt123";
            twitter.numAmigos = 50;

            googlePlus.senha = "gp123";
            googlePlus.numAmigos = 120;

            instagram.senha = "ig123";
            instagram.numAmigos = 500;

            RedeSocial[] redeSociais = new RedeSocial[2];
            redeSociais[0] = facebook;
            redeSociais[1] = instagram;

            Usuario usuario = new Usuario(redeSociais);

            usuario.setNome("Eduardo");
            usuario.setEmail("edu@inatel.br");

            try {
                    ((Facebook) usuario.getRedesSociais()[0]).fazStreaming();
                    usuario.getRedesSociais()[0].postarVideo();
                    usuario.getRedesSociais()[0].postarFoto();

                    usuario.getRedesSociais()[1].postarComentario();
                    usuario.getRedesSociais()[1].curtirPublicacao();
            } catch (ExcecaoNaoVerificada e){
                    e.printStackTrace();
            }
    }
}
