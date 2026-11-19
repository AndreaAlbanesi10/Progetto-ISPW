package exception;

public class AppException extends Exception {

    public AppException(String message) {

        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    //aggiungi Exception per il controllo sul formato dei dati inseriti dall'utente


}
