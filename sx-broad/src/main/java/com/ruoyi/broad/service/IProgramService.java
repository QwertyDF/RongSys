package com.ruoyi.broad.service;

import com.ruoyi.broad.domain.Program;
import com.ruoyi.village.domain.PersonApi;

import java.util.List;

/**
 * @program: RongSys-lyb
 * @description: 节目单管理 服务层
 * @author: Mr.Liu
 * @create: 2019-02-26 19:44
 **/

public interface IProgramService {

    /**
     * 查询节目库数据
     * @param program 节目实体类
     * @return 结果
     */
    public List<Program> selectProList(Program program);
    /**
     * 获取广播MP3文件列表（村务宝典）
     * @param program 节目实体类
     * @return 结果
     */
    public List<Program> selectProList1(PersonApi program);
    /**
     * 得到当年文件最大编号
     * @param year
     * @return
     */
    public String getMaxFileidofYear(String year);

    /**
     * 上传节目单
     * @param program 节目单
     * @return
     */
    public int insertProgram(Program program);
    /**
     * 查询节目
     * @param fname 节目名称
     * @return 结果
     */
    public Program selectFileByFileName(String fname);

    /**
     * 删除节目
     * @param fid 节目名称
     * @return 结果
     */

    public int deleteProgram(String fid);


    public List<Program> selectProgramListByids(List<String> sfids);

    public int setIsPublic(String fid);

}
