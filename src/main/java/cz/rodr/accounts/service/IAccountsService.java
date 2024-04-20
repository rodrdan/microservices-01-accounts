package cz.rodr.accounts.service;

import cz.rodr.accounts.dto.CustomerDto;

public interface IAccountsService {


    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
