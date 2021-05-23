package com.company.Abstracts;

import com.company.Entities.Campaign;

public interface ICampaignManager {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign, String name,double amountOfCampaign);
}
