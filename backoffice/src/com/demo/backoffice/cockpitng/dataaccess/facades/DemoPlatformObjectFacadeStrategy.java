package com.demo.backoffice.cockpitng.dataaccess.facades;

import com.hybris.backoffice.cockpitng.dataaccess.facades.object.DefaultPlatformObjectFacadeStrategy;
import com.hybris.cockpitng.dataaccess.context.Context;
import com.hybris.cockpitng.dataaccess.facades.object.exceptions.ObjectSavingException;
import de.hybris.platform.core.model.order.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cyclone
 */
public class DemoPlatformObjectFacadeStrategy extends DefaultPlatformObjectFacadeStrategy
{
    private static final Logger LOG = LoggerFactory.getLogger(DemoPlatformObjectFacadeStrategy.class);

    @Override
    public <T> T save(T objectToSave, Context ctx) throws ObjectSavingException
    {
        LOG.info("This is in demo default platform object facade.");
        return super.save(objectToSave, ctx);
    }

    @Override
    public boolean canHandle(Object object)
    {
        if (object instanceof OrderModel)
        {
            return false;
        }
        return super.canHandle(object);
    }
}
