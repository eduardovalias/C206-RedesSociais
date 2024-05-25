package Excecoes;

public class ExcecaoNaoVerificada extends RuntimeException{
    public ExcecaoNaoVerificada(String mensagem){
        super(mensagem);
    }
}
