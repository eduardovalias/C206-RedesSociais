package Excecoes;

import java.io.IOException;

public class ExcecaoVerificada extends IOException {
    public ExcecaoVerificada(String mensagem){
        super(mensagem);
    }
}
