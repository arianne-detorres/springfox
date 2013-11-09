package com.mangofactory.swagger;

import scala.Option;
import scala.collection.immutable.List;
import static scala.collection.JavaConversions.*;

import java.util.ArrayList;
import java.util.Collection;

public class ScalaUtils {

   public static List toList(Collection collection) {
      if(null == collection){
         collection = new ArrayList();
      }
      return collectionAsScalaIterable(collection).toList();
   }

   public static java.util.List<?> fromList(List<?> list) {
      return asJavaList(list);
   }
   public static Option toOption(Object o) {
      return Option.apply(o);
   }

   public static <T> T fromOption(Option<T> o) {
      if(!o.isDefined()){
         return null;
      }
      return o.get();
   }
}
