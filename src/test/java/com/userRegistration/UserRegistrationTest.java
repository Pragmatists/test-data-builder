package com.userRegistration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserRegistrationTest {

    @Test
    public void should_display_user_registration_data() {
        UserRegistration userRegistration = new UserRegistration("John", "john@mail.com", "123", LocalDate.of(2020, 1, 8),new Address("LA","12345"));

        Assertions.assertThat(userRegistration.summary()).isEqualTo("UserRegistration{name='John', email='john@mail.com'}");
    }
}
