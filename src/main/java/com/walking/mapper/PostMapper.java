package com.walking.mapper;

import com.walking.entity.Post;

import java.util.List;

public interface PostMapper {
   List<Post> selectPosts(int id);
}
