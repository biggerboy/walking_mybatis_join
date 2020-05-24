package com.walking.mapper;

import com.walking.entity.PostTag;

import java.util.List;

public interface PostTagMapper {
   List<PostTag> selectPostTags(int id);
}
