package com.juliusyolo.ox.community.repository.es.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

/**
 * @author Julius Wang
 * <p>
 *
 * <p>
 * @since v0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "comment_index")
public class AggregatedComment {

    @Id
    private Long id;

    @Field(type = FieldType.Long)
    private Long commentId;

    @Field(type = FieldType.Long)
    private Long postId;

    @Field(type = FieldType.Long)
    private Long userId;

    @Field(type = FieldType.Text)
    private String nickname;

    @Field(type = FieldType.Text)
    private String username;

    @Field(type = FieldType.Text)
    private String avatarUrl;

    @Field(type = FieldType.Text)
    private String content;

    @Field(type = FieldType.Text)
    private LocalDateTime createTime;

    @Field(type = FieldType.Text)
    private LocalDateTime updateTime;
}
