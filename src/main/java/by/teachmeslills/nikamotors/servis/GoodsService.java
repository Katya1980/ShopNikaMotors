package by.teachmeslills.nikamotors.servis;

import by.teachmeslills.nikamotors.dto.good.GoodsReguest;
import by.teachmeslills.nikamotors.entity.Goods;
import by.teachmeslills.nikamotors.mapper.GoodsMapper;
import by.teachmeslills.nikamotors.repository.FileGoodsRepository;

public class GoodsService {

    public void add (GoodsReguest goodsReguest){
        FileGoodsRepository goodsRepository = new FileGoodsRepository();
        GoodsMapper goodsMapper =new GoodsMapper();
        Goods goods =goodsMapper.toEntity(goodsReguest);
        goodsRepository.add(goods);

    }


}
