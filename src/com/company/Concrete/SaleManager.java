package com.company.Concrete;

import com.company.Abstracts.ISaleManager;
import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;
import com.company.Entities.Sale;

import java.util.Arrays;

public class SaleManager implements ISaleManager {
   //kampanyasız satış seçeneği
    @Override
    public void saleProductWithoutCampaign(Customer customer, Game[] games) {
        for(Game game:games){
            System.out.print(game.getName()+", ");
        }
        System.out.println(" adlı ürünler, "+customer.getFirstName()+" adlı müşteri tarafından satın alındı.");
    }
    //kampanyalı satış seçeneği
    @Override
    public void saleProductwithCampaign(Customer customer, Game[] games, Campaign campaign) {
        Sale sale = new Sale();
        for(int i=0; i< games.length; i++){
            sale.setAmount(sale.getAmount()+games[i].getPrice());
        }
        sale.setAmount(sale.getAmount()-sale.getAmount()*campaign.getAmountOfCampaign());
        System.out.println(customer.getFirstName()+" adlı müşteri "+campaign.getName()+
                " adlı kampanyayı kullanarak toplamda "+sale.getAmount()+" ödemiştir.");
    }

    @Override
    public void deleteProduct(Customer customer, Game[] games) {
        System.out.println(customer.getFirstName()+" adlı müşteri "+games+" adlı ürünleri satın almaktan vazgeçti.");
    }
}
