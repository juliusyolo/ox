package com.juliusyolo.ox.community.facade.converter;

import com.juliusyolo.ox.community.facade.model.CommentSaveRequest;
import com.juliusyolo.ox.community.facade.model.CommentVO;
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

    CommentVO convert(AggregatedCommentModel source);

    AggregatedCommentModel convert(CommentSaveRequest source);

}
