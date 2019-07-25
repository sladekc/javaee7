package de.akdb.oesio.readinggroup.interceptors;

import java.io.Serializable;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@OurInterceptorBinding
public class OurInterceptor implements Serializable
{
    public OurInterceptor()
    {
    }

    @AroundInvoke
    public Object logMethodEntry(InvocationContext invocationContext)
            throws Exception
    {

        System.out.println("Entering method: "
                + invocationContext.getMethod().getName() + " in class "
                + invocationContext.getMethod().getDeclaringClass().getName());

        final String returnValue = (String) invocationContext.proceed() + " intercepted";

        System.out.println("Exiting method.");
        System.out.println("Return value: " + returnValue);

        return returnValue;
    }

    @AroundConstruct
    public Object logObjectConstruct(InvocationContext ctx) throws Exception
    {
        System.out.println("Constructing " + ctx.getConstructor());
        return ctx.proceed();
    }

}