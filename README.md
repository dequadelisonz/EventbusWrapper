This a simple wrapper class that incapsulate basic basic communication features given bu Eventbus created by greenrobot.de at https://github.com/greenrobot/EventBus.

It includes the EventbusObject that you can extend to immediately obtain a Eventbus registered object on creation and a method:
```public void onEventMainThread(IBaseEventbusEvent event)```
to be overridden to receive and manage EventBus events.

Don't forget to call method ```unregister()``` when you are going to destroy your object.

It also includes the public ```interface IBaseEventbusEvent``` to be used to create Eventbus events for communication.

You can include this library in your project by adding to your gradle-build file this row:

```compile(group: 'it.code.martin', name: 'eventbuswrapper', version: '1.0.2', ext: 'aar')```

Further features will be added in the future.