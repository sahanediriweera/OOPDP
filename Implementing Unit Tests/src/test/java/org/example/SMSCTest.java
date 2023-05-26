package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import SMSC.BillingSystem;
import SMSC.SMSC;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import SMSC.*;

public class SMSCTest {

    @Test
    void exceptionScenario(){

        BillingSystem billingSystem = mock(BillingSystem.class);
        //SMSC smsc = mock(SMSC.class);

        SMSController controller = new SMSController(billingSystem);
        //controller.setSmsc(smsc);

        doReturn(false).when(billingSystem).authorize("OOP",2);

        assertThrows(CreditLimitExceededException.class,
                ()->controller.sendSms("OOP","knthi","value"));

    }

    @Test
    void happyScenario(){

        BillingSystem billingSystem = mock(BillingSystem.class);
        SMSC smsc = mock(SMSC.class);

        SMSController controller = new SMSController(billingSystem);
        controller.setSmsc(smsc);

        doReturn(true).when(billingSystem).authorize("OOP",2);

        controller.sendSms("OOP","kl","dfd");
        verify(smsc).send("OOP","kl");
    }
}
