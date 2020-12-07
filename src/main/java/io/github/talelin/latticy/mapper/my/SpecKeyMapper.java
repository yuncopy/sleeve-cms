package io.github.talelin.latticy.mapper.my;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.talelin.latticy.model.my.SpecKey;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecKeyMapper extends BaseMapper<SpecKey> {
    /**
     * 分页查询规格名
     */
    IPage<SpecKey> searchAllSpecKey(IPage<SpecKey> page);

}
