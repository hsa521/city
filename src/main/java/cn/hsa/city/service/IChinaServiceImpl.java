package cn.hsa.city.service;

import cn.hsa.city.mapper.IChinaDao;
import cn.hsa.city.pojo.China;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IChinaServiceImpl implements IChinaService {

    @Autowired
    private IChinaDao chinaDao;

    public List<China> findAllByPname() throws Exception {
        return chinaDao.findAllByPname();
    }

    public List<China> findAllByPid(int pid) throws Exception {

        return chinaDao.findAllByPid(pid);
    }

    public List<China> findAllByCid(int cid) throws Exception{
        return chinaDao.findAllByCid(cid);
    }
}
