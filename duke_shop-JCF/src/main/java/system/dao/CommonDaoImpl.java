package system.dao;

import java.util.List;
import java.util.Map;

import jcf.data.handler.StreamHandler;
import jcf.query.core.QueryExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Jeado
 *
 */
public class CommonDaoImpl implements CommonDao {

	@Autowired
	private QueryExecutor queryExecutor;

	public <T> void queryForStream(Object statementId, Object parameter, StreamHandler<T> streamHandler) {
		queryExecutor.queryForStream(statementId, parameter, streamHandler);
	}

	public <T> T queryForObject(Object statementId, Object parameter, Class<T> clazz) {
		return queryExecutor.queryForObject(statementId, parameter, clazz);
	}

	public Map<String, Object> queryForMap(Object statementId, Object parameter) {
		return queryExecutor.queryForMap(statementId, parameter);
	}

	public <T> List<T> queryForList(Object statementId, Object parameter, Class<T> clazz) {
		return queryExecutor.queryForList(statementId, parameter, clazz);
	}

	public <T> List<T> queryForList(Object statementId, Object parameter, RowMapper<T> rowMapper) {
		return queryExecutor.queryForList(statementId, parameter, rowMapper);
	}

	public <T> List<T> queryForList(Object statementId, Object parameter, int skipRows, int maxRows, Class<T> clazz) {
		return queryExecutor.queryForList(statementId, parameter, skipRows,
				maxRows, clazz);
	}
	public List<Map<String, Object>> queryForMapList(Object statementId, Object parameter) {
		return queryExecutor.queryForMapList(statementId, parameter);
	}

	@SuppressWarnings("deprecation")
	public List<Map<String, Object>> queryForMapList(Object statementId, Object parameter, int skipRows, int maxRows) {
		return queryExecutor.queryForMapList(statementId, parameter, skipRows,
				maxRows, true);
	}

	public Integer queryForInt(Object statementId, Object parameter) {
		return queryExecutor.queryForInt(statementId, parameter);
	}

	public Long queryForLong(Object statementId, Object parameter) {
		return queryExecutor.queryForLong(statementId, parameter);
	}

	public Integer update(Object statementId, Object parameter) {
		return queryExecutor.update(statementId, parameter);
	}

	public int[] batchUpdate(Object statementId, List<?> parameter) {
		return queryExecutor.batchUpdate(statementId, parameter);
	}

	public Map<String, Object> executeCallStatement(Object statementId, Object parameter) {
		return queryExecutor.executeCallStatement(statementId, parameter);
	}

	public void setQueryExecutor(QueryExecutor queryExecutor) {
		this.queryExecutor = queryExecutor;
	}

}
