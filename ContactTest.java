import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreationSuccess() {
        Contact contact = new Contact("Morgun", "Leonard", "1234567890", "123 Second St");
        assertNotNull(contact.getContactId());
        assertEquals("Morgun", contact.getFirstName());
        assertEquals("Leonard", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Second St", contact.getAddress());
    }

    @Test
    public void testContactCreationInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Leonard", "1234567890", "123 Second St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("ThisNameIsTooLong", "Leonard", "1234567890", "123 Second St"));
    }
}