package by.teachmeslills.nikamotors.repository;

import by.teachmeslills.nikamotors.entity.Goods;

import java.io.*;
import java.util.*;

public class FileGoodsRepository implements GoogsRepository {
    private final String filePath = "E:\\Козловская Е. В\\ShopNikaMotors\\goods";
    private List<Goods> goodsList;

    public FileGoodsRepository(){
        goodsList = deserializable();
    }

    @Override
    public Goods add(Goods goods) {
        goodsList.add(goods);
        serializable();
        return goods;
    }

    @Override
    public void deleteById(Long goodsId) {
        goodsList.removeIf(goods -> goods.getId().equals(goodsId));
        serializable();
    }

    @Override
    public Goods findGoodsById(Long goodsId) {
        return null;
    }

    @Override
    public Collection<Goods> allGoods() {
        return goodsList;
    }

    public void serializable() {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filePath))) {
            os.writeObject(goodsList);
            System.out.println("Серилазация упешна. Количесво товаров:" + goodsList.size());
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации товаров" + e.getMessage());
            throw new RuntimeException(e);

        }
    }

    public List<Goods> deserializable() {
        File file = new File(filePath);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath))) {
            goodsList = (List<Goods>) is.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации товаров" + e.getMessage());

        }
        return goodsList;
    }

}