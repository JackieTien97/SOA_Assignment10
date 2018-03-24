package cn.edu.nju.soa.repository;

import cn.edu.nju.soa.entity.TScoreEntityPK;
import cn.edu.nju.soa.entity.TScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Jackie Tien on 2018-03-24.
 *
 */
public interface ScoreRepo extends JpaRepository<TScoreEntity, TScoreEntityPK> {
    List<TScoreEntity> findBySid(String sid);
}
