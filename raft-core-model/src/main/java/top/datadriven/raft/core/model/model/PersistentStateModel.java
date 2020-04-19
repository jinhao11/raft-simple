package top.datadriven.raft.core.model.model;

import lombok.Getter;
import lombok.Setter;
import top.datadriven.raft.facade.base.BaseToString;
import top.datadriven.raft.facade.model.LogEntryModel;

import java.util.List;

/**
 * @description: 持久化的状态数据
 * @author: jiayancheng
 * @email: jiayancheng@foxmail.com
 * @datetime: 2020/4/13 8:44 下午
 * @version: 1.0.0
 */
@Getter
@Setter
public class PersistentStateModel extends BaseToString {
    private static final long serialVersionUID = 614565993931190984L;

    private Long currentTerm;

    /**
     * 在 currentTerm 获得选票的serverId。如果没有投票则为null
     * 处理逻辑：follower给candidate投票成功，则
     */
    private Long votedFor;

    private List<LogEntryModel> logEntries;

}
