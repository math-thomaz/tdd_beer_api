package com.dio.beerapiproject.mapper;

import com.dio.beerapiproject.dto.BeerDTO;
import com.dio.beerapiproject.entity.Beer;
import org.mapstruct.factory.Mappers;

public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}
