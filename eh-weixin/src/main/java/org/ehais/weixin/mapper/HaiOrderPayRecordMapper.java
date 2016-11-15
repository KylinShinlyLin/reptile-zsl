package org.ehais.weixin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.ehais.tools.EConditionObject;
import org.ehais.weixin.model.HaiOrderPayRecord;
import org.ehais.weixin.model.HaiOrderPayRecordAndUsers;
import org.ehais.weixin.model.HaiOrderPayRecordExample;
import org.ehais.weixin.model.HaiOrderPayRecordWithBLOBs;

public interface HaiOrderPayRecordMapper {
	
	
	@Select("SELECT * FROM hai_order_pay_record o " +
			" LEFT JOIN hai_users u ON o.user_id = u.user_id " +
			" WHERE o.store_id = #{store_id} "+
			" ORDER BY o.create_date DESC LIMIT #{start}, #{len};")
	@Results(value = {
			@Result(property="orderPayId", column="order_pay_id"),
			@Result(property="userId", column="user_id"),
			@Result(property="faceImage", column="face_image")			
	})
    List<HaiOrderPayRecordAndUsers> hai_order_pay_record_users(@Param("store_id") Integer store_id, @Param("start") Integer start, @Param("len") Integer len);

	
	
	@ResultMap(value = "ResultMapWithUnion")
    List<HaiOrderPayRecordAndUsers> hai_order_pay_record_list_by_condition(
    		@Param("condition") EConditionObject condition, 
    		@Param("tableId") Integer tableId,
    		@Param("tableName") String tableName,
    		@Param("orderStatus") Integer orderStatus,
    		@Param("start") Integer start, 
    		@Param("len") Integer len
    		);

	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    @ResultMap(value = "BaseResultMap")
    List<HaiOrderPayRecord> hai_order_pay_record_list(@Param("store_id") Integer store_id, @Param("start") Integer start, @Param("len") Integer len);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    @ResultMap(value = "BaseResultMap")
    List<HaiOrderPayRecord> hai_order_pay_record_list_by_example(HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    @ResultMap(value = "ResultMapWithBLOBs")
    HaiOrderPayRecord get_hai_order_pay_record_info(@Param("store_id") Integer store_id, @Param("order_pay_id") Long order_pay_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int countByExample(HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int deleteByExample(HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int deleteByPrimaryKey(Long orderPayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int insert(HaiOrderPayRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int insertSelective(HaiOrderPayRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    List<HaiOrderPayRecordWithBLOBs> selectByExampleWithBLOBs(HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    List<HaiOrderPayRecord> selectByExample(HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    HaiOrderPayRecordWithBLOBs selectByPrimaryKey(Long orderPayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int updateByExampleSelective(@Param("record") HaiOrderPayRecordWithBLOBs record, @Param("example") HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") HaiOrderPayRecordWithBLOBs record, @Param("example") HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int updateByExample(@Param("record") HaiOrderPayRecord record, @Param("example") HaiOrderPayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int updateByPrimaryKeySelective(HaiOrderPayRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(HaiOrderPayRecordWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_order_pay_record
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    int updateByPrimaryKey(HaiOrderPayRecord record);
}