package by.teachmeslills.nikamotors;

import by.teachmeslills.nikamotors.entity.Goods;
import by.teachmeslills.nikamotors.entity.User;
import by.teachmeslills.nikamotors.repository.FileRepository;
import by.teachmeslills.nikamotors.repository.FileGoodsRepository;

public class Main {
    public static void main(String[] args) {
        FileRepository fileRepository = new FileRepository();

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Катя");
        user1.setSurname("Козловская");
        user1.setLogin("Katya");
        user1.setPassword("1234");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Петя");
        user2.setSurname("Петров");
        user2.setLogin("Petr");
        user2.setPassword("12345");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Иван");
        user3.setSurname("Иванов");
        user3.setLogin("Ivan");
        user3.setPassword("123456");

        fileRepository.add(user1);
        fileRepository.add(user2);
        fileRepository.add(user3);

        System.out.println("Все пользователи:  ");
        for (User user : fileRepository.allUsers()) {
            System.out.println(user);
        }

        fileRepository.deleteByld(2L);
        System.out.println("Обновленный список пользователей:  ");
        for (User user : fileRepository.allUsers()) {
            System.out.println(user);
        }


        FileGoodsRepository goodsRepository = new FileGoodsRepository();
        Goods goods1 = new Goods();
        goods1.setId(1L);
        goods1.setName("рычаг");
        goods1.setCode("111");
        goods1.setCost(123);
        goods1.setQuantityInStock(5);



        goodsRepository.add(goods1);
         Goods foundGoods = goodsRepository.findGoodsById(1L);
         if (foundGoods != null){
             System.out.println("Товар найден  " + foundGoods.getName());
        } else
             System.out.println();
             System.out.println("Товар с таким Id не найден");



    }

}