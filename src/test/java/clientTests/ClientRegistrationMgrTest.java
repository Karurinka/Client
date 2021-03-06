package clientTests;

import WebServices.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ClientRegistrationMgrTest
{
    private static final Auction auctionService = new AuctionService().getPort(Auction.class);
    private static final Registration registrationService = new RegistrationService().getPort(Registration.class);


    @Test
    public void registerUser()
    {
        User user1 = registrationService.registerUser("xxx1@yyy");
        assertTrue(user1.getEmail().equals("xxx1@yyy"));
        User user2 = registrationService.registerUser("xxx2@yyy2");
        assertTrue(user2.getEmail().equals("xxx2@yyy2"));
        User user2bis = registrationService.registerUser("xxx2@yyy2");
        assertEquals(user2bis, user2);
        //geen @ in het adres
        assertNull(registrationService.registerUser("abc"));
    }

    @Test
    public void getUser()
    {
        User user1 = registrationService.registerUser("xxx5@yyy5");
        User userGet = registrationService.getUser("xxx5@yyy5");
        assertEquals(userGet, user1);
        assertNull(registrationService.getUser("aaa4@bb5"));
        registrationService.registerUser("abc");
        assertNull(registrationService.getUser("abc"));
    }
}
