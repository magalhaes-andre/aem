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

package com.scholastic.playground.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code BlueButton} Sling Model used for the {@code playground/components/content/blue-button} component.
 * 
 */
@ConsumerType
public interface BlueButton
    extends ComponentExporter
{


    String getText();

}
