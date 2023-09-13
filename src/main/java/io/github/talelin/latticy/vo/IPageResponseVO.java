package io.github.talelin.latticy.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页数据统一 view object
 *
 * @author pedro@TaleLin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IPageResponseVO<T> {
    /**
     * 总的数据记录数量
     */
    private Long total;
    /**
     * 记录对象集合
     */
    private List<T> items;
    /**
     * 当前数据的页码
     */
    private Long page;
    /**
     * 每页展示的记录条数
     */
    private Long count;

}
