package com.juliusyolo.ox.community.service.converter;

import com.juliusyolo.ox.community.repository.db.model.Comment;
import com.juliusyolo.ox.community.repository.es.model.AggregatedComment;
import com.juliusyolo.ox.community.service.model.AggregatedCommentModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T12:44:11+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class CommentConverterImpl implements CommentConverter {

    @Override
    public AggregatedCommentModel convert(AggregatedComment source) {
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

    @Override
    public Comment convert(AggregatedCommentModel source) {
        if ( source == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setCommentId( source.getCommentId() );
        comment.setPostId( source.getPostId() );
        comment.setUserId( source.getUserId() );
        comment.setContent( source.getContent() );

        return comment;
    }

    @Override
    public AggregatedComment convertAggregatedComment(AggregatedCommentModel source) {
        if ( source == null ) {
            return null;
        }

        AggregatedComment aggregatedComment = new AggregatedComment();

        aggregatedComment.setCommentId( source.getCommentId() );
        aggregatedComment.setPostId( source.getPostId() );
        aggregatedComment.setUserId( source.getUserId() );
        aggregatedComment.setContent( source.getContent() );

        return aggregatedComment;
    }
}
