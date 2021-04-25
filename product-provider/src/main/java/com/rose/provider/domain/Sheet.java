package com.rose.provider.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName(value = "tb_sheet")
public class Sheet implements Serializable {

  private static final long serialVersionUID = -5340490311697996900L;
  /**
   * Sheet music's ID.
   */
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  /**
   * Song name of the sheet music.
   */
  @TableField(value = "song_name")
  private String songName;

  /**
   * Lyric's author name.
   */
  @TableField(value = "lyric_author")
  private String lyricAuthor;

  /**
   * Compositor's name.
   */
  @TableField(value = "compositor")
  private String compositor;

  /**
   * Song's key.
   */
  @TableField(value = "song_key")
  private String songKey;

  /**
   * Tags.
   */
  @TableField(value = "tags")
  private String tags;

  /**
   * Song's topic {"四旬期，圣诞期"}.
   */
  @TableField(value = "topic")
  private String topic;

  /**
   * Web dir of the picture.
   */
  @TableField(value = "picture_dir")
  private String pictureDir;

  /**
   * Web dir of the audio file.
   */
  @TableField(value = "audio_dir")
  private String audioDir;

  /**
   * Instrument type {"guitar,piano etc."}.
   */
  @TableField(value = "type")
  private String type;

  /**
   * Created date time.
   */
  @TableField(value = "created")
  private Date created;

  /**
   * Last update date time.
   */
  @TableField(value = "updated")
  private Date updated;
}
