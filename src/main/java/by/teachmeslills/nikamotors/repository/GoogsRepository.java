package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.Goods;

import java.util.Collection;

public interface GoogsRepository {



    public  Goods add (Goods goods);
    public void deleteById (Long goodsId);

    public Goods findGoodsById(Long goodsId);

    public Collection<Goods> allGoods();
    

}
