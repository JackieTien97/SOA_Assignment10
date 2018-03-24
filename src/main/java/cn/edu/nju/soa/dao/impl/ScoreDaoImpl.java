package cn.edu.nju.soa.dao.impl;

import cn.edu.nju.soa.dao.ScoreDao;
import cn.edu.nju.soa.entity.TScoreEntity;
import cn.edu.nju.soa.repository.ScoreRepo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Jackie Tien on 2018-03-24.
 *
 */
@Repository
public class ScoreDaoImpl implements ScoreDao {

    @Resource
    private ScoreRepo scoreRepo;

    @Override
    public TScoreEntity save(TScoreEntity scoreEntity) {
        return scoreRepo.save(scoreEntity);
    }

    @Override
    public void delete(TScoreEntity scoreEntity) {
        scoreRepo.delete(scoreEntity);
    }

    @Override
    public List<TScoreEntity> findBySid(String sid) {
        return scoreRepo.findBySid(sid);
    }
}
