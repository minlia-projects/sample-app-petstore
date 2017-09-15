package org.minlia.apps.sample.petstore.service;

import com.minlia.cloud.service.WriteOnlyService;
import org.minlia.apps.sample.petstore.dao.AccountDao;
import org.minlia.apps.sample.petstore.domain.Account;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by will on 8/17/17.
 */
@Transactional
public interface AccountWriteOnlyService extends WriteOnlyService<AccountDao, Account, Long> {

}
