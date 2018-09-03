package zhy.dao;

import zhy.entity.Zhy;

import java.util.List;

/**
 * @author YevgeniC
 * @date 2018/8/31 15:59
 */
public interface ZhyDao {
    List<Zhy> selectGoods();
}
