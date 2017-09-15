package org.minlia.apps.sample.petstore.service.impl;

import com.minlia.cloud.service.AbstractWriteOnlyService;
import lombok.extern.slf4j.Slf4j;
import org.minlia.apps.sample.petstore.dao.AccountDao;
import org.minlia.apps.sample.petstore.domain.Account;
import org.minlia.apps.sample.petstore.service.AccountWriteOnlyService;
import org.springframework.stereotype.Service;

/**
 * Created by will on 8/17/17.
 */
@Service
@Slf4j
public class AccountWriteOnlyServiceImpl extends AbstractWriteOnlyService<AccountDao, Account, Long> implements
    AccountWriteOnlyService {

}
