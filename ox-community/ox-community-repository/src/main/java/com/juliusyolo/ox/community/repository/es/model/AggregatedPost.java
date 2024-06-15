package com.juliusyolo.ox.community.repository.es.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;
import java.util.List;

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
@Document(indexName = "post_index")
public class AggregatedPost {
    @Id
    private Long id;

    private Long postId;

    private Long userId;

    private String title;

    private String content;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private List<AggregatedComment> comments;

}
