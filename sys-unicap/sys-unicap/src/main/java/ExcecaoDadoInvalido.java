public class ExcecaoDadoInvalido extends RuntimeException {
    public ExcecaoDadoInvalido(Throwable cause){
        super("Dado inválido");
    }
}
