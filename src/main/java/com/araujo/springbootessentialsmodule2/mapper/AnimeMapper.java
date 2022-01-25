package com.araujo.springbootessentialsmodule2.mapper;

import com.araujo.springbootessentialsmodule2.domain.Anime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import request.AnimePostRequestBody;
import request.AnimePutRequestBody;

@Mapper(componentModel = "spring")
@Component
public abstract class AnimeMapper {

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
