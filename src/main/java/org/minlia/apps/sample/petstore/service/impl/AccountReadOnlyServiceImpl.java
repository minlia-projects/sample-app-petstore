package org.minlia.apps.sample.petstore.service.impl;

import com.minlia.cloud.service.AbstractReadOnlyService;
import org.minlia.apps.sample.petstore.dao.AccountDao;
import org.minlia.apps.sample.petstore.domain.Account;
import org.minlia.apps.sample.petstore.service.AccountReadOnlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by will on 8/17/17.
 */
@Service
public class AccountReadOnlyServiceImpl extends AbstractReadOnlyService<AccountDao, Account, Long> implements AccountReadOnlyService {

    @Autowired
    AccountDao accountDao;

    /**
     * 调用DAO进行查询操作
     *
     * @param name
     * @param pageable
     * @return
     */
    @Override
    public Page<Account> findAllAccountsByXmlWithSort(String name, Pageable pageable) {
        return accountDao.findAllAccountsByXmlWithSort(name, pageable);
    }

    /**
     * 调用DAO进行查询操作
     *
     * @param name
     * @param pageable
     * @return
     */
    @Override
    public Page<Account> findAllAccountsByXml(String name, Pageable pageable) {
        return accountDao.findAllAccountsByXml(name, pageable);
    }

}
