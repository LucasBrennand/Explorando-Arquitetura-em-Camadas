package negocio;

public class ExcecaoElementoJaExiste extends RuntimeException {
    public ExcecaoElementoJaExiste(String errorMsg){
        super("Esse elemento já está na lista");
    }
}
