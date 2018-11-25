package metaExample;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface QAEduAnno{
	String str();
	int val();
}

public class meta {
@QAEduAnno(str = "Annotation Example", val=100)
public static void myMeth() {
	Meta ob = new Meta();
}
try {
	
}
}
