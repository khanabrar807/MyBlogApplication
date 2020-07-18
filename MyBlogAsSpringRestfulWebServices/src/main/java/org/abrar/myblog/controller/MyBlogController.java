package org.abrar.myblog.controller;

import java.util.List;


import org.abrar.myblog.bean.MyBlogClass;
import org.abrar.myblog.service.MyBlogService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBlogController {

	MyBlogService blogService = new MyBlogService();

	@RequestMapping(value = "/myblogs", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<MyBlogClass> getblogs() {
		List<MyBlogClass> listOfMyBlogs = blogService.getAllblogs();
		return listOfMyBlogs;
	}

	@RequestMapping(value = "/blog/{blogId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public MyBlogClass getblogs(@PathVariable int id) {
		return blogService.getblogs(id);
	}

	@RequestMapping(value = "/myblogs", method = RequestMethod.POST, headers = "Accept=application/json")
	public MyBlogClass addBlogs(@RequestBody MyBlogClass myblogs) {
		return blogService.addBlogs(myblogs);
	}

	@RequestMapping(value = "/myblogs", method = RequestMethod.PUT, headers = "Accept=application/json")
	public MyBlogClass updateBlogs(@RequestBody MyBlogClass myblogs) {
		return blogService.updateBlogs(myblogs);

	}

	@RequestMapping(value = "/blog/{blogId}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteBlogs(@PathVariable("blogId") int id) {
		blogService.deleteBlogs(id);

	}	
}
