package cz.rodr.accounts.service.impl;

import cz.rodr.accounts.dto.CustomerDto;
import cz.rodr.accounts.repository.AccountsRepository;
import cz.rodr.accounts.repository.CustomerRepository;
import cz.rodr.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param customerDto - CustomerDto Object
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
