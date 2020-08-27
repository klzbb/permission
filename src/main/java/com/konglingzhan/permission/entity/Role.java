package com.konglingzhan.permission.entity;

import com.konglingzhan.permission.common.converter.DataScopeReadConverter;
import com.konglingzhan.permission.common.converter.DataScopeWriteConverter;
import com.konglingzhan.permission.common.converter.TimeConverter;
import com.konglingzhan.permission.common.options.DataScopeOptions;
import com.wuwenze.poi.annotation.ExcelField;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "t_role")
public class Role implements Serializable {

    private static final long serialVersionUID = -1714476694755654924L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;

    @NotBlank(message = "{required}")
    @Size(max = 10, message = "{noMoreThan}")
    @ExcelField(value = "角色名称")
    private String roleName;

    @Size(max = 50, message = "{noMoreThan}")
    @ExcelField(value = "角色描述")
    private String remark;

    @ExcelField(value = "创建时间", writeConverter = TimeConverter.class)
    private Date createTime;

    @ExcelField(value = "修改时间", writeConverter = TimeConverter.class)
    private Date modifyTime;

    private transient String createTimeFrom;
    private transient String createTimeTo;
    private transient String menuId;
    @NotNull(message = "{required}")
    @ExcelField(value = "数据范围", writeConverter = DataScopeWriteConverter.class,readConverter = DataScopeReadConverter.class,options = DataScopeOptions.class )
    private Integer dataScope;
}
