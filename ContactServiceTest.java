import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("Morgun", "Leonard", "1234567890", "123 Second St");
        service.addContact(contact);
        assertEquals(contact, service.getContact(contact.getContactId()));
    }

    @Test
    public void testAddDuplicateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("Morgun", "Leonard", "1234567890", "123 Second St");
        service.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
    }
}