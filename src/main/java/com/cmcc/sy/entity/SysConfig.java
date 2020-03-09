package com.cmcc.sy.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author config
 * @since 2020-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysConfig extends Model<SysConfig> {

    private static final long serialVersionUID = 1L;

    private String variable;

    private String value;

    private LocalDateTime setTime;

    private String setBy;


    @Override
    protected Serializable pkVal() {
        return this.variable;
    }

}
