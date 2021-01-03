package com.dominicheal.graphql.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Post {
    String id;
    String title;
    String category;
    String author;
    String text;
}
