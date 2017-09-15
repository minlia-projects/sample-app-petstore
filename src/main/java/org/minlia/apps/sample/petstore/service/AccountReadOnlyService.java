package org.minlia.apps.sample.petstore.service;

import com.minlia.cloud.service.ReadOnlyService;
import org.minlia.apps.sample.petstore.dao.AccountDao;
import org.minlia.apps.sample.petstore.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by will on 8/17/17.
 */
@Transactional(readOnly = true)
public interface AccountReadOnlyService extends ReadOnlyService<AccountDao, Account, Long> {


    /**
     * 手写SQL查询出分页结果
     * @param name
     * @param pageable
     * @return
     */
    Page<Account> findAllAccountsByXmlWithSort(String name, Pageable pageable);



    /**
     * 手写SQL查询出分页结果
     * @param name
     * @param pageable
     * @return
     */
    Page<Account> findAllAccountsByXml(String name, Pageable pageable);

}
