package com.company;

import com.company.Abstracts.IPersonCheckService;
import com.company.Adapters.MernisServiceAdapter;
import com.company.Concrete.CustomerManager;
import com.company.Concrete.GameManager;
import com.company.Concrete.SaleManager;
import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //kayıt işlemleri
        Customer customer = new Customer(1,"Duygu","Gök",
               LocalDate.of(1996,05,20),"48067173533");
        Game game = new Game(1,"Resident Evil 8","Horror",359);
        Game game2 = new Game(2, "Among Us","Social Deduction",10);
        Game[] games = {game,game2};
        Campaign campaign = new Campaign(1,"Haftasonu İndirimi",25);
        //oyuncu ile ilgili ekleme-silme-güncelleme işlemleri
        CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
        customerManager.register(customer);
        customerManager.update(customer,"Deniz","Gök",1996,"48067173533");
        customerManager.delete(customer);
        //oyun ile ilgili ekleme-silme-güncelleme işlemleri
        GameManager gameManager = new GameManager();
        gameManager.save(game);
        gameManager.delete(game);
        //satış ile ilgili işlemler
        SaleManager saleManager = new SaleManager();
        saleManager.saleProductWithoutCampaign(customer,games);
        saleManager.saleProductwithCampaign(customer,games,campaign);
    }
}
