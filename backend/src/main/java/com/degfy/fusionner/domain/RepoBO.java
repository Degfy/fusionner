package com.degfy.fusionner.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RepoBO {
    private Integer id;
    private String name;
    private String description;
    private String url = "";
}
