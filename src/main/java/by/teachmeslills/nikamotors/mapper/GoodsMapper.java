package by.teachmeslills.nikamotors.mapper;

import by.teachmeslills.nikamotors.dto.good.GoodsReguest;
import by.teachmeslills.nikamotors.dto.good.GoodsResponse;
import by.teachmeslills.nikamotors.dto.user.UserResponse;
import by.teachmeslills.nikamotors.entity.Goods;
import by.teachmeslills.nikamotors.entity.User;

public class GoodsMapper {
    public Goods toEntity(GoodsReguest goodsReguest) {
        Goods goods = new Goods();
        goods.setId(goodsReguest.getId());
        goods.setCode(goodsReguest.getCode());
        goods.setName(goodsReguest.getName());
        goods.setSubtype(goodsReguest.getSubtype());
        goods.setCost(goodsReguest.getCost());
        goods.setQuantityInStock(goodsReguest.getQuantityInStock());
        return goods;

    }

    public GoodsResponse toResponse(Goods goods) {
        GoodsResponse goodsResponse = new GoodsResponse();
        goodsResponse.setId(goods.getId());
        goodsResponse.setCode(goods.getCode());
        goodsResponse.setName(goods.getName());
        goodsResponse.setSubtype(goods.getSubtype());
        goodsResponse.setCost(goods.getCost());
        goodsResponse.setQuantityInStock(goods.getQuantityInStock());
        return goodsResponse;
    }

}
