This is a simple Xamarin Android application to show a cumulative memory leak that we are seeing with the ESRI Mapview control.  

The app will open to a main activity with two buttons.  The first button, "Go To Map", will start a new activity with a MapView and Map assigned to the MapView.  The second button will start an activity that does essestially nothing as a control.

We are using the Android Studio 3 Profiler to watch memory usage on the device.  Start the profiler and then run the app.  Click on the "Go To Map", wait for the map to appear, then use the Android back button to go back to the main activity.  Repeat a few times.  

In the Android Studio Profiler, you will see memory usage go up, then down, the up, then down.  What we are seeing is that memory usage does not go all the way back down when you go back to the main activity.  The more you do this, the greater the memory usage is.
