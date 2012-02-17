package redis.clients.johm;

public class InvalidFieldException extends JOhmException {

    public InvalidFieldException(Exception e) {
    	super(e);
    }

    public InvalidFieldException(String message) {
    	super(message);
    }

	/**
     * 
     */
    private static final long serialVersionUID = -7953140268180103467L;

}
