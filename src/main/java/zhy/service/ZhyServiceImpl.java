package zhy.service;

import org.springframework.stereotype.Service;
import zhy.dao.ZhyDao;
import zhy.entity.Zhy;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YevgeniC
 * @date 2018/8/31 15:49
 */
@Service("ZhyService")
public class ZhyServiceImpl implements ZhyService{
    @Resource
    ZhyDao zhyDao;
    @Override
    public List<Zhy> selectGoods() {
        return zhyDao.selectGoods();
    }
}
