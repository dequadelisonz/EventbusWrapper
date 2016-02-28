/*****************************************************************
 Copyright 2015 Paolo Martinello; created on 18/04/15

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 *******************************************************************/
package code.martin.it.eventbuswrapper;

import android.util.Log;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.SubscriberExceptionEvent;

public class EventbusObject {

    protected final String TAG=this.getClass().getSimpleName();
    protected final EventBus eBus=EventBus.getDefault();

    public EventbusObject() {
        super();
        eBus.register(this);
    }

    protected void unregister() {
        if (eBus.isRegistered(this)) eBus.unregister(this);
    }


    public void onEventMainThread(IBaseEventbusEvent event){

    }

    public void onEventMainThread(SubscriberExceptionEvent see) {
        Log.e(TAG, see.toString());
        Log.e(TAG, see.causingEvent.toString());
        Log.e(TAG, see.causingSubscriber.toString());
    }

}