/**
 * Copyright 2015 YA LLC
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.yandex.subtitles.service.speechkit.speaker;

import android.support.annotation.NonNull;

import ru.yandex.speechkit.Vocalizer;

/**
 * Enumeration contains voices which are supported by Yandex.SpeechKit SDK.
 */
public enum Voice {

    /**
     * SPEAKERS = {'jane': ['evil', 'good', 'neutral'],
     * 'ermil': ['neutral'],
     * 'zahar': ['neutral'],
     * 'omazh': ['evil', 'good', 'neutral']}
     */

    JANE(Vocalizer.Voice.JANE),
    ERMIL(Vocalizer.Voice.ERMIL),
    ZAHAR(Vocalizer.Voice.ZAHAR),
    OMAZH(Vocalizer.Voice.OMAZH);

    private String mVoice;

    /* package */ Voice(@NonNull final String voice) {
        mVoice = voice;
    }

    @NonNull
    public String value() {
        return mVoice;
    }

}
