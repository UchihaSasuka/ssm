package com.ssm.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase;

public class PropertyNamingStrategyCloud extends PropertyNamingStrategyBase {
    private static final long serialVersionUID = -6761807038049455432L;

    public PropertyNamingStrategyCloud() {
    }

    public String translate(String propertyName) {
        return propertyName;
    }
}
