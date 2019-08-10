package com.sxwl.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class DeptParam {
    private Integer id;
    @NotBlank(message = "部门名称不能为空")
    @Length(max = 15,min = 2,message = "部门名称需要在2-15个字符之间")
    private String name;
    private Integer parentId=0;
    @NotNull(message="展现顺序不能为空")
    private Integer seq;
    @Length(max = 150,message = "备注在150个字符之间")
    private String remark;


}
