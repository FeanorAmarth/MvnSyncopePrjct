package org.apache.syncope.core.logic;

import java.lang.reflect.Method;
import org.apache.syncope.common.lib.to.EntityTO;
import org.apache.syncope.common.lib.types.StandardEntitlement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
public class DeveloperLogic extends AbstractTransactionalLogic<EntityTO > {

	String developer = "developer";

    @PreAuthorize("isAnonymous() or hasRole('" + StandardEntitlement.ANONYMOUS + "')")
    public DeveloperLogic developer() {
		return this;
    }

    @Override
    protected EntityTO resolveReference(final Method method, final Object... os)
            throws UnresolvedReferenceException {

        throw new UnresolvedReferenceException();
    }

}