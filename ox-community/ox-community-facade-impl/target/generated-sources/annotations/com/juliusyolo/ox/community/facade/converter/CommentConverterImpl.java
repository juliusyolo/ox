package com.juliusyolo.ox.community.facade.converter;

import com.juliusyolo.ox.community.facade.model.CommentSaveRequest;
import com.juliusyolo.ox.community.facade.model.CommentVO;
import com.juliusyolo.ox.community.service.model.AggregatedCommentModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T20:49:43+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class CommentConverterImpl implements CommentConverter {

    @Override
    public CommentVO convert(AggregatedCommentModel source) {
        if ( source == null ) {
            return null;
        }

        CommentVO commentVO = new CommentVO();

        return commentVO;
    }

    @Override
    public AggregatedCommentModel convert(CommentSaveRequest source) {
        if ( source == null ) {
            return null;
        }

        AggregatedCommentModel aggregatedCommentModel = new AggregatedCommentModel();

        aggregatedCommentModel.setCommentId( source.getCommentId() );
        aggregatedCommentModel.setUserId( source.getUserId() );
        aggregatedCommentModel.setPostId( source.getPostId() );
        aggregatedCommentModel.setContent( source.getContent() );

        return aggregatedCommentModel;
    }
}
