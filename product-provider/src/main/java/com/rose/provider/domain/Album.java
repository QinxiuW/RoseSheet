package com.rose.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName(value = "tb_album")
public class Album implements Serializable {

  private static final long serialVersionUID = 1354555982203978416L;
  /**
   * Album's ID.
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * Album's name.
   */
  @TableField(value = "album_name")
  private String albumName;

  /**
   * Create date time.
   */
  @TableField(value = "created")
  private Date created;

  /**
   * Last update date time.
   */
  @TableField(value = "updated")
  private Date updated;
}
