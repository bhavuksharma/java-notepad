import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// This is first custom Marker annotation
// @Retention is need so that the annotation exists at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Auditable{

}