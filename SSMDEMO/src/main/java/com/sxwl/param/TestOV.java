package com.sxwl.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TestOV {
    @NotBlank
    private String msg;
    @NotNull
    private Integer id;
}
