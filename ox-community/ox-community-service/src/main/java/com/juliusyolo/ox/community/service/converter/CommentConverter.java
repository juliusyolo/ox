package com.juliusyolo.ox.community.service.converter;

import com.juliusyolo.ox.community.repository.db.model.Comment;
import com.juliusyolo.ox.community.repository.es.model.AggregatedComment;
import com.juliusyolo.ox.community.service.model.AggregatedCommentModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Julius Wang
 * <p>
 * CommentConverter
 * <p>
 * @since v0.1
 */
@Mapper
public interface CommentConverter {

    CommentConverter INSTANCE = Mappers.getMapper(CommentConverter.class);

    AggregatedCommentModel convert(AggregatedComment source);


    Comment convert(AggregatedCommentModel source);

    AggregatedComment convertAggregatedComment(AggregatedCommentModel source);
}
