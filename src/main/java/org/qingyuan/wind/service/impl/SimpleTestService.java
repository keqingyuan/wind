package org.qingyuan.wind.service.impl;

import org.hsweb.web.service.impl.AbstractServiceImpl;
import org.qingyuan.wind.bean.test.TestPo;
import org.qingyuan.wind.dao.test.TestDao;
import org.qingyuan.wind.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhouhao
 */
@Service("testService")
public class SimpleTestService extends AbstractServiceImpl<TestPo, String> implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    protected TestDao getMapper() {
        return testDao;
    }

    /**
     * 根据名称查询
     *
     * @see org.hsweb.ezorm.core.dsl.Query
     */
    @Override
    @Transactional
    public List<TestPo> selectByName(String name) {
        return createQuery().where(TestPo.Property.name, name).listNoPaging();
    }

}
