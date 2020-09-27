package cn.hsa.city.mapper;



import cn.hsa.city.pojo.China;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface IChinaDao {

    //查看所有省
    @Select("select id,name,pid from china where level=1")
    List<China> findAllByPname() throws Exception;

    //根据省id查省下面的所有市
    @Select("select id,name,pid from china where pid=#{pid}")
    List<China> findAllByPid(int pid) throws Exception;

    //根据市id查询下面所有的区
    @Select("select name from china where pid=#{pid}")
    List<China> findAllByCid(int cid) throws Exception;



}
