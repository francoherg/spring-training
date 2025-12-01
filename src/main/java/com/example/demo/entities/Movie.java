package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @JsonProperty("title")
    String title;
    @JsonProperty("duration")
    Integer duration;
    @JsonProperty("director")
    String director;
}
