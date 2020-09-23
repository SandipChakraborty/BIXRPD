package utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import org.dozer.Mapper;


@Component
public class CommonUtils {

	
	  /**
	   * This function is for using the dozzer mapper to map a list of beans
	   * 
	   * @param mapper
	   * @param source
	   * @param destType
	   * @return
	   */
	  public <T, U> List<U> dozerMapperForList(final Mapper mapper,
	      final List<T> source, final Class<U> destType) {
	    final List<U> dest = new ArrayList<U>();
	    for (T element : source) {
	      dest.add(mapper.map(element, destType));
	    }
	    return dest;
	  }
	  
}
