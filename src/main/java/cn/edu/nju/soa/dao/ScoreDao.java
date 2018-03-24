package cn.edu.nju.soa.dao;

import cn.edu.nju.soa.entity.TScoreEntity;

import java.util.List;

/**
 * Created by Jackie Tien on 2018-03-24.
 *
 */
public interface ScoreDao {
    TScoreEntity save(TScoreEntity scoreEntity);
    void delete(TScoreEntity scoreEntity);
    List<TScoreEntity> findBySid(String sid);
}
