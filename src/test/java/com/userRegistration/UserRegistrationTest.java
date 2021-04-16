package com.userRegistration;

import org.junit.jupiter.api.Test;

import static com.userRegistration.UserRegistrationBuilder.aUser;
import static org.assertj.core.api.Assertions.assertThat;

public class UserRegistrationTest {

    @Test
    public void should_display_user_registration_data() {
        UserRegistration user = aUser().name("John").email("john@mail.com").build();

        assertThat(user.summary()).isEqualTo("UserRegistration{name='John', email='john@mail.com'}");
    }

}
