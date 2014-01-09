/*
 *
 * Copyright 2014 Weswit s.r.l.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package stocklist_jms_demo.feed_simulator;

import java.util.HashMap;

/**
 * Used to receive data from the simulated broadcast feed in an
 * asynchronous way, through the onEvent method.
 */
public interface ExternalFeedListener {

    /**
     * Called by the feed for each update event occurrence on some stock.
     * If isSnapshot is true, then the event contains a full snapshot,
     * with the current values of all fields for the stock.
     */
    void onEvent(String itemName, HashMap currentValues, boolean isSnapshot);

}


/*--- Formatted in Lightstreamer Java Convention Style on 2005-11-03 ---*/