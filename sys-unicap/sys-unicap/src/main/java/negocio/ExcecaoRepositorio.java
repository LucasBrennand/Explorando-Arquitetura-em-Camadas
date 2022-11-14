package negocio;

public class ExcecaoRepositorio extends Exception {
    public ExcecaoRepositorio(String errorMsg){
        super(errorMsg);
    }
}
