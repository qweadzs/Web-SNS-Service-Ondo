package com.nextlevel.ondo.domain.dto.comment;

import com.nextlevel.ondo.domain.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class GetCommentDto {

    Comment comment;
    String username;
    String image;
    Boolean flag;
    @Builder
    public GetCommentDto(Comment comment, String username, String image, Boolean flag) {
        this.comment = comment;
        this.username = username;
        this.image = image;
        this.flag = flag;
    }
}