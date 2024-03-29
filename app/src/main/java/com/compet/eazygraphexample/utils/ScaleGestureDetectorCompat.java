/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.compet.eazygraphexample.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.ScaleGestureDetector;

/**
 * A utility class for using {@link ScaleGestureDetector} in a backward-compatible fashion.
 */
public class ScaleGestureDetectorCompat {

    /**
     * Disallow instantiation.
     */
    private ScaleGestureDetectorCompat() {
    }

    /**
     * @see ScaleGestureDetector#getCurrentSpanX()
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static float getCurrentSpanX(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            return scaleGestureDetector.getCurrentSpanX();
        } else {
            return scaleGestureDetector.getCurrentSpan();
        }
    }

    /**
     * @see ScaleGestureDetector#getCurrentSpanY()
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static float getCurrentSpanY(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            return scaleGestureDetector.getCurrentSpanY();
        } else {
            return scaleGestureDetector.getCurrentSpan();
        }
    }

    /**
     * @see ScaleGestureDetector#getPreviousSpanX()
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static float getPreviousSpanX(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            return scaleGestureDetector.getPreviousSpanX();
        } else {
            return scaleGestureDetector.getPreviousSpan();
        }
    }

    /**
     * @see ScaleGestureDetector#getPreviousSpanY()
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static float getPreviousSpanY(ScaleGestureDetector scaleGestureDetector) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            return scaleGestureDetector.getPreviousSpanY();
        } else {
            return scaleGestureDetector.getPreviousSpan();
        }
    }
}
