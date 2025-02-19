package com.example.assignment2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testValidPersonCreation() {
        Person person = Person.builder()
                .id("TestID")
                .firstName("Krishna")
                .lastName("Unni")
                .age(24)
                .gender("Male")
                .build();
        assertNotNull(person);
        assertEquals("Krishna", person.getFirstName());
    }

    @Test
    void testNullIdThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            Person.builder().id(null).firstName("Krishna").lastName("Unni").age(24).gender("Male").build()
        );
        assertEquals("ID cannot be null", exception.getMessage());
    }

    @Test
    void testBlankFirstNameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            Person.builder().id("TestID").firstName("   ").lastName("Krishna").age(24).gender("Male").build()
        );
        assertEquals("First name cannot be null or blank", exception.getMessage());
    }

    @Test
    void testNegativeAgeThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            Person.builder().id("TestID").firstName("Krishna").lastName("Unni").age(-5).gender("Male").build()
        );
        assertEquals("Age cannot be negative", exception.getMessage());
    }
}
