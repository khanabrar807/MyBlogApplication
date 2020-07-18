package org.abrar.myblog.service;

import java.util.*;
/*import java.util.HashMap;
import java.util.List;*/

//import org.abrar.myblog.bean;
import org.abrar.myblog.bean.MyBlogClass;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class MyBlogService {

 static HashMap<Integer,MyBlogClass> BlogIdMap=getBlogIdMap();


 public MyBlogService() {
  super();

  if(BlogIdMap==null)
  {
   BlogIdMap=new HashMap<Integer,MyBlogClass>();
  // Creating some objects of CountryBlogs while initializing
   MyBlogClass indiaCountry=new MyBlogClass(1, "Trip to India"," Sometimes India made me laugh. Sometimes India made me think. On more than one occasion, India made me sick. Over the course of my trip, I took nearly 2,000 photos of architecture, people, food, animals – beautiful things and ugly things and things I don’t remember why I thought to photograph ");
   MyBlogClass chinaCountry=new MyBlogClass(4, "Trip to China"," China is a place which attracts people from all over the world, be it in tourism, products or culture. However, for an ordinary Indian to think that one day he/she will visit China is still a dream");
   MyBlogClass nepalCountry=new MyBlogClass(3, "Trip to Nepal","  Nepal has a diverse landscape, the best being the Himalayan Mountains");
   MyBlogClass bhutanCountry=new MyBlogClass(2, "Trip to Bhutan","Bhutan's amazing landscape and natural sceneries attract visitors from every corner of the world ");


   BlogIdMap.put(1,indiaCountry);
   BlogIdMap.put(4,chinaCountry);
   BlogIdMap.put(3,nepalCountry);
   BlogIdMap.put(2,bhutanCountry);
  }
 }

 public List<MyBlogClass> getAllblogs()
 {
  List<MyBlogClass> myblogs = new ArrayList<MyBlogClass>(BlogIdMap.values());
  return myblogs;
 }

 public MyBlogClass getblogs(int id)
 {
  MyBlogClass blog= BlogIdMap.get(id);
  return blog;
 }
 public MyBlogClass addBlogs(MyBlogClass myblogs)
 {
	 myblogs.setblogId(getMaxId()+1);
  BlogIdMap.put(myblogs.getblogId(), myblogs);
  return myblogs;
 }
 
 public MyBlogClass updateBlogs(MyBlogClass myblogs)
 {
  if(myblogs.getblogId()<=0)
   return null;
  BlogIdMap.put(myblogs.getblogId(), myblogs);
  return myblogs;

 }
 public void deleteBlogs(int id)
 {
  BlogIdMap.remove(id);
 }

 public static HashMap<Integer, MyBlogClass> getBlogIdMap() {
  return BlogIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:BlogIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

