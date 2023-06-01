package com.mobile.webmobile.service;

import com.mobile.webmobile.entity.Comment;
import com.mobile.webmobile.model.request.CreateCommentPostRequest;
import com.mobile.webmobile.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
