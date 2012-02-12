package system.dao;

import java.util.List;
import java.util.Map;

import jcf.data.handler.StreamHandler;
import jcf.query.core.QueryExecutor;

import org.springframework.jdbc.core.RowMapper;


/**
 *
 * {@link QueryExecutor}를 내부적으로 초기화하여 지원하는 편의 클래스. 배치 트랜잭션 모드를 지원하는 배치 연산
 * 추가 제공.
 *
 * @author Jeado
 *
 */
public interface CommonDao {

	<T> void queryForStream(Object statementId, Object parameter, StreamHandler<T> streamHandler);

	/**
	 *
	 * 단건 조회 연산을 수행한다.
	 *
	 * @param <T>
	 * @param statementId
	 * @param parameter
	 * @param clazz
	 * @return
	 */
	<T> T queryForObject(Object statementId, Object parameter, Class<T> clazz);

	/**
	 *
	 * 단건 조회 연산을 수행한다.
	 *
	 * @param statementId
	 * @param parameter
	 * @return
	 */
	Map<String, Object> queryForMap(Object statementId, Object parameter);

	/**
	 *
	 * 다건 조회 연산을 수행한다.
	 *
	 * @param <T>
	 * @param statementId
	 * @param parameter
	 * @param clazz
	 * @return
	 */
	<T> List<T> queryForList(Object statementId, Object parameter, Class<T> clazz);

	/**
	 *
	 * 다건 조회 연산을 수행한다.
	 *
	 * @param <T>
	 * @param statementId
	 * @param parameter
	 * @param rowMapper
	 * @return
	 */
	<T> List<T> queryForList(Object statementId, Object parameter, RowMapper<T> rowMapper);

	/**
	 *
	 * 다건 조회 연산을 수행한다.
	 *
	 * @param <T>
	 * @param statementId
	 * @param parameter
	 * @param skipRows
	 * @param maxRows
	 * @param clazz
	 * @return
	 */
	<T> List<T> queryForList(Object statementId, Object parameter, int skipRows, int maxRows, Class<T> clazz);

	/**
	 *
	 * 다건 조회 연산을 수행한다.
	 *
	 * @param statementId
	 * @param parameter
	 * @return
	 */
	List<Map<String, Object>> queryForMapList(Object statementId, Object parameter);

	/**
	 *
	 * 다건 조회 연산을 수행한다.
	 *
	 * @param statementId
	 * @param parameter
	 * @param skipRows
	 * @param maxRows
	 * @return
	 */
	List<Map<String, Object>> queryForMapList(Object statementId, Object parameter, int skipRows, int maxRows);

	/**
	 *
	 * 조회 결과를 정수형(Integer)으로 반환한다.
	 *
	 * @param statementId
	 * @param parameter
	 * @return
	 */
	Integer queryForInt(Object statementId, Object parameter);

	/**
	 *
	 * 조회 결과를 정수형(Long)으로 반환한다.)
	 *
	 * @param statementId
	 * @param parameter
	 * @return
	 */
	Long queryForLong(Object statementId, Object parameter);

	/**
	 *
	 * 입력/수정/삭제 연산을 수행한다.
	 *
	 * @param statementId
	 * @param parameter
	 * @return
	 */
	Integer update(Object statementId, Object parameter);

	/**
	 *
	 * 입력/수정/삭제  배치 연산을 수행한다.
	 *
	 * @param statementId
	 * @param parameter
	 * @return
	 */
	int[] batchUpdate(Object statementId, List<?> parameter);

}