package cap.mapper;

import cap.model.Profile;

public interface ProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    int insert(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    int insertSelective(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    Profile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Profile record);
}