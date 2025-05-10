package org.example.springherojava24.core.beanscope.scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/**
 * A new instance of the bean is created every time it is requested from the Spring container or injected into another bean.
 * For example, a shopping cart object, a report builder that holds temporary data
 */
public class PrototypeMessageHolder {

    private String message;
    private final String creationTime;

    public PrototypeMessageHolder() {
        this.creationTime = LocalTime.now().toString();
        System.out.println("PrototypeMessageHolder: Bean CREATED at " + creationTime);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message + " (from instance created at " + creationTime + ")";
    }

    public String getCreationTime() {
        return creationTime;
    }
}