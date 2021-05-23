package com.company.Abstracts;

import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;

public interface ISaleManager {
    void saleProductWithoutCampaign(Customer customer, Game[] games);
    void saleProductwithCampaign(Customer customer, Game[] games, Campaign campaign);
    void deleteProduct(Customer customer, Game[] games);
}
