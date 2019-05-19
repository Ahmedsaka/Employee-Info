import java.util.UUID;

public class IdGenerator {
    public  final static UUID generator(){
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey;
    }
}
