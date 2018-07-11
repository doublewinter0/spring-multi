/*
 * This line is for God!
 * Created by erdong on 2018/7/8 12:12
 * One is Gauss, and another is Évariste Galois.
 */

package ren.erdong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPController {

	@RequestMapping(value = "/api/test")
	public String show(@RequestParam(value = "callback") String funame) {
		funame += "(\"艹腻骂。。。\")";
		System.out.println(funame);
		return funame;
	}
}
