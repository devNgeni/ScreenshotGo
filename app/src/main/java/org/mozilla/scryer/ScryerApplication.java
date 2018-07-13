/* -*- Mode: Java; c-basic-offset: 4; tab-width: 4; indent-tabs-mode: nil; -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.scryer;

import android.app.Application;

public class ScryerApplication extends Application {

    private static ScryerApplication INSTANCE;

    public static ScryerApplication getInstance() {
        return INSTANCE;
    }

    private ScreenshotRepository screenshotRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;

        screenshotRepository = ScreenshotRepository.Factory.createRepository(this);
    }

    public ScreenshotRepository getScreenshotRepository() {
        return screenshotRepository;
    }
}
