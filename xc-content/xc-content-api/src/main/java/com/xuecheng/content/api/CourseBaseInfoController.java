package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.xuecheng.content.api
 * @NAME: CourseBaseInfoController
 * @USER: qxq
 * @DATE: 2023/4/8 23:33
 * @DAY_NAME_SHORT: 周六
 * @Description 课程信息编辑接口
 */

@RestController //@Controller + @ResponBody
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams,@RequestBody QueryCourseParamsDto queryCourseParamsDto) {
        return null;
    }
}
