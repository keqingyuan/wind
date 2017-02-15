package org.qingyuan.wind.service;

import org.hsweb.web.service.GenericService;
import org.qingyuan.wind.bean.test.TestPo;

import java.util.List;

/**
 * @author zhouhao
 */
public interface TestService extends GenericService<TestPo, String> {
    List<TestPo> selectByName(String name);
}
