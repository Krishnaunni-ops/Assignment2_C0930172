package com.example.assignment2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {

    @Test
    void testValidBlogPostCreation() {
        BlogPost post = BlogPost.builder()
                .id("TestId")
                .authorId("TestAuthor")
                .postContent("This is a test blog post.")
                .build();
        assertNotNull(post);
        assertEquals("TestAuthor", post.getAuthorId());
    }

    @Test
    void testNullIdThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            BlogPost.builder().id(null).authorId("TestAuthor").postContent("Test").build()
        );
        assertEquals("Post ID cannot be null", exception.getMessage());
    }

    @Test
    void testNullAuthorIdThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            BlogPost.builder().id("TestId").authorId(null).postContent("Test").build()
        );
        assertEquals("Author ID cannot be null", exception.getMessage());
    }
}
