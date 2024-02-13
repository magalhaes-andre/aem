/*
 * ***********************************************************************
 * Scholastic CONFIDENTIAL
 * ___________________
 *
 * Copyright 2024 Scholastic.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of Scholastic and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to Scholastic
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Scholastic.
 * ***********************************************************************
 */

package com.scholastic.playground.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.scholastic.playground.core.models.BlueButton;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    BlueButton.class,
    ComponentExporter.class
}, resourceType = "playground/components/content/blue-button")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class BlueButtonImpl
    implements BlueButton
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String text;
    @SlingObject
    private Resource resource;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}
