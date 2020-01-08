package com.zj;

import org.junit.Test;
import org.mockito.InjectMocks;

/**
 * @author lzj
 */
public class TestAService {

    @InjectMocks
    private AServiceImpl aService = new AServiceImpl();

    @Test
    public void test9() throws Exception {
        aService.a();
    }


}