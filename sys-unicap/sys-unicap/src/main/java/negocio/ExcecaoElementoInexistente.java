package negocio;

public class ExcecaoElementoInexistente extends Exception {
    public ExcecaoElementoInexistente(String errorMsg){
        super(errorMsg);
    }
}
