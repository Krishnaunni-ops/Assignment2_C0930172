package com.example.assignment2;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import java.util.List;
import java.util.Objects;

@Getter
@ToString
@EqualsAndHashCode
public class Blog {
    private List<BlogPost> posts;
    private List<Person> contributors;

}
