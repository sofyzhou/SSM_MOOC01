package com.third.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Classify {
    private  int id;
    private String bigName;
    private String smallName;


}
