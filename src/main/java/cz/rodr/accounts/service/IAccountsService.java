package cz.rodr.accounts.service;

import cz.rodr.accounts.dto.CustomerDto;

public interface IAccountsService {


    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Accounts Details based on a given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
