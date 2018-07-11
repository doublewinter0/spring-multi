package ren.erdong.web;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ren.erdong.constant.CityErrorInfoEnum;
import ren.erdong.result.GlobalErrorInfoException;
import ren.erdong.result.ResultBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 错误码案例
 */
@RestController
public class ErrorJsonController {


    /**
     * 获取城市接口
     *
     * @param cityName
     * @return
     * @throws GlobalErrorInfoException
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public ResultBody findOneCity(@RequestParam("cityName") String cityName, HttpServletRequest req) throws GlobalErrorInfoException {
        // 入参为空
		// TODO 删除 go()
		go(req);
        if (StringUtils.isEmpty(cityName)) {
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        return new ResultBody(new City(1L,2L,"采当","我的故乡"));
    }

    private void go(HttpServletRequest req) {
		System.out.println(req.getClass());
    }
}