import java.util.logging.Level;

public class R07_ERR02_J {
    try {
    // ...
    } catch(SecurityException se) {
    logger.log(Level.SEVERE, se);
    // Recover from exception
    }
}
