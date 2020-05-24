package com.walking.mapper;

import com.walking.entity.Comment;

import java.util.List;

public interface CommentMapper {
   List<Comment> selectComments(int id);
}
