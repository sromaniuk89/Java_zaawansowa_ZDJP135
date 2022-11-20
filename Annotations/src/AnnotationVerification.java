import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@MyAnnotation(comment = "Example comment about this class.")
public class AnnotationVerification {
//    @MyAnnotation(comment = "Is this going to work?") //to nie zadziala bo nie jest typ FIELD
    private static List<String> SKIP_METHODS = Arrays.asList("equals", "toString", "hashCode", "annotationType");

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        for (Annotation classAnnotation : AnnotationVerification.class.getDeclaredAnnotations()){
            printAnnotationDetails(classAnnotation);
        }

    }

    private static void printAnnotationDetails(Annotation annotation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Annotation found: " + annotation);

        for(Method method : annotation.annotationType().getMethods()){
            if(SKIP_METHODS.contains(method.getName()))
                continue;

            System.out.println("Name of the element: " + method.getName());
            System.out.println("Default value of the element: " + method.getDefaultValue());
            System.out.println("Current value of the element: " + method.invoke(annotation));
            System.out.println();
        }
    }

    @MyAnnotation(comment = "This method does not do anything")
    private static void doNothing(){

    }
}
