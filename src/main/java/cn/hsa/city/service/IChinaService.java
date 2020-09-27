package cn.hsa.city.service;

import cn.hsa.city.pojo.China;

import java.util.List;

public interface IChinaService {

    List<China> findAllByPname() throws Exception;

    List<China> findAllByPid(int pid) throws Exception;

    List<China> findAllByCid(int cid) throws Exception;
}
