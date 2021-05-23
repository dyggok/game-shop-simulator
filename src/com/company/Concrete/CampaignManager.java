package com.company.Concrete;

import com.company.Abstracts.ICampaignManager;
import com.company.Entities.Campaign;

public class CampaignManager implements ICampaignManager {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName()+" adlı kampanya eklendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName()+" adlı kampanya sistemden silindi.");
    }

    @Override
    public void update(Campaign campaign,String name, double amountOfCampaign) {
        campaign.setName(name);
        campaign.setAmountOfCampaign(amountOfCampaign);
        System.out.println("Kampanya bilgileri güncellendi.");
    }
}
