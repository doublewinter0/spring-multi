/*
 * This line is for God!
 * Created by erdong on 2018/6/30 17:50
 * One is Gauss, and another is Évariste Galois.
 */

package ren.erdong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityController {

	@RequestMapping(value = "/addCity")
	public String addCity() {
		return "/addCity";
	}
}
